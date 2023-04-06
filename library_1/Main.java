package library_1;
import java.util.Scanner;

public class Main {
    static int task;

    public static void main(String[] args) throws Exception {
        System.out.print("Выберите № задания: ");
        Scanner in = new Scanner(System.in);
        task = in.nextInt();
        switch (task) {
            case (1):
                Task_1 task_1 = new Task_1();
                task_1.InputMode();
                break;
            case (2):
                Task_2 task_2 = new Task_2();
                task_2.Result();
                break;
            case (3):
                Task_3 task_3 = new Task_3();
                task_3.СalMode();
                break;
            case (4):
                Task_4 task_4 = new Task_4();
                task_4.IntInput();
                break;
        }
        in.close();
    }
}