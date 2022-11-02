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
}
