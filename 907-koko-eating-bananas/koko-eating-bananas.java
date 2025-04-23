class Solution {
    public static int minEatingSpeed(int[] v, int h) { // Renamed method
        int start = 1, end = maxele(v);
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int totalH = Calculatetotalh(v, mid);
            if (totalH <= h) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int maxele(int[] v) {
        int maxi = Integer.MIN_VALUE;
        for (int num : v) {
            maxi = Math.max(maxi, num);
        }
        return maxi;
    }

    public static int Calculatetotalh(int[] v, int hourly) {
        int totalH = 0;
        for (int num : v) {
            totalH += Math.ceil((double) num / hourly);
        }
        return totalH;
    }
}
