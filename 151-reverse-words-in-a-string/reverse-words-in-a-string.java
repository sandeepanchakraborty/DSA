class Solution {
    public String reverseWords(String s) {
   StringBuilder res=new StringBuilder();
   int startindex=s.length()-1;
   while(startindex>=0){
    while(startindex>=0 && s.charAt(startindex)==' '){
        startindex--;
    }
    if(startindex<0){
        break;
    }
    int endindex=startindex;

    while(startindex>=0 && s.charAt(startindex)!=' '){
        startindex--;
    }
       if(res.length()==0){
           res.append(s.substring(startindex+1,endindex+1));
       }else{
           res.append(" ");
            res.append(s.substring(startindex+1,endindex+1));
       }
   }
   return res.toString();
    }
}