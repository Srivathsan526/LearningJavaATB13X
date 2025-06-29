package June27;
import java.util.Scanner;
public class Lab002StarMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to print. eg n = 3");
        int input = sc.nextInt();


        for(int i = 0; i<input; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
