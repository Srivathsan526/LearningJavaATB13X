package June25;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab008CharPlace {

    public static void main(String[] args) {


        String[] name = {"p", "R", "a", "m", "o", "d"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to be found");
        String found = sc.next();
        boolean isFound = false;
        for (int i = name.length - 1; i >= 0; i--) {
            if (found.equalsIgnoreCase(name[i])) {
                System.out.println(found + " letter is at " + (i + 1) + " place. Thanks!");
                isFound = true;
                break;
            }
        }
            if(!isFound) {
                System.out.println("Entered letter is not found");
            }
            sc.close();
        }
    }






