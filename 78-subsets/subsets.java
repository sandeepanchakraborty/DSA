class Solution {
    public List<List<Integer>> subsets(int[] nums) {
          List <List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(0,nums.length,nums,curr,ans);
        return ans;
    }
     public void backtrack(int ind,int n,int[] nums,List<Integer> curr,List<List<Integer>> ans){
        if(ind==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        backtrack(ind+1,n,nums,curr,ans);

        curr.add(nums[ind]);
        backtrack(ind+1,n,nums,curr,ans);
        curr.remove(curr.size()-1);
    }
}