package edu.pacific.comp55.ProjectCode;

public class Block {
	BlockType type;
	Orientation orientation;
	Space[] spacesOccupied;
	Boolean rock = false;
	Boolean rotationPhase = false;
	private int row;
	private int col;
	private Space startSpace;
	
	Block(BlockType type, Orientation orientation, Boolean rock, Boolean rotationPhase, Space startSpace){
		this.type = type;
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
	
	Space[] spacesIfMoveLeft() { //return an array of the spaces, check if empty in the BOARD class
		return null;
	}
	
	Space[] spacesIfMoveRight() {
		return null;
	}
	
	Space[] spacesIfMoveDown() {
		return null;
	}
	
	Orientation getOrientation() {
		return this.orientation;
	}
	
	boolean canRotate() {
		return true;
	}
	
	void rotate() {
		//
	}
	
	Space[] spacesOccupied() {
		//Space [] s = new Space[length];
		//if(getOrientation() == "UP") { // getOrientation() == "UP"
		//	for(int i = 0; i < s.length; i++) {
			//	s[i] = new Space(row + i, col);
			//}
		//}
		return null;
	}
	
	BlockType getBlockType() {
		return type;
	}
}
