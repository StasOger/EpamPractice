package chapter4_Programming_with_classes.Task8;

import chapter4_Programming_with_classes.Task4.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task8 {

    public static String choice = "";

    private static void makeTextOperation(BrunchCustomer brunch) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for get list of customers A-Z; \n" +
                "- Enter \"2\" for get list of customers which number of credit card is in the range;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortCustomersByName(brunch.getCustomers());
                    break;
                case "2":
                    sortCustomersByNumberOfCard(brunch.getCustomers());
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
        BrunchCustomer brunchCustomer = new BrunchCustomer(111, Arrays.asList(new Customer(1,
                "Pitt",
                "Brad",
                "901 W Manchester Blvd, Inglewood, CA 90301, United States",
                6969_6969_9696_9696L,
                "US32142222122222"), new Customer(2,
                "Phelps",
                "Michael",
                "119 Culver Blvd, Playa Del Rey, CA 90293, United States",
                1111_1111_1111_1111L,
                "US12276467212222"), new Customer(3,
                "Robbie",
                "Margot",
                "Los Angeles, CA 90068, United States",
                2222_2222_2222_2222L,
                "US69696969696969"), new Customer(4,
                "Caleone",
                "Don",
                "Italia, Milan, Balcony street 12",
                3333_3333_3333_3333L,
                "IT32142222122222"), new Customer(5,
                "MacGregor",
                "Konor",
                "Ireland, Dublin",
                4444_4444_4444_4444L,
                "IR32142333326622"), new Customer(6,
                "Diaz",
                "Nate",
                "USA, California, Los Angeles",
                5555_5555_5555_5555L,
                "US32142333322222"), new Customer(7,
                "Fox",
                "Megane",
                "USA, California",
                6666_6666_6666_6666L,
                "IT32142222122222"), new Customer(8,
                "Travolta",
                "John",
                "USA, California",
                7777_7777_7777_7777L,
                "IT32142222122222"),new Customer(9,
                "Tarantino",
                "Quentin",
                "USA, California",
                8888_8888_8888_8888L,
                "IT32142222122222"), new Customer(10,
                "Oher",
                "Stas",
                "Bealsrus, Minsk",
                9999_9999_9999_9999L,
                "IT32142222122222")));

        makeTextOperation(brunchCustomer);
    }

    private static void sortCustomersByName(List<Customer> customersList) {
        customersList.sort(COMPARE_BY_LASTNAME);

        for(Customer temp: customersList){
            System.out.println("Lastname: "+ temp.getLastname() + ", firstname: " + temp.getFirstname());
        }
    }
    private static final Comparator<Customer> COMPARE_BY_LASTNAME = Comparator.comparing(Customer::getLastname);

    private static void sortCustomersByNumberOfCard(List<Customer> customersList) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input range of number card value (min): ");
        long min = scan.nextLong();
        System.out.print("Input range of number card value (max): ");
        long max = scan.nextLong();
        for(Customer temp: customersList){
            if (temp.getNumberOfCreditCard()>=min && temp.getNumberOfCreditCard()<=max)
            System.out.println("Lastname: "+ temp.getLastname() + ", firstname: " + temp.getFirstname() + ", number of card: " + temp.getNumberOfCreditCard());
        }
    }
}
