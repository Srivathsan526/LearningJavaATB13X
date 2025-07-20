package July15;

import java.util.LinkedHashMap;
import java.util.Map;

public class T5_Find_First_Non_Repeated_Character {
    public static void main(String[] args) {
        String input = "aabbccdeeff";

        Map<Character,Integer> characters = new LinkedHashMap();
        for(char c: input.toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1);
        }

            char firstChar = '\0';
            for(Character key:characters.keySet()) {
                if (characters.get(key) == 1) {
                    firstChar = key;
                    break;
                }
            }

                if (firstChar != '\0') {
                    System.out.println("First non-repeated character is: " + firstChar);
                }else{
                    System.out.println("No Non Repeated Characters found");
                }
            }
        }



