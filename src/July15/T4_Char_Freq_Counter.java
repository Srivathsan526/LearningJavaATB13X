package July15;


import java.util.HashMap;
import java.util.Map;

public class T4_Char_Freq_Counter {
    public static void main(String[] args) {
        String input = "aabbccddeeff";

        Map<Character,Integer> wordCount = new HashMap();
        for(char c: input.toCharArray()){
            wordCount.put(c, wordCount.getOrDefault(c,0)+1);
        }

        for(Character key: wordCount.keySet()){
            System.out.println(key + " -> " + wordCount.get(key));
        }

    }
}
