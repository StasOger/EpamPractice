//package chapter4_Programming_with_classes.Task4;
//import java.io.IOException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//public class Task4_Train {
//
//    private long numberOfTrain;
//
//    private String finishPoint;
//
//    private Date st;
//
//
//    private static SimpleDateFormat startTime = new SimpleDateFormat("HH:mm");
//
//    public Task4_Train(long numberOfTrain, String finishPoint, Date st) {
//        this.numberOfTrain = numberOfTrain;
//        this.finishPoint = finishPoint;
//        this.st = st;
//    }
//
//    public long getNumberOfTrain() {
//        return numberOfTrain;
//    }
//
//    public void setNumberOfTrain(long numberOfTrain) {
//        this.numberOfTrain = numberOfTrain;
//    }
//
//    public String getFinishPoint() {
//        return finishPoint;
//    }
//
//    public void setFinishPoint(String finishPoint) {
//        this.finishPoint = finishPoint;
//    }
//
//    public Date getSt() {
//        return st;
//    }
//
//    public void setSt(Date st) {
//        this.st = st;
//    }
//
//
//    public static class MyComparator implements Comparator {
//
//        @Override
//        public int compare(Object o1, Object o2) {
//            Task4_Train train1 = (Task4_Train) o1;
//            Task4_Train train2 = (Task4_Train) o2;
//            if (train1.getNumberOfTrain() < train2.getNumberOfTrain()) {// Установить порядок сортировки здесь
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//
//
//        public static void main(String[] args) {
//
//
//            trains[0] = new Task4_Train(4, "St-Peterburg", startTime.parse("10:00"));
//            trains[1] = new Task4_Train(5, "Los Angeles", startTime.parse("12:00"));
//            trains[2] = new Task4_Train(6, "Sochi", startTime.parse("00:00"));
//            trains[3] = new Task4_Train(7, "Los Santos", startTime.parse("03:30"));
//            trains[4] = new Task4_Train(1, "Murmansk", startTime.parse("10:40"));
//            trains[5] = new Task4_Train(2, "Moskow", startTime.parse("21:44"));
//            trains[6] = new Task4_Train(44, "Liberty City", startTime.parse("17:13"));
//            trains[7] = new Task4_Train(33, "Vice City", startTime.parse("12:49"));
//
//            List<Task4_Train> list = new ArrayList<>();
//
//            Comparator comp = new MyComparator();
//            Collections.sort(list, comp);
//
//
////        for (int i = 0; i< trains.length;i++){
////            list.add(trains[i]);
////        }
////
////        System.out.println("-------до сортировки--------");
////        for (Task4_Train u : list) {
////            System.out.println(u);
////        }
////        System.out.println("-------после сортировки-----");
////        Collections.sort(list);
////        for (Task4_Train u : list) {
////            System.out.println(u);
////        }
//
//
////        sortByNumber(trains);
////
////        for (Task4_Train train : trains) {
////            System.out.println(train.numberOfTrain);
////        }
//        }
//
////    private static void makeSortTrains(Task4_Train [] trains) throws IOException {
////        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////        String start = "- Enter \"1\" for sorting paragraphs by number of train \n" +
////                "- Enter \"2\" for sorting sentences by long words;\n" +
////                "- Enter \"3\" for sorting leksem by discending \n" +
////                "for end enter \"exit\"\n";
////        String choice = "";
////        System.out.println(start);
////
////        while (!choice.equalsIgnoreCase("exit")) {
////            System.out.print("Enter command: ");
////            choice = reader.readLine();
////            switch (choice) {
////                case "1":
////                    sortByNumber(trains);
//////                    for (int i = 0; i< trains.length; i++){
//////                        System.out.println(trains[i]);
//////                    }
////                    break;
////                case "2":
////                    System.out.println(1212);
////                    break;
////                case "3":
////                    System.out.println(1212);
////                    break;
////                case "exit":
////                    System.out.println("\nOver.");
////                    break;
////                default:
////                    System.out.println("Incorrect. Please repeat one more time.\n");
////            }
////        }
////    }
//
//        private static void sortByNumber(Task4_Train[] trains) {
//            Task4_Train temp;
//
////        for(int i = 0; i<trains.length-1; i++) {
////            for (int j = i+1; j< trains.length; j++) {
////                if(trains[i].numberOfTrain.compareTo(trains[i].numberOfTrain) > 0) {
////                    temp = trains[i];
////                    trains[i] = trains[j];
////                    trains[j] = temp;
////                }
////
////            }
////        }
//
//
//        }
//    }
//}
