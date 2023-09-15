package task05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class task {

    public static void main(String[] args) {
        System.out.println(checkBracket("a+(d*3)"));
        System.out.println(checkBracket("[a+(1*3)"));
        System.out.println(checkBracket("[6+(3*3)]"));
        System.out.println(checkBracket("{a}[+]{(d*3)}"));
        System.out.println(checkBracket("<{a}+{(d*3)}>"));
        System.out.println(checkBracket("{a+]}{(d*3)}"));
    }

    static boolean checkBracket(String exp){
        Deque<Character> openBracketStack = new ArrayDeque<>();
        Map<Character, Character> bracketPairs = new HashMap<>(); 

        fillMap(bracketPairs);

        for (char ch : exp.toCharArray()) {
            if (bracketPairs.containsKey(ch)) {
                openBracketStack.add(ch);
            } else if (bracketPairs.containsValue(ch)) {
                if (openBracketStack.isEmpty()) {
                    return false;
                }

                char top = openBracketStack.removeLast();
                if (bracketPairs.get(top) != ch) {
                    return false;
                }
            }
        }
        return openBracketStack.isEmpty();
    }

    static void fillMap(Map<Character, Character> map) {
        map.put('{', '}');
        map.put('<', '>');
        map.put('[', ']');
        map.put('(', ')');
//        map = Map.of('{', '}', '<', '>', '[', ']','(', ')');
//        map = Map.ofEntries(Map.entry('{', '}'));
    }
    
}