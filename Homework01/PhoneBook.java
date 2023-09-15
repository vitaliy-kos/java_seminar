package Homework01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    static Map<String, ArrayList<String>> phonebook = new HashMap<>();
    
    public static void main(String[] args) {
        
        addDemoData();

        printMap(phonebook);

        printMapSortedByName(phonebook);

        printMapSortedByPhonesQuantity(phonebook);
        
    }

    private static void printMap(Map<String, ArrayList<String>> map) {
        System.out.println("Printing phonebook:");
        map.entrySet().forEach(System.out::println);
        System.out.println();
    }

    private static void printMapSortedByName(Map<String, ArrayList<String>> map) {
        System.out.println("Printing phonebook sorted by username:");
        map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(System.out::println);
        System.out.println();
    }

    private static void printMapSortedByPhonesQuantity(Map<String, ArrayList<String>> map) {
        System.out.println("Printing phonebook sorted by numbers quantity:");
        map.entrySet()
                    .stream()
                    .sorted((k1, k2) -> Integer.valueOf(k2.getValue().size()).compareTo(Integer.valueOf(k1.getValue().size())))
                    .forEach(System.out::println);
        System.out.println();
    }

    private static void addDemoData() {
        phonebook.put("Иванов", new ArrayList<>());
        phonebook.get("Иванов").add("79244431233");
        phonebook.get("Иванов").add("79164131255");
        phonebook.get("Иванов").add("79854131266");

        phonebook.put("Белов", new ArrayList<>());
        phonebook.get("Белов").add("79244431211");
        phonebook.get("Белов").add("79154431222");

        phonebook.put("Романов", new ArrayList<>());
        phonebook.get("Романов").add("79244431211");
        phonebook.get("Романов").add("79154431222");

        phonebook.put("Сидоров", new ArrayList<>());
        phonebook.get("Сидоров").add("79244431299");

        phonebook.put("Александров", new ArrayList<>());
        phonebook.get("Александров").add("79244431200");

        phonebook.put("Жуков", new ArrayList<>());
        phonebook.get("Жуков").add("79244431288");
    }

}
