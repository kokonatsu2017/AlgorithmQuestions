package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

/**
 * You are given a 2D char matrix representing the game board. 'M' represents an unrevealed mine, 'E' represents an unrevealed empty square, 'B' represents a revealed blank square that has no adjacent (above, below, left, right, and all 4 diagonals) mines, digit ('1' to '8') represents how many mines are adjacent to this revealed square, and finally 'X' represents a revealed mine.

Now given the next click position (row and column indices) among all the unrevealed squares ('M' or 'E'), return the board after revealing this position according to the following rules:

If a mine ('M') is revealed, then the game is over - change it to 'X'.
If an empty square ('E') with no adjacent mines is revealed, then change it to revealed blank ('B') and all of its adjacent unrevealed squares should be revealed recursively.
If an empty square ('E') with at least one adjacent mine is revealed, then change it to a digit ('1' to '8') representing the number of adjacent mines.
Return the board when no more squares will be revealed.
 * @author Kerry
 *
 */
public class mineswapper {
	public char[][] updateBoard(char[][] board, int[] click) {
		int m = board.length;
		int n = board[0].length;
		
		Queue<int[]> queue = new LinkedList<>();
		
		queue.add(click);
		
		while(!queue.isEmpty()) {
			int[] cell = queue.poll();
			int row = cell[0];
			int col = cell[1];
			
			if(board[row][col] == 'M') {
				board[row][col] = 'X';
			} else {
				int count = 0;
				//count number of mine
				for(int i = -1; i < 2; i++) {
					for(int j = -1; j < 2; j++) {
						if(i == 0 && j == 0) continue;
						
						int r = row + i;
						int c = col + j;
						
						if(r < 0 || r >= m || c < 0 || c >= n) continue;
						
						if(board[r][c] == 'M' || board[r][c] == 'X') count++;
					}
				}
				
				if(count > 0) {
					//Number of mine
					board[row][col] = (char)(count + '0');
				} else {
					//No mine
					board[row][col] = 'B';
					
					for(int i = -1; i < 2; i++) {
						for(int j = -1; j < 2; j++) {
							if(i == 0 && j == 0) continue;
							
							int r = row + i;
							int c = col + j;
							
							if(r < 0 || r >= m || c < 0 || c >= n) continue;
							
							if(board[r][c] == 'E') {
								queue.add(new int[] {r, c});
								board[r][c] = 'B';
							}
						}
					}
				}
			}
		}
		return board;
        
    }
}
