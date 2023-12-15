
# Chiffre de César | Java

Программа по дисциплине "Информационная безопасность".  
Реализует шифр Цезаря".  
За основу дешифровки был взят метод частотного анализа для самой встречающейся буквы "О".
Программа находит самую встречающуюся букву заширофванного текста, принимает её за "О", вычисляет сдвиг и производит обратную подстановку.  
Выполнил: Ашихмин Всеволод. Группа: ПИ-41(э). Дата: 13.12.2023.

Пример работы с консоли:  
-------------------------------------------------------------------------------------------
Исходный текст:    
Маленький принц пошел взглянуть на розы.
- Вы ничуть не похожи на мою розу, - сказал он им. - Вы еще ничто.
Никто вас не приручил, и вы никого не приручили.
Таким был прежде мой Лис.
Он ничем не отличался от ста тысяч других лисиц.
Но я с ним подружился, и теперь он - единственный в целом свете.
Розы очень смутились.
- Вы красивые, но пустые, - продолжал Маленький принц. - Ради вас не захочется умереть.
Конечно, случайный прохожий, поглядев на мою розу, скажет, что она точно такая же, как вы.
Но мне она одна дороже всех вас. Ведь это ее, а не вас я поливал каждый день.
Ее, а не вас накрывал стеклянным колпаком. Ее загораживал ширмой, оберегая от ветра.
Для нее убивал гусениц, только двух или трех оставил, чтобы вывелись бабочки.
Я слушал, как она жаловалась и как хвастала, я прислушивался к ней, даже когда она умолкала. Она - моя.
И Маленький принц возвратился к Лису.
- Прощай... - сказал он.
- Прощай, - сказал Лис. - Вот мой секрет, он очень прост: зорко одно лишь сердце.
Самого главного глазами не увидишь.
- Самого главного глазами не увидишь, - повторил Маленький принц, чтобы лучше запомнить.
- Твоя роза так дорога тебе потому, что ты отдавал ей всю душу.
- Потому что я отдавал ей всю душу... - повторил Маленький принц, чтобы лучше запомнить.
- Люди забыли эту истину, - сказал Лис, - но ты не забывай: ты навсегда в ответе за всех, кого приручил.
Ты в ответе за твою розу.
- Я в ответе за мою розу... - повторил Маленький принц, чтобы лучше запомнить. "

-------------------------------------------------------------------------------------------
Шифр текст:  
ПГОЗРЯНЛМТУЛРЩТСЫЗОЕКЁОВРЦХЯРГУСКЮЕЮРЛЪЦХЯРЗТСШСЙЛРГПСБУСКЦФНГКГОСРЛПЕЮЗЬЗРЛЪХСРЛНХСЕГФРЗТУЛУЦЪЛОЛЕЮРЛНСЁСРЗТУЛУЦЪЛОЛХГНЛПДЮОТУЗЙЖЗПСМОЛФСРРЛЪЗПРЗСХОЛЪГОФВСХФХГХЮФВЪЖУЦЁЛШОЛФЛЩРСВФРЛПТСЖУЦЙЛОФВЛХЗТЗУЯСРЗЖЛРФХЕЗРРЮМЕЩЗОСПФЕЗХЗУСКЮСЪЗРЯФПЦХЛОЛФЯЕЮНУГФЛЕЮЗРСТЦФХЮЗТУСЖСОЙГОПГОЗРЯНЛМТУЛРЩУГЖЛЕГФРЗКГШСЪЗХФВЦПЗУЗХЯНСРЗЪРСФОЦЪГМРЮМТУСШСЙЛМТСЁОВЖЗЕРГПСБУСКЦФНГЙЗХЪХССРГХСЪРСХГНГВЙЗНГНЕЮРСПРЗСРГСЖРГЖСУСЙЗЕФЗШЕГФЕЗЖЯАХСЗЗГРЗЕГФВТСОЛЕГОНГЙЖЮМЖЗРЯЗЗГРЗЕГФРГНУЮЕГОФХЗНОВРРЮПНСОТГНСПЗЗКГЁСУГЙЛЕГОЫЛУПСМСДЗУЗЁГВСХЕЗХУГЖОВРЗЗЦДЛЕГОЁЦФЗРЛЩХСОЯНСЖЕЦШЛОЛХУЗШСФХГЕЛОЪХСДЮЕЮЕЗОЛФЯДГДСЪНЛВФОЦЫГОНГНСРГЙГОСЕГОГФЯЛНГНШЕГФХГОГВТУЛФОЦЫЛЕГОФВНРЗМЖГЙЗНСЁЖГСРГЦПСОНГОГСРГПСВЛПГОЗРЯНЛМТУЛРЩЕСКЕУГХЛОФВНОЛФЦТУСЬГМФНГКГОСРТУСЬГМФНГКГООЛФЕСХПСМФЗНУЗХСРСЪЗРЯТУСФХКСУНССЖРСОЛЫЯФЗУЖЩЗФГПСЁСЁОГЕРСЁСЁОГКГПЛРЗЦЕЛЖЛЫЯФГПСЁСЁОГЕРСЁСЁОГКГПЛРЗЦЕЛЖЛЫЯТСЕХСУЛОПГОЗРЯНЛМТУЛРЩЪХСДЮОЦЪЫЗКГТСПРЛХЯХЕСВУСКГХГНЖСУСЁГХЗДЗТСХСПЦЪХСХЮСХЖГЕГОЗМЕФБЖЦЫЦТСХСПЦЪХСВСХЖГЕГОЗМЕФБЖЦЫЦТСЕХСУЛОПГОЗРЯНЛМТУЛРЩЪХСДЮОЦЪЫЗКГТСПРЛХЯОБЖЛКГДЮОЛАХЦЛФХЛРЦФНГКГООЛФРСХЮРЗКГДЮЕГМХЮРГЕФЗЁЖГЕСХЕЗХЗКГЕФЗШНСЁСТУЛУЦЪЛОХЮЕСХЕЗХЗКГХЕСБУСКЦВЕСХЕЗХЗКГПСБУСКЦТСЕХСУЛОПГОЗРЯНЛМТУЛРЩЪХСДЮОЦЪЫЗКГТСПРЛХЯ

