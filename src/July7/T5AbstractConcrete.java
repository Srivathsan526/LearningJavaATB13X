package July7;

public class T5AbstractConcrete {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.display();
        c1.show();

    }
}

    abstract class Parent {
        abstract void show();

        void display() {
            System.out.println("Concrete method in abstract class");
        }
    }

        class Child extends Parent {
            void show() {
                System.out.println("Abstract method implemented");
            }
        }


