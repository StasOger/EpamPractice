package chapter5_BasicsOfOOP.Task5;

public class Package {

    private int id;
    private String color;
    private String applique;
    private String form;
    private int weight;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getApplique() {
        return applique;
    }

    public void setApplique(String applique) {
        this.applique = applique;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Package(int id, String color, String applique, String form, int weight, int price) {
        this.id = id;
        this.color = color;
        this.applique = applique;
        this.form = form;
        this.weight = weight;
        this.price = price;
    }
}
