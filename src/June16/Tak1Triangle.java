package June16;


import java.util.Scanner;

public class Tak1Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st line length");
        int line1 = scanner.nextInt();
        //System.out.println(line1);

        System.out.println("Enter the 2nd line length");
        int line2 = scanner.nextInt();
        //System.out.println(line2);

        System.out.println("Enter the 3rd line length");
        int line3 = scanner.nextInt();
       // System.out.println(line3);


        if (line1 == line2 && line2 == line3){
            System.out.println("Triangle is equilateral");
        }else if(line1 == line2 || line1 == line3 || line2 == line3){
            System.out.println("Triangle is isosceles ");
        }else{
            System.out.println("Triangle is scalene");
        }


    }
}
