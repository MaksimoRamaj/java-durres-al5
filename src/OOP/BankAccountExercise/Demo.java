package OOP.BankAccountExercise;

public class Demo {
    public static void main(String[] args) {
       BankAccount b1 = new BankAccount("AL015462355B",5000);
       BankAccount b2 = new BankAccount("AL854545",1000);
        System.out.println("Gjendja aktuale: " + b1.checkBalance());
        b1.depositMoney(2000);
        try {
            b1.withdawMoney(-10000);
        }catch (WithdrawException e){
            System.out.println(e);
        }

        System.out.println("After exception!");

//        System.out.println("Gjendja aktuale: " + b1.checkBalance());
//
//        System.out.println(b1);
//
//
//        String s1 = "A";
//        String s2 = "A";
//        String s3 = new String("A");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1 == s3);
//        System.out.println();
//        System.out.println(
//        b1.equals(b2));
    }
}
