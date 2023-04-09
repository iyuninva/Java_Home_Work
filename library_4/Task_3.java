package library_4;

import java.util.Scanner;

/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */

public class Task_3 {
    static String mode;
    static int number_1;
    static int number_2;
    static int result;
    static double result_div;
    static boolean flag = false;

    public static void main(String[] args) {
        СalMode();
    }

    static void СalMode() {
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Выберите режим калькулятора ('+' '-' '*' '/') :");
            mode = in.next();
            if (mode.equals("+")) {
                flag = false;

                number_1 = in.nextInt();
        
                number_2 = in.nextInt();
                System.out.printf("%s %s %s = ", number_1, mode, number_2);
                ModeSum(number_1, number_2);
                break;
            } else if (mode.equals("-")) {
                flag = false;
                System.out.print("Number - 1 = ");
                number_1 = in.nextInt();
                System.out.print("Number - 2 = ");
                number_2 = in.nextInt();
                ModeDeduction(number_1, number_2);
                break;
            } else if (mode.equals("*")) {
                flag = false;
                System.out.print("Number - 1 = ");
                number_1 = in.nextInt();
                System.out.print("Number - 2 = ");
                number_2 = in.nextInt();
                ModeMultiplier(number_1, number_2);
                break;
            } else if (mode.equals("/")) {
                flag = false;
                System.out.print("Number - 1 = ");
                double number_1 = in.nextDouble();
                System.out.print("Number - 2 = ");
                double number_2 = in.nextDouble();
                ModeDivision(number_1, number_2);
                break;
            } else {
                System.out.println("Error: Некорректный ввод");
            }

        } while (!flag);
    }

    static int ModeSum(int number_1, int number_2) {
        result = number_1 + number_2;
        return PrintOutput(result);
    }

    static int ModeDeduction(int number_1, int number_2) {
        result = number_1 - number_2;
        return PrintOutput(result);
    }

    static int ModeMultiplier(int number_1, int number_2) {
        result = number_1 * number_2;
        return PrintOutput(result);
    }

    static double ModeDivision(double number_1, double number_2) {
        if (number_2 == 0) {
            System.out.println("Error: на 0 делить нельзя!");
            return 0;
        } else {
            if (number_1 % number_2 == 0) {
                result_div = (number_1 / number_2) + (number_1 % number_2);
                System.out.println(String.format("%.0f", result_div));
                return result_div;
            } else {
                result_div = (number_1 / number_2) + (number_1 % number_2);
                return PrintOutputDouble(result_div);
            }
        }
    }

    static int PrintOutput(int result) {
        System.out.println(result);
        return result;
    }

    static double PrintOutputDouble(double result_div) {
        System.out.println(result_div);
        return result_div;
    }

}
