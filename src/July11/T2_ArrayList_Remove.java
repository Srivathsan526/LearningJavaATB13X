package July11;

import java.util.ArrayList;
import java.util.Iterator;

public class T2_ArrayList_Remove {
    public static void main(String[] args) {
        ArrayList remove = new ArrayList();
        remove.add("Amit");
        remove.add("Neha");
        remove.add("Suresh");
        remove.remove("Neha");
        System.out.println("Names after removal");
        System.out.println(remove);

        Iterator iterator = remove.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
