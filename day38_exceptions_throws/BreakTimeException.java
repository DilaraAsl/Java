package day38_exceptions_throws;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException() {
        super("It is break time!");
    }

    public BreakTimeException(String str) {
        super(str);
    }
}
