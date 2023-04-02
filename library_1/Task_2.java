package library_1;
/**
 * Task_2
 * Вывести все простые числа от 1 до 1000
 */

public class Task_2 {
    int count = 0;

    void Result() {
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + "; ");
            }
            count = 0;
        }
    }
}