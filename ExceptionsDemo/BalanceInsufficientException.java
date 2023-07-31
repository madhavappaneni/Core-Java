package ExceptionsDemo;

// Checked -> Extend Exception class
// Unchecked -> RuntimeException class

public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException(String message) {
        super(message);
    }

    public BalanceInsufficientException() {
        super("Insufficient Funds in your account");
    }

}
