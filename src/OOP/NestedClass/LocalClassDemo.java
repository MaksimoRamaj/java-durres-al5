package OOP.NestedClass;

public class LocalClassDemo {
    public static void main(String[] args) {
        final int x = 3;
        final int y = 5;
        class MyLocal {
            @Override
            public String toString() {
                return "Inside local class ->  x = " + x + ", y =" + y;
            }
        }
//        y = 6;
        MyLocal myLocal = new MyLocal();
        System.out.println(myLocal.toString());
    }
}


