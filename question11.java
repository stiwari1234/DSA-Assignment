//Algorithm:
//
//Use two pointers: one at the beginning (left) and one at the end (right).
//Calculate the sum of the elements at left and right.
//If the sum equals the target, return the pair.
//If the sum is smaller than the target, increment left to increase the sum.
//If the sum is larger than the target, decrement right to decrease the sum.
//Repeat until a pair is found or left crosses right.
import java.util.Arrays;
public class question11 {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) return new int[]{nums[left], nums[right]};
            if (sum < target) left++;
            else right--;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
// Time Complexity:O(n)

