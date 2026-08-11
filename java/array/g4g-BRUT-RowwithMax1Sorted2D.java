class Solution {
    public int rowWithMax1s(int[][] arr) {
        int[][] mat = arr;
        int maxRowIndex = 0;
        int maxCount = 0;
        for(int i = 0; i < mat.length; i++){
            int OneCount = 0;
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    OneCount++;
                }
                if(OneCount>maxCount){
                    maxCount = OneCount;
                    maxRowIndex = i;
                }
            }
        }
        if(maxCount>0) return maxRowIndex;
        else{
            return -1;
        }
        
    }
}
