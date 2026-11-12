package String;

public class MaximumAvgSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double windowSum = 0;
        for(int i=0;i<k;i++){
            windowSum += arr[i];
        }
        double maxSum = windowSum;
        double maxAvg = windowSum/k;
        for(int i = k;i<arr.length;i++){
            windowSum = windowSum - arr[i-k] + arr[i];

            if(windowSum > maxSum){
                maxSum = windowSum;
                maxAvg = maxSum/k;
            }
        }
        System.out.println(maxAvg);
    }
}
