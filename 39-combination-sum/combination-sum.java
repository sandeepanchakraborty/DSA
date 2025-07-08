class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        for (int num : candidates) {
            v.add(num);
        }  
        func(v, v.size() - 1, target, new ArrayList<>(), ans);
        
        return ans;
    }
       public void func(List<Integer> v,int i,int sum,List<Integer> v2,List<List<Integer>> ans){
        if(sum==0){
            ans.add(new ArrayList<>(v2));
            return;
        }
        if(sum<0 || i<0){
            return;
        }
        func(v, i - 1, sum, v2, ans);
        v2.add(v.get(i));
        func(v,i,sum-v.get(i),v2,ans);
        v2.remove(v2.size()-1);
    }

}