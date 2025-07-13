package July9;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class T7_Checked_Exception {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("SDF://Test/to/check/not/working");
        } catch (FileNotFoundException e) {
            System.out.println("Error Message is " + e.getClass().getSimpleName());
        }
    }
}