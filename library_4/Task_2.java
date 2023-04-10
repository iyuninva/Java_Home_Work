package library_4;
/*
* Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя.
*/

import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {

    static LinkedList<Integer> list = new LinkedList<>();
    static LinkedList<Integer> listEnqueue = new LinkedList<>();
    static LinkedList<Integer> listDequeue = new LinkedList<>();
    static LinkedList<Integer> listFirst = new LinkedList<>();
    static int SIZE = 5;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        inputList();
        enqueue();
        dequeue();
        first();
    }

    static void inputList() {
        for (int i = 1; i <= SIZE; i++) {
            list.add(i);
        }
        System.out.printf("Начальний List: %s", list);
        System.out.println();
    }

    static void enqueue() {
        System.out.println();
        System.out.print("Введите элемент enqueue: ");
        int temp = scanner();
        in.close();
        for (int i = 1; i <= SIZE; i++) {
            listEnqueue.add(i);
        }
        for (int i = 1; i <= SIZE; i++) {
            if (i == temp) {
                listEnqueue.addLast(temp);
                listEnqueue.remove(i - 1);
            }
        }
        System.out.printf("enqueue List: %s", listEnqueue);
        System.out.println();
    }

    static void dequeue() {
        for (int i = 1; i <= SIZE; i++) {
            listDequeue.add(i);
        }
        System.out.println();
        System.out.printf("Возвращенный элемент: %s", listDequeue.removeFirst());
        System.out.println();
        System.out.printf("dequeue List: %s", listDequeue);
        System.out.println();
    }

    static void first() {
        for (int i = 1; i <= SIZE; i++) {
            listFirst.add(i);
        }
        System.out.println();
        System.out.printf("Возвращенный элемент: %s", listFirst.getFirst());
        System.out.println();
        System.out.printf("first List: %s", listFirst);
        System.out.println();
    }

    public static int scanner() {
        int inputNumber = in.nextInt();
        return inputNumber;
    }
}
