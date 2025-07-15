class Solution {
    public int[][] insert(int[][] Intervals, int[] newInterval) {
         List<int[]> res=new ArrayList<>();
      int n=Intervals.length;
      int i=0;
      while(i<n && Intervals[i][1]<newInterval[0]){
        res.add(Intervals[i]);
        i++;
      }
      while(i<n && Intervals[i][0]<=newInterval[1]){
        newInterval[0]=Math.min(newInterval[0],Intervals[i][0]);
        newInterval[1]=Math.max(newInterval[1],Intervals[i][1]);
        i++;
      }
      res.add(newInterval);

      while(i<n){
        res.add(Intervals[i]);
        i++;
      }
      return res.toArray(new int[res.size()][]);
    }
}