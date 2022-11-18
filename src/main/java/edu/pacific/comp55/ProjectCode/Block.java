package edu.pacific.comp55.ProjectCode;
import java.util.Random;

public class Block {
	BlockType type;
	Orientation orientation;
	Space[] spacesOccupied;
	Boolean rock = false;
	Boolean rotationPhase = false;
	private int row;
	private int col;
	double randNum;
	private Space startSpace;
	
	Block(Orientation orientation, Boolean rock, Boolean rotationPhase, Space startSpace){
		randNum = Math.random()*100;
		if(randNum < 14) {
			//type = RIGHTL;	//nora: im going to ask prof about these type assignments i couldnt get them working
		}
		else if(randNum < 28) {
			//type = LEFTL;
		}
		else if(randNum < 42) {
			//type = T;
		}
		else if(randNum < 56) {
			//type = RIGHTS;
		}
		else if(randNum < 70) {
			//type = LEFTS;
		}
		else if(randNum < 84) {
			//type = SQUARE;
		}
		else {
			//type = BAR;
		}
		this.orientation = orientation;
		this.rock = rock;
		this.rotationPhase = rotationPhase;
		this.startSpace = startSpace;
	}
	
	boolean isRock() {
		return rock;
	}
	
	boolean canRotateType() {
		if(!rock && !rotationPhase) {
			return true;
		}
		return false;
	}
	
	boolean canMoveDown() {
		//nora
		Space[] returnMe = spacesOccupied();
		for(int i = 0; i<returnMe.length; i++) {
			if(returnMe[i].getRow()-1 < 0) {
				System.out.println("move out of bounds!");
				return false;
			}
		}
		return true;
	}
	
	boolean canMoveRight() {
		//nora
		Space[] returnMe = spacesOccupied();
		for(int i = 0; i<returnMe.length; i++) {
			//each col +1 when we move right, bounds check first
			if(returnMe[i].getCol()+1 > 10) {
				System.out.println("move out of bounds!");
				return false;
			}
		}
		return true;
	}
	
	boolean canMoveLeft() {
		//nora
		Space[] returnMe = spacesOccupied();
		for(int i = 0; i<returnMe.length; i++) {
			if(returnMe[i].getCol()-1 < 0) {
				System.out.println("move out of bounds!");
				return false;
			}
		}
		return true;
	}
	
	Space[] spacesIfMoveLeft() { //return an array of the spaces, check if empty in the BOARD class - prof suggestion
		//nora: i think this should send an array of the spaces a block would occupy to canPlaceBlock in board, and then we can decide if the block should be placed or not somewhere else
		//so rn i THINK this should just take spaces occupied and change a row, but please lmk if you think it should do something else!
		Space[] returnMe = spacesOccupied();
		if(!canMoveLeft()) {
			return returnMe;
		}
		for(int i = 0; i<returnMe.length; i++) {
			//must have passed the checks, now set it
			returnMe[i].setCol(returnMe[i].getCol()-1);
		}
		return returnMe;
	}
	
	Space[] spacesIfMoveRight() {
		//nora
		Space[] returnMe = spacesOccupied();
		for(int i = 0; i<returnMe.length; i++) {
			//each col +1 when we move right, bounds check first
			if(returnMe[i].getCol()+1 > 10) {
				System.out.println("move out of bounds!");
				return returnMe;
			}
		}
		//assuming it passed the bounds check
		for(int i = 0; i<returnMe.length; i++) {
			returnMe[i].setCol(returnMe[i].getCol()+1);
		}
		return returnMe;
	}
	
	Space[] spacesIfMoveDown() {
		//nora
		//dont forget we need a check in board to see if theres already a block in the spaces this function returns. this function only returns where the block WOULD be, not if the block can be there
		Space[] returnMe = spacesOccupied();
		for(int i = 0; i<returnMe.length; i++) {
			if(returnMe[i].getRow()-1 < 0) {
				System.out.println("move out of bounds!");
				return returnMe;
			}
		}
		for(int i = 0; i<returnMe.length; i++) {
			returnMe[i].setRow(returnMe[i].getRow()-1);
		}
		return returnMe;
	}
	
	Orientation getOrientation() {
		return this.orientation;
	}
	
	boolean canRotate() {
		//nora
		//i believe this needs to go in board. ill look into it more later
		return true;
	}
	
	void rotate() {
		//
	}
	
	public Space[] spacesOccupied() {
		Space[] spaceArray = new Space[4];
		if (this.type == BlockType.RIGHTL) {
			if (this.orientation == Orientation.UP) { 
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() - 2);
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1, spaceArray[0].getCol());
				
			}
			else if (this.orientation == Orientation.RIGHT) { 
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() - 2, spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() + 1);
			}
			else if (this.orientation == Orientation.DOWN) { 
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() + 2);
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1, spaceArray[0].getCol());
			}
			else {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() + 2, spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() - 1);
			}
		}
		else if (this.type == BlockType.LEFTL) {
			if (this.orientation == Orientation.UP) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() + 2);
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1, spaceArray[0].getCol());
			}
			else if (this.orientation == Orientation.RIGHT) { 
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() + 2, spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() + 1);
			}
			else if (this.orientation == Orientation.DOWN) { 
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() - 2);
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1, spaceArray[0].getCol());
			}
			else {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() - 1, spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() - 2, spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() - 1);
			}
			
		}
		else if (this.type == BlockType.T) {
			if (this.orientation == Orientation.UP) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() - 1);
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1, spaceArray[0].getCol());
			}
			else if (this.orientation == Orientation.RIGHT) { 
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() - 1, spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() + 1);
			}
			else if (this.orientation == Orientation.DOWN) { 
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
			}
			else {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() + 1, spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow(), spaceArray[0].getCol() - 1);
			}
		}
		else if (this.type == BlockType.RIGHTS) {
			if (this.orientation == Orientation.UP) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[2] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol() - 1);
			}
			else if (this.orientation == Orientation.RIGHT) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol() - 1);
			}
			else if (this.orientation == Orientation.DOWN) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[2] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol() + 1);
			}
			else {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol() + 1);
			}
		}
		else if (this.type == BlockType.LEFTS) {
			if (this.orientation == Orientation.UP) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[2] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol() + 1);
			}
			else if (this.orientation == Orientation.RIGHT) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol() - 1);
			}
			else if (this.orientation == Orientation.DOWN) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[2] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol() - 1);
			}
			else {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol() + 1);
			}
		}
		else if (this.type == BlockType.SQUARE) {
			spaceArray[0] = this.startSpace;
			spaceArray[1] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
			spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
			spaceArray[3] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol() + 1);
		}
		else {
			if (this.orientation == Orientation.UP) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 2);
				spaceArray[3] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
			}
			else if (this.orientation == Orientation.RIGHT) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() + 2,spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
			}
			else if (this.orientation == Orientation.DOWN) {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 1);
				spaceArray[2] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() - 2);
				spaceArray[3] = new Space(spaceArray[0].getRow(),spaceArray[0].getCol() + 1);
			}
			else {
				spaceArray[0] = this.startSpace;
				spaceArray[1] = new Space(spaceArray[0].getRow() - 1,spaceArray[0].getCol());
				spaceArray[2] = new Space(spaceArray[0].getRow() - 2,spaceArray[0].getCol());
				spaceArray[3] = new Space(spaceArray[0].getRow() + 1,spaceArray[0].getCol());
			}
		}
		return spaceArray;
	}
	
	BlockType getBlockType() {
		return type;
	}
	
	public void setStartSpace(int newRow, int newCol) {
		this.startSpace.setRow(newRow);
		this.startSpace.setCol(newCol);
	}
}
