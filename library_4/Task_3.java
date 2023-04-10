package library_4;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
 */

public class Task_3 {

    static Scanner in = new Scanner(System.in);
    static String mode;
    static ArrayList<Integer> listNumber = new ArrayList<>();
    static ArrayList<Double> listNumberDouble = new ArrayList<>();
    static boolean flag;
    static Object tempInput = Integer.valueOf("1");
    static Object tempInputDouble = Double.valueOf("1.0");
    static int result;
    static double result_div;
    

    public static void main(String[] args) {
        calMode();
    }

    
    static void calMode() { // Выбор режима калькулятора 
        System.out.println("Выберите режим: + - * /");
        mode = scannerString();
        if(mode.equals("+")) {
            modeSum();
        } else if(mode.equals("-")) {
            modeDeduction();
        } else if(mode.equals("*")) {
            modeMultiplier();
        } else if (mode.equals("/")){
            modeDivision();
        } else {
            System.out.println("ERROR!!!");
            calMode();
        }
    }

    static ArrayList<Integer> calInputNumber() { // Заполнение листа чисел
        System.out.println();
        do {
            System.out.print("num: ");
            tempInput = scannerString();
            if(!tempInput.equals("end")) {
                if(!tempInput.equals("back")) {
                    int numberInput = Integer.parseInt((String) tempInput);
                    listNumber.add(numberInput);
                } else {
                    System.out.println("Отмена!");
                    listNumber.remove(listNumber.size() - 1);
                }
            } else {
                flag = true;
            }
        } while(!flag);
        return listNumber;
    }

    static ArrayList<Double> calInputDouble() { // Заполнение листа чисел
        System.out.println();
        do {
            System.out.print("num: ");
            tempInputDouble = scannerString();
            if(!tempInputDouble.equals("end")) {
                if(!tempInputDouble.equals("back")) {
                Double numberInputDouble = Double.parseDouble((String) tempInputDouble);
                listNumberDouble.add(numberInputDouble);
                } else {
                    System.out.println("Отмена!");
                    listNumberDouble.remove(listNumberDouble.size() - 1);
                }
            } else {
                flag = true;
            }
        } while(!flag);
        return listNumberDouble;
    }

    static int modeSum() { // Режим СУММА!
        calInputNumber();
        for(int i = 0; i < listNumber.size(); i++) {
            result += listNumber.get(i);
        }
        outputProgram();
        return result;
    }

    static int modeDeduction() { // Режим РАЗНОСТЬ!
        calInputNumber();
        for(int i = 1; i < listNumber.size(); i++) {
            result = listNumber.get(0) - listNumber.get(i);
        }
        outputProgram();
        return result;
    }

    static int modeMultiplier() { // Режим ПРОИЗВЕДЕНИЕ!
        calInputNumber();
        for(int i = 0; i < listNumber.size(); i++) {
            result *= - listNumber.get(i);
        }
        outputProgram();
        return result;
    }

    static double modeDivision() { // Режим ДЕЛЕНИЕ!
        calInputDouble();
        for(int i = 0; i < listNumberDouble.size(); i++) {
            if(listNumberDouble.get(i) == 0) {
                System.out.println("ERROR: Деление на ноль!");
                return 0;
            } else {
                result_div = (listNumberDouble.get(0) / listNumberDouble.get(i)) + (listNumberDouble.get(0) % listNumberDouble.get(i));
                outputProgramDouble();
                return result_div;
            }
        }
        return result_div;
    }

    static String scannerString() { // Сканер String
        String inputString = in.next();
        return inputString;
     }

     static void outputProgram() {
        System.out.print("Режим " + "(" + mode + ")");
        for(int i = 0; i < listNumber.size(); i++) {
            System.out.print(" " + listNumber.get(i));
        }
        System.out.print(" = " + result);
    }

    static void outputProgramDouble() {
        System.out.print("Режим " + "(" + mode + ")");
        for(int i = 0; i < listNumberDouble.size(); i++) {
            System.out.print(" " + listNumberDouble.get(i));
        }
        System.out.print(" = " + result_div);
    }

}