package July15;

import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class T3_TreeMap_Sort_By_Keys {
    public static void main(String[] args) {
        Map marks = new HashMap();
        marks.put("Anjali",95);
        marks.put("Dipak",75);
        marks.put("Ravi",80);
        Map treeMarks = new TreeMap();
        treeMarks.putAll(marks);

        for(Object key: treeMarks.keySet()){
            System.out.println(key + " = " + treeMarks.get(key));

        }

    }
}
