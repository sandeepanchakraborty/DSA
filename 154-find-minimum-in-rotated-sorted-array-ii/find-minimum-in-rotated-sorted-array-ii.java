class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        
        while (start < end) {
            // Check if the subarray is already sorted
            if (arr[start] < arr[end]) {
                return arr[start];
            }

            int mid = start + (end - start) / 2;

            // Handle duplicates by moving start and end towards the center
            if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                start++;
                end--;
            } 
            // Check if the left half is sorted
            else if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } 
            // Right half is sorted
            else {
                end = mid;
            }
        }

        return arr[start];
    }
}

