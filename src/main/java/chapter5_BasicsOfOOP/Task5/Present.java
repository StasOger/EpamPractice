package chapter5_BasicsOfOOP.Task5;

import java.util.List;

public class Present {

    private List<Sweets> choisedSweets;
    private List<Package> choisedPackage;

    public List<Sweets> getChoisedSweets() {
        return choisedSweets;
    }

    public void setChoisedSweets(List<Sweets> choisedSweets) {
        this.choisedSweets = choisedSweets;
    }

    public List<Package> getChoisedPackage() {
        return choisedPackage;
    }

    public void setChoisedPackage(List<Package> choisedPackage) {
        this.choisedPackage = choisedPackage;
    }

    public Present(List<Sweets> choisedSweets, List<Package> choisedPackage) {
        this.choisedSweets = choisedSweets;
        this.choisedPackage = choisedPackage;
    }
}
