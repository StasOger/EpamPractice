package chapter4_Programming_with_classes.topic2.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
 * различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class TravelService {

    public static void main(String[] args) throws Exception {
        List<Trip> trips = new ArrayList<>();

//  путевки: отдых
        trips.add(new Relax("USA","Los Angeles",3, "bus", startTime.parse("01-11-2022"), "all inclusive", 1229));
        trips.add(new Relax("USA", "Miami",14, "airplane", startTime.parse("10-12-2022"), "all inclusive", 4500));
        trips.add(new Relax("Brazil", "Rio de Janeiro",7, "airplane", startTime.parse("01-12-2022"), "all inclusive", 2800));
        trips.add(new Relax("Italy", "Venice",7, "airplane", startTime.parse("07-11-2022"), "all inclusive", 3000));
        trips.add(new Relax("Thailand", "Phuket",21, "airplane", startTime.parse("01-11-2022"), "breakfast", 3100));

//  путевки: терапия
        trips.add(new Therapy("Switzerland", "Alps",7, "bus", startTime.parse("01-11-2022"), "all inclusive", 1229));
        trips.add(new Therapy("Russia", "Dombau",14, "airplane", startTime.parse("10-12-2022"), "breakfast", 500));
        trips.add(new Therapy("Belarus", "Narach",14, "bus", startTime.parse("01-12-2022"), "all inclusive", 800));
        trips.add(new Therapy("Russia", "Altay",21, "airplane", startTime.parse("07-11-2022"), "all inclusive", 399));
        trips.add(new Therapy("Russia", "Teriberka",14, "train", startTime.parse("01-11-2022"), "breakfast", 369));

//  путевки: шопинг
        trips.add(new Shopping("France", "Paris",2, "bus", startTime.parse("01-11-2022"), "all inclusive", 1229));
        trips.add(new Shopping("Poland", "Warsaw",1, "bus", startTime.parse("10-12-2022"), "breakfast", 500));
        trips.add(new Shopping("Ukraine", "Kiev",2, "bus", startTime.parse("01-12-2022"), "all inclusive", 800));
        trips.add(new Shopping("Romania", "Buharest",2, "train", startTime.parse("07-11-2022"), "all inclusive", 399));
        trips.add(new Shopping("Russia", "Moskow",1, "train", startTime.parse("01-11-2022"), "breakfast", 369));

//  путевки: экскурсии
        List<String> citiesFrance = new ArrayList<>();//список стран (круиз)
        citiesFrance.add("Paris");
        citiesFrance.add("Marsel");
        citiesFrance.add("Brest");

        List<String> citiesUSA = new ArrayList<>();//список стран (круиз)
        citiesUSA.add("Los Angeles");
        citiesUSA.add("San Francisco");
        citiesUSA.add("Las Vegas");

        List<String> citiesChina = new ArrayList<>();//список стран (круиз)
        citiesChina.add("Beijing");
        citiesChina.add("Shanghai");
        citiesChina.add("Guangzhou");


        trips.add(new Excursion("France", citiesFrance,2, "train", startTime.parse("01-11-2022"), "all inclusive", 1229));
        trips.add(new Excursion("USA", citiesUSA,1, "bus", startTime.parse("10-12-2022"), "breakfast", 500));
        trips.add(new Excursion("China", citiesChina,2, "bus", startTime.parse("01-12-2022"), "all inclusive", 800));


//  путевки: круиз
        List<String> countries1 = new ArrayList<>();//список стран (круиз)
        countries1.add("Germany");
        countries1.add("Denmark");
        countries1.add("France");
        countries1.add("Spain");
        countries1.add("Italy");
        trips.add(new Cruise(countries1, 7, startTime.parse("05-11-2022"), "all inclusive", 1229));
        List<String> countries2 = new ArrayList<>();
        countries2.add("Estonia");
        countries2.add("Finland");
        trips.add(new Cruise(countries2, 2, startTime.parse("01-11-2022"), "all inclusive", 1229));
        List<String> countries3 = new ArrayList<>();
        countries3.add("Latvia");
        countries3.add("Finland");
        countries3.add("Sweden");
        countries3.add("Denmark");
        countries3.add("Germany");
        trips.add(new Cruise(countries3, 4, startTime.parse("01-11-2022"), "breakfast", 1229));
        List<String> countries4 = new ArrayList<>();
        countries4.add("USA");
        countries4.add("Dominican");
        countries4.add("Cuba");
        countries4.add("Brazil");
        trips.add(new Cruise(countries4, 3, startTime.parse("01-11-2022"), "all inclusive", 1229));

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
                    relaxSort(trips);
                    break;
                case "2":
                    excursionSort(trips);
                    break;
                case "3":
                    therapySort(trips);
                    break;
                case "4":
                    shoppingSort(trips);
                    break;
                case "5":
                    cruiseSort(trips);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void excursionSort(List<Trip> trips) throws IOException {
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start =
                "- Enter \"1\" for choise trip by amount of nights;\n" +
                        "- Enter \"2\" for choise trip by type of transfer;\n" +
                        "- Enter \"3\" for choise trip by supply;\n" +
                        "for end enter \"exit\"\n";

        System.out.println(start);

        List<Excursion> excursionList = trips.stream().filter(Excursion.class::isInstance).map(Excursion.class::cast).collect(Collectors.toList());

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Input amount of nights: ");
                    int amountOfNights = in1.nextInt();

                    excursionList.stream().filter(temp -> temp.getAmountOfNights() == amountOfNights).map(temp -> " " + temp.getCountry() + ", " + temp.getCityList() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "2":
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Input type of transfer (airplane, bus, train): ");

                    String typeOfTransfer = in2.nextLine();

                    excursionList.stream().filter(temp -> temp.getTransfer().equals(typeOfTransfer)).map(temp -> " " + temp.getCountry() + ", " + temp.getCityList() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "3":
                    Scanner in3 = new Scanner(System.in);
                    System.out.print("Input type of transfer (all inclusive, breakfast): ");

                    String typeOfSupply = in3.nextLine();

                    excursionList.stream().filter(temp -> temp.getSupply().equals(typeOfSupply)).map(temp -> " " + temp.getCountry() + ", " + temp.getCityList() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static SimpleDateFormat startTime = new SimpleDateFormat("dd-MM-yyyy");

    private static void therapySort(List<Trip> trips) throws IOException {
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start =
                "- Enter \"1\" for choise trip by amount of nights;\n" +
                "- Enter \"2\" for choise trip by type of transfer;\n" +
                "- Enter \"3\" for choise trip by supply;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);

        List<Therapy> therapyList = trips.stream().filter(Therapy.class::isInstance).map(Therapy.class::cast).collect(Collectors.toList());

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Input amount of nights: ");
                    int amountOfNights = in1.nextInt();

                    therapyList.stream().filter(temp -> temp.getAmountOfNights() == amountOfNights).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "2":
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Input type of transfer (airplane, bus, train): ");

                    String typeOfTransfer = in2.nextLine();

                    therapyList.stream().filter(temp -> temp.getTransfer().equals(typeOfTransfer)).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "3":
                    Scanner in3 = new Scanner(System.in);
                    System.out.print("Input type of transfer (all inclusive, breakfast): ");

                    String typeOfSupply = in3.nextLine();

                    therapyList.stream().filter(temp -> temp.getSupply().equals(typeOfSupply)).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void shoppingSort(List<Trip> trips) throws IOException {
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start =
                "- Enter \"1\" for choise trip by amount of nights;\n" +
                        "- Enter \"2\" for choise trip by type of transfer;\n" +
                        "- Enter \"3\" for choise trip by supply;\n" +
                        "for end enter \"exit\"\n";

        System.out.println(start);

        List<Shopping> shoppingList = trips.stream().filter(Shopping.class::isInstance).map(Shopping.class::cast).collect(Collectors.toList());

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Input amount of nights: ");
                    int amountOfNights = in1.nextInt();

                    shoppingList.stream().filter(temp -> temp.getAmountOfNights() == amountOfNights).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "2":
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Input type of transfer (airplane, bus, train): ");

                    String typeOfTransfer = in2.nextLine();

                    shoppingList.stream().filter(temp -> temp.getTransfer().equals(typeOfTransfer)).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "3":
                    Scanner in3 = new Scanner(System.in);
                    System.out.print("Input type of transfer (all inclusive, breakfast): ");

                    String typeOfSupply = in3.nextLine();

                    shoppingList.stream().filter(temp -> temp.getSupply().equals(typeOfSupply)).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }


    private static void relaxSort(List<Trip> trips) throws IOException {
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start =
                "- Enter \"1\" for choise trip by amount of nights;\n" +
                        "- Enter \"2\" for choise trip by type of transfer;\n" +
                        "- Enter \"3\" for choise trip by supply;\n" +
                        "for end enter \"exit\"\n";

        System.out.println(start);

        List<Relax> relaxList = trips.stream().filter(Relax.class::isInstance).map(Relax.class::cast).collect(Collectors.toList());

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Input amount of nights: ");
                    int amountOfNights = in1.nextInt();

                    relaxList.stream().filter(temp -> temp.getAmountOfNights() == amountOfNights).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "2":
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Input type of transfer (airplane, bus, train): ");

                    String typeOfTransfer = in2.nextLine();

                    relaxList.stream().filter(temp -> temp.getTransfer().equals(typeOfTransfer)).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "3":
                    Scanner in3 = new Scanner(System.in);
                    System.out.print("Input type of transfer (all inclusive, breakfast): ");

                    String typeOfSupply = in3.nextLine();

                    relaxList.stream().filter(temp -> temp.getSupply().equals(typeOfSupply)).map(temp -> " " + temp.getCountry() + ", " + temp.getResort() + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }



    private static void cruiseSort(List<Trip> trips) throws IOException {
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start =
                "- Enter \"1\" for choise trip by amount of nights;\n" +
                        "- Enter \"2\" for choise trip by supply;\n" +
                        "for end enter \"exit\"\n";

        System.out.println(start);

        List<Cruise> cruiseList = trips.stream().filter(Cruise.class::isInstance).map(Cruise.class::cast).collect(Collectors.toList());

        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Input amount of nights: ");
                    int amountOfNights = in1.nextInt();

                    cruiseList.stream().filter(temp -> temp.getAmountOfNights() == amountOfNights).map(temp -> " " + temp.getCountryList() + ", " + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "2":
                    Scanner in2 = new Scanner(System.in);
                    System.out.print("Input type of transfer (all inclusive, breakfast): ");

                    String typeOfSupply = in2.nextLine();

                    cruiseList.stream().filter(temp -> temp.getSupply().equals(typeOfSupply)).map(temp -> " " + temp.getCountryList()  + ", amount of nights: " + temp.getAmountOfNights()).forEach(System.out::println);
                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }
}
