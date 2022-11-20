package edu.pacific.comp55.ProjectCode;

public class BoardConverter {
	public static String createString(Board b) {
		char[][] board = new char[20][10];
		initBoard(board, b);
		populateBoard(board, b);
		return convertBoardToString(board, b);
	}

	private static void initBoard(char[][] board, Board b) {
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 10; col++) {
				board[row][col] = '.';
			}
		}
	}

	private static void populateBoard(char[][] chboard, Board b) {
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 10; col++) {
				if(b.getBlock(new Space(row, col)) != null) {
					chboard[row][col] = b.getBlock(new Space(row, col)).getBlockType().toString().charAt(0);
				}
			}
		}
	}

	private static String convertBoardToString(char[][] board, Board b) {
		String result = "";
		for(int row = 0; row < 20; row++) {
			for(int col = 0; col < 10; col++) {
				result+=board[row][col];
			}
			result+="\n";
		}
		return result;
	}
}
