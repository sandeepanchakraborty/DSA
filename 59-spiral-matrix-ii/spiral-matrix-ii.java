class Solution {
    public int[][] generateMatrix(int n) {
        //  List<Integer> result=new ArrayList<>();
        int matrix[][]=new int[n][n];
        // int n=matrix.length;
        // int m=matrix[0].length;
        int startRow=0;
        int endRow=n-1;
        int startcol=0;
        int endcol=n-1;
        int val=1;
         
        while(startRow<=endRow && startcol<=endcol ){
            //for first row
            for(int j=startcol;j<=endcol;j++){
            matrix[startRow][j]=val;
            val++;
                // result.add(matrix[startRow][j]);
            }
            startRow++;

            for(int i=startRow;i<=endRow;i++){
                // result.add(matrix[i][endcol]);
                matrix[i][endcol]=val;
                val++;
            }
            endcol--;
            if(startRow<=endRow){   
                for(int j=endcol;j>=startcol;j--){
                // result.add();
                matrix[endRow][j]=val;
                val++;
            }
            endRow--;
}
            if(startcol<=endcol){
                for(int i=endRow;i>=startRow;i--){
                    // result.add();
                    matrix[i][startcol]=val;
                    val++;
                }
                startcol++;
            }
         
          
        }
        return matrix;
    }
}