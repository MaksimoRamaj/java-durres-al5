package OOP.Composition;

public class Manufacturer {
    private String brand;
    private int foundationYear;
    private String state;

    public Manufacturer(String brand, int foundationYear, String state) {
        this.brand = brand;
        this.foundationYear = foundationYear;
        this.state = state;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
