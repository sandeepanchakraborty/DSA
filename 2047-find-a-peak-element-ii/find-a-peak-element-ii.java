class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int start=0;
        int end=m-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int maxRowIndex=maxvalue(mat,n,m,mid);
            if (maxRowIndex < 0 || maxRowIndex >= n) return new int[]{-1, -1};
            int left=mid-1>=0?mat[maxRowIndex][mid-1]:-1;
            int right=mid+1<m?mat[maxRowIndex][mid+1]:-1;
            if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right){
             return new int[]{maxRowIndex, mid};
            }else if(mat[maxRowIndex][mid]<left){
                end=mid-1;
            }else{
                start=mid+1;
            }
          
        }
     return new int[]{-1, -1};
    }
    public int maxvalue(int[][] mat,int n,int m,int col){
         if (col < 0 || col >= m) return -1; 
        int max_value=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][col]>max_value){
                max_value=mat[i][col];
                index=i;
            }
        }
        return index;
    }
}