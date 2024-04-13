package OOP.Exceptions;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
    }

    static void myMeth(){
        int a = 2;
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.initCause(new IllegalArgumentException());
            throw e;
        }
    }
}
