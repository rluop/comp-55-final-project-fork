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
	
	Space[] spacesOccupied() {
		return this.spacesOccupied;
	}
	
	BlockType getBlockType() {
		return type;
	}
}
