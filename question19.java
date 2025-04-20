// Algorithm:
// 1. Initialize maxProd, minProd, and result.
// 2. Iterate through array, for each element:
//    - Update maxProd and minProd using current number.
//    - Update result with maxProd.

public class question19 {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0], minProd = nums[0], res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
            minProd = Math.min(nums[i], Math.min(temp * nums[i], minProd * nums[i]));
            res = Math.max(res, maxProd);
        }
        return res;
    }

    public static void main(String[] args) {
        question19 obj = new question19();
        int[] nums = {2,3,-2,4};
        System.out.println(obj.maxProduct(nums));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
