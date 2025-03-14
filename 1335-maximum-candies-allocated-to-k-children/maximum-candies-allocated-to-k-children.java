class Solution {
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        for(int candie:candies){
            max=Math.max(max,candie);
        }
        int low=0,high=max;
        while(low<high){
            int mid=(low+high+1)/2;
            if(IsPossible(candies,k,mid)){
                low=mid;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
    private boolean IsPossible(int[] candies,long k,int mid){
        long piles=0;
        for(int candie:candies){
            piles+=candie/mid;
            if(piles>=k){
                return true;
            }
        }
        return false;
    }
}