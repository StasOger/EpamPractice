package chapter5_BasicsOfOOP.Task5;

public class Sweets {

    private int id;
    private String type;
    private String name;
    private int weight;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Sweets(int id, String type, String name, int weight, double price) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet: " +
                "№ " + id +
                " - " + type +
                " '" + name + '\'' +
                " (" + weight +
                "g) - $" + price;
    }
}
