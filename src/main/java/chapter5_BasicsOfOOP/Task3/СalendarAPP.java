package chapter5_BasicsOfOOP.Task3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Сalendar {
    public static void main(String[] args) throws ParseException {
        System.out.println("Do you want to come in?(y/n)");
        Scanner in1 = new Scanner(System.in);
        String comeIn = in1.nextLine();
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