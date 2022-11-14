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
			//type = RIGHTL;
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
		//if(type.toString() == "") { // getOrientation() == "UP"
		//	for(int i = 0; i < s.length; i++) {
			//	s[i] = new Space(row + i, col);
			//}
		//}
		return null;
	}
	
	BlockType getBlockType() {
		return type;
	}
	
	public void setStartSpace() {
		
	}
}
