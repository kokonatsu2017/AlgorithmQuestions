package Amazon.Easy;
/**
 * LeetCode 661
 * @author kokonatsudream
 *
 */
public class ImageSmoother {
	public int[][] imageSmoother(int[][] M) {
		int[][] res = new int[M.length][M[0].length];
		
        for(int r = 0; r < M.length; r++){
        	for(int c = 0; c < M[0].length; c++){
        		res[r][c] = average(M, r, c);
        	}
        }
        
        return res;
    }
	
	public int average(int[][] M, int r, int c){
		int sum = 0;
		int count = 0;
		
		for(int i = -1; i < 2; i++){
			for(int j = -1; j < 2; j++){
				if(r + i >= 0 && r + i < M.length && c + j >= 0 && c + j < M[0].length){
					sum += M[r + i][c + j];
					count++;
				}
				
			}
		}
		return sum / count;
	}
}
