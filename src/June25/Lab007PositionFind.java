package June25;

import java.util.Scanner;

public class Lab007PositionFind {
    public static void main(String[] args) {
        int[] marks = {1, 2, 3, 4, 5, 6};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number to be found from the array");
        int num;

        if(!scanner.hasNextInt()){
            System.out.println("Please enter a valid number to continue");

        }else {
            num = scanner.nextInt();


            for (int i = 0; i < marks.length; i++) {
                if (num == marks[i]) {
                    System.out.println(num + " is at " + "location " + (i + 1));
                } else {
                    System.out.println(num + " is not found in the array");
                    break;
                }
            }
        }
    }
}