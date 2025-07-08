package July7;

public class T9_Interface_Polymorphism{
    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        g1.play();
        Piano p1 = new Piano();
        p1.play();
    }
}
interface Playable{
    void play();

    }
class Guitar implements Playable{
    public void play(){
        System.out.println("Playing Guitar");
    }

}
class Piano implements Playable{
    public void play(){
        System.out.println("Playing Piano");
    }

}