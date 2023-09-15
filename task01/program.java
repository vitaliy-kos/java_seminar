package task01;

public class Program {
    public static void main(String[] args) {
        GbStack<String> stack = new GbStack<>();

        // System.out.println(stack.size());
        stack.push("aasdsa");
        // System.out.println(stack);
        // stack.pop();
        // System.out.println(stack.size());
        System.out.println(stack);
    }
}

// import java.util.ArrayDeque;
// import java.util.Deque;
// import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

// public class Program {
//     static Deque<String> db = new ArrayDeque<>();
//     static Scanner scan = new Scanner(System.in);

//     public static void main(String[] args) {

//         while (true) {
//             run();
//         }
        
//     }

//     private static String getStringFromUser (){
//         System.out.println("Введите данные: ");
//         return scan.next();
//     }

//     private static void run() {
//         String string = getStringFromUser();

//         if (string.equalsIgnoreCase("q")) {
//             scan.close();
//             System.exit(0);
//         }

//         if (string.equalsIgnoreCase("print")) {
//             System.out.println(db);
//         } else if (string.equalsIgnoreCase("revert")) {
//             db.pop();
//             System.out.println(db);
//         } else {
//             db.push(string);
//         }

//     }
    
// }



// import java.util.*;

// Реализовать консольное приложение, которое:
// Принимает от пользователя строку вида 
// text:num
// Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
// Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.

// public class Program {
//     static List<String> str = new LinkedList<>();

//     public static void main(String[] args) {
        
//         while (true) {
//             run();
//         }

//     }

//     private static String getStringFromUser (){
//         System.out.println("Введите данные: ");
//         Scanner scan = new Scanner(System.in);
//         scan.close();
//         return scan.next();
//     }

//     private static void run() {
//         String string = getStringFromUser();
//         String[] strArray = string.split(":");
//         String strText = strArray[0];
//         int index = Integer.parseInt(strArray[1]);
//         if (index > str.size()) {
//             for(int i = 0; i < index; i++){
//                 str.add(null);
//             }
//         }
//         if (!string.startsWith("print")) {
//             str.add(index, strText);
//         } else {
//             System.out.println(str.get(index));
//             str.remove(index);
//         }
//     }
// }


// public class program {

//     public static class Node {
//         int val;
//         Node next;
    
//         public Node(int val) {
//             this.val = val;
//             this.next = null;
//         }

//         public Node getNext() {
//             return this.next;
//         }

//         public void setNext(Node node) {
//             this.next = node;
//         }

//     }
    
//     public static class Answer {
//         Node head;

//         public void reverse() {
            
//             Node previous = null;
//             Node current = head;
//             while (current != null) {
//                 Node nextElement = current.getNext();
//                 current.setNext(previous);
//                 previous = current;
//                 current = nextElement;
//             }
//             head = previous;
    
//         }

//     }
    
//     public class Printer {
//         public static void main(String[] args) {
//             // Создаем связанный список 1 -> 2 -> 3 -> 4
//             Node head;
//             if (args.length == 0) {
//                 head = new Node(1);
//                 head.next = new Node(2);
//                 head.next.next = new Node(3);
//                 head.next.next.next = new Node(4);
//             } else {
//                 head = new Node(Integer.parseInt(args[0]));
//                 head.next = new Node(Integer.parseInt(args[1]));
//                 head.next.next = new Node(Integer.parseInt(args[2]));
//                 head.next.next.next = new Node(Integer.parseInt(args[3]));
//             }
    
//             // Сохраняем голову списка в поле класса Answer
//             Answer ans = new Answer();
//             ans.head = head;
//             // Инвертируем порядок элементов списка
//             ans.reverse();
    
//             // Выводим инвертированный порядок элементов списка
//             Node current = ans.head;
//             while (current != null) {
//                 System.out.print(current.val + " ");
//                 current = current.next;
//             }
//             System.out.println();
//         }
//     }


// }

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileReader;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Arrays;
// import java.text.SimpleDateFormat;
// import java.util.Date;

// public class program {

//     static class BubbleSort {

//         public static void sort(int[] mas) {

//             int min = 0;
//             String res = "";
//             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-MM-dd H:mm");

//             if (mas[0] == 9 && mas.length > 5) {
//                 min = 2;
//             }
            
//             for (int i = 0; i < mas.length - min; i++) {
//                 for (int j = 0; j < mas.length - i - 1; j++) {
//                     if (mas[j] > mas[j + 1]){
//                         int temp = mas[j];
//                         mas[j] = mas[j + 1];
//                         mas[j + 1] = temp;
//                     }
//                 }

//                 String date_str = simpleDateFormat.format(new Date());
//                 res = res + date_str + " " + Arrays.toString(mas) + "\n";

//             }

//             try {
//                 FileWriter writer = new FileWriter("log.txt", false);
//                 BufferedWriter bufferWriter = new BufferedWriter(writer);
//                 bufferWriter.write(res);
//                 bufferWriter.close();
//             } catch (IOException e) {
//                 System.out.println(e);
//             }
        
//         }
//     }

//     // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
//     public class Printer{ 
//         public static void main(String[] args) { 
//         int[] arr = {};
        
//         if (args.length == 0) {
//             // При отправке кода на Выполнение, вы можете варьировать эти параметры
//             arr = new int[]{9, 4, 8, 3, 1};
//             // arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
//             // arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//         }
//         else{
//             arr = Arrays.stream(args[0].split(", "))
//                             .mapToInt(Integer::parseInt)
//                             .toArray();
//         }     
        
//         BubbleSort ans = new BubbleSort();      
//         ans.sort(arr);

//         try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
//                 String line;
//                 while ((line = br.readLine()) != null) {
//                     System.out.println(line);
//                 }
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }

    
// }
