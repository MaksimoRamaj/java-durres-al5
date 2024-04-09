package OOP.BankAccountExercise;

import java.util.Objects;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(double toDeposit){
        if (toDeposit < 0){
            return;
        }
        balance = balance + toDeposit;
        System.out.println("Gjendja aktuale: " + checkBalance());
    }

    public double withdawMoney(double toWithdraw){
        if (toWithdraw > balance || toWithdraw < 0){
            System.out.println("Nuk mund te terheqesh kete shume!");
            return 0;
        }
        balance = balance - toWithdraw;
        System.out.println("Gjendja aktuale: " + checkBalance());
        return toWithdraw;
    }

    public double checkBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(accountNumber, that.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, balance);
    }
}
