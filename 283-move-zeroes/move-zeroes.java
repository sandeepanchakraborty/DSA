class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = -1;

        // Find the first occurrence of zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If there are no zeros, return
        if (j == -1) return;

        // Move non-zero elements to the left and fill zeros at the end
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                arr[i] = 0;
                j++;
            }
        }
    }
}
