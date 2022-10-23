package chapter5_BasicsOfOOP.Task2;

public class Product {

    private String model;
    private String color;
    private int memory;
    private int size;  // diagonal (mm), for watch
    private int price;
    private int quantity; // product quantity

    public Product(String model, String color, int memory, int price, int quantity) {
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String model, int price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String model, int size, String color, int price, int quantity) {
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", size=" + size +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
