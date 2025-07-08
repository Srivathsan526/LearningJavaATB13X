package July7;

public class T8_Interface_Constants {
    public static void main(String[] args) {
        Car1 c2 = new Car1();
        c2.message();
    }

}
interface SpeedLimit{
    int max_speed = 120;
    }
class Car1 implements SpeedLimit{
    void message(){
        System.out.println("Max Speed: " + max_speed);
    }

}
