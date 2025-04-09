import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length; // Number of intervals

        // Sort intervals based on their start times
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            // Skip intervals that are already merged
            if (ans.isEmpty()|| intervals[i][0]>ans.get(ans.size()-1)[1]) {
                ans.add(new int[]{start,end});
            }else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],end);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
