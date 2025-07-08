package July7;

public class T1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
    }
}

abstract class Animal{
    abstract void makeSound();

    }

    class Dog extends Animal{
        @Override
        void makeSound() {
            System.out.println("Sound - Bark");
        }

    }

    class Cat extends Animal{

        @Override
        void makeSound() {
            System.out.println("Sound - meow");
        }
    }