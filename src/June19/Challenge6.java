package June19;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        long z = scanner.nextLong();
        if(z>0){
            System.out.println(z + " is positive");
        }else if(z<0){
            System.out.println(z + " is negative");
        }else{
            System.out.println(z + " is zero");
        }

    }
}
