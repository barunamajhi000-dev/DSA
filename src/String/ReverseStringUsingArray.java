package String;

public class ReverseStringUsingArray {
    public static void main(String[] args) {
    String str = "abc";
    char[] ch = str.toCharArray();
    reverseString(ch);

    }
    static void reverseString(char[] s){
        int left = 0;
        int right = s.length-1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
       /*for(char ch : s){
            System.out.print(ch+" ");
        } */
        System.out.println(s);
    }
}
