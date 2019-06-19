package Medium;

import java.util.LinkedList;
import java.util.Queue;
/**
 * LeetCode 542
 * @author kokonatsudream
 *
 */
public class Matrix01 {
	public int[][] updateMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		if(matrix[i][j] != 0){
        			matrix[i][j] = Integer.MAX_VALUE;
        		}
        	}
        }
		
        for(int i = 0; i < matrix.length; i++){
        	for(int j = 0; j < matrix[0].length; j++){
        		if(matrix[i][j] == 0){
        			findShortestPath(matrix, i, j);
        		}
        	}
        }
        
        return matrix;
    }
	
	private class rowCol{
		int row, col;
		public rowCol(int row, int col){
			this.row = row;
			this.col = col;
		}
	}
	private void findShortestPath(int[][] matrix, int i, int j){
		Queue<rowCol> q = new LinkedList<>();
		
		
		
		int level = 0;
		q.add(new rowCol(i,j));
		
		while(!q.isEmpty()){
			level++;
			int size = q.size();
			
			for(int count = 0; count < size; count++){
				rowCol rc = q.poll();
				
				if(rc.row > 0 && matrix[rc.row - 1][rc.col] > level){
					matrix[rc.row - 1][rc.col] = level;
					q.add(new rowCol(rc.row - 1, rc.col));
				}
				if(rc.row < matrix.length - 1 && matrix[rc.row + 1][rc.col] > level){
					matrix[rc.row + 1][rc.col] = level;
					q.add(new rowCol(rc.row + 1, rc.col));
				}
				if(rc.col > 0 && matrix[rc.row][rc.col - 1] > level){
					matrix[rc.row][rc.col - 1] = level;
					q.add(new rowCol(rc.row, rc.col - 1));
				}
				if(rc.col < matrix[0].length - 1 && matrix[rc.row][rc.col + 1] > level){
					matrix[rc.row][rc.col + 1] = level;
					q.add(new rowCol(rc.row, rc.col + 1));
				}
			}
		}
	}
}
