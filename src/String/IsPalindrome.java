package String;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "MADA";
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not a Palindrome");
                return; //return; immediately stops the method. and exist on only void method
            }
            left++;
            right--;
        System.out.println("Yes , Palindrome");
        }
    }
}
