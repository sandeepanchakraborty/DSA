import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
        Arrays.sort(candidates);
        func(0,target,nums,candidates,ans);
        return ans;
    }

    public void func(int ind,int sum,List<Integer> nums,int[] cand,List<List<Integer>> ans){
        if(sum==0){
            ans.add(new ArrayList<>(nums));
            return;
        }

        if(sum<0 || ind==cand.length){
            return;
        }
        nums.add(cand[ind]);
        func(ind+1,sum-cand[ind],nums,cand,ans);
        nums.remove(nums.size()-1);
        for(int i=ind+1;i<cand.length;i++){
            if(cand[i]!=cand[ind]){
                func(i,sum,nums,cand,ans);
                break;
            }
        }
    }
}