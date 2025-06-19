package June18;

import java.util.Scanner;

public class Task1LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year you want check whether it's a leap year or not");
        int year;

        while(true){
            if(scanner.hasNextInt()){
                year = scanner.nextInt();
                break;
            }else{
                System.out.println("Please enter a valid number as a year to continue");
                scanner.next();
            }
        }



        if((year % 4 == 0 && year % 100 != 0) ||  year % 400 == 0){
            System.out.println(year + " is a leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}
