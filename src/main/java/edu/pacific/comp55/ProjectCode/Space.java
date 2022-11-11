package edu.pacific.comp55.ProjectCode;

public class Space {
	private int row;
	private int col; 
	
	public Space(int row, int col) {
		this.row = row;
	}
	
	// setters
	
	public void setRow(int numRows) {
		this.row = numRows;
	}
	public void setCol(int numCols) {
		this.row = numCols;
	}
	
	// getters
	
	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}
}
