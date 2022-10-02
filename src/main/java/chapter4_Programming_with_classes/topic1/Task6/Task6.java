package chapter4_Programming_with_classes.topic1.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//6. Составьте  описание  класса  для  представления  времени.  Предусмотрте  возможности установки  времени  и
//        изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//        недопустимых  значений полей  поле  устанавливается  в  значение  0.  Создать  методы  изменения  времени на
//        заданное количество часов, минут и секунд.

public class Task6 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        inputTime();
    }

    private static DateTime inputTime() throws IOException {

        System.out.print("Input hours: ");
        int h = scan.nextInt();
        if (h > 24){
            h = 0;
        }

        System.out.print("Input minutes: ");
        int m = scan.nextInt();
        if (m > 60){
            m = 0;
        }

        System.out.print("Input seconds: ");
        int s = scan.nextInt();
        if (s > 60){
            s = 0;
        }

        DateTime dateTime = new DateTime(h,m,s);
        System.out.println(dateTime.getHours() + ":" + dateTime.getMinutes() + ":" + dateTime.getSeconds());
        makeOperationWithTime(dateTime);
        return dateTime;
    }

    private static void makeOperationWithTime(DateTime dateTime) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for input time; \n" +
                "- Enter \"2\" for change default time;\n" +
                "- Enter \"3\" for change default time;\n" +
                "for end enter \"exit\"\n";
        System.out.println(start);
        String choice = "";
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    changeHours(dateTime);
                    System.out.println(dateTime.getHours() + ":" + dateTime.getMinutes() + ":" + dateTime.getSeconds());
                    break;
                case "2":
                    changeMinutes(dateTime);
                    System.out.println(dateTime.getHours() + ":" + dateTime.getMinutes() + ":" + dateTime.getSeconds());
                    break;
                case "3":
                    changeSeconds(dateTime);
                    System.out.println(dateTime.getHours() + ":" + dateTime.getMinutes() + ":" + dateTime.getSeconds());
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static int changeHours(DateTime dateTime) {
        int h = scan.nextInt();
        dateTime.setHours(h);
        return h;
    }

    private static int changeMinutes(DateTime dateTime) {
        int m = scan.nextInt();
        dateTime.setMinutes(m);
        return m;
    }

    private static int changeSeconds(DateTime dateTime) {
        int s = scan.nextInt();
        dateTime.setSeconds(s);
        return s;
    }
}
