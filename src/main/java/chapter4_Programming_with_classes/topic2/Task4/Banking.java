package chapter4_Programming_with_classes.topic2.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 *  Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
 *  Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
 *  имеющим положительный и отрицательный балансы отдельно.
 */

public class Banking {
    public static String choice = "";

    private static void makeTextOperation(List<BankAccount> bankAccount) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String start =
                "- Enter \"1\" for sort by cash;\n" +
                "- Enter \"2\" for lock account;\n" +
                "- Enter \"3\" for unlock account;\n" +
                "- Enter \"4\" for show sum of accounts;\n" +
                "for end enter \"exit\"\n";

        System.out.println(start);
        while (!choice.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            choice = reader.readLine();
            switch (choice) {
                case "1":
                    sortBankAccountsByCash(bankAccount);
                    break;
                case "2":
//          BLOCK
                    System.out.println("Input id of account which you want to block: ");
                    Scanner in1 = new Scanner(System.in);
                    int i = in1.nextInt();

                    for(BankAccount temp: bankAccount){
                        if (temp.getId() == i){
                            temp.blockAccount();
                        }
                    }
                    for(BankAccount temp: bankAccount){
                        System.out.println(temp.getId()+ ":  " + "   IBAN:  " + temp.getNumberOfAccount() + "  :  " + temp.getCash() + "$" + "   status: " + temp.isStatus());
                    }
                    break;
                case "3":
//          UNLOCK
                    System.out.println("Input id of account which you want to unlock: ");
                    Scanner in2 = new Scanner(System.in);
                    int u = in2.nextInt();

                    for(BankAccount temp: bankAccount){
                        if (temp.getId() == u){
                            temp.unlockAccount();
                        }
                    }
                    for(BankAccount temp: bankAccount){
                        System.out.println(temp.getId()+ ":  " + "   IBAN:  " + temp.getNumberOfAccount() + "  :  " + temp.getCash() + "$" + "   status: " + temp.isStatus());
                    }
                    break;
                case "4":
                    String start1 =
                            "- Enter \"1\" for show sum all;\n" +
                            "- Enter \"2\" for show sum positiv accounts;\n" +
                            "- Enter \"3\" for show sum negativ accounts;\n" +
                            "for end enter \"exit\"\n";
                    System.out.println(start1);
                    while (!choice.equalsIgnoreCase("exit")) {
                        System.out.print("Enter command: ");
                        choice = reader.readLine();
                        switch (choice) {
                            case "1":
                                sumOfBankAccounts(bankAccount);
                                break;
                            case "2":
                                sumOfPositivBankAccounts(bankAccount);
                                break;
                            case "3":
                                sumOfNegativBankAccounts(bankAccount);
                                break;
                            case "exit":
                                System.out.println("\nOver.");
                                break;
                            default:
                                System.out.println("Incorrect. Please repeat one more time.\n");
                        }
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

    private static void sumOfBankAccounts(List<BankAccount> bankAccount) {
        double sum = 0;
        for(BankAccount temp: bankAccount){
            sum = sum + temp.getCash();
            System.out.println(temp.getId()+ ":  " + "   IBAN:  " + temp.getNumberOfAccount() + "  :  " + temp.getCash() + "$" + "   status: " + temp.isStatus());
        }
        System.out.println("sum of accounts = " + sum + "$");
    }

    private static void sumOfPositivBankAccounts(List<BankAccount> bankAccount) {
        double sum = 0;
        for(BankAccount temp: bankAccount){
            if (temp.getCash() > 0){
                sum =  sum + temp.getCash();
                System.out.println(temp.getId()+ ":  " + "   IBAN:  " + temp.getNumberOfAccount() + "  :  " + temp.getCash() + "$" + "   status: " + temp.isStatus());
            }
        }
        System.out.println("sum of accounts = " + sum + "$");
    }

    private static void sumOfNegativBankAccounts(List<BankAccount> bankAccount) {
        double sum = 0;
        for(BankAccount temp: bankAccount){
            if (temp.getCash() < 0){
                sum = sum + temp.getCash();
                System.out.println(temp.getId()+ ":  " + "   IBAN:  " + temp.getNumberOfAccount() + "  :  " + temp.getCash() + "$" + "   status: " + temp.isStatus());
            }
        }
        System.out.println("sum of accounts = " + sum + "$");
    }

    public static void main(String[] args) throws Exception {
        BankAccount[] bankAccount = new BankAccount[7];

        bankAccount[0] = new BankAccount(1, "BY35004222690000", 1512.12, true);
        bankAccount[1] = new BankAccount(2, "BY35004333690000", 699.43, true);
        bankAccount[2] = new BankAccount(3, "BY71004222110000", 1500.21, true);
        bankAccount[3] = new BankAccount(4, "BY69009922000000", 0, true);
        bankAccount[4] = new BankAccount(5, "BY13009922690000", -21.18, false);
        bankAccount[5] = new BankAccount(6, "BY44004222690000", -100.34, false);
        bankAccount[6] = new BankAccount(7, "BY22009922690000", 69, true);

        List<BankAccount> bankAccountList = new ArrayList<>(Arrays.asList(bankAccount).subList(0, 7));

        makeTextOperation(bankAccountList);
    }

    private static void sortBankAccountsByCash(List<BankAccount> bankAccountList) {
        bankAccountList.sort(COMPARE_BY_CASH);
        for(BankAccount temp: bankAccountList){
            if (temp.isStatus()){
                System.out.println(temp.getId()+ ":  " + "   IBAN:  " + temp.getNumberOfAccount() + "  :  " + temp.getCash() + "$" + "   status: unlock");
            } else {
                System.out.println(temp.getId()+ ":  " + "   IBAN:  " + temp.getNumberOfAccount() + "  :  " + temp.getCash() + "$" + "   status: lock");
            }
        }
    }

    private static final Comparator<BankAccount> COMPARE_BY_CASH = (bankAccount1, bankAccount2) -> (int) (bankAccount1.getCash()-bankAccount2.getCash());
}
