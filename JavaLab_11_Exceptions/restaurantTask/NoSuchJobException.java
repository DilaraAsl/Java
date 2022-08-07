package JavaLab_11_Exceptions.restaurantTask;

public class NoSuchJobException extends RuntimeException {
    public NoSuchJobException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
