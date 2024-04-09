package OOP.Inheritance;

public class BoxColor extends BoxWeight{
    String color;

    public BoxColor() {
    }

    public BoxColor(int width, int height, int depth, int weight, String color) {
        super(width, height, depth, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
