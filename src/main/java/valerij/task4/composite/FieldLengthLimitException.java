package valerij.task4.composite;

public class FieldLengthLimitException extends Exception {
    public static final int maxLength = 30;

    public FieldLengthLimitException() {}

    public FieldLengthLimitException(String message) {
        super(message);
    }
}
