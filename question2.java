//Algorithm:
//Preprocessing (Building the Prefix Sum Array):
//Create a prefix sum array where each element at index i stores the sum of elements from the start of the array up to index i.
//Initialize the prefix sum array such that:
//prefix_sum[i]=arr[0]+arr[1]+arr[i]
//prefix_sum[i]=arr[0]+arr[1]+…+arr[i]
//Querying the Sum of Elements in a Range [L, R]:
//After the prefix sum array is built, the sum of elements in the range [L, R] can be calculated as:
//sum
//        (
//                L
//                ,
//                R
//                )
//=
//prefix_sum
//[
//R
//]
//        −
//prefix_sum
//[
//L
//−
//        1
//        ]
//sum(L,R)=prefix_sum[R]−prefix_sum[L−1]
//        If L = 0, the sum is simply prefix_sum[R].

public class question2{


    public static int[] buildPrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }
    public static int rangeSum(int[] prefixSum, int L, int R) {
        if (L == 0) {
            return prefixSum[R];
        }
        return prefixSum[R] - prefixSum[L - 1];
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};


        int[] prefixSum = buildPrefixSumArray(arr);


        System.out.println("Prefix Sum Array: ");
        for (int i : prefixSum) {
            System.out.print(i + " ");
        }
        System.out.println();
        int sum = rangeSum(prefixSum, 1, 3);
        System.out.println("Sum from index 1 to 3: " + sum);
        sum = rangeSum(prefixSum, 0, 4);
        System.out.println("Sum from index 0 to 4: " + sum);
    }
}
//time Complexity = O(n)

