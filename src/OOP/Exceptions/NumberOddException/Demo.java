package OOP.Exceptions.NumberOddException;

public class Demo {
    public static void main(String[] args) {
        //Write a Java program to create a method that takes an integer as a parameter
        // and throws an exception if the number is odd

 try {
     isOdd(5);
 }
 catch (Exception e){
     System.out.println(e.getMessage());
 }
    }
   static void isOdd(int number) throws Exception {
        if (number % 2 ==1 ){

            try {
                throw new NumberOddExeption("Nuk mund te jete numer tek");
            }
            catch (NumberOddExeption e){
             System.out.println(e.getMessage());
                try {
                    throw e;
                } catch (NumberOddExeption ex) {
                    throw new Exception(ex);
                }
            }
        }
        else { System.out.println(number);


   }
}
}
