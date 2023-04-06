/*
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
package library_3;

import java.util.ArrayList;
import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = random.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Начальный список %s\n", list1);
        int i = 0;
        while (i < list1.size()) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Конечный список %s", list1);
    }
}
