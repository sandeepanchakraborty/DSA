class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int sum=0;
        int prefix[][]=new int[n+1][26];

        for(int i=0;i<n;i++){
            for(int c=0;c<26;c++){
                prefix[i+1][c]=prefix[i][c];
            }
             prefix[i+1][s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                int max=0,min=n;
                for(int c=0;c<26;c++){
                    int freq=prefix[j][c]-prefix[i][c];
                    if(freq>0){
                        max=Math.max(max,freq);
                        min=Math.min(min,freq);
                    }
                }

                if(max>0 && min<n) sum+=max-min;
            }
        }
        return sum;
    }
}