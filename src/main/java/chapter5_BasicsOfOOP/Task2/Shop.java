package chapter5_BasicsOfOOP.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Shop {
    public static void main(String[] args) throws IOException {
        List<Product> products = new ArrayList<>();
        List<Product> shoppingList = new ArrayList<>();

        init(products);

        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String start = "What do you want to buy? \n" +
                "- Enter \"1\" for buy Iphone;\n" +
                "- Enter \"2\" for buy AirPods;\n" +
                "- Enter \"3\" for buy MacBook;\n" +
                "for end enter \"exit\"\n";
        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    buyIPhone(products, shoppingList);
                    break;
                case "2":
                    buyAirPods(products);
                    break;
                case "3":
                    buyIWatch(products);
                    break;
                case "4":
//                    basket();
                    break;
                case "5":

                    break;
                case "exit":
                    System.out.println("\nOver.");
                    break;
                default:
                    System.out.println("Incorrect. Please repeat one more time.\n");
            }
        }
    }

    private static void init(List<Product> products) {
        products.add(new IPhone("5S", "Space grey", 16, 199, 10));
        products.add(new IPhone("6S", "Space grey", 32, 299, 7));
        products.add(new IPhone("7 Plus", "Red", 64, 399, 8));
        products.add(new IPhone("8 Plus", "Space grey", 128, 459, 11));
        products.add(new IPhone("X", "Black", 64, 499, 20));
        products.add(new IPhone("XS", "Gold", 128, 529, 23));
        products.add(new IPhone("11", "Purple", 64, 599, 2));
        products.add(new IPhone("11", "Purple", 128, 599, 3));
        products.add(new IPhone("11", "Purple", 256, 599, 4));
        products.add(new IPhone("11", "Black", 128, 599, 3));
        products.add(new IPhone("12 Mini", "White", 128, 699, 2));
        products.add(new IPhone("12 Pro MAX", "Grey", 16, 899, 2));
    }

    private static void buyIPhone(List<Product> products,List<Product> shoppingList) {
        int counter = 1;
        //вывод на экран
        List<IPhone> iphoneList = products.stream().filter(IPhone.class::isInstance).map(IPhone.class::cast).collect(Collectors.toList());
        for (IPhone iPhone : iphoneList) {
            String format = String.format("%d %s %s %d %d", counter++, iPhone.getModel(), iPhone.getColor(), iPhone.getPrice(), iPhone.getQuantity());
            System.out.println(format);
        }

        //buy iphone by number of list
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input number of IPhone: ");
        int numberOfIPhone = in1.nextInt();
        counter = 1;

        IPhone selectedIphone = iphoneList.get(numberOfIPhone-1);
        selectedIphone.setQuantity(selectedIphone.getQuantity() - 1);
        System.out.println(selectedIphone);

    }

    private static void buyAirPods(List<Product> products) {

    }

    private static void buyIWatch (List <Product> products) {

    }


}