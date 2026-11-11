package String;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String str = "programming";
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> map : hm.entrySet()){
            Character key = map.getKey();
            Integer value = map.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
