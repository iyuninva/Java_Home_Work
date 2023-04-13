package library_5;
import java.util.HashMap;
import java.util.Scanner;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

public class Task_1 {
    static HashMap<String, String> phoneBook = new HashMap<>();
    static Scanner in = new Scanner(System.in);
    static boolean flag;

    static void outputHashMapSurnameName() {
        String surnameName = scannerSurnameName();
        if ((HashMap().containsValue((surnameName))) == false) {
            System.out.println("Введенные значения отсутствуют в справочнике!");
            System.out.println("Повторите ввод? Для выхода введите q");
            if (scannerMode().equals("q")) {
                return;
            } else {
                outputHashMapSurnameName();
                return;
            }
        } else {
            System.out.println();
            System.out.println("Результат:");
            for (var key : HashMap().keySet()) {
                if ((HashMap().get(key).toLowerCase()).equals((surnameName).toLowerCase())) {
                    System.out.println(key + ": " + HashMap().get(key));
                }
            }
        }
    }

    static void outputHashMapNumber() {
        String number = scannerNumber();
        if ((HashMap().containsKey((number))) == false) {
            System.out.println("Введенные значения отсутствуют в справочнике!");
            System.out.println("Повторите ввод? Для выхода введите q");
            if (scannerMode().equals("q")) {
                return;
            } else {
                outputHashMapNumber();
                return;
            }
        } else {
            System.out.println();
            System.out.println("Результат:");
            for (var key : HashMap().keySet()) {
                if (key.equals(number)) {
                    System.out.println(key + ": " + HashMap().get(key));
                }
            }
        }
    }

    static HashMap<String, String> inputHashMap() {
        do {
            String key = scannerNumber();
            String values = scannerHashMapValues();
            if (!key.equals("")) {
                phoneBook.put(key, values);
            }
            System.out.println("Для завершения введите q! ");
            if (scannerMode().equals("q")) {
                flag = false;
                Mode();
                return phoneBook;
            }
        } while (flag);
        System.out.println(phoneBook);
        return phoneBook;
    }

    static HashMap<String, String> HashMap() {
        return phoneBook;
    }

    static String scannerSurnameName() {
        System.out.println();
        System.out.print("Введите Фамилию: ");
        String surname = in.next().toLowerCase();
        System.out.print("Введите Имя: ");
        String name = in.next().toLowerCase();
        String surnameName = surname.substring(0, 1).toUpperCase() + surname.substring(1) + " " +
                name.substring(0, 1).toUpperCase() + name.substring(1);
        return surnameName;
    }

    static String scannerNumber() {
        System.out.print("Введите номер телефона: ");
        String number = in.nextLine();
        return number;
    }

    static String scannerMode() {
        String mode = in.nextLine();
        return mode;
    }

    static String scannerHashMapValues() {
        System.out.print("Введите Фамилию и Имя: ");
        String values = in.nextLine();
        return values;
    }

    static void inputMode() {
        System.out.println("Произвести поиск по: Фамилии и Имени(SN)/Номеру телефона(N)?");
        String mode = scannerMode().toUpperCase();
        do {
            if (mode.equals("SN")) {
                System.out.print("Поиск по Фамилии и Имени: ");
                flag = true;
                outputHashMapSurnameName();
            } else if (mode.equals("N")) {
                System.out.print("Поиск по номеру телефона: ");
                flag = true;
                outputHashMapNumber();
            } else {
                System.out.println("ERROR: unknown input!");
            }
        } while (!flag);
    }

    static void Mode() {
        do {
            System.out.print("Создать справочник или произвести поиск? (input/search): ");
            String mode = scannerMode().toLowerCase();
            if (mode.equals("input")) {
                flag = true;
                inputHashMap();
            } else if (mode.equals("search")) {
                flag = true;
                inputMode();
            } else {
                System.out.println("ERROR: unknown input!");
            }
        } while (!flag);
    }

    public static void main(String[] args) {
        Mode();
    }
}
