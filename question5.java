//Algorithm:
//Initial Window Sum: Start by calculating the sum of the first K elements of the array. This will be the sum of the first window.
//Sliding the Window: For each subsequent position of the window:
//Subtract the element that is leaving the window (i.e., the element at the left end).
//Add the element that is entering the window (i.e., the element at the right end).
//Track Maximum Sum: Keep track of the maximum sum encountered while sliding the window.
public class question5{

    public static int maxSum(int[] arr, int K) {
        int n = arr.length;
        if (n < K) return -1;
        int currentSum = 0;
        for (int i = 0; i < K; i++) {
            currentSum += arr[i];
        }
        int maxSum = currentSum;
        for (int i = K; i < n; i++) {
            currentSum += arr[i] - arr[i - K];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int K = 3;
        System.out.println(maxSum(arr, K));
    }
}

