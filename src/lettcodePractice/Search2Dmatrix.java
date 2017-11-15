
public class Search2Dmatrix {
	/**
	 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
	 * Integers in each row are sorted in ascending from left to right.
	 * Integers in each column are sorted in ascending from top to bottom.
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix(int[][] matrix, int target) {
		
        int row = matrix.length;
        if(row == 0) return false;
        
        int column = matrix[0].length;
        int i = 0, j = column - 1;
        while(i < row && j >= 0) {
        	if(matrix[i][j] == target) return true;
        	else if(matrix[i][j] < target) i++;
        	else j--;
        }
        return false;
    }
}
