import java.util.Random;
import java.util.Scanner;

/*
 * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
 * например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */

public class Task_4 {

    private StringBuilder str_num_1;
    private StringBuilder str_num_2;
    private int result;
    char set = '?';
    private int number_1;
    private int number_2;

    void IntInput() {
        System.out.println("Введите выражения");
        Scanner in = new Scanner(System.in);

        System.out.println("Первое число: ");
        int number_1 = in.nextInt();
        this.number_1 = number_1;
        StringBuilder str_num_1 = new StringBuilder();
        str_num_1.append(number_1);
        this.str_num_1 = str_num_1;

        System.out.println("Второе число: ");
        int number_2 = in.nextInt();
        this.number_2 = number_2;
        StringBuilder str_num_2 = new StringBuilder();
        str_num_2.append(number_2);
        this.str_num_2 = str_num_2;

        System.out.println("Результат равенства: ");
        int result = in.nextInt();
        this.result = result;
        in.close();
        ResultSum();
    }

    public StringBuilder FirstNumber() {
        str_num_1.setCharAt(PositionRandom(), set);
        return str_num_1;
    }

    public StringBuilder SecondNumber() {
        str_num_2.setCharAt(PositionRandom(), set);
        return str_num_2;
    }

    public int ResultNumber() {
        return result;
    }

    void ResultSum() {
        System.out.println();
        System.out.println("Дано равенство:");
        System.out.printf("%s + %s = %d \n", FirstNumber(), SecondNumber(), ResultNumber());
        int index_num_1 = FirstNumber().indexOf("?");
        int index_num_2 = FirstNumber().indexOf("?");
        int num_1;
        int num_2;
        boolean flag = false;

        System.out.println("Результат работы программы:");
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                if (index_num_1 == 1) {
                    String str_count_1 = "" + number_1 / 10 + i;
                    num_1 = Integer.parseInt(str_count_1);
                } else {
                    String str_count_1 = "" + i + number_1 % 10;
                    num_1 = Integer.parseInt(str_count_1);
                }
                if (index_num_2 == 1) {
                    String str_count_2 = "" + number_2 / 10 + j;
                    num_2 = Integer.parseInt(str_count_2);
                } else {
                    String str_count_2 = "" + j + number_2 % 10;
                    num_2 = Integer.parseInt(str_count_2);
                }
                if (num_1 + num_2 == result) {
                    System.out.printf("%d + %d = %d \n", num_1, num_2, ResultNumber());
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Решение не возможно!");
        }
    }

    int PositionRandom() {
        Random rand = new Random();
        int random_number = rand.nextInt(2);
        return random_number;
    }

}
