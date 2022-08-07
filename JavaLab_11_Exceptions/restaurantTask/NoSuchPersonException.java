package JavaLab_11_Exceptions.restaurantTask;

public class NoSuchPersonException extends RuntimeException {
    public NoSuchPersonException(String exceptionMessage) {
        super(exceptionMessage);
    }
}
