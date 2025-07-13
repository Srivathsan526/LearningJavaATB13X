package July11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class T5_Compare_ArrayList_LinkedList {
    public static void main(String[] args) {
        List AL = new ArrayList();
        List LL = new LinkedList();

        Long ALStartTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            AL.add(i+1);
        }
        Long ALEndTime = System.currentTimeMillis();

        Long ALTime = (ALEndTime - ALStartTime);


        Long LLStartTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            LL.add(i);
        }
        Long LLEndTime = System.currentTimeMillis();

        Long LLTime = (LLEndTime - LLStartTime);

        System.out.println("ArrayList time: " + ALTime +"ms");
        System.out.println("LinkedList time: " + LLTime + "ms");



    }

}
