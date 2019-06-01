package Medium;
/**
 * LeetCode 59
 * @author kokonatsudream
 *
 */
public class SprialMatrix {
	public int[][] generateMatrix(int n) {
		
		int[][] sprial = new int[n][n];
		
		if (n <= 0) {
			return sprial;
	    }

		int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        
		int num = 1;
		
		while(num <= n * n){
			
			for(int i = colStart; i <= colEnd; i++){
				sprial[rowStart][i] = num;
				num++;
			}
			
			rowStart++;
			
			for(int i = rowStart; i <= rowEnd; i++){
				sprial[i][colEnd] = num;
				num++;
			}
			
			colEnd--;
	        
			for(int i = colEnd; i >= colStart; i--){
				sprial[rowEnd][i] = num;
				num++;
			}
			
			rowEnd--;
			
			for(int i = rowEnd; i >= rowStart; i--){
				sprial[i][colStart] = num;
				num++;
			}
			
			colStart++;
			
		}
		
		return sprial;
		
		
    }
}
