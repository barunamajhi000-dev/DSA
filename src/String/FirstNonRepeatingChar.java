package String;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("program"));

    }

    static char firstNonRepeatingChar(String str) {

        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
}



