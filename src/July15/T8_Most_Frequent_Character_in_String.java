package July15;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class T8_Most_Frequent_Character_in_String {
    public static void main(String[] args) {
        String input = "aaaabbbcc";
        Map<Character, Integer> charCount = new TreeMap();
        for(char c: input.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);

        }

        Character maxKey = '\0';
        Integer maxValue = 0;
        for(Character key: charCount.keySet()){
        if(charCount.get(key)>maxKey){
            maxKey = key;
            maxValue = charCount.get(key);
            System.out.println("Most frequent character is: " + maxKey + "(" + maxValue + " times)." );
        }

        }

    }
}
