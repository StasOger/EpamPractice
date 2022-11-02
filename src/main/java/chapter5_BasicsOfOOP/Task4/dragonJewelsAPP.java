package chapter5_BasicsOfOOP.Task4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class dragonJewelsAPP {

    public static void main(String[] args) throws IOException {
        Coin coin1 = new Coin("coin", "dhdhfd", 21, 21, "metall", "iamgay");
        System.out.println(coin1.getTypeOfJewels() + coin1.getPrice() + "$");

        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String start = "What can I help you? \n" +
                "- Enter \"1\" for show the jewels;\n" +
                "- Enter \"2\" for show the most expensive jewels;\n" +
                "- Enter \"3\" for show jewels for a given amount;\n" +
                "for end enter \"exit\"\n";
        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
//                    Files.lines(Paths.get("src/main/resources/Jewels.txt")).forEach(line -> System.out.println(line));
//
//                    List<String> list = Files.readAllLines(Paths.get("src/main/resources/Jewels.txt"));
//
//                    for (String item : list) {
//                        System.out.println(item);
//                    }

                    showTheJewels();
                    break;
                case "2":
//                    showTheMostExpensiveJewels();
                    break;
                case "3":
//                    showJewelsForAgivenAmount();
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void showTheJewels() {
        List<JewelModel> jewels = readJewelsFromCSV("src/main/resources/Jewels.csv");
//        let's print all the person read from CSV file
        for (JewelModel b : jewels) {
            System.out.println(b);
        }
    }

    private static List<JewelModel> readJewelsFromCSV(String fileName) {
        List<JewelModel> jewels = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
            // read the first line from the text file
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");
                JewelModel jewel = createJewels(attributes);
//                   adding book into ArrayList
                jewels.add(jewel);
                // read next line before looping
                // if end of file reached, line would be null
                 line = br.readLine();
            }
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return jewels;
    }

    private static JewelModel createJewels(String[] metadata) {
        String typeOfJewels = metadata[0];
        String name = metadata[1];
        int price = Integer.parseInt(metadata[2]);
        int weight = Integer.parseInt(metadata[3]);
        String material = metadata[4];
        String comment = metadata[5];
        // create and return book of this metadata
        return new JewelModel(typeOfJewels, name, price, weight, material, comment);
    }
}
