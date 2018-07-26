package DFSBFS;

/**
 * Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 *board =
[
  ['A','B','C','E'],
  ['S','F','C','S'],
  ['A','D','E','E']
]

Given word = "ABCCED", return true.
Given word = "SEE", return true.
Given word = "ABCB", return false.
 * @author kokonatsudream
 *
 */
public class WordSearch {
	boolean[][] used;
	
	public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        
        used = new boolean[rows][cols];
        
        for(int r = 0; r < rows; r++) {
        	for(int c = 0; c < cols; c++) {
        		if(search(board, word, 0, r, c)) return true;
        	}
        }
        return false;
    }
	
	public boolean search(char[][] board, String word, int index, int row, int col) {
		if(index == word.length()) return true;
		
		if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || used[row][col] || board[row][col] != word.charAt(index)) return false;
		
		used[row][col] = true;
		
		if(search(board, word, index+1, row + 1, col) || search(board, word, index+1, row-1, col)||search(board, word, index+1, row, col-1)|| search(board,word,index+1, row, col+1)) return true;
		
		used[row][col] = false;
		
		return false;
	}
}
