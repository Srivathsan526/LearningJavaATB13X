package June19;

import java.util.Scanner;

public class Challenge9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of a day from 1 to 7 to check the day");
        byte day = scanner.nextByte();

        switch(day){
            case 1 :
                System.out.println(day + " is a Monday");
                break;
            case 2 :
                System.out.println(day + " is a Tuesday");
                break;
            case 3 :
                System.out.println(day + " is a Wednesday");
                break;
            case 4 :
                System.out.println(day + " is a Thursday");
                break;
            case 5 :
                System.out.println(day + " is a Friday");
                break;
            case 6 :
                System.out.println(day + " is a Saturday");
                break;
            case 7 :
                System.out.println(day + " is a Sunday");
                break;
            default:
                System.out.println("Please enter a valid number from 1 to 7");
        }
    }
}
