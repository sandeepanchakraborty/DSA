class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            return 1.0/power(x,-(long)n);
        }
        return power(x,n);
    }
    public double power(double x,long n){
        if(n==0) return 1.0;

        if(n==1) return x;

        if(n%2==0){
            return power(x*x,n/2);
        }else{
            return x*power(x,n-1);
        }
    }
}