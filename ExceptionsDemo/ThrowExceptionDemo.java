package ExceptionsDemo;

import java.io.IOException;

public class ThrowExceptionDemo {

    public static void main() throws IOException, BalanceInsufficientException {
        var account = new Account();
        try {
            account.deposit(1);
            account.withdraw(10);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Logging");
            throw e;
        }
    }
}
