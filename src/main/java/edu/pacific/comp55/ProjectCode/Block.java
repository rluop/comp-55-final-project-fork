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
}
