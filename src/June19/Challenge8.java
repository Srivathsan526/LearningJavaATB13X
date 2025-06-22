package June19;

import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year to find out whether it's a leap year");
        int year = scanner.nextInt();

        if((year%4==0) &&(year%100!=0) || year%400 ==0){
            System.out.println(year + " is a leap yer");
        }else{
            System.out.println(year + " is not a leap yer");
        }
    }
}
