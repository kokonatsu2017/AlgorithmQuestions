package Amazon.Easy;

/**
 * LeetCode 733
 * @author kokonatsudream
 *
 */
public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc > image[0].length) return image;
        
        int sColor = image[sr][sc];
        
        helper(image, sr, sc, sColor, newColor);
        
        return image;
    }
	
	public void helper(int[][] image, int r, int c, int sColor, int newColor){
		if(r < 0 || r >= image.length || c < 0 || c > image[0].length) return;
		
		if(image[r][c] != sColor || image[r][c] == newColor) return;
		
	    image[r][c] = newColor;
		
		helper(image, r, c + 1, sColor, newColor);
		helper(image, r, c - 1, sColor, newColor);
		helper(image, r + 1, c, sColor, newColor);
		helper(image, r - 1, c, sColor, newColor);
	}
}
