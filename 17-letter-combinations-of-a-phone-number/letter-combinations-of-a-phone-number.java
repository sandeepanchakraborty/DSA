class Solution {
    String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0) return ans;

        func(digits,ans,0,"");
        return ans;
    }
    public void func(String digits,List<String> ans,int ind,String curr){
        if(ind==digits.length()){
            ans.add(curr);
            return;
        }
        String s=map[digits.charAt(ind)-'0'];
        for(int i=0;i<s.length();i++){
            func(digits,ans,ind+1,curr+s.charAt(i));
        }
    }
}