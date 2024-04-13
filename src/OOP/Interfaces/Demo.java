package OOP.Interfaces;

public class Demo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        WW ww = new WW();
        BTC btc = new BTC();

        Universitet universitet = new Universitet();

        universitet.receivePayments(bank);
        //Error sepse ww nuk implementon interface Payments
//        universitet.receivePayments(ww);
        universitet.receivePayments(btc);
    }
}
