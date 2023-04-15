package library_6;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class Data {

    public static HashSet<Laptop> dataLaptop = new HashSet<>();
    public static LinkedHashMap<Integer, Laptop> dataArticle = new LinkedHashMap<>();
    public static LinkedHashMap<Integer, String> dataType = new LinkedHashMap<>();
    public static LinkedHashMap<Integer, Integer> dataRam = new LinkedHashMap<>();
    public static LinkedHashMap<Integer, Integer> dataMemory = new LinkedHashMap<>();
    public static LinkedHashMap<Integer, Double> dataFrequency = new LinkedHashMap<>();
    public static LinkedHashMap<Integer, String> dataSystemName = new LinkedHashMap<>();
    public static LinkedHashMap<Integer, String> dataColor = new LinkedHashMap<>();

    static LinkedHashMap<Integer, String> filterListType() {
        dataType.put(1, "ASUS");
        dataType.put(2, "Lenovo");
        dataType.put(3, "ASER");
        dataType.put(4, "AOG");
        return dataType;
    }

    static LinkedHashMap<Integer, Integer> filterListRam() {
        dataRam.put(1, 16);
        dataRam.put(2, 8);
        dataRam.put(3, 32);
        return dataRam;
    }

    static LinkedHashMap<Integer, Integer> filterListMemory() {
        dataMemory.put(1, 1000);
        dataMemory.put(2, 500);
        dataMemory.put(3, 250);
        return dataMemory;
    }

    static LinkedHashMap<Integer, Double> filterListFrequency() {
        dataFrequency.put(1, 2.0);
        dataFrequency.put(2, 2.4);
        dataFrequency.put(3, 3.4);
        dataFrequency.put(4, 4.0);
        return dataFrequency;
    }

    static LinkedHashMap<Integer, String> filterListSystemName() {
        dataSystemName.put(1, "WIN10");
        dataSystemName.put(2, "WIN11");
        return dataSystemName;
    }

    static LinkedHashMap<Integer, String> filterListColor() {
        dataColor.put(1, "Black");
        dataColor.put(2, "White");
        return dataColor;
    }

    static void newList() {
        Laptop laptop_1001 = new Laptop("ASUS", 16, 1000, 2.4, "WIN10", "Black");
        addLaptop(laptop_1001);
        addArticle(System.identityHashCode(laptop_1001), laptop_1001);
        Laptop laptop_1002 = new Laptop("ASUS", 8, 500, 2.4, "WIN10", "Black");
        addLaptop(laptop_1002);
        addArticle(System.identityHashCode(laptop_1002), laptop_1002);
        Laptop laptop_1003 = new Laptop("Lenovo", 8, 250, 2.0, "WIN10", "Black");
        addLaptop(laptop_1003);
        addArticle(System.identityHashCode(laptop_1003), laptop_1003);
        Laptop laptop_1004 = new Laptop("ASER", 16, 500, 3.4, "WIN11", "White");
        addLaptop(laptop_1004);
        addArticle(System.identityHashCode(laptop_1004), laptop_1004);
        Laptop laptop_1005 = new Laptop("AOG", 32, 1000, 4.0, "WIN11", "Black");
        addLaptop(laptop_1005);
        addArticle(System.identityHashCode(laptop_1005), laptop_1005);
    }

    public static HashSet<Laptop> addLaptop(Laptop laptop) {
        dataLaptop.add(laptop);
        return dataLaptop;
    }

    public static LinkedHashMap<Integer, Laptop> addArticle(Integer article, Laptop laptop_1001) {
        dataArticle.put(article, laptop_1001);
        return dataArticle;
    }

}
