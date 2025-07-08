package July7;

public class T7Interface_Default_Static {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        Vehicle.fuelType();
    }
}
interface Vehicle{
    default void start(){
        System.out.println("Vehicle Started");
    }

    static void fuelType(){
        System.out.println("Fuel Type - Petrol");
    }
}

class Car implements Vehicle{

}