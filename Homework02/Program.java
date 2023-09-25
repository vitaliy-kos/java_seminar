package Homework02;

import java.util.HashSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Program {
    static Set<Laptop> laptopBase = new HashSet<>();
    static Map<Integer, String> filter = new HashMap<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        createLaptopBase();
        createFilter();

        Integer numFilter = userFilterInput();

        if (numFilter <= 0 || numFilter >= 6) {
            System.out.println("Inserted filter number is incorrect.");
        } else {
            String valueFilter = userValueInput(numFilter).toUpperCase();

            printFilteredBase(numFilter, valueFilter);
        }

        input.close();
    }

    public static void printFilteredBase(Integer filter, String value){

        String resStr = "Result of filtering: \n";

        for (Laptop laptop : laptopBase) {
            switch (filter) {
                case (1):
                    if (laptop.brand.toString().equals(value)) resStr = resStr + laptop + "\n";
                    break;
                case (2):
                    if (laptop.color.toString().equals(value)) resStr = resStr + laptop + "\n";
                    break;
                case (3):
                    if (laptop.os.toString().equals(value)) resStr = resStr + laptop + "\n";
                    break;
                case (4):
                    if (laptop.hard >= Integer.parseInt(value)) resStr = resStr + laptop + "\n";
                    break;
                case (5):
                    if (laptop.ram >= Integer.parseInt(value)) resStr = resStr + laptop + "\n";
                    break;
            }
        }

        System.out.println(resStr);
    }

    public static Integer userFilterInput(){

        System.out.println("-------------");
        String filterChooseStr = String.format("Input number of parameter you need %s:", filter.entrySet());
        System.out.println(filterChooseStr);
        Integer id_filter = input.nextInt();

        return id_filter;
    }

    public static String userValueInput(Integer filter){

        String strVal = "";

        switch (filter) {
            case  (1):
                strVal = Arrays.toString(Brand.values());
                break;
            case (2):
                strVal = Arrays.toString(Color.values());
                break;
            case (3):
                strVal = Arrays.toString(Os.values());
                break;
            case (4):
                strVal = "(minimal value)";
                break;
            case (5):
                strVal = "(minimal value)";
                break;
        }

        System.out.println("Insert value you need " + strVal + ":");
        String valueFilter = input.next();
        input.close();

        return valueFilter;
    }

    public static void createLaptopBase(){
        Laptop laptop1 = new Laptop(1, Brand.HP, Color.BLACK, Os.WINDOWS, 100, 4);
        Laptop laptop2 = new Laptop(2, Brand.LENOVO , Color.WHITE, Os.LINUX, 200, 8);
        Laptop laptop3 = new Laptop(3, Brand.MAC , Color.WHITE, Os.MACOS, 100, 8);        
        Laptop laptop4 = new Laptop(4, Brand.SAMSUNG , Color.PURPLE, Os.WINDOWS, 500, 8);
        Laptop laptop5 = new Laptop(5, Brand.LENOVO , Color.BLACK, Os.WINDOWS, 900, 8);
        Laptop laptop6 = new Laptop(6, Brand.MAC , Color.GREY, Os.MACOS, 1000, 16);
        Laptop laptop7 = new Laptop(7, Brand.HP , Color.WHITE, Os.LINUX, 200, 8);
        Laptop laptop8 = new Laptop(8, Brand.LENOVO , Color.GREY, Os.WINDOWS, 400, 8);
        Laptop laptop9 = new Laptop(9, Brand.SAMSUNG , Color.GREEN, Os.WINDOWS, 300, 8);
        Laptop laptop10 = new Laptop(10, Brand.MAC , Color.BLACK, Os.MACOS, 500, 16);

        laptopBase.add(laptop1);
        laptopBase.add(laptop2);
        laptopBase.add(laptop3);
        laptopBase.add(laptop4);
        laptopBase.add(laptop5);
        laptopBase.add(laptop6);
        laptopBase.add(laptop7);
        laptopBase.add(laptop8);        
        laptopBase.add(laptop9);
        laptopBase.add(laptop10);
    }

    public static void createFilter(){
        filter.put(1, "Brand");
        filter.put(2, "Color");
        filter.put(3, "OS");
        filter.put(4, "Hard drive");
        filter.put(5, "Ram");
    }
}