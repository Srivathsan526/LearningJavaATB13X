package June16;

import java.util.Scanner;

public class Lab003StringSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter the Browser");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("It will be executed in chrome");
                break;

            case "firefox":
                System.out.println("It will be executed in firefox");
                break;

            case "edge":
                System.out.println("It will be executed in Microsoft Edge");
                break;

            default:
                System.out.println("Apologies, This browser is not valid (or) supported");
                break;

        }


    }
}

