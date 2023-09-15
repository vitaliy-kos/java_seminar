package task04;

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class task {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code")); 
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("hello", "world"));
    }

    private static boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> usedChars = new HashSet<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (map.containsKey(char1)) {
                if (map.get(char1) != char2) {
                    return false;
                }
            } else {
                if (usedChars.contains(char2)) {
                    return false;
                }
                map.put(char1, char2);
                usedChars.add(char2);
            }
        }

        return true;
    }
}

