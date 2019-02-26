package Amazon.Medium;
/**
 * LeetCode 48
 * 
 * @author kokonatsudream
 *
 */
public class RotateImage {
	public void rotate(int[][] matrix) {
		int matrixLen = matrix.length;
		
		for(int row = 0; row < matrixLen/2; row++){
        	for(int col = 0; col < (matrixLen+1)/2; col++){
        		/**
        		upleft -> matrix[row][col];
        		upright -> matrix[col][matrixLen-1 - row];
        		bottomleft -> matrix[matrixLen -1 - col][row];
        		bottomright -> matrix[matrixLen-1 - row][matrixLen-1 - col];
        		
        		**/
        		int tmp = matrix[row][col];
        		matrix[row][col] = matrix[matrixLen-1-col][row];
        		matrix[matrixLen-1-col][row] = matrix[matrixLen-1 - row][matrixLen-1 - col];
        		matrix[matrixLen-1 - row][matrixLen-1 - col] = matrix[col][matrixLen-1 - row];
        		matrix[col][matrixLen-1 - row] = tmp;
        	}
        }
	}
}
