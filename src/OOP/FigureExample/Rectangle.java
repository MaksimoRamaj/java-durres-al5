package OOP.FigureExample;

public class Rectangle extends Figure{
    private int c,d;

    public Rectangle() {
    }

    public Rectangle(int a, int b, int c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    @Override
    public int area(){
        return this.getA() * this.getB();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
