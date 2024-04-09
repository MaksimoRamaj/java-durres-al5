package OOP.Composition;

public class Car {
    private CDPlayer cdPlayer;
    private Manufacturer manufacturer;
    private int noOfDoors;

    public Car() {
    }

    public Car(CDPlayer cdPlayer, Manufacturer manufacturer, int noOfDoors) {
        this.manufacturer = manufacturer;
        this.noOfDoors = noOfDoors;
        if (cdPlayer.isTaken()){
            cdPlayer = new CDPlayer("A");
        }
    }

    public void brake(){
        System.out.println("Car is breaking!");
    }

    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CDPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}
