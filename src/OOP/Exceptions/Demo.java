package OOP.Exceptions;

public class Demo {
    public static void main(String[] args){



        Bank bank = new Bank(1000);
        try {
            bank.withdrawMoney(2000);
        }catch (BalanceJoMjaftueshemException e){
            e.getMessage();
        }

        System.out.println("After withdraw!");

//        int a = 5;
//        int b = 0;
//        int c[] = {1,2};
//
//        try {
//            System.out.println(a/b);
//        }catch (ArithmeticException e){
//            b = 1;
//            System.out.println(e.getMessage());
//            System.out.println("Vlera e b ishte 0 u zevendsua me 1");
//            System.out.println(a/b);
//        }finally {
//            System.out.println("E");
//        }
//
//
//        System.out.println("After Exception!");
    }

    static void throwsExceptionMethod()throws Exception{
        throw new Exception();
    }
}
