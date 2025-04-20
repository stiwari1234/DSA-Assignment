//
//Algorithm:
//Compute the total sum of the array.
//Iterate through the array while maintaining a running sum of the elements to the left of the current index (left_sum).
//For each element at index i, do the following:
//The right sum of the array can be calculated as total_sum - left_sum - arr[i].
//If left_sum == right_sum, the index i is an equilibrium index.
//Update left_sum by adding the value of arr[i] after checking the equilibrium condition.
public class question3{

    public static int findEquilibrium(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, 3, 1};
        int result = findEquilibrium(arr);
        if (result != -1) {
            System.out.println("Equilibrium index: " + result);
        } else {
            System.out.println("No equilibrium index found");
        }
    }
}
//time Complexity  = O(n)

