package String;

import java.util.HashMap;

public class AnagramCheck {
    public static void main(String[] args) {
        if(isAnagram("listen","silent")){
            System.out.println("Yes two strings r anagram");
        }
        else{
            System.out.println("not a anagram");
        }
    }
    static boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        //first trasverse string 1
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        //second we have to check through trasverse each element present or not
        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}
