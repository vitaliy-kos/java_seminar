package task01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class program {

    static class BubbleSort {

        public static void sort(int[] mas) {

            for (int i = 0; i < mas.length; i++) {

                for (int j = 0; j < mas.length; j++) {
                    if (mas[i] < mas[j]){
                        int temp = mas[j];
                        mas[j] = mas[i];
                        mas[i] = temp;
                    }
                }

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("y-MM-dd H:mm");
                String date_str = simpleDateFormat.format(new Date());

                try {
                    FileWriter writer = new FileWriter("log.txt", true);
                    BufferedWriter bufferWriter = new BufferedWriter(writer);
                    bufferWriter.write(date_str + " " + Arrays.toString(mas) + "\n");
                    bufferWriter.close();
                } catch (IOException e) {
                    System.out.println(e);
                }

            }
        
        }
    }

    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer{ 
        public static void main(String[] args) { 
        int[] arr = {};
        
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        }     
        
        BubbleSort ans = new BubbleSort();      
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    
}
