package Easy;

/**
 * LeetCOde 463
 * @author kokonatsudream
 *
 */
public class IslandPerimeter {
	public int islandPerimeter(int[][] grid) {
		int adj = 0;
		int num1 = 0;
        for(int r = 0; r < grid.length; r++){
        	for(int c = 0; c < grid[0].length; c++){
        		if(grid[r][c] == 1){
        			num1++;
        			
        			if(r - 1 >= 0 && grid[r-1][c] == 1){
        				adj++;
        			}
        			if(c - 1 >= 0 && grid[r][c-1] == 1){
        				adj++;
        			}
        		}
        	}
        }
        
        return num1 * 4 - adj * 2;
    }
}
