class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(generaterow(i+1));
        }
        return ans;
    }

    public static List<Integer> generaterow(int row){
        long ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(1);
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}