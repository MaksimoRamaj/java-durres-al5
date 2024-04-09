package OOP.Composition;

public class CDPlayer {

    private String brand;
    private boolean isTaken;
    public CDPlayer(String brand) {
        this.brand = brand;
        this.isTaken = false;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean taken) {
        isTaken = taken;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
