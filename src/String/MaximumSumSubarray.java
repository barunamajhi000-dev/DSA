package String;

public class MaximumSumSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int count=0;
        int windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum = windowSum+arr[i];
        }
        int maxSum = windowSum;
        for(int i = k;i<arr.length;i++){
            windowSum = windowSum - arr[i-k] + arr[i];
            count = count+1;
            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }
        System.out.println(maxSum);
        System.out.println(count);
    }
}