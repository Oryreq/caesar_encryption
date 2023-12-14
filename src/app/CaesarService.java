package app;

import utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

/**
 * CaesarService can encrypt and decrypt messages. <br>
 * Can encrypt by some shift number and decrypt without shift number. <br>
 * Decryption product by frequency method for one most popular letter in russian language. <br>
 * @author Vsevolod Ashihmin.
 * @Date: 14.12.2023.
 */
public class CaesarService {

    private record LetterFrequency(String letter, int frequency) {};
    private String[] shiftedAlphabet;

    /**
     * Removes all unnecessary symbols and digits from message and to upper case it. <br>
     * Creates shifted alphabet and encrypt message.
     * @return encrypted message
     */
    public String encrypt(String[] alphabet, String message, int shift) {
        message = normalizeMessage(message, alphabet);
        createShiftedAlphabet(alphabet, shift);

        var alphabetList = Arrays.stream(alphabet).toList();

        ToIntFunction<String> fromLetterToLetterNumber = alphabetList::indexOf;
        IntFunction<String> fromLetterNumberToShiftedLetter = (i) -> shiftedAlphabet[i];
        BinaryOperator<String> sumLettersToText = (text, letter) -> text += letter;

        return Arrays.stream(message.split(""))
                        .mapToInt(fromLetterToLetterNumber)
                        .mapToObj(fromLetterNumberToShiftedLetter)
                        .reduce(sumLettersToText)
                        .get();
    }

    /**
     * Find most popular letter in encrypted text. <br>
     * For example this letter is "Ï". <br>
     * But original most popular letter is "Î". <br>
     * Get their indexes from alphabet and their difference is alphabet shift. <br>
     * Shifts alphabet and reverse replace letters from encrypted message. <br>
     * @return decrypted message.
     */
    public String decrypt(String[] alphabet, String encryptedMessage) {
        String[] shiftedAlphabet = getShiftedAlphabet(alphabet, encryptedMessage);

        var alphabetList = Arrays.stream(shiftedAlphabet).toList();

        ToIntFunction<String> fromLetterToLetterNumber = alphabetList::indexOf;
        IntFunction<String> fromLetterNumberToLetter = (i) -> alphabet[i];
        BinaryOperator<String> sumLettersToText = (text, letter) -> text += letter;

        return Arrays.stream(encryptedMessage.split(""))
                        .mapToInt(fromLetterToLetterNumber)
                        .mapToObj(fromLetterNumberToLetter)
                        .reduce(sumLettersToText)
                        .get();
    }

    private String[] getShiftedAlphabet(String[] alphabet, String encryptedMessage) {
        var alphabetList = Arrays.stream(alphabet).toList();

        String mostPopularLetter = getMostPopularLetterInText(alphabet, encryptedMessage);
        int index = alphabetList.indexOf(mostPopularLetter);

        String mostPopularLetterOriginal = "Î";
        int originalIndex = alphabetList.indexOf(mostPopularLetterOriginal);

        int shift = Math.abs(index - originalIndex);
        String[] shiftedAlphabet = alphabet.clone();
        ArrayUtils.moveArrayLeft(shiftedAlphabet, shift);

        return shiftedAlphabet;
    }

    /**
     * Find most popular letter in encrypted message. This letter is encrypted analog letter "Î".
     */
    private String getMostPopularLetterInText(String[] alphabet, String encryptedMessage) {
        var letterFrequency = getLetterFrequency(alphabet, encryptedMessage);
        letterFrequency.sort(Comparator.comparingInt(frequency -> frequency.frequency));

        return letterFrequency.get(letterFrequency.size() - 1).letter;
    }

    /**
     * Counts letters frequency in encrypted message.
     * @return letters frequency list.
     */
    private ArrayList<LetterFrequency> getLetterFrequency(String[] alphabet, String encryptedMessage) {
        BiFunction<String, String, Integer> countLettersInString =
                (letter, string) -> Arrays.stream(string.split(""))
                                            .filter(letter2 -> letter2.equals(letter))
                                            .toArray().length;

        Function<String, LetterFrequency> fromLetterToFrequency =
                (letter) -> new LetterFrequency(letter, countLettersInString.apply(letter, encryptedMessage));

        var letterFrequency = Arrays.stream(alphabet)
                                                                .map(fromLetterToFrequency)
                                                                .toList();

        return new ArrayList<>(letterFrequency);
    }

    /**
     * Shifts alphabet to some positions right.
     */
    private void createShiftedAlphabet(String[] alphabet, int shift) {
        shiftedAlphabet = alphabet.clone();
        ArrayUtils.moveArrayLeft(shiftedAlphabet, shift);
    }

    /**
     * Removes all unnecessary symbols and digits from message and to upper case it.
     * @return normalized message.
     */
    private String normalizeMessage(String message, String[] alphabet) {
        message = message.replaceAll(" ", "")
                            .replaceAll("\\.", "")
                            .replaceAll(",", "")
                            .replaceAll("-", "")
                            .replaceAll("\n", "")
                            .replaceAll(":", "")
                            .replaceAll("—", "")
                            .replaceAll("¹","")
                            .replaceAll("\\(", "")
                            .replaceAll("\\)", "")
                            .replaceAll("0", "")
                            .replaceAll("1", "")
                            .replaceAll("2", "")
                            .replaceAll("3", "")
                            .replaceAll("4", "")
                            .replaceAll("5", "")
                            .replaceAll("6", "")
                            .replaceAll("7", "")
                            .replaceAll("8", "")
                            .replaceAll("9", "")
                            .replaceAll("–", "")
                            .toUpperCase();

        var alphabetList = Arrays.stream(alphabet).toList();
        var messageCopy = message.split("");
        for (String letter : messageCopy) {
            if (!alphabetList.contains(letter)) {
                message = message.replaceAll(letter, "");
            }
        }
        return message;
    }
}
