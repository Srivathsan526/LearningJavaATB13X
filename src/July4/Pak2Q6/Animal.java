package July4.Pak2Q6;

public class Animal {
    protected void eat(){
        System.out.println("Animal is eating");
    }
}

class dog extends Animal{

    void doEat(){
        super.eat();
    }
}
