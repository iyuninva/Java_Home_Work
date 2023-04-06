/*
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */

package library_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_3 {
    static ArrayList<Integer> list1 = new ArrayList<Integer>();
    static int maxNumber;
    static int minNumber;
    static int averageNumber;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int val = RandomNumber();
            list1.add(val);
        }
        System.out.printf("Начальный список %s\n", list1);
        maxNumber = list1.get(0);
        minNumber = list1.get(0);
        for (int i : list1) {
            if (i > maxNumber) {
                maxNumber = i;
            }
            else if (i < minNumber) {
                minNumber = i;
            }
            averageNumber += i;
        }
        float average = (float) averageNumber / list1.size();
        System.out.printf("Максимальное число: %s\nМинимальное число: %s\nСреднее число: %s\n", maxNumber, minNumber,
                average);
    }

    static int RandomNumber() {
        Random random = new Random();
        int random_number = random.nextInt(-100, 100);
        return random_number;
    }
}
