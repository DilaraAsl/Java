package day38_exceptions_throws.ShapeTask;

public class InvalidShapeException extends RuntimeException {
    public InvalidShapeException(String str) {
        super(str);
    }
}
