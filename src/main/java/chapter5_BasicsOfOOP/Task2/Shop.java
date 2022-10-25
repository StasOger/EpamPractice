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
        Payment balance = new Payment(1269);

        init(products);//create product list
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String start = "What do you want to buy? \n" +
                "- Enter \"1\" for buy Iphone;\n" +
                "- Enter \"2\" for buy AirPods;\n" +
                "- Enter \"3\" for buy IWatch;\n" +
                "- Enter \"4\" for watch shopping list;\n" +
                "- Enter \"5\" for watch my balance;\n" +
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
                    buyAirPods(products, shoppingList);
                    break;
                case "3":
                    buyIWatch(products, shoppingList);
                    break;
                case "4":
                    basket(shoppingList, balance);
                    break;
                case "5":
                    balance(balance);
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

        products.add(new AirPods("1", 139, 30));
        products.add(new AirPods("2", 199, 10));
        products.add(new AirPods("PRO", 299, 5));

        products.add(new IWatch("3", 42, "Rose Gold", 199, 10));
        products.add(new IWatch("4", 44, "Black", 299, 8));
        products.add(new IWatch("5", 44, "White", 399, 9));
        products.add(new IWatch("Nike", 38, "Rose Gold", 299, 6));
        products.add(new IWatch("SE", 40, "Rose Gold", 299, 5));
    }

    private static void buyIPhone(List<Product> products, List<Product> shoppingList) {
        int counter = 1;
        //вывод на экран
        List<IPhone> iphoneList = products.stream().filter(IPhone.class::isInstance).map(IPhone.class::cast).collect(Collectors.toList());
        for (IPhone iPhone : iphoneList) {
            String format = String.format("%d %s %s %s %d %d", counter++, iPhone.getModel(), iPhone.getMemory(), iPhone.getColor(), iPhone.getPrice(), iPhone.getQuantity());
            System.out.println(format);
        }
        //buy iphone by number in list
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input number of IPhone: ");
        int numberOfIPhone = in1.nextInt();
        counter = 1;

        IPhone selectedIphone = iphoneList.get(numberOfIPhone-1);
        if (selectedIphone.getQuantity() != 0){
            shoppingList.add(selectedIphone);
            selectedIphone.setQuantity(selectedIphone.getQuantity() - 1);
            System.out.println("IPhone  "+shoppingList);
            System.out.println("Product bought");
        } else {
            System.out.println("Not in stock...");
        }
    }

    private static void buyAirPods(List<Product> products, List<Product> shoppingList) {
        int counter = 1;
        //вывод на экран
        List<AirPods> airPodsList = products.stream().filter(AirPods.class::isInstance).map(AirPods.class::cast).collect(Collectors.toList());
        for (AirPods airPods : airPodsList) {
            String format = String.format("%d %s %d %d", counter++, airPods.getModel(), airPods.getPrice(), airPods.getQuantity());
            System.out.println(format);
        }
        //buy iphone by number in list
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input number of AirPods: ");
        int numberOfAirPods = in1.nextInt();
        counter = 1;

        AirPods selectedAirPods = airPodsList.get(numberOfAirPods-1);
        if (selectedAirPods.getQuantity() != 0){
            shoppingList.add(selectedAirPods);
            selectedAirPods.setQuantity(selectedAirPods.getQuantity() - 1);
            System.out.println("AirPods  " + shoppingList);
            System.out.println("Product bought");
        } else {
            System.out.println("Not in stock...");
        }
    }

    private static void buyIWatch(List<Product> products, List<Product> shoppingList) {
        int counter = 1;
        //вывод на экран
        List<IWatch> iWatchList = products.stream().filter(IWatch.class::isInstance).map(IWatch.class::cast).collect(Collectors.toList());
        for (IWatch iWatch : iWatchList) {
            String format = String.format("%d %s %d %d", counter++, iWatch.getModel(), iWatch.getPrice(), iWatch.getQuantity());
            System.out.println(format);
        }
        //buy iphone by number in list
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input number of IWatch: ");
        int numberOfIWatch = in1.nextInt();
        counter = 1;

        IWatch selectedIWatch = iWatchList.get(numberOfIWatch-1);
        if (selectedIWatch.getQuantity() != 0){
            shoppingList.add(selectedIWatch);
            selectedIWatch.setQuantity(selectedIWatch.getQuantity() - 1);
            System.out.println("IWatch  " + shoppingList);
            System.out.println("Product bought");
        } else {
            System.out.println("Not in stock...");
        }
    }

    private static void basket(List<Product> shoppingList, Payment balance) {
        int totalSum = 0; //summ of purchase
        for (Product product : shoppingList) {
            totalSum = totalSum + product.getPrice();
        }
        System.out.println("Total sum: " + totalSum);
        System.out.println("Do you want to confirm the purchase?(y/n)");
        Scanner in1 = new Scanner(System.in);
        String confirm = in1.nextLine();

        if ( confirm.equals("y")){
            if (balance.getBalance() > totalSum){
                balance.setBalance(balance.getBalance()-totalSum);
                System.out.println("confirm! " + " balance = " + balance.getBalance() + ",  sum = " + totalSum);
            } else {
                System.out.println("dont confirm!  " + " balance = " + balance.getBalance() + ",  sum = " + totalSum);
            }
        }
    }

    private static void balance(Payment balance) {
        System.out.println("balance = " + balance.getBalance());
    }
}