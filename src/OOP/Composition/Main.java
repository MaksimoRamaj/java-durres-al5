package OOP.Composition;

public class Main {
    public static void main(String[] args) {
        CDPlayer carCdPlayer = new CDPlayer("Pioner");
        CDPlayer mp3CdPlayer = new CDPlayer("mp3");
        Manufacturer manufacturer = new Manufacturer("BMW",2017,"DE");

        Car car = new Car(carCdPlayer,manufacturer,5);
        Car car2 = new Car(carCdPlayer,manufacturer,4);
        
        CDPlayer cdPlayer = car.getCdPlayer();
        String brandd = cdPlayer.getBrand();

        String brand = car.getCdPlayer().getBrand();
    }
}
