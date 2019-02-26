package Amazon.Medium;
/**
 * LeetCode 240
 * @author kokonatsudream
 *
 */
public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        	return false;
        
        int col = matrix[0].length - 1;
        int row = 0;
        
        while(col >= 0 && row <= matrix.length - 1){
        	if(target == matrix[row][col]){
        		return true;
        	} else if(target < matrix[row][col]){
        		col--;
        	} else if(target > matrix[row][col]){
        		row++;
        	}
        }
        return false;
    }
	
}
