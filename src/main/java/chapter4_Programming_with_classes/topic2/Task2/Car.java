package chapter4_Programming_with_classes.topic2.Task2;

import chapter4_Programming_with_classes.topic2.Task1.Sentence;

public class Car {

    private Wheel wheel;
    private Engine engine;

    void drive() {
        System.out.print("we're driving, bro");
    }

    void refuel() {
        System.out.println("The car is filled");
    }

    void changeWheel(){
        System.out.println("Wheel changed");
    }

    void showInformationAboutCar() {System.out.println("BMW");}

    public Car(Wheel wheel, Engine engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Task2{" +
                "wheel=" + wheel +
                ", engine=" + engine +
                '}';
    }

    public Car(Engine engine) {
        this.engine = engine;
    }
}