-------------------------------------------------------------------------------------------
Расшифрованный текст:  
МАЛЕНЬКИЙПРИНЦПОШЕЛВЗГЛЯНУТЬНАРОЗЫВЫНИЧУТЬНЕПОХОЖИНАМОЮРОЗУСКАЗАЛОНИМВЫЕЩЕНИЧТОНИКТОВАСНЕПРИРУЧИЛИВЫНИКОГОНЕПРИРУЧИЛИТАКИМБЫЛПРЕЖДЕМОЙЛИСОННИЧЕМНЕОТЛИЧАЛСЯОТСТАТЫСЯЧДРУГИХЛИСИЦНОЯСНИМПОДРУЖИЛСЯИТЕПЕРЬОНЕДИНСТВЕННЫЙВЦЕЛОМСВЕТЕРОЗЫОЧЕНЬСМУТИЛИСЬВЫКРАСИВЫЕНОПУСТЫЕПРОДОЛЖАЛМАЛЕНЬКИЙПРИНЦРАДИВАСНЕЗАХОЧЕТСЯУМЕРЕТЬКОНЕЧНОСЛУЧАЙНЫЙПРОХОЖИЙПОГЛЯДЕВНАМОЮРОЗУСКАЖЕТЧТООНАТОЧНОТАКАЯЖЕКАКВЫНОМНЕОНАОДНАДОРОЖЕВСЕХВАСВЕДЬЭТОЕЕАНЕВАСЯПОЛИВАЛКАЖДЫЙДЕНЬЕЕАНЕВАСНАКРЫВАЛСТЕКЛЯННЫМКОЛПАКОМЕЕЗАГОРАЖИВАЛШИРМОЙОБЕРЕГАЯОТВЕТРАДЛЯНЕЕУБИВАЛГУСЕНИЦТОЛЬКОДВУХИЛИТРЕХОСТАВИЛЧТОБЫВЫВЕЛИСЬБАБОЧКИЯСЛУШАЛКАКОНАЖАЛОВАЛАСЬИКАКХВАСТАЛАЯПРИСЛУШИВАЛСЯКНЕЙДАЖЕКОГДАОНАУМОЛКАЛАОНАМОЯИМАЛЕНЬКИЙПРИНЦВОЗВРАТИЛСЯКЛИСУПРОЩАЙСКАЗАЛОНПРОЩАЙСКАЗАЛЛИСВОТМОЙСЕКРЕТОНОЧЕНЬПРОСТЗОРКООДНОЛИШЬСЕРДЦЕСАМОГОГЛАВНОГОГЛАЗАМИНЕУВИДИШЬСАМОГОГЛАВНОГОГЛАЗАМИНЕУВИДИШЬПОВТОРИЛМАЛЕНЬКИЙПРИНЦЧТОБЫЛУЧШЕЗАПОМНИТЬТВОЯРОЗАТАКДОРОГАТЕБЕПОТОМУЧТОТЫОТДАВАЛЕЙВСЮДУШУПОТОМУЧТОЯОТДАВАЛЕЙВСЮДУШУПОВТОРИЛМАЛЕНЬКИЙПРИНЦЧТОБЫЛУЧШЕЗАПОМНИТЬЛЮДИЗАБЫЛИЭТУИСТИНУСКАЗАЛЛИСНОТЫНЕЗАБЫВАЙТЫНАВСЕГДАВОТВЕТЕЗАВСЕХКОГОПРИРУЧИЛТЫВОТВЕТЕЗАТВОЮРОЗУЯВОТВЕТЕЗАМОЮРОЗУПОВТОРИЛМАЛЕНЬКИЙПРИНЦЧТОБЫЛУЧШЕЗАПОМНИТЬ

-------------------------------------------------------------------------------------------







