package library_6;

import java.util.Scanner;

public class Config {
    public static Scanner in = new Scanner(System.in);

    static void modeCase() {
        switch (Main.filterPos()) {
            case 1:
                filterType();
                break;
            case 2:
                filterRam();
                break;
            case 3:
                filterMemory();
                break;
            case 4:
                filterFrequency();
                break;
            case 5:
                filterSystemName();
                break;
            case 6:
                filterColor();
                break;
            case 7:
                printAllModel();
                break;
            default:
                break;
        }
    }

    static void filterType() {
        System.out.print("Введите ключ: ");
        System.out.println(Data.filterListType());
        System.out.print("Поле ввода: ");
        int nameType = scannerInteger();
        if (Data.filterListType().containsKey(nameType)) {
            String temp = Data.filterListType().get(nameType);
            for (Laptop type : Data.dataLaptop) {
                if (type.getType().equalsIgnoreCase(temp)) {
                    System.out.println(type.toString());
                }
            }
        } else {
            printAllModel();
        }
    }

    static void filterRam() {
        System.out.print("Введите ключ: ");
        System.out.println(Data.filterListRam());
        System.out.print("Поле ввода: ");
        int ramSize = scannerInteger();
        if (Data.filterListRam().containsKey(ramSize)) {
            int temp = Data.filterListRam().get(ramSize);
            for (Laptop ram : Data.dataLaptop) {
                if (ram.getRam() == temp) {
                    System.out.println(ram.toString());
                }
            }
        } else {
            printAllModel();
        }
    }

    static void filterMemory() {
        System.out.print("Введите ключ: ");
        System.out.println(Data.filterListMemory());
        System.out.print("Поле ввода: ");
        int memorySize = scannerInteger();
        if (Data.filterListMemory().containsKey(memorySize)) {
            int temp = Data.filterListMemory().get(memorySize);
            for (Laptop memory : Data.dataLaptop) {
                if (memory.getMemory() == temp) {
                    System.out.println(memory.toString());
                }
            }
        } else {
            printAllModel();
        }
    }

    static void filterFrequency() {

        System.out.print("Введите ключ: ");
        System.out.println(Data.filterListFrequency());
        System.out.print("Поле ввода: ");
        int frequencySize = scannerInteger();
        if (Data.filterListFrequency().containsKey(frequencySize)) {
            Double temp = Data.filterListFrequency().get(frequencySize);
            for (Laptop frequency : Data.dataLaptop) {
                if (frequency.getFrequency() == temp) {
                    System.out.println(frequency.toString());
                }
            }
        } else {
            printAllModel();
        }
    }

    static void filterSystemName() {
        System.out.print("Введите ключ: ");
        System.out.println(Data.filterListSystemName());
        System.out.print("Поле ввода: ");
        int nameSystem = scannerInteger();
        if (Data.filterListSystemName().containsKey(nameSystem)) {
            String temp = Data.filterListSystemName().get(nameSystem);
            for (Laptop systemName : Data.dataLaptop) {
                if (systemName.getSystemName().equalsIgnoreCase(temp)) {
                    System.out.println(systemName.toString());
                }
            }
        } else {
            printAllModel();
        }
    }

    static void filterColor() {
        System.out.print("Введите ключ: ");
        System.out.println(Data.filterListColor());
        System.out.print("Поле ввода: ");
        int nameColor = scannerInteger();
        if (Data.filterListColor().containsKey(nameColor)) {
            String temp = Data.filterListColor().get(nameColor);
            for (Laptop color : Data.dataLaptop) {
                if (color.getColor().equalsIgnoreCase(temp)) {
                    System.out.println(color.toString());
                }
            }
        } else {
            printAllModel();
        }
    }

    static void printAllModel() {
        System.out.print("Полный список моделей: ");
        for (var key : Data.dataArticle.keySet()) {
            System.out.println();
            System.out.println("Артикул: " + key);
            System.out.println(Data.dataArticle.get(key));
        }
    }

    static String scannerString() {
        String nameType = in.next();
        return nameType;
    }

    static int scannerInteger() {
        int number = in.nextInt();
        return number;
    }

}
