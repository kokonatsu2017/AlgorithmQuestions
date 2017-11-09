
public class setZeroMatrix {
	/**
	 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
	 * @param matrix
	 */
	public void setZeroes(int[][] matrix) {
        int[] rows =  new int[matrix.length];
        int[]  columns = new int [matrix[0].length];
        
        
        for(int row = 0; row < matrix.length; row++) {
        	for(int column = 0; column < matrix[0].length; column++) {
        		if(matrix[row][column] == 0) {
        			rows[row] = 1;
        			columns[column] = 1;
        		}
        	}
        }
        
        for(int row = 0; row < matrix.length; row++) {
        	if(rows[row] == 1) {
        		for(int column = 0; column < matrix[0].length; column++)
        			matrix[row][column] = 0;
        	}
        }
        
        for(int column = 0; column < matrix[0].length; column++) {
        	if(columns[column] == 1) {
        		for(int row = 0; row < matrix.length; row++)
        			matrix[row][column] = 0;
        	}
        }
    }
}
