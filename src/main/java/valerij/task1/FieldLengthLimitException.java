package valerij.task1;

public class FieldLengthLimitException extends Exception {
    public static final int maxLength = 15;

    public FieldLengthLimitException() {}

    public FieldLengthLimitException(String message) {
        super(message);
    }
}
