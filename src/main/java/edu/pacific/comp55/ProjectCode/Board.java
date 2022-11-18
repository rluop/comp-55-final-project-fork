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
		return false; // nora
	}
	
	public boolean canClearLine() {
		return false; // TODO
	}
	
	public boolean canRotate() {
		if(!activeBlock.canRotateType()) {
			return false;
		}
		return false; // nora: ill do the rest of this after we're ready to do the rotation function.
	}
	
	public boolean canHold() {
		return false; // TODO
		// ralph: you can only switch out the active block with the currently held block ONCE, you cannot infinitely switch blocks back and forth until the active block is placed
	}
	
	//this will check the spaces occupied against the spaces if I move some direction, and see if the space is otherwise occupied by some block on the board
	public boolean moveActiveBlockDown() {//
		if(!activeBlock.canMoveDown()) {
			return false;
		}
		if(!canPlaceBlock()) {
			return false;
		}
		Space[] spacesOccupied = activeBlock.spacesOccupied();
		for(int i = 0; i<spacesOccupied.length; i++) {
			
		}
		return false; // nora
	}
	
	public boolean moveActiveBlockLeft() {
		return false; // nora
	}
	
	public boolean moveActiveBlockRight() {
		return false; // nora
	}
}
