package June20;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st number");
        int a;
         if(scanner.hasNextInt()){
           a = scanner.nextInt();
        } else{
            System.out.println("Please enter a valid number");
            return;
        }
        System.out.println("Please enter the 2nd number");
        int b;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        } else{
            System.out.println("Please enter a valid number");
            return;
        }
        int result_sum = sum(a,b);
        System.out.println("Sum of the 2 numbers are: " + result_sum);
        int result_sub = sub(a,b);
        System.out.println("Subtraction of the 2 numbers are: " + result_sub);
        int result_mul = mul(a,b);
        System.out.println("Multiplication of the 2 numbers are: " + result_mul);
        int result_div = div(a,b);
        System.out.println("Division of the 2 numbers are: " + result_div);
        int result_mod = mod(a,b);
        System.out.println("Modulus of the 2 numbers are: " + result_mod);


    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }
}
