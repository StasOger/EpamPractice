package chapter4_Programming_with_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
//    private String name = "";
//    private String gender="";
//    private int age = 0;
//
//    public ArrayListSort(String name,int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public static void main(String args[]) {
//        List list = new ArrayList<ArrayListSort>();
//        list.add(new ArrayListSort("Crazy2", 34));
//        list.add(new ArrayListSort("Crazy1", 35));
//        list.add(new ArrayListSort("Crazy3", 33));
//        list.add(new ArrayListSort("Crazy5", 31));
//        list.add(new ArrayListSort("Crazy4", 32));
//
//        for (int i = 0; i < list.size(); i++) {
//            ArrayListSort p = (ArrayListSort) list.get(i);
//            System.out.println("Name:" + p.getName() + "Age:" + p.getAge());
//        }
//
//        System.out.println("The Above is unsorted.");
//
//        Comparator comp = new MyComparator();
//        Collections.sort(list, comp);
//
//        for (int i = 0; i < list.size(); i++) {
//            ArrayListSort p = (ArrayListSort) list.get(i);
//            System.out.println("Name:" + p.getName() + "Age:" + p.getAge());
//        }
//    }
//
//
//}


public class ArrayListSort {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        Car ferrari = new Car(1990, "Ferrari 360 Spider", 310);
        Car lambo = new Car(2012, "Lamborghini Gallardo", 290);
        Car bugatti = new Car(2010, "Bugatti Veyron", 350);

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);


        //тут раньше была ошибка
        Collections.sort(cars);

        int i=0;
        for(Car temp: cars){
            System.out.println("cars " + ++i + " : " + temp.getManufactureYear());
        }


    }
}