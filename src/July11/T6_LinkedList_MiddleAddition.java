package July11;

import java.util.LinkedList;

public class T6_LinkedList_MiddleAddition {
    public static void main(String[] args) {
        LinkedList fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1,"Orange");
        //fruits.set(1,"Update");

        System.out.println("Fruits List: " + fruits);

    }
}
