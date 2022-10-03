package chapter4_Programming_with_classes.topic2.Task2;

import chapter4_Programming_with_classes.topic2.Task1.Sentence;
import chapter4_Programming_with_classes.topic2.Task1.Text;
import chapter4_Programming_with_classes.topic2.Task1.Word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task2 {
    private static SimpleDateFormat startTime = new SimpleDateFormat("HH:mm");

    public static String choice = "";

    private static void makeCarOperation(Car car) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int wheelBroken = (int) ( Math.random() * 2 );

        String start = "- What do you want? \n" +
                "- Enter \"1\" for driving car; \n" +
                "- Enter \"2\" for filling car;\n" +
                "- Enter \"3\" for change wheel; \n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {


            if (wheelBroken > 0){
                System.out.println("You need to change the wheel");
            }
            System.out.println("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    car.drive();
                    break;
                case "2":
                    car.refuel();
                    break;
                case "3":
                    car.changeWheel();
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
        if (wheelBroken > 0){
            System.out.println("Wheel is OK");
        }
    }

    public static void main(String[] args) throws Exception {
        Wheel bbs = new Wheel(18, false);
        Engine m50b25 = new Engine(2500, "gas");

        Car bmw = new Car(bbs, m50b25);
        makeCarOperation(bmw);
    }
}