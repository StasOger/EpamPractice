package chapter5_BasicsOfOOP.Task3;

import chapter5_BasicsOfOOP.Task2.Product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class СalendarAPP {
    public static void main(String[] args) throws ParseException, IOException {

        List<CalendarMODEL> weekend = new ArrayList<>();
        weekend.add(new CalendarMODEL(9,5));
        weekend.add(new CalendarMODEL(1,1));
        weekend.add(new CalendarMODEL(7,1));

        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start ="What type of trip do you want?\n" +
                "- Enter \"1\" for select relax;\n" +
                "- Enter \"2\" for select excursion;\n" +
                "- Enter \"3\" for select therapy;\n" +
                "- Enter \"4\" for select shopping;\n" +
                "- Enter \"5\" for select cruise;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    showTheWeekends(weekend);
                    break;
                case "2":
                    showTheHolidays();
                    break;
                case "3":
                    verifyTheWeekends();
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void showTheWeekends(List<CalendarMODEL> weekend) {
        System.out.println(weekend.toString());
    }

    private static void showTheHolidays() {

    }

    private static void verifyTheWeekends() throws ParseException {
        Scanner in1 = new Scanner(System.in);

        System.out.println("Input month");
        String month = in1.nextLine();
        System.out.println("Input day");
        String day = in1.nextLine();
        System.out.println("Input year");
        String year = in1.nextLine();

        String inputDateStr = String.format("%s/%s/%s", day, month, year);
        Date inputDate = new SimpleDateFormat("dd/MM/yyyy").parse(inputDateStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        String dayOfWeek = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
        System.out.println(dayOfWeek);
    }
}