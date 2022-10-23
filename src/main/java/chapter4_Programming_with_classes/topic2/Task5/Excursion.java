package chapter4_Programming_with_classes.topic2.Task5;

import java.util.Date;
import java.util.List;

public class Excursion extends Trip{
    public Excursion(String country, List<String> cityList, int amountOfNights, String transfer, Date startDay, String supply, int price) {
        super(country, cityList, amountOfNights, transfer, startDay, supply, price);
    }
}
