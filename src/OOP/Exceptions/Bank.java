package OOP.Exceptions;

public class Bank {

    int balance;

    public Bank(int balance) {
        this.balance = balance;
    }

    void withdrawMoney(int value) throws BalanceJoMjaftueshemException{
        if (balance >= value){
            balance = balance - value;
        }else {
            throw new BalanceJoMjaftueshemException("Nuk keni mjaftueshem balance!");
        }
    }
}
