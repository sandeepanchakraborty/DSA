class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        // Create a new array to store the merged results
        long nums3[] = new long[n + m];
        
        int right = 0;  // Pointer for nums2
        int left = 0;   // Pointer for nums1
        int index = 0;  // Pointer for nums3

        // Merge both arrays while there are elements in nums1 and nums2
        while (left < n && right < m) {
            if (nums1[left] < nums2[right]) {
                nums3[index] = nums1[left];
                index++;
                left++;
            } else {
                nums3[index] = nums2[right];
                index++;
                right++;
            }
        }

        // Add remaining elements from nums1 (if any)
        while (left < n) {
            nums3[index++] = nums1[left++];
        }

        // Add remaining elements from nums2 (if any)
        while (right < m) {
            nums3[index++] = nums2[right++];
        }
        for (int i = 0; i < nums3.length; i++) {
            nums1[i] = (int) nums3[i];
    }
}
}
