package chapter4_Programming_with_classes.topic1.Task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Task10 {

    public static String choice = "";

    private static final SimpleDateFormat startTime = new SimpleDateFormat("HH:mm");

    private static void makeTextOperation(List<Airlane> airlaneList) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for get FinishPoints; \n" +
                "- Enter \"2\" for get findAirplaneByDayOfTheWeek;\n" +
                "- Enter \"3\" for get AirplaneByDayOfTheWeekBeforeStartTime;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    findAirplaneByFinishPoints(airlaneList);
                    break;
                case "2":
                    findAirplaneByDayOfTheWeek(airlaneList);
                    break;
                case "3":
                    findAirplaneByDayOfTheWeekBeforeStartTime(airlaneList);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void findAirplaneByDayOfTheWeekBeforeStartTime(List<Airlane> airlaneList) throws ParseException {

        Scanner in = new Scanner(System.in);
//        System.out.print("Input day of flight (day of the week): ");
//        String inputDayOfTheWeek = in.nextLine();
        System.out.println("Input start time (xx:xx): ");
        String inStartTime = in.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
//        Date dateObj = format.parse(inStartTime);
//        Date dateObj2 = format.parse(startTime);
//        System.out.println(dateObj2);
        int result = inStartTime.compareTo(startTime.toString());
        System.out.println(result);
        System.out.println("st = " + startTime);
//        for(Airlane temp: airlaneList){
//            if (temp.getDayOfTheWeek().equals(inputDayOfTheWeek)){
//                if (temp.getStartTime() > startTime.parse("21:00")) {
//                    System.out.println("Finish point: "+ temp.getFinishPoint() + ", number of the airlane: " + temp.getNumberOfAirlane() +", type of airplane: " + temp.getTypeOfAirplane() + ", start time: " + temp.getStartTime() + ", day of the week: " + temp.getDayOfTheWeek());
//                }
//            }
//        }
    }

    private static void findAirplaneByDayOfTheWeek(List<Airlane> airlaneList) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input day of flight (day of the week): ");

        String inputDayOfTheWeek = in.nextLine();
        System.out.println(inputDayOfTheWeek);
        for(Airlane temp: airlaneList){
            if (temp.getDayOfTheWeek().equals(inputDayOfTheWeek)){
                System.out.println("To: "+ temp.getFinishPoint() + ", №" + temp.getNumberOfAirlane() +", type of airplane: " + temp.getTypeOfAirplane() + ", start time: " + temp.getStartTime() + ", day of the week: " + temp.getDayOfTheWeek());
            }
        }
    }

    private static void findAirplaneByFinishPoints(List<Airlane> airlaneList) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input finish point: ");

        String inputFinishPoint = in.nextLine();
        for(Airlane temp: airlaneList){
            if (temp.getFinishPoint().equals(inputFinishPoint)){
                System.out.println("To: "+ temp.getFinishPoint() + ", №" + temp.getNumberOfAirlane() +", type of airplane: " + temp.getTypeOfAirplane() + ", start time: " + temp.getStartTime() + ", day of the week: " + temp.getDayOfTheWeek());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Airlane[] airlanes = new Airlane[14];
        List<Airlane> airlanesList = new ArrayList<>();

        airlanes[0] = new Airlane("Los Angeles", 121, "AirBus A-380", startTime.parse("10:00"), "Monday");
        airlanes[1] = new Airlane("Los Santos", 777, "Boeing 747", startTime.parse("11:00"), "Friday");
        airlanes[2] = new Airlane("Liberty City", 333, "AirBus A-320", startTime.parse("05:00"), "Sunday");
        airlanes[3] = new Airlane("San Francisco", 369, "AirBus A-320", startTime.parse("06:00"), "Friday");
        airlanes[4] = new Airlane("New York", 444, "AirBus A-320", startTime.parse("09:00"), "Monday");
        airlanes[5] = new Airlane("Chicago", 3214, "Boeing 777", startTime.parse("07:00"), "Sunday");
        airlanes[6] = new Airlane("Dubai", 1111, "Boeing 747", startTime.parse("01:00"), "Friday");
        airlanes[7] = new Airlane("Dubai", 6969, "Boeing 737", startTime.parse("01:00"), "Monday");
        airlanes[8] = new Airlane("Moskow", 69, "AirBus A-320", startTime.parse("03:10"), "Sunday");
        airlanes[9] = new Airlane("Las Vegas", 9669, "Boeing 737", startTime.parse("03:40"), "Friday");
        airlanes[10] = new Airlane("Paris", 11, "AirBus A-320", startTime.parse("03:30"), "Sunday");
        airlanes[11] = new Airlane("Berlin", 77, "AirBus A-380", startTime.parse("12:30"), "Sunday");
        airlanes[12] = new Airlane("Paris", 7701, "AirBus A-320", startTime.parse("12:40"), "Monday");
        airlanes[13] = new Airlane("Liberty City", 21, "AirBus A-380", startTime.parse("10:00"), "Friday");

        for (int i = 0; i<airlanes.length; i++){
            airlanesList.add(airlanes[i]);
        }

        makeTextOperation(airlanesList);
    }


}
