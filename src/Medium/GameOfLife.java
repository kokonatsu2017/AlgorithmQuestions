package Medium;
/**
 * LeetCode 289
 * @author kokonatsudream
 *
 */
public class GameOfLife {
	public void gameOfLife(int[][] board) {
        for(int x = 0; x < board.length; x++){
        	for(int y = 0; y < board[0].length; y++){
        		int numOne = numOfOne(board, x, y);
        		if(board[x][y] == 1){
        			if(numOne < 2 || numOne > 3){
        				board[x][y] = -1;
        			}
        		} else if(board[x][y] == 0){
        			if(numOne == 3){
        				board[x][y] = 2;
        			}
        		}
        	}
        }
        
        for(int x = 0; x < board.length; x++){
        	for(int y = 0; y < board[0].length; y++){
        		if(board[x][y] == 2){
        			board[x][y] = 1;
        		} else if(board[x][y] == -1){
        			board[x][y] = 0;
        		}
        	}
        }
    }
	
	public int numOfOne(int[][] board, int x, int y){
		int liveCell = 0;
		if(x - 1 >= 0){
			if(y - 1 >= 0 && Math.abs(board[x-1][y-1]) == 1)
				liveCell++;
			if(Math.abs(board[x-1][y]) == 1)
				liveCell++;
			if(y + 1 < board[0].length && Math.abs(board[x-1][y+1]) == 1)
				liveCell++;
		}
		
		if(y - 1 >= 0 && Math.abs(board[x][y-1]) == 1){
			liveCell++;
		}
		
		if(y + 1 < board[0].length && Math.abs(board[x][y+1]) == 1){
			liveCell++;
		}
		
		if(x + 1 < board.length){
			if(y - 1 >= 0 && Math.abs(board[x+1][y - 1]) == 1)
				liveCell++;
			if(Math.abs(board[x+1][y]) == 1)
				liveCell++;
			if(y + 1 < board[0].length && Math.abs(board[x+1][y+1]) == 1)
				liveCell++;
		}
		
		return liveCell;
	}
}
 