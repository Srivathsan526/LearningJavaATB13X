package July15;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T6_Group_Word_By_Length_Using_Map {
    public static void main(String[] args) {
        List<String> input = new ArrayList();
        input.add("Java");
        input.add("is");
        input.add("fun");
        input.add("cool");
        input.add("Hi");

        Map<Integer, List<String>> groupWords = new HashMap();
        for(String word: input){
            word = word.toLowerCase();
            Integer length = word.length();
            groupWords.putIfAbsent(length, new ArrayList());
            groupWords.get(length).add(word);

        }
        for(Integer key: groupWords.keySet()){
            System.out.println(key + " -> " + groupWords.get(key));
        }


    }
}
