package library_1;
import java.util.Scanner;

/**
 * Task_1
 * Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
 * чисел от 1 до n)
 */
public class Task_1 {

    int number;
    int result;
    String flag_mode;
    boolean flag = false;

    void InputMode() {
        do {
            System.out.print("Выберите режим работы программы 'n или n!': ");
            Scanner in = new Scanner(System.in);
            flag_mode = in.next();
            if (flag_mode.equals("n!")) {
                System.out.print("Введите число > 0: ");
                number = in.nextInt();
                in.close();
                flag = false;
                NumberMultiplier(number);
                break;
            } else if (flag_mode.equals("n")) {
                System.out.print("Введите число > 0: ");
                number = in.nextInt();
                in.close();
                flag = false;
                NumberSum(number);
                break;
            } else {
                System.out.println("Error: Некорректный ввод");
            }
        } while (!flag);
    }

    void NumberMultiplier(int number) {
        for (int i = 1; i < number; i++) {
            result = i * (i + 1);
        }
        System.out.println("Результат работы программы: " + result);
    }

    void NumberSum(int number) {
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println("Результат работы программы: " + result);
    }
}