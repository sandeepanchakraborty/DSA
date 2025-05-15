class Solution {
    public String reverseWords(String s) {
        char arr[]=s.toCharArray();
        int len=arr.length;
        int startindex=0;
        for(int endindex=0;endindex<=len;endindex++){
            if(endindex==len || arr[endindex]==' '){
                reverse(arr,startindex,endindex-1);
                startindex=endindex+1;
            }
        }
        return new String(arr);
    }


    public void reverse(char arr[],int startindex,int endindex){
        while(startindex<endindex){
            char temp=arr[startindex];
            arr[startindex]=arr[endindex];
            arr[endindex]=temp;
            startindex++;
            endindex--;
       }
    }
}