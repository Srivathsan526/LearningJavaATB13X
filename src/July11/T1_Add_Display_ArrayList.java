package July11;

import java.util.ArrayList;
import java.util.List;

public class T1_Add_Display_ArrayList {
    public static void main(String[] args) {
        List students = new ArrayList();
        students.add("Dipak");
        students.add("Ravi");
        students.add("Sneha");
        students.add("Priya");
        students.add("Anjali");

        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

    }
}
