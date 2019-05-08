package Medium;
/**
 * LeetCode 695
 * @author kokonatsudream
 *
 */
public class MaxAreaOfIslands {
	public int maxAreaOfIsland(int[][] grid) {
		
		if(grid.length <= 0 || grid[0].length <= 0) return 0;
		
        int rows = grid.length;
        int cols = grid[0].length;
        
        int max = 0;
        for(int r = 0; r < rows; r++){
        	for(int c = 0; c < cols; c++){
        		if(grid[r][c] == 1){
        			int count = searchAround(grid, r, c);
        			max = Math.max(max, count);
        		}
        	}
        }
        
        return max;
    }
	
	public int searchAround(int [][] grid, int r, int c){
		if(r >= grid.length || r < 0 || c >= grid[0].length || c < 0) return 0;
		
		int count = 0;
		
		if(grid[r][c] == 1){
			grid[r][c] = 0;
			count++;
			count += searchAround(grid, r + 1, c);
			count += searchAround(grid, r - 1, c);
			count += searchAround(grid, r, c + 1);
			count += searchAround(grid, r, c - 1);
		}
		
		return count;
		
	}
}
