package library_5;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

/*
 * Пусть дан список сотрудников:
 * Иван Иванов
 * Светлана Петров
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */

public class Task_2 {
    static LinkedHashMap<String, String> list = new LinkedHashMap<>();
    static LinkedHashMap<String, Integer> listSumName = new LinkedHashMap<>();
    static LinkedHashMap<String, Integer> sortedList = new LinkedHashMap<>();

    static Scanner in = new Scanner(System.in);
    static int count = 0;
    static boolean flag;

    static void sortedList() {
        count = Collections.max(listSumName.values());
        for (var key : listSumName.keySet()) {
            for (var keyTemp : listSumName.keySet()) {
                if(listSumName.get(keyTemp) > count) {
                    sortedList.put(keyTemp, listSumName.get(keyTemp));
                }
            }
            count--;
        }
        System.out.println();
        System.out.println("Отсортированный список: ");
        for (var key : sortedList.entrySet()) {
            System.out.println(key);
        }
    }

    static void outputSumName() {
        for (var key : putList().keySet()) {
            for (var keyTemp : putList().keySet()) {
                if ((putList().get(key)).equals(putList().get(keyTemp))) {
                    count++;
                    listSumName.put(putList().get(keyTemp), count);
                }
            }
            count = 0;
        }
        System.out.println();
        System.out.println("Начальный список Имен: ");
        for (var key : listSumName.entrySet()) {
            System.out.println(key);
        }
        sortedList();
    }

    static LinkedHashMap<String, String> putList() {
        list.put("Иванов", "Иван");
        list.put("Петрова", "Светлана");
        list.put("Белова", "Кристина");
        list.put("Мусина", "Анна");
        list.put("Крутова", "Анна");
        list.put("Юрин", "Иван");
        list.put("Лыков", "Петр");
        list.put("Чернов", "Павел");
        list.put("Федорова", "Мария");
        list.put("Светлова", "Марина");
        list.put("Савина", "Мария");
        list.put("Рыкова", "Мария");
        list.put("Лугова", "Марина");
        list.put("Владимирова", "Анна");
        list.put("Мечников", "Иван");
        list.put("Петин", "Петр");
        list.put("Ежов", "Иван");
        return list;
    }

    public static void main(String[] args) {
        outputSumName();
    }
}
