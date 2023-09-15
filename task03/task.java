package task03;

import java.util.HashMap;
import java.util.Map;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

public class task {
    
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap <>();
        db.putIfAbsent(123456, "Иванов");
        db.putIfAbsent(321456, "Васильев");
        db.putIfAbsent(234561, "Петрова");
        db.putIfAbsent(234432, "Иванов");
        db.putIfAbsent(654321, "Петрова");
        db.putIfAbsent(345678, "Иванов");
        
        System.out.println(db);

        for (Map.Entry<Integer, String> entry : db.entrySet()) {
            if (entry.getValue().equals("Иванов")) {
                System.out.println(entry);
            }
        }
        // System.out.println(db.containsValue("Иванов"));
    }
}
