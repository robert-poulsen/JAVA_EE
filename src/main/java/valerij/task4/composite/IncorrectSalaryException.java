package valerij.task4.composite;

public class IncorrectSalaryException extends Exception {
    public IncorrectSalaryException() {}

    public IncorrectSalaryException(String message) {
        super(message);
    }
}