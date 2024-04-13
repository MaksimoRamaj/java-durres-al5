package OOP.Interfaces.klasatAnonime;

import OOP.Interfaces.Bank;
import OOP.Interfaces.Payments;

public class Demo {
    public static void main(String[] args) {
        Payments p = new Payments() {
            @Override
            public void makePayment() {
                System.out.println("Payment done!");
            }
        };

        Payments p2 = ()->{
            System.out.println("Payment Done");
        };

        p2.makePayment();

        InstFinanciar i = new InstFinanciar() {
            @Override
            void receivePayment() {

            }

            @Override
            public void makePayment() {

            }
        };

        Bank b = new Bank();

    }
}
