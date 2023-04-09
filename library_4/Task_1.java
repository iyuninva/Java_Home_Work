package library_4;

import java.util.LinkedList;
import java.util.Random;

/**
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
 * вернёет «перевёрнутый» список.
 */
public class Task_1 {
    static LinkedList<Integer> list = new LinkedList<>();
    static LinkedList<Integer> flipList = new LinkedList<>();
    static int length = randomLengthList();

    public static void main(String[] args) {
        inputList();
    }

    static void inputList() {
        for(int i = 0; i < length; i++) {
            list.add(randomNumberList());
        }
        System.out.printf("Начальний List: %s", list);
        flipList();
    }

    static void flipList() {
        for(int i = 0; i < length; i++) {
            flipList.add(list.getLast());
            list.removeLast();
        }
        System.out.println();
        System.out.printf("Перевернутый List: %s", flipList);
    }

    static int randomNumberList() {
        Random random = new Random();
        int randomNumber = random.nextInt(-100, 100);
        return randomNumber;
    }

    static int randomLengthList() {
        Random random = new Random();
        int randomLength = random.nextInt(3, 10);
        return randomLength;
    }

}