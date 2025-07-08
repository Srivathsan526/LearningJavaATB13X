package July7;

public class T6InterfaceMulti {
    public static void main(String[] args) {
        Document d1 = new Document();
        d1.print();
        d1.show();

    }
}

interface Printable{
    void print();
    void show();
        }
        interface Showable{
            void print();
            void show();

        }
class Document implements Printable, Showable {

    public void print(){
        System.out.println("Printing Document");
    }
    public void show(){
        System.out.println("Showing Document");
    }

}

