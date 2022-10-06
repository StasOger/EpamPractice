package chapter4_Programming_with_classes.topic2.Task3;

import chapter4_Programming_with_classes.topic1.Task4.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task3 {
    public static String choice = "";

    private static void makeTextOperation(State belarus) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for printArea;\n" +
                "- Enter \"2\" for numberOfRegions;\n" +
                "- Enter \"3\" for capitalName;\n" +
                "- Enter \"4\" for printRegionCity;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    belarus.printArea();
                    break;
                case "2":
                    belarus.numberOfRegions();
                    break;
                case "3":
                    belarus.printCapital();
                    break;
                case "4":
                    belarus.printRegionCity();
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        City capitalOfBelarus = new City("Minsk");
        ArrayList<Region> regionsOfBelarus = new ArrayList<>();

        regionsOfBelarus.add(new Region("Minsk region", "Minsk"));
        regionsOfBelarus.add(new Region("Mogilev region", "Mogilev"));
        regionsOfBelarus.add(new Region("Brest region", "Brest"));
        regionsOfBelarus.add(new Region("Grodno region", "Grodno"));
        regionsOfBelarus.add(new Region("Gomel region", "Gomel"));
        regionsOfBelarus.add(new Region("Vitebsk region", "Vitebsk"));

        State belarus = new State("Belarus", capitalOfBelarus,200000, regionsOfBelarus);

        makeTextOperation(belarus);
    }
}
