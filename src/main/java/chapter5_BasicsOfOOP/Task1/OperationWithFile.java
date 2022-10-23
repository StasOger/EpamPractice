package chapter5_BasicsOfOOP.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationWithFile {

    public static void main(String[] args) throws IOException {
        String choice = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String first2 = "12";
        Directory directory = new Directory("Iezykyl");
        TextFile firstFile = new TextFile(directory, first2);

        String start =
                "- Enter \"1\" for create new file;\n" +
                "- Enter \"2\" for rename file;\n" +
                "- Enter \"3\" for show text file;\n" +
                "- Enter \"4\" for add file;\n" +
                "- Enter \"5\" for delete file;\n" +
                "for end enter \"exit\"\n";
        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    System.out.println("Add file: ");
                    String newFileName = reader.readLine();
                    File tFile2 = new TextFile(directory, newFileName );
                    for (TextFile file : directory.getFiles()) {
                        System.out.println(file);
                    }
                    break;
                case "2":
                    for (TextFile file : directory.getFiles()) {
                        System.out.println(file);
                    }
                    System.out.println("Input old file name: ");
                    String oldFileName1 = reader.readLine();
                    for (TextFile file : directory.getFiles()) {
                        if (oldFileName1.equals(file.getFileName())){
                            System.out.println("Input new file name: ");
                            String newFileName1 = reader.readLine();
                            file.changeName(newFileName1);
                        }
                        System.out.println(file);
                    }
                    break;
                case "3":
                    System.out.println("Input file name: ");
                    String showText = reader.readLine();
                    System.out.println("File content: ");
                    directory.getFiles();
                    firstFile.printContent();

                    System.out.println("Input file name: ");
                    String fileName3 = reader.readLine();
                    for (TextFile file : directory.getFiles()) {
                        if (fileName3.equals(file.getFileName())){
                            System.out.println("Content: ");
                            file.printContent();
                        }
                    }
                    break;
                case "4":
                    System.out.println("Input file name: ");
                    String fileName4 = reader.readLine();
                    for (TextFile file : directory.getFiles()) {
                        if (fileName4.equals(file.getFileName())){
                            System.out.println("Add text: ");
                            String addLine = reader.readLine();
                            file.addText(addLine);
                        }
                        System.out.println(file);
                    }
                    break;
                case "5":
                    System.out.println("Input removed file: ");
                    String fileName5 = reader.readLine();
                    directory.removeFile(fileName5);
                    for (TextFile file : directory.getFiles()) {
                        System.out.println(file);
                    }
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
