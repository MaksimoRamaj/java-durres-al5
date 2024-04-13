package OOP.Exceptions;

public class Demo {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c[] = {1,2};
        try {
            System.out.println(a/2);
            c[3] = 5;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Brenda catch: " + e.getMessage());
        }
        finally {
            System.out.println("Brenda finally!");
        }

        System.out.println("After Exception!");
    }
}
