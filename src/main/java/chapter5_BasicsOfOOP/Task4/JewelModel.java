package chapter5_BasicsOfOOP.Task4;

public class JewelModel{

    private String typeOfJewels;
    private String name;
    private int price;
    private int weight;
    private String material;
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfJewels() {
        return typeOfJewels;
    }

    public void setTypeOfJewels(String typeOfJewels) {
        this.typeOfJewels = typeOfJewels;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public JewelModel(String typeOfJewels,String name, int price, int weight, String material, String comment) {
        this.typeOfJewels = typeOfJewels;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.material = material;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "JewelModel{" +
                "typeOfJewels='" + typeOfJewels + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
