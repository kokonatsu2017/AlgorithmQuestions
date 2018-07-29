package Array;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * 
 *
 */

public class validSudoku {
	public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] cubes = new boolean[9][9];
        
        for(int row = 0; row < board.length; row++){
        	for(int col = 0; col < board[0].length; col++){
        		int c = board[row][col] - '1';
        		
        		if(board[row][col] == '.') continue;
        		
        		if(rows[row][c] || cols[col][c] || cubes[(row/3)* 3 + (col / 3)][c]) return false;
        		
        		rows[row][c] = true;
        		cols[col][c] = true;
        		cubes[(row/3)* 3 + (col / 3)][c] = true;
        	}
        	
        }
        return true;
    }
}
