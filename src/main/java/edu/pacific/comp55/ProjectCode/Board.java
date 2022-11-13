package edu.pacific.comp55.ProjectCode;

import java.util.*;

public class Board {
	private int numRows;
	private int numCols;
	
	//Block[] list; made a list instead like a vector to input easier
	private ArrayList<Block>block = new ArrayList<Block>();
	
	private Block[][] board;
	
	private Block activeBlock;
	private Block nextBlock;
	
	public Board(int rows, int cols) {
		this.numRows = rows;
		this.numCols = cols;
		board = new Block[20][10];
	}
	
	public Block createNextBlock(Orientation orientation, boolean rock, boolean rotationPhase, Space startSpace) {
		nextBlock = new Block(orientation, rock, rotationPhase, startSpace);
		return nextBlock;
	}
	
	public void addBlock(){
		//TODO 
	}
	
	public boolean canPlaceBlock() {
		return false; // TODO
	}
	
	public boolean canClearLine() {
		return false; // TODO
	}
	
	public boolean canRotate() {
		return false; // TODO
	}
	
	public boolean moveActiveBlockDown() {
		return false; // TODO
	}
	
	public boolean moveActiveBlockLeft() {
		return false; // TODO
	}
	
	public boolean moveActiveBlockRight() {
		return false; // TODO
	}
}
