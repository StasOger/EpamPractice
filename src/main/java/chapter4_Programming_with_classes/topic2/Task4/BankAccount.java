package chapter4_Programming_with_classes.topic2.Task4;

import java.util.Scanner;

public class BankAccount {

    private int id;
    private String numberOfAccount;
    private double cash;
    private boolean status;

    public BankAccount(int id, String numberOfAccount, double cash, boolean status) {
        this.id = id;
        this.numberOfAccount = numberOfAccount;
        this.cash = cash;
        this.status = status;
    }

    void blockAccount(){
        setStatus(false);
        System.out.println("Account: " + numberOfAccount + " is blocked");
    }

    void unlockAccount(){
        setStatus(true);
        System.out.println("Account: " + numberOfAccount + " is unlocked");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberOfAccount() {
        return numberOfAccount;
    }

    public void setNumberOfAccount(String numberOfAccount) {
        this.numberOfAccount = numberOfAccount;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", numberOfAccount='" + numberOfAccount + '\'' +
                ", cash=" + cash +
                ", status=" + status +
                '}';
    }
}
