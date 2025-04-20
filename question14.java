//Algorithm:
//
//Ensure the first array is smaller than the second.
//Use binary search on the smaller array, partitioning both arrays such that half of the elements are on the left side and half are on the right side.
//Calculate the median based on the partitioned arrays.
public class question14 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);
        int m = nums1.length, n = nums2.length;
        int left = 0, right = m, partitionX, partitionY;
        while (left <= right) {
            partitionX = (left + right) / 2;
            partitionY = (m + n + 1) / 2 - partitionX;
            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
            if (maxX <= minY && maxY <= minX) {
                if ((m + n) % 2 == 0) return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                else return Math.max(maxX, maxY);
            } else if (maxX > minY) right = partitionX - 1;
            else left = partitionX + 1;
        }
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}

