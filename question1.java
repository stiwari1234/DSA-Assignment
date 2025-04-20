// A prefix sum array is a data structure that stores the cumulative sum of elements of an array up to each index. Essentially, each element in the prefix sum array represents the sum of all the elements in the original array from the start up to that position

//     How it works:
// If you have an array arr of length n, the prefix sum array prefix_sum is also of length n. The value at each position i in the prefix_sum array represents the sum of elements from index 0 to i in the arr.

// For example, if arr = [1, 2, 3, 4, 5], the prefix sum array prefix_sum would look like this:

// prefix_sum[0] = arr[0] = 1
// prefix_sum[1] = arr[0] + arr[1] = 1 + 2 = 3
// prefix_sum[2] = arr[0] + arr[1] + arr[2] = 1 + 2 + 3 = 6
// prefix_sum[3] = arr[0] + arr[1] + arr[2] + arr[3] = 1 + 2 + 3 + 4 = 10
// prefix_sum[4] = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] = 1 + 2 + 3 + 4 + 5 = 15
// So, prefix_sum = [1, 3, 6, 10, 15].

// Formula:
// To build the prefix sum array from the original array:

// prefix_sum[i] = arr[0] + arr[1] + ... + arr[i] for each i in the range 0 to n-1.
class question1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int[] prefixSum = new int[n];
        
        
        prefixSum[0] = arr[0]; 
        
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i]; 
        }

        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        
    }
}