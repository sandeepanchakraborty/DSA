class Solution {
   public List<Integer> spiralOrder(int[][] matrix){
        List<Integer> result=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int startRow=0;
        int endRow=n-1;
        int startcol=0;
        int endcol=m-1;
         
        while(startRow<=endRow && startcol<=endcol ){
            //for first row
            for(int j=startcol;j<=endcol;j++){
                result.add(matrix[startRow][j]);
            }
            startRow++;

            for(int i=startRow;i<=endRow;i++){
                result.add(matrix[i][endcol]);
            }
            endcol--;
            if(startRow<=endRow){   
                for(int j=endcol;j>=startcol;j--){
                result.add(matrix[endRow][j]);
            }
            endRow--;
}
            if(startcol<=endcol){
                for(int i=endRow;i>=startRow;i--){
                    result.add(matrix[i][startcol]);
                }
                startcol++;
            }
         
          
        }
        return result;
    }
}