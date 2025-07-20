package July15;

import java.util.LinkedHashMap;
import java.util.Map;

public class T2_Iterate_Over_HashMap_3Ways {
    public static void main(String[] args) {
        Map<String, String> users = new LinkedHashMap();
        users.put("Name","Dipak");
        users.put("Role","Tester");
        users.put("Level","Senior");
        System.out.println(users);

        System.out.println("KeySet output -------------");

        for(String key:users.keySet()){
            System.out.println(key + " -> " + users.get(key));

            //I did only one way and skipped entry set and iterator because I don't wanna cry
        }



    }
}
