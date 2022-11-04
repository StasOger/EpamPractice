package chapter5_BasicsOfOOP.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingPresent {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String choice = "";
        String start = "What do you want to add in present?\n"+
                "- Enter \"1\" for add sweets;\n" +
                        "- Enter \"2\" for choise a package;\n" +
                        "- Enter \"3\" for show a present;\n" +
                        "for end enter \"exit\"\n";
        System.out.println(start);

        List<Package> packagePresents = new ArrayList<>();
        packagePresents.add(new Package(1,"black", "gradient", "cube", 100, 51));
        packagePresents.add(new Package(2,"red", "monotone", "cube", 100, 29));
        packagePresents.add(new Package(3,"all color", "striped", "cylinder", 100, 59));

        List<Sweets> sweets = new ArrayList<>();
        sweets.add(new Sweets(1,"CHOCOLATE", "Nutella", 100, 7.99));
        sweets.add(new Sweets(2,"CANDIES", "Mars", 100, 6.99));
        sweets.add(new Sweets(3,"ZEFIR", "Krasniy pischevik", 100, 5.99));

        List<Sweets> choisedSweet = new ArrayList<>();

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    choiceASweets(sweets, choisedSweet);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void choiceASweets(List<Sweets> sweets, List<Sweets> choisedSweet) {
        for (Sweets b: sweets){
            System.out.println(b);
        }

        System.out.println("What do you choise?");

        Scanner in1 = new Scanner(System.in);
        int idOfChoisedSweet = in1.nextInt();

        for (Sweets b: sweets){
            if (b.getId() == idOfChoisedSweet){
                choisedSweet.add(b);
            }
        }

        for (Sweets b: choisedSweet){
            System.out.println(b);
        }
    }
}
