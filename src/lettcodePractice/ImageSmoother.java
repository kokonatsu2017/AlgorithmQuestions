package lettcodePractice;

/**
 * Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. 
 * If a cell has less than 8 surrounding cells, then use as many as you can.
 * 
 *
 */
public class ImageSmoother {
	public int[][] imageSmoother(int[][] M) {
        if(M == null) return null;
        
        int rows = M.length;
        int columns = M[0].length;
        
        int[][] res = new int[rows][columns];
        for(int r = 0; r < rows; r++){
        	for(int c = 0; c < columns; c++){
        		int count = 0;
        		int sum = 0;
        		
        		for(int r1 : new int[]{-1, 0, 1}){
        			for(int c1: new int[]{-1, 0, 1}){
        				int row = r + r1;
        				int col = c + c1;
        				if(valid(row, col, rows, columns)){
        					count++;
        					sum += M[row][col];
        				}
        			}
        		}
        		res[r][c] = sum/count;
        	}
        }
        return res;
    }
	public boolean valid(int x, int y, int maxRow, int maxCol){
		return x >= 0 && y >= 0 && x < maxRow && y< maxCol;
	}
}
