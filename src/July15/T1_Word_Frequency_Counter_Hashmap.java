package July15;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T1_Word_Frequency_Counter_Hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence to check the word count");
        String input = sc.nextLine();

        String[] words = input.split("\\s+");
        Map<String,Integer> wordCount = new HashMap();
        for(String word: words){
            word = word.toLowerCase();
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);

        }
        for(String key : wordCount.keySet()){
            System.out.println(key + " -> " + wordCount.get(key));
        }

    }
}
