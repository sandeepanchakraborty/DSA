class Solution {
    public void reverseString(char[] s) {
       int n=s.length;
       for(int i=0;i<n/2;i++){
        char FirstChar=s[i];
        char LastChar=s[n-1-i];
        s[i]=LastChar;
        s[n-1-i]=FirstChar;

       } 
    }
}