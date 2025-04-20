
//Algorithm:
//Calculate the totalSum of the array.
//Initialize prefixSum = 0.
//Loop through the array:
//For each element arr[i], calculate suffixSum = totalSum - prefixSum - arr[i].
//        If prefixSum == suffixSum, return true.
//Update prefixSum by adding arr[i].
//Return false if no equilibrium index is found after checking all elements.
public class question4{

    public static boolean canSplit(int[] arr) {
        int n = arr.length;

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            int suffixSum = totalSum - prefixSum - arr[i];
            if (prefixSum == suffixSum) {
                return true;
            }
            prefixSum += arr[i];
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3};
        int[] arr2 = {1, 2, 3, 3, 0};

        System.out.println(canSplit(arr1)); // Output: false
        System.out.println(canSplit(arr2)); // Output: true
    }
}

