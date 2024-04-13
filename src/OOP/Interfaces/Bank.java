package OOP.Interfaces;

public class Bank implements Payments {
    @Override
    public void makePayment() {
        System.out.println("Pagesa u krye nepermjet bankes!");
    }
}
