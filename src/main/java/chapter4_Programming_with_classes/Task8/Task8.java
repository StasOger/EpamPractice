package chapter4_Programming_with_classes.Task8;

import chapter4_Programming_with_classes.Task4.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task8 {

    public static String choice = "";

    private static void makeTextOperation(List<Train> trainsList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for sorting trains by number; \n" +
                "- Enter \"2\" for sorting sentences by long words;\n" +
                "- Enter \"3\" for sorting leksem by discending \n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortTrainsByNumber(trainsList);
                    break;
                case "2":
                    showInformationAboutTrain(trainsList);
                    break;
                case "3":
                    sortTrainsByFinishPoint(trainsList);
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
        Customer[] customers = new Customer[12];

        List<Train> trainsList = new ArrayList<>();

        customers[0] = new Customer(1,
                "Pitt",
                "Brad",
                "901 W Manchester Blvd, Inglewood, CA 90301, United States",
                6969_6969_9696_9696L,
                "US32142222122222");
        customers[1] = new Customer(1,
                "Phelps",
                "Michael",
                "119 Culver Blvd, Playa Del Rey, CA 90293, United States",
                1111_1111_1111_1111L,
                "US12276467212222");
        customers[2] = new Customer(1,
                "Robbie",
                "Margot",
                "Los Angeles, CA 90068, United States",
                2222_2222_2222_2222L,
                "US69696969696969");
        customers[3] = new Customer(1,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                3333_3333_3333_3333L,
                "IT32142222122222");
        customers[4] = new Customer(1,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                4444_4444_4444_4444L,
                "IT32142222122222");
        customers[5] = new Customer(1,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                5555_5555_5555_5555L,
                "IT32142222122222");
        customers[6] = new Customer(1,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                6666_6666_6666_6666L,
                "IT32142222122222");
        customers[7] = new Customer(1,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                7777_7777_7777_7777L,
                "IT32142222122222");
        customers[8] = new Customer(1,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                8888_8888_8888_8888L,
                "IT32142222122222");
        customers[9] = new Customer(1,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                9999_9999_9999_9999L,
                "IT32142222122222");


        for (int i = 0; i<trains.length; i++){
            trainsList.add(trains[i]);
        }

        makeTextOperation(trainsList);
    }
}
