// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package library_2.Task_2;

import java.io.IOException;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("logTask2.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Требуется сортировка: ");
        int[] array = { 2, 5, 1, -7, 3, 64, 0 };
        ConfigOut.printArrInt(array);
        int[] newArr = listSort(array);
        System.out.printf("\nСортировка: ");
        ConfigOut.printArrInt(newArr);
    }

    public static int[] listSort(int[] arr) {
        for (int k = 0; k < arr.length - 1; k++) {

            for (int i = 0; i < arr.length - k - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
