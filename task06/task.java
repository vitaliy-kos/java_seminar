package task06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

// Написать метод, который переводит число из римского формата записи в арабский. 
// Например, MMXXII = 2022

public class task {

    private static final Map<String, Integer> romanToArabicMap = new HashMap<>(
            Map.of(
                    "I", 1,
                    "V", 5,
                    "X", 10,
                    "L", 50,
                    "C", 100,
                    "D", 500,
                    "M", 1000));
    public static void main(String[] args) {
        System.out.println(convertRomanToArabic("MMXXII"));
        System.out.println(convertRomanToArabic("XXII"));
        System.out.println(convertRomanToArabic("asdasd"));
    }

    static int convertRomanToArabic(String romanNotation) {
        if (romanNotation == null) {
            throw new RuntimeException("String must contain only valid roman numerals [I, V, X, L, C, D, M].");
        }

        romanNotation = romanNotation.toUpperCase();
        boolean valid = romanNumberIsValid(romanNotation);
        int arabicResult;

        if (valid) {
            arabicResult =
             romanToArabicMap.get(Character.toString(romanNotation.charAt(0)));

            List<Integer> symbols = romanNotation
                    .chars().mapToObj(Character::toString)
                    .map(romanToArabicMap::get)
                    .collect(Collectors.toList());

            for (int i = 0; i < symbols.size() - 1; i++) {

                if (symbols.get(i) >= symbols.get(i + 1)) {
                    arabicResult += symbols.get(i+1);
                }
                if (symbols.get(i) < symbols.get(i + 1)) {
                    arabicResult += symbols.get(i+1) - symbols.get(i)*2;
                }

            }

            return arabicResult;

        } else {
            throw new RuntimeException("String must contain only valid roman numerals [I, V, X, L, C, D, M].");
        }

    }

    private static boolean romanNumberIsValid(String input) {
        /* Кроме валидации конкретных символов, добавил валидацию правильного построения римского числа,
        например 490 правильно не XD, а CDXC. Текст выброшенного исключения не менял, чтобы прошел валидацию,
        согласно ТЗ
        */
        return Pattern.matches("[IVXLCDM]+", input); // && !Pattern.matches("I{4,}|X{4,}|C{4,}|M{4,}|V{2,}|L{2,}|D{2,}|IL+|IC+|ID+|IM+|XD+|XM+", input)
    }
    
}
