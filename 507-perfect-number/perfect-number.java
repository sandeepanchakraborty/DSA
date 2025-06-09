class Solution {
    public boolean checkPerfectNumber(int n) {
          if(n==1) return false;
        int sum=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;

                if(n/i!=n && i!=n/i){
                    sum+=n/i;
                }
            }
        }
        if(sum==n) return true;
        return false;
    }
}