package chapter4_Programming_with_classes.topic1.Task8;

import java.util.List;

public class BrunchCustomer {

    private int id;
    private List<Customer> customers;

    public BrunchCustomer(int id, List<Customer> customers) {
        this.id = id;
        this.customers = customers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
