class Solution {
    public String largestOddNumber(String s) {
     int ind=-1;
       for(int i=s.length()-1;i>=0;i--){
        if((s.charAt(i)-'0')%2==1){
            ind=i;
            break;
        }
       }
       if(ind==-1) return "";
    int i=0;
       while(i<=ind && s.charAt(i)=='0') i++;
       return s.substring(i,ind+1);
    }
}