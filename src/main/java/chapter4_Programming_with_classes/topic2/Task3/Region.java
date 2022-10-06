package chapter4_Programming_with_classes.topic2.Task3;

public class Region {
    private String regionName;
    private String regionCentre;

    public Region(String regionName, String regionCentre) {
        this.regionName = regionName;
        this.regionCentre = regionCentre;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionCentre() {
        return regionCentre;
    }

    public void setRegionCentre(String regionCentre) {
        this.regionCentre = regionCentre;
    }
}
