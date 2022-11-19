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
	private Block tempBlock;
	
	public Board(int rows, int cols) {
		this.numRows = rows;
		this.numCols = cols;
		board = new Block[20][10];
	}
	
	public Block createNextBlock(Orientation orientation, boolean rock, boolean cantRotatePhase, int startRow, int startCol) {
		nextBlock = new Block(orientation, rock, cantRotatePhase, startRow, startCol);
		return nextBlock;
	}
	
	public void spawnBlock(){
		//TODO 
	}
	
	public Block getBlock(Space s) {
		//nora: this function will be the equivalent of getVehicle in trafficjam, takes a space and returns whether there's a block there or not
		return board[s.getRow()][s.getCol()];
	}
	
	public boolean canPlaceBlock() {
		return false; // TODO
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
	
	public void addBlock() {
		Block addMe = new Block(activeBlock.getOrientation(), activeBlock.isRock(), activeBlock.canRotateType(), activeBlock.getStartSpace().getRow(), activeBlock.getStartSpace().getCol());
	}//nora
	
	public void removeBlock() {
		tempBlock = activeBlock;
		//need to remove it from the board/grid
		
		//need to remove it from the array
		
	}//nora
	
	//this will check the spaces occupied against the spaces if I move some direction, and see if the space is otherwise occupied by some block on the board
	public boolean moveActiveBlockDown() {
		if(!activeBlock.canMoveDown()) {
			return false;
		}
		Space[] spacesOccupied = activeBlock.spacesOccupied();
		for(int i = 0; i<spacesOccupied.length; i++) {
			//change the temporary array to have the spaces the block will occupy once its moved.
			//this is a bounds check, it will bnnot be moved in the actual movement of the block
			spacesOccupied[i].setRow(spacesOccupied[i].getRow()-1);
			if(getBlock(spacesOccupied[i]) != null) {
				return false;
			}
		}
		//remove blah blah
		addBlock();
		return false; // nora
	}
	
	public boolean moveActiveBlockLeft() {
		return false; // nora
	}
	
	public boolean moveActiveBlockRight() {
		return false; // nora
	}
}
