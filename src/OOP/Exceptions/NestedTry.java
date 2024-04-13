package OOP.Exceptions;

import java.util.Random;

public class NestedTry {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(-2,5);
        try {
            int b = 13 / a;
            System.out.println("a = " + a);
            try {
                if (a==1) a = a/(a-a);
                if (a==2) {
                    int c[] = {1};
                    c[10] = 100;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index oob: " + e);
            }
        }catch (ArithmeticException e){
            System.out.println("Divide by 0: " + e);
        }
    }
}
