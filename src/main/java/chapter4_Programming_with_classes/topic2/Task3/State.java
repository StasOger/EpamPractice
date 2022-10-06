package chapter4_Programming_with_classes.topic2.Task3;

import java.util.ArrayList;

public class State {
    private String nameState;
    private City capitalName;
    private int area;
    private ArrayList<Region> regions;

    public State(String nameState, City capitalName, int area, ArrayList<Region> regions) {
        this.nameState = nameState;
        this.capitalName = capitalName;
        this.area = area;
        this.regions = regions;
    }

    public String getNameState() {
        return nameState;
    }

    public void setNameState(String nameState) {
        this.nameState = nameState;
    }

    public City getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(City capitalName) {
        this.capitalName = capitalName;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    void printArea() {
        System.out.println(area);
    }

    void numberOfRegions() {
        System.out.println(regions.size());
    }

    void printCapital() {
        System.out.println(capitalName.getCityName());
    }

    void printRegionCity() {
        for (int i=0; i<regions.size();i++)
        System.out.println(regions.get(i).getRegionCentre());
    }
}
