package July11;

import java.util.ArrayList;
import java.util.Scanner;

public class T4_ArrayList_Find {
    public static void main(String[] args) {
        ArrayList cities = new ArrayList();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the city to be checked");
        String checkCity = sc.next();

        if(cities.contains(checkCity)){
            System.out.println(checkCity + " is in the list");
        }else{
            System.out.println(checkCity + " is not in the list");
        }




        sc.close();

    }

}
