package library_5;

import java.util.Random;

/*
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

public class Task_3 {
    static int[] arrayList = new int[10];

    static void output() {
        System.out.println();
        System.out.print("Отсортированный результат: ");
        for (int el : arrayList) {
            System.out.print(el + " ");
        }
    }

    static void input() {
        System.out.println();
        System.out.print("Начальный список: ");
        for (int el : arrayList) {
            System.out.print(el + " ");
        }
    }

    static int leftSort(int i) {
        return (2 * i + 1);
    }

    static int rightSort(int i) {
        return (2 * i + 2);
    }

    static void swapNumberList(int[] arrayList, int i, int j) {
        int temp = arrayList[i];
        arrayList[i] = arrayList[j];
        arrayList[j] = temp;
    }

    static void heapify(int[] arrayList, int i, int size) {
        int leftSort = leftSort(i);
        int rightSort = rightSort(i);

        int maxx = i;

        if (leftSort < size && arrayList[leftSort] > arrayList[i]) {
            maxx = leftSort;
        }

        if (rightSort < size && arrayList[rightSort] > arrayList[maxx]) {
            maxx = rightSort;
        }
        if (maxx != i) {
            swapNumberList(arrayList, i, maxx);
            heapify(arrayList, maxx, size);
        }
    }

    static int pop(int[] arrayList, int size) {
        if (size <= 0) {
            return -1;
        }
        int top = arrayList[0];
        arrayList[0] = arrayList[size - 1];
        heapify(arrayList, 0, size - 1);

        return top;
    }

    static void separationArray() {
        int n = arrayList.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(arrayList, i--, n);
        }

        while (n > 0) {
            arrayList[n - 1] = pop(arrayList, n);
            n--;
        }
    }

    static int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(-100, 100);
        return randomNumber;
    }

    static int[] inputArrayNumber() {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = randomNumber();
        }
        return arrayList;
    }

    public static void main(String[] args) {
        inputArrayNumber();
        input();
        separationArray();
        output();
    }
}