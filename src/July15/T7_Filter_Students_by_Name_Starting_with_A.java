package July15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T7_Filter_Students_by_Name_Starting_with_A {
    public static void main(String[] args) {
        Map<Integer, String >students = new HashMap();
        students.put(101, "Anjali");
        students.put(102, "Dipak");
        students.put(103, "Aman");
        students.put(104, "Ravi");

        for(Integer key: students.keySet()) {
            String name = students.get(key);
            if(name.startsWith("A")){
                System.out.println(key + " -> " + students.get(key));
            }else{
                System.out.println("No name starts with A");
            }
        }
    }
}
