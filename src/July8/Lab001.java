package July8;

import java.sql.SQLOutput;

public class Lab001 {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(Automation.driver); //Recommended. class is used to call static variable not object(t1)
        Automation t2 = new Automation();
        System.out.println(t2.driver); // Not recommended. Please use class to call static variable(Automation.driver). Not object(t2)
    }
}
class Automation{
    static String driver = "chrome";

    {
        System.out.println("IIB-1");//Called every time when the class is called. (2 times here)
    }
    {
        System.out.println("IIB - 2");//Called every time when the class is called. (2 times here)
    }
    static{
        System.out.println("Default - Static");//Will be called only once when the class is called
    }
    static{
        System.out.println("Default - Static -2");//Will be called only once when the class is called
    }
}
