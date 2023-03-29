import java.util.Scanner;

/**
 * Main
 */
public class Main {
    static int task;

    public static void main(String[] args) {
        System.out.print("Выберите № задания: ");
        Scanner in = new Scanner(System.in);
        task = in.nextInt();
        switch(task) {
            case (1):
                Task_1 task_1 = new Task_1();
                task_1.InputMode();
                break;
            case (2):
                break;
            case (3):
                break;
            case (4):
                break;
            case (5):
                break;
            case (6):
                break;
            case (7):
                break;
            case (8):
                break;
            case (9):
                break;
        }
        in.close();
    }
}