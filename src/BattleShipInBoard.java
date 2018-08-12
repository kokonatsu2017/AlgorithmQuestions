/**
 * Given an 2D board, count how many battleships are in it. The battleships are represented with 'X's, empty slots are represented with '.'s. You may assume the following rules:
You receive a valid board, made of only battleships or empty slots.
Battleships can only be placed horizontally or vertically. In other words, they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1 column), where N can be of any size.
At least one horizontal or vertical cell separates between two battleships - there are no adjacent battleships.
Example:
X..X
...X
...X
In the above board there are 2 battleships.
Invalid Example:
...X
XXXX
...X
This is an invalid board that you will not receive - as battleships will always have a cell separating between them.
Follow up:
Could you do it in one-pass, using only O(1) extra memory and without modifying the value of the board?
 * @author kokonatsudream
 *
 */
public class BattleShipInBoard {
	public int countBattleships(char[][] board) {
        int count = 0;
        
        int r = board.length;
        if(r == 0) return 0;
        
        int c = board[0].length;
        if(c == 0) return 0;
        
        if(board[0][0] == 'X') count++;
        
        for(int i = 1; i < r; i++) {
        	if(board[i][0] == 'X' && board[i-1][0] == '.') count++;
        }
        
        for(int j = 1; j < c; j++) {
        	if(board[0][j] == 'X' && board[0][j-1] == '.') count++;
        }
        
        for(int i = 1; i < r; i++) {
        	for(int j = 1; j < c; j++) {
        		if(board[i][j] == 'X' && board[i-1][j] == '.' && board[i][j-1] == '.') count++;
        	}
        }
        
        return count;
    }
}
