package OOP.FigureExample;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int area() {
        return (int) ((int) Math.PI * Math.pow(radius,2));
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
