package chapter4_Programming_with_classes.topic1.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
//
//          Cоздайте  класс  Train,  содержащий  поля:  название  пункта  назначения,  номер  поезда,  время  отправления.
//        Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//        номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//        Добавьте  возможность  сортировки  массива  по  пункту  назначения,  причем  поезда  с  одинаковыми  пунктами
//        назначения должны быть упорядочены по времени отправления.

public class TrainSort {

    private static SimpleDateFormat startTime = new SimpleDateFormat("HH:mm");

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
        Train[] trains = new Train[12];

        List<Train> trainsList = new ArrayList<>();

        trains[0] = new Train(13, "Los Santos", startTime.parse("14:00"));
        trains[1] = new Train(44, "Las Venturas", startTime.parse("12:10"));
        trains[2] = new Train(1, "San Fierro", startTime.parse("06:20"));
        trains[3] = new Train(7, "Los Santos", startTime.parse("10:00"));
        trains[4] = new Train(77, "Las Venturas", startTime.parse("12:50"));
        trains[5] = new Train(88, "San Fierro", startTime.parse("10:20"));
        trains[6] = new Train(100, "Paris", startTime.parse("12:00"));
        trains[7] = new Train(41, "Moskow", startTime.parse("12:10"));
        trains[8] = new Train(69, "San Antonsk", startTime.parse("06:20"));
        trains[9] = new Train(96, "Liberty City", startTime.parse("10:00"));
        trains[10] = new Train(11, "Brooklyn", startTime.parse("12:10"));
        trains[11] = new Train(911, "Mordor", startTime.parse("06:20"));

        for (int i = 0; i<trains.length; i++){
            trainsList.add(trains[i]);
        }

        makeTextOperation(trainsList);
    }

    private static void sortTrainsByNumber(List<Train> trainsList) {
        trainsList.sort(COMPARE_BY_NUMBER);

        for(Train temp: trainsList){
            System.out.println("Number of train: "+ temp.getNumberOfTrain() + ", time of start: " + temp.getSt() + ", finish point: " + temp.getFinishPoint());
        }
    }

    private static final Comparator<Train> COMPARE_BY_NUMBER = (train1, train2) -> (int) (train1.getNumberOfTrain()-train2.getNumberOfTrain());

    private static void showInformationAboutTrain(List<Train> trainsList) {
        System.out.println("Input number of train: ");

        Scanner in1 = new Scanner(System.in);
        int i = in1.nextInt();

        Optional<Train> selectedTrain = trainsList.stream().filter(train -> train.getNumberOfTrain() == i).findFirst();
        if (selectedTrain.isPresent()){
            System.out.println(selectedTrain.get());
        } else {
            System.out.println("not found");
        }
    }

    private static void sortTrainsByFinishPoint(List<Train> trainsList) {
        trainsList.sort(COMPARE_BY_FINISH_POINT_OR_ST);

        for(Train temp: trainsList){
            System.out.println("Number of train: "+ temp.getNumberOfTrain() + ", time of start: " + temp.getSt() + ", finish point: " + temp.getFinishPoint());
        }
    }
    private static final Comparator<Train> COMPARE_BY_FINISH_POINT_OR_ST = Comparator.comparing(Train::getFinishPoint) .thenComparing(Train::getSt);

}
