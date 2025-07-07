package July4;

public class parentSuper{
    public static void main(String[] args) {
        son s1 = new son();

    }
}

    class parent {
        int gold = 1000;
        int house = 3;

        void parent() {

            System.out.println("Hello! from father");
        }
    }

    class son extends parent {
        int gold = 1500;
        int house = 5;

        son() {
            super();
            super.parent();


            System.out.println("Parent class variable from super keyword is " + super.gold);
            System.out.println("Child class variable from super keyword is " + this.gold);

        }
    }

