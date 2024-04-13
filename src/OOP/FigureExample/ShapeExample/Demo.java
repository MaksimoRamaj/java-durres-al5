package OOP.FigureExample.ShapeExample;

public class Demo {
    public static void main(String[] args) {
        Shape sh1;
        Circle c1 = new Circle(5);
        Square sq1 = new Square(5);
        sh1 = c1;
        System.out.println(sh1.area());
        System.out.println(c1.area());
        sh1 = sq1;
       System.out.println( sh1.area() );
        System.out.println(sq1.area());

    }
}
