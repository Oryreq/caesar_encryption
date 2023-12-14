package utils;

import java.util.Arrays;

public class ArrayUtils {
    /**
     * Moves array left in N positions.
     */
    public static void moveArrayLeft(String[] array, int n) {
        String[] result = Arrays.copyOf(array, n);
        System.arraycopy(array, n, array, 0, array.length - n);
        System.arraycopy(result, 0, array, array.length - n, n);
    }
}
