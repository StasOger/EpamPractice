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

        List<CalendarMODEL> holiday = new ArrayList<>();
        holiday.add(new CalendarMODEL(9,5));
        holiday.add(new CalendarMODEL(1,1));
        holiday.add(new CalendarMODEL(7,1));

        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start ="What type of trip do you want?\n" +
                "- Enter \"1\" for verify The Weekends;\n" +
                "- Enter \"2\" for verify The Holidays;\n" +
                "- Enter \"3\" for showTheHoliday;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    verifyTheWeekends();
                    break;
                case "2":
                    verifyTheHolidays(holiday);
                    break;
                case "3":
                    showTheHoliday(holiday);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void verifyTheHolidays(List<CalendarMODEL> holiday) {
        Scanner in1 = new Scanner(System.in);

        System.out.println("Input month");
        int month = in1.nextInt();
        System.out.println("Input day");
        int day = in1.nextInt();

        for (CalendarMODEL calendarMODEL : holiday) {
            if (calendarMODEL.getDay() == day && calendarMODEL.getMonth() == month){
                System.out.println("holiday");
            } else {
                System.out.println("Its not holiday");
            }
        }
    }

    private static void showTheHoliday(List<CalendarMODEL> holiday) {
        System.out.println(holiday.toString());
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
        if (dayOfWeek.equals("SATURDAY") || dayOfWeek.equals("SUNDAY")){
            System.out.println("It's a weekend ("+dayOfWeek+")");
        }
    }
}