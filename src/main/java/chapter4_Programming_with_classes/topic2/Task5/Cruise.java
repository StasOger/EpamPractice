package chapter4_Programming_with_classes.topic2.Task5;

import java.util.Date;
import java.util.List;

public class Cruise extends Trip{
    public Cruise(List<String> countryList, int amountOfNights, Date startDay, String supply, int price) {
        super(countryList, amountOfNights, startDay, supply, price);
    }
}
