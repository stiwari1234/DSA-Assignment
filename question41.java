// Algorithm:
// 1. Initialize max and current sum to first element.
// 2. At each step, update current sum and max.

public class question41 {
    public int maxSubArray(int[] nums) {
        int max = nums[0], curr = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        question41 obj = new question41();
        System.out.println(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)
