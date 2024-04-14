package OOP.Exceptions;

public class BalanceJoMjaftueshemException extends Exception{

    private String message;

    public BalanceJoMjaftueshemException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
