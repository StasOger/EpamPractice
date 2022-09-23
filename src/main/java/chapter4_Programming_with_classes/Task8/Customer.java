package chapter4_Programming_with_classes.Task8;

public class Customer {
    private int id;
    private String lastname;
    private String firstname;
    private String address;
    private long numberOfCreditCard;
    private String numberOfBankAccount;

    public Customer(int id, String lastname, String firstname, String address, long numberOfCreditCard, String numberOfBankAccount) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(long numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public String getNumberOfBankAccount() {
        return numberOfBankAccount;
    }

    public void setNumberOfBankAccount(String numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCreditCard=" + numberOfCreditCard +
                ", numberOfBankAccount=" + numberOfBankAccount +
                '}';
    }
}
