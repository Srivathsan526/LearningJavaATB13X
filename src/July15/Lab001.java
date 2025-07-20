package July15;


import java.util.*;


public class Lab001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check character count");
        String input = sc.next();

        Map<Character, Integer> characters = new HashMap();
        for(char c : input.toCharArray()) {
            characters.put(c, characters.getOrDefault(c, 0) + 1);

        }
        for(Character key: characters.keySet()){
            System.out.println(key + " -> " + characters.get(key));

        }
        sc.close();
    }

}
