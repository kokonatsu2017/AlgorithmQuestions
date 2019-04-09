package Medium;
/**
 * LeetCode 807
 * @author kokonatsudream
 *
 */
public class maxIncreaseKeepingSkyline {
	public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] tbSkyline = new int[grid[0].length];
        int[] lrSkyline = new int[grid.length];
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] > tbSkyline[j]){
                    tbSkyline[j] =  grid[i][j];
                }
                if(grid[i][j] > lrSkyline[i]){
                    lrSkyline[i] = grid[i][j];
                }
            }
        }
        
        int increasing = 0; 
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                int max = Math.min(tbSkyline[j], lrSkyline[i]);
                if(max > grid[i][j]){
                    increasing += max - grid[i][j];
                }
            }
        }
        
        return increasing;
    }
}
