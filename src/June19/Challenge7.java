package June19;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers to find the largest");
        long y = scanner.nextLong();
        long x = scanner.nextLong();
        long w = scanner.nextLong();
        if((y>=x) && (y>=w)){
            System.out.println("Largest number is: " + y);
        }else if((x>=y) && (x>=w)){
            System.out.println("Largest number is: " + x);
        }else{
            System.out.println("Largest number is: " + w);

        }

    }
}
