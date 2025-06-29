package June27;

import java.util.Scanner;

public class Lab003RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter the number to print * with Left triangle");
        int num = scanner.nextInt();

        for(int i = num; i >= 1; i--){
            for(int j = 1; j<=i;j++){
                System.out.print(" * |");
            }
            System.out.println();
        }
    }
}
