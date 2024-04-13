package OOP.FigureExample.ShapeExample;

public class Demo {
    public static void main(String[] args) {
        Shape sh1 = new Shape();
        Circle c1 = new Circle();
        Square sq1 = new Square();

        sh1 = c1;
        sh1.draw();

    }
}
