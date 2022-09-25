package chapter4_Programming_with_classes.Task9;

import chapter4_Programming_with_classes.Task4.Train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task9 {

    public static String choice = "";

    private static void makeTextOperation(List<Book> bookList) throws IOException {
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
//                    sortCustomersByName(bookList);
                    break;
                case "2":
                    sortBooksByPublishHouse(bookList);
                    break;
                case "3":
                    sortBooksByPublishYear(bookList);
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
        Book[] book = new Book[2];

        List<Book> bookList = new ArrayList<>();
        List<String> autors = new ArrayList<>();

        String[] autor0 = new String[2];
        autor0[0] = "Chuk Polanik";
        autor0[1] = "Kvintin Tarantino";

        for (int i = 0; i<autor0.length; i++){
            autors.add(autor0[i]);
        }

        String[] autor1 = new String[2];
        autor1[0] = "Donald Trump";
        autor1[1] = "Kvintin Tarantino";

        for (int i = 0; i<autor1.length; i++){
            autors.add(autor1[i]);
        }

        book[0] = new Book(1, "Fight Club", autors, "Rolling", 1999, 369, 299,"HZ"
                );
        book[1] = new Book(2, "1984", autors, "Breaken News", 1984, 369, 199,"HZ"
        );

        for (int i = 0; i<book.length; i++){
            bookList.add(book[i]);
        }

        makeTextOperation(bookList);
    }

    private static void sortBooksByPublishYear(List<Book> bookList) {
        bookList.sort(COMPARE_BY_PUBLISH_YEAR);

        for(Book temp: bookList){
            System.out.println("Books name: "+ temp.getName() + ", autors: " + temp.getAutors() +", year of publish: " + temp.getYearOfPublish() + ", publishing house: " + temp.getPublishingHouse());
        }
    }

    private static final Comparator<Book> COMPARE_BY_PUBLISH_YEAR = Comparator.comparing(Book::getYearOfPublish);

    private static void sortBooksByPublishHouse(List<Book> bookList) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Input input publishing house: ");

            String inputPublishingHouse = reader.readLine();
            Optional<Book> selectedBook = bookList.stream().filter(book -> book.getPublishingHouse() == inputPublishingHouse).findFirst();
            if (selectedBook.isPresent()){
                System.out.println(selectedBook.get());
                for(Book temp: bookList){
                    System.out.println("Books name: " + temp.getName() + ", autors: " + temp.getAutors() + ", year of publish: " + temp.getYearOfPublish() + ", publishing house: " + temp.getPublishingHouse());
                }
            } else {
                System.out.println("not found");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
