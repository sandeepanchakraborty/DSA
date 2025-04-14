class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == n - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else { 
                start = mid + 1;
            }
        }

        return -1; 
    }
}
