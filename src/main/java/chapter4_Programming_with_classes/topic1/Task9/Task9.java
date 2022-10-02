package chapter4_Programming_with_classes.Task9;

import chapter4_Programming_with_classes.Task4.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task9 {

    public static String choice = "";

    private static void makeTextOperation(BrunchBook brunch) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start = "- Enter \"1\" for get list of books by a given autor; \n" +
                "- Enter \"2\" for get list of books by a given publishing house;\n" +
                "- Enter \"3\" for get list books realized after a given year;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    findBookByAutors(brunch.getBooks());
                    break;
                case "2":
                    findBooksByPublishHouse(brunch.getBooks());
                    break;
                case "3":
                    findBooksBeforePublishYear(brunch.getBooks());
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

        List<String> autors0 = new ArrayList<>();
        List<String> autors1 = new ArrayList<>();
        List<String> autors2 = new ArrayList<>();

        String[] autor0 = new String[2];
        autor0[0] = "Chuk Polanik";
        autor0[1] = "Kvintin Tarantino";

        for (int i = 0; i<autor0.length; i++){
            autors0.add(autor0[i]);
        }

        String[] autor1 = new String[2];
        autor1[0] = "Donald Trump";
        autor1[1] = "Kvintin Tarantino";

        for (int i = 0; i<autor1.length; i++){
            autors1.add(autor1[i]);
        }

        String autor2 = "Dmitry Dostoevsky";
        autors2.add(autor2);

        BrunchBook brunchBook = new BrunchBook(111, Arrays.asList(
                new Book(1, "Fight Club", autors0, "Rolling Stones", 1999, 369, 299,"HZ"),
                new Book(2, "1984", autors1, "Breaken News", 1984, 369, 199,"HZ"),
                new Book(3, "Prestuplenie i nakazanie", autors2, "Breaken News", 1799, 600, 199,"HZ")
        ));

//        book[0] = new Book(1, "Fight Club", autors0, "Rolling Stones", 1999, 369, 299,"HZ"
//                );
//        book[1] = new Book(2, "1984", autors1, "Breaken News", 1984, 369, 199,"HZ"
//        );
//        book[2] = new Book(3, "Prestuplenie i nakazanie", autors2, "Breaken News", 1799, 600, 199,"HZ"
//        );
//
//        for (int i = 0; i<book.length; i++){
//            bookList.add(book[i]);
//        }

        makeTextOperation(brunchBook);
    }

    private static void findBookByAutors(List<Book> bookList) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input autor: ");
//
//        String inputAutors = in.nextLine();
//
//        for(Book temp: bookList){
//            for (int i=0; i<)
//            if (temp.getAutors().equals(inputAutors)){
//                System.out.println("Books name: "+ temp.getName() + ", autors: " + temp.getAutors() +", year of publish: " + temp.getYearOfPublish() + ", publishing house: " + temp.getPublishingHouse());
//            }
//        }
    }

    private static void findBooksBeforePublishYear(List<Book> bookList) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input publishing year: ");

        int inputPublishingYear = in.nextInt();
        for(Book temp: bookList){
            if (temp.getYearOfPublish() > inputPublishingYear){
                System.out.println("Books name: "+ temp.getName() + ", autors: " + temp.getAutors() +", year of publish: " + temp.getYearOfPublish() + ", publishing house: " + temp.getPublishingHouse());

            }
        }
    }

    private static void findBooksByPublishHouse(List<Book> bookList) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input input publishing house: ");

        String inputPublishingHouse = in.nextLine();

        for(Book temp: bookList){
            if (temp.getPublishingHouse().equals(inputPublishingHouse)){
                System.out.println("Books name: "+ temp.getName() + ", autors: " + temp.getAutors() +", year of publish: " + temp.getYearOfPublish() + ", publishing house: " + temp.getPublishingHouse());
            }
        }
    }
}
