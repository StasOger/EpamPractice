package chapter4_Programming_with_classes.topic2.Task2;

public class Engine {

    private int volumeOfEngine;
    private String typeOfEngine;

    public int getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(int volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public Engine(int volumeOfEngine, String typeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
        this.typeOfEngine = typeOfEngine;
    }
}
