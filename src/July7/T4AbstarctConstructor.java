package July7;

public class T4AbstarctConstructor {
    public static void main(String[] args) {
        c2 c = new c2();
        c.method();


    }
}


abstract class c1{

    void method(){
        System.out.println("Method from abstract class");
    }

    c1(){
        System.out.println("Abstract class constructor called");
    }
}

class c2 extends c1{

}
