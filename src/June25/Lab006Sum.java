package June25;

import java.util.Scanner;

public class Lab006Sum {
    public static void main(String[] args) {
            //int [] TobeSum = {56, 78, 75, 84, 92};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the total size of the list");
            int size = scanner.nextInt();
            int[] List = new int[size];

            for(int i = 0; i<size; i++){
                System.out.println("Please enter Number " + (i+1) + ":");
                List[i] = scanner.nextInt();
            }
            System.out.println("Please find the entered numbers to be added");

            for(int i = 0; i < size; i++){
                System.out.println(List[i]);
            }


            int sum = 0;
            for(int i = 0 ; i < List.length; i++){
                sum = sum + List[i];
            }
            System.out.println("Total sum of the numbers in this array is " + sum);
        }

    }