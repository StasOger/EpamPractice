package chapter4_Programming_with_classes.topic1.Task9;

import java.util.List;

public class Book {
    private int id;
    private String name;
    private List<String> autors;
//    private String autors;
    private String publishingHouse;
    private int yearOfPublish;
    private int amountOfPages;
    private int price;
    private String bindingType;

//    public Book(int id, String name, String autors, String publishingHouse, int yearOfPublish, int amountOfPages, int price, String bindingType) {
//        this.id = id;
//        this.name = name;
//        this.autors = autors;
//        this.publishingHouse = publishingHouse;
//        this.yearOfPublish = yearOfPublish;
//        this.amountOfPages = amountOfPages;
//        this.price = price;
//        this.bindingType = bindingType;
//    }


    public Book(int id, String name, List<String> autors, String publishingHouse, int yearOfPublish, int amountOfPages, int price, String bindingType) {
        this.id = id;
        this.name = name;
        this.autors = autors;
        this.publishingHouse = publishingHouse;
        this.yearOfPublish = yearOfPublish;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getAutors() {
//        return autors;
//    }
//
//    public void setAutors(String autors) {
//        this.autors = autors;
//    }

        public List<String> getAutors() {
        return autors;
    }

    public void setAutors(List<String> autors) {
        this.autors = autors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", autors=" + autors +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", amountOfPages=" + amountOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }
}
