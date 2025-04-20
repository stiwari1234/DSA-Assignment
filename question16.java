//Algorithm:
//
//Use the Boyer-Moore Voting Algorithm.
//Initialize a candidate and a count.
//Traverse through the array, adjust the candidate and count.
//After one pass, the candidate will be the majority element.
public class question16 {
    public static int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for (int num : nums) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }
}
//Time Complexity:O(n)

