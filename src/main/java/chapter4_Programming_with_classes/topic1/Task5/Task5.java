package chapter4_Programming_with_classes.topic1.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static String choice = "";

    public static void main(String[] args) throws Exception {

        Count count1 = new Count(5, 10, 6);
        int count2min = (int) (0 + Math.random()*15);
        int count2max = count2min + 7;
        int count2current = (int) (count2min + Math.random()*count2max);
        Count count2 = new Count(count2min,count2max,count2current);

        makeRandomOrDefault(count1, count2);

    }


//    TODO COUNT1,COUNT2 -> COUNT
    private static Count makeRandomOrDefault(Count count1, Count count2) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for initialization of the counter with random values; \n" +
                       "- Enter \"2\" for initializing the counter with default values;\n" +
                       "for end enter \"exit\"\n";
        System.out.println(start);

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    countRandom(count2);
                    break;
                case "2":
                    countDefault(count1);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
        return null;
    }

    private static Count countDefault(Count count) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for increment value; \n" +
                "- Enter \"2\" for decrement value;\n" +
                "for end enter \"exit\"\n";
        System.out.println(start);

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    count.increment();
                    System.out.println("count = " + count.value());
                    break;
                case "2":
                    count.decrement();
                    System.out.println("count = " + count.value());
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
        return null;
    }

    private static Count countRandom(Count count) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for increment value; \n" +
                "- Enter \"2\" for decrement value;\n" +
                "for end enter \"exit\"\n";
        System.out.println(start);

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    count.increment();
                    System.out.println("count = " + count.value());
                    break;
                case "2":
                    count.decrement();
                    System.out.println("count = " + count.value());
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
        return null;
    }
}
