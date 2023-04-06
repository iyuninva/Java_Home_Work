/*
 * Реализовать алгоритм сортировки слиянием
 */

package library_3;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    static int[] array = new int[RandomLength()];

    public static void main(String[] args) {
        InputNumberArray();
    }

    static int[] InputNumberArray() {
        System.out.println("Начальный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomNumber();
        }
        System.out.println(Arrays.toString(array));
        if (array.length > 2) {
            array = NewArrayTemp(array);
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }

    static int RandomNumber() {
        Random random = new Random();
        int random_number = random.nextInt(-100, 100);
        return random_number;
    }

    static int RandomLength() {
        Random random = new Random();
        int random_number = random.nextInt(100);
        return random_number;
    }

    static int[] NewArrayTemp(int[] array) {
        if (array == null) {
            System.out.println("Error: Элементы отсутствуют");
            return null;
        }
        int length_arr = array.length / 2;
        if (array.length < 2) {
            return array;
        }
        if (array.length % 2 != 0) {
            length_arr += 1;
        }
        int[] arrayTempRight = new int[length_arr];
        int[] arrayTempLeft = new int[array.length / 2];
        for (int i = 0; i < array.length / 2; i++) {
            arrayTempLeft[i] = array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            arrayTempRight[i - array.length / 2] = array[i];
        }
        arrayTempLeft = NewArrayTemp(arrayTempLeft);
        arrayTempRight = NewArrayTemp(arrayTempRight);
        
        return SortMergeArray(arrayTempLeft, arrayTempRight);
    }

    static int[] SortMergeArray(int[] arrayTempLeft, int[] arrayTempRight) {
        int[] arrayEnd = new int[arrayTempLeft.length + arrayTempRight.length];
        int pos_1 = 0; 
        int pos_2 = 0;
        for (int i = 0; i < arrayEnd.length; i++) {
            if (pos_1 < arrayTempLeft.length && pos_2 < arrayTempRight.length) {
                if (arrayTempLeft[pos_1] < arrayTempRight[pos_2]) {
                    arrayEnd[i] = arrayTempLeft[pos_1];
                    pos_1++;
                } else {
                    arrayEnd[i] = arrayTempRight[pos_2];
                    pos_2++;
                }
            } else if (pos_1 == arrayTempLeft.length && pos_2 < arrayTempRight.length) {
                arrayEnd[i] = arrayTempRight[pos_2];
                pos_2++;
            } else if (pos_1 < arrayTempLeft.length && pos_2 == arrayTempRight.length) {
                arrayEnd[i] = arrayTempLeft[pos_1];
                pos_1++;
            } else {
                arrayEnd[i] = 0;
            }
        }
        return arrayEnd;
    }
}
