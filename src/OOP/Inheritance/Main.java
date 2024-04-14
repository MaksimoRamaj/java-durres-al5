package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box boxWeight = new BoxWeight(1,2,1,500);
        boxWeight.vellimi();

        Box box = boxWeight;
        box.vellimi();
    }
}
