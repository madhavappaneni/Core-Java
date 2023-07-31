package ExceptionsDemo;

public class Main {
    public static void main(String[] args) {
        try {
            ThrowExceptionDemo.main();
            // } catch (Exception e) {
        } catch (Throwable e) {
            System.out.println("Some error occured");
        }
    }
}