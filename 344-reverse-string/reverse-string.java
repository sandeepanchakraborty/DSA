class Solution {
    public void reverseString(char[] s) {
        StringBuilder ans=new StringBuilder(new String(s));
        int n=s.length;
        for(int i=0;i<n/2;i++){
            char FirstChar=ans.charAt(i);
            char LastChar=ans.charAt(n-1-i);
            ans.setCharAt(i,LastChar);
            ans.setCharAt(n-1-i,FirstChar);
        }
        for(int i=0;i<n;i++){
            s[i]=ans.charAt(i);
        }
    }
}