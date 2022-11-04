package edu.pacific.comp55.ProjectCode;

public class Block {
	BlockType type;
	Orientation orientation;
	
	boolean isRock() {
		return false;
	}
	
	boolean canRotateType() {
		return true;
	}
	
	boolean canMoveLeft() {
		return true;
	}
	
	boolean canMoveRight() {
		return true;
	}
	
	boolean canMoveDown() {
		return true;
	}
	
	Orientation getOrientation() {
		return this.orientation;
	}
	
	void rotate() {
		
	}
	
//	Space[] spacesOccupied() {
//		
//	}
	
	BlockType getBlockType() {
		return this.type;
	}
}
