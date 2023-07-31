package ExceptionsDemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckedExceptionsDemo {
    public static void main(String[] args) {
        // FileReader reader = null;

        // try{

        // try with resources
        try (FileReader reader = new FileReader("File.txt");
                FileWriter fileWriter = new FileWriter("...");) {
            // other option is to use throws
            // reader = new FileReader("File.txt");
            // var value = reader.read();
            new SimpleDateFormat().parse("");
        }
        // catch (FileNotFoundException ex) {
        // // File not found exception extends IO exception and should be put before IO
        // // exception if we wish to handle it
        // System.out.println("File does not exist");
        // System.out.println(ex.getMessage());
        // } catch (IOException ex) {
        // System.out.println("Could not read data");
        // System.out.println(ex.getMessage());
        // } catch (ParseException e) {
        // e.printStackTrace();
        // }
        catch (IOException | ParseException ex) {
            ex.printStackTrace();
        }
        // finally {
        // if (reader != null) {
        // try {
        // reader.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }
        // } // can declare and initialize the resources in the try statement
    }
}