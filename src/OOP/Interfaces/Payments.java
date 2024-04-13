package OOP.Interfaces;

public interface Payments {
    int a = 5;

    void makePayment();

    //mund te kemi metoda statike
    static void myMeth(){
        System.out.println("Inside myMeth");
    }
    //mund te kemi implementim default
    default int myDefMeth(){
        return 0;
    }
    //mund te kemi metoda private
    private void pMeth(){
        //implementimi
    }
}
