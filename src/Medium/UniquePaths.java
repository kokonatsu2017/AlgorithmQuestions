package Medium;
/**
 * LeetCode 62
 * @author kokonatsudream
 *
 */
public class UniquePaths {
	public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        for(int r = 0; r < n; r++){
        	paths[0][r] = 1;
        }
        
        for(int c = 0; c < m; c++){
        	paths[c][0] = 1;
        }
        
        for(int r = 1; r < n; r++){
        	for(int c = 1; c < m; c++){
        		paths[c][r] = paths[c][r -1] + paths[c - 1][r];
        	}
        }
        
        return paths[m - 1][n - 1];
    }
}
