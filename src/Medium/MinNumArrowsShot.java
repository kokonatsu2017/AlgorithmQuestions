package Medium;

import java.util.Arrays;
/**
 * LeetCode 452
 * @author kokonatsudream
 *
 */
public class MinNumArrowsShot {
	public int findMinArrowShots(int[][] points) {
		if(points.length == 0){
            return 0;
        }
		
        int numArrows = points.length;
		
        Arrays.sort(points, (a, b) -> a[0] - b[0]);
        
        int[] prev = points[0];
        
        for(int i = 1; i < points.length; i++){
        	if(points[i][0] <= prev[1]){
        		prev[0] = Math.max(points[i][0], prev[0]);
        		prev[1] = Math.min(points[i][1], prev[1]);
        		numArrows--;
        	} else {
        		prev = points[i];
        	}
        }
        
        return numArrows;
        
        
    }
}
