package edu.pacific.comp55.ProjectCode;

public class Block {
	BlockType type;
	Orientation orientation;
	Space[] spacesOccupied;
	Boolean rock = false;
	Boolean rotationPhase = false;
	
	Block(BlockType type, Orientation orientation, Boolean rock, Boolean rotationPhase){
		this.type = type;
		this.orientation = orientation;
		this.rock = rock;
		this.rotationPhase = rotationPhase;
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
	
	boolean spacesIfMoveLeft() { //return an array of the spaces, check if empty in the BOARD class
		return true;
	}
	
	boolean spacesIfMoveRight() {
		return true;
	}
	
	boolean spacesIfMoveDown() {
		return true;
	}
	
	Orientation getOrientation() {
		return this.orientation;
	}
	
	void canRotate() {
		
	}
	
	void rotate() {
		
	}
	
	Space[] spacesOccupied() {
		return this.spacesOccupied;
	}
	
	BlockType getBlockType() {
		return type;
	}
}
