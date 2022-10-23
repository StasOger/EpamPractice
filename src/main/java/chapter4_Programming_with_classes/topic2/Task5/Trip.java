package chapter4_Programming_with_classes.topic2.Task5;

import java.util.Date;
import java.util.List;

public class Trip {

    private String country;

    private String city;

    private List<String> countryList;

    private List<String> cityList;

    private String resort;

    private int amountOfNights;

    private String transfer;

    private Date startDay;

    private String supply;

    private int price;


// constructor for relax
    public Trip(String country, String resort, int amountOfNights, String transfer, Date startDay, String supply, int price) {
        this.country = country;
        this.resort = resort;
        this.amountOfNights = amountOfNights;
        this.transfer = transfer;
        this.startDay = startDay;
        this.supply = supply;
        this.price = price;
    }

// constructor for excursion
    public Trip(String country, List<String> cityList, int amountOfNights, String transfer, Date startDay, String supply, int price) {
        this.country = country;
        this.cityList = cityList;
        this.amountOfNights = amountOfNights;
        this.transfer = transfer;
        this.startDay = startDay;
        this.supply = supply;
        this.price = price;
    }

// constructor for excursion/cruise
    public Trip(List<String> countryList, int amountOfNights, Date startDay, String supply, int price) {
        this.countryList = countryList;
        this.amountOfNights = amountOfNights;
        this.startDay = startDay;
        this.supply = supply;
        this.price = price;
    }

    public List<String> getCityList() {
        return cityList;
    }

    public void setCityList(List<String> cityList) {
        this.cityList = cityList;
    }

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getCountryList() {return countryList;}

    public void setCountryList(List<String> countryList) {this.countryList = countryList;}

    public String getResort() {
        return resort;
    }

    public void setResort(String resort) {
        this.resort = resort;
    }

    public int getAmountOfNights() {
        return amountOfNights;
    }

    public void setAmountOfNights(int amountOfNights) {
        this.amountOfNights = amountOfNights;
    }

    public String getTransfer() {return transfer;}

    public void setTransfer(String transfer) {
        this.transfer = transfer;
    }

    public Date getStartDay() {return startDay;}

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public String getSupply() {
        return supply;
    }

    public void setSupply(String supply) {
        this.supply = supply;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
