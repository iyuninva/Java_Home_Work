package library_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int task;
        System.out.print("Выберите № задания: ");
        Scanner in = new Scanner(System.in);
        task = in.nextInt();
        switch (task) {
            case (1):
                Task_1 task_1 = new Task_1();
                task_1.;
                break;
            // case (2):
            //     Task_2 task_2 = new Task_2();
            //     task_2.;
            //     break;
            // case (3):
            //     Task_3 task_3 = new Task_3();
            //     task_3.;
            //     break;
        }
        in.close();
    }
}
