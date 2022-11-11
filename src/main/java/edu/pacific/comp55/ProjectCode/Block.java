package edu.pacific.comp55.ProjectCode;

public class Block {
	BlockType type;
	Orientation orientation;
	Space[] spacesOccupied;
	Boolean rock = false;
	Boolean rotationPhase = false;
	private int length;
	private boolean vertical;
	private int row;
	
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
	
	public boolean isVertical() {
		return vertical;
	}
	
	Space[] spacesOccupied() {
		Space [] s = new Space[length];
		if(isVertical()) {
			for(int i = 0; i < s.length; i++) {
				
			}
		}
		return s;
	}
	
	BlockType getBlockType() {
		return type;
	}
}
