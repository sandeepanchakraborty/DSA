import java.util.*;
class Solution {
    public static int comp(int[] val1,int[] val2){
        return Integer.compare( val1[1], val2[1]);
    }


    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,Solution :: comp);
        int n=intervals.length;
        int cnt=1;
        int lastendtime=intervals[0][1];
        for(int i=0;i<n;i++){
            if(intervals[i][0]>=lastendtime){
                cnt++;
                lastendtime=intervals[i][1];
            }
        }
        return n-cnt;
    }
}