package String;

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        if(isPalindrome(str)){
            System.out.println("Yes , Palindrome");
        }
        else {
            System.out.println("No , not a Palindrome");
        }

    }


    static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
