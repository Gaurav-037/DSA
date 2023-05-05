

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow =0;
        int startCol =0;
        int  endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        List<Integer> myList = new ArrayList<Integer>();  

        while(startRow <= endRow && startCol <= endCol){
            // for top 
            for(int i=startCol; i<=endCol; i++){
                myList.add(matrix[startRow][i]);
                // System.out.print(matrix[startRow][i]);
            }
            // for left
            for(int j= startRow+1; j<=endRow; j++){
                myList.add(matrix[j][endCol]);
                // System.out.print(matrix[j][endCol]);
            }
            //for bottom
            for(int i = endCol-1; i>=startCol; i--){
                if(startRow == endRow){
                    break;
                }
                myList.add(matrix[endRow][i]);
                // System.out.print(matrix[endRow][k]);
            }
            //for right
            for(int j=endRow-1; j>=startRow+1; j--){
                  if(startCol == endCol){
                    break;
                }
                myList.add(matrix[j][startCol]);
                // System.out.print(matrix[l][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--; 
        }
        System.out.println();
    return (myList);
    }
}
