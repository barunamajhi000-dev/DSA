package String;

public class ContiguousArray {
    public static void main(String[] args) {
        String str = "ABCDE";
        int windowSize = 3;
        for(int i=0;i<str.length()-windowSize+1;i++){
            System.out.println(str.substring(i,i+windowSize));
        }
    }
}
