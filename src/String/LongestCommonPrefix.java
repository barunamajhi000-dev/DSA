package String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"apple", "application", "apply"};
        String[] str2 = {"flower","flow","flowe"};
        System.out.println(longestCommonPrefix(str2));
    }

    static String longestCommonPrefix(String[] str){
        if(str.length==0 || str == null){
            return "";
        }
        //outer loop;
        for(int i=0;i<str[0].length();i++){
            char ch = str[0].charAt(i);
            //inner loop used for compare rest string's char
            for(int j=1;j<str.length;j++){
                if( i >= str[j].length() || str[j].charAt(i) != ch ){
                    return str[0].substring(0,i);
                }
            }
        }
        return str[0];
    }
}
