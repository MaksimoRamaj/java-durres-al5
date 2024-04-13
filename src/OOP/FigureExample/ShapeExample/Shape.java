package OOP.FigureExample.ShapeExample;

abstract class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
    abstract double area();
    abstract double perimter();
}
 class Circle extends Shape {
    private int radius;

     public Circle(int radius) {
         this.radius = radius;
     }

     @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

     @Override
     double area() {
         System.out.println("Brenda rrethit!");
        return Math.PI * Math.pow(radius,2);
     }
     @Override
     double perimter() {
         return 2*Math.PI * radius;
     }
 }
class Square extends Shape {
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }

    @Override
    double area() {
        System.out.println("Brenda katrorit!");
        return a * a;
    }

    @Override
    double perimter() {
        return 0;
    }
}


