package edu.pacific.comp55.ProjectCode;

public enum BlockType {
	RIGHTL, LEFTL, T, RIGHTS, LEFTS, SQUARE, BAR;
	
	public String toString() {
		switch(this) {
			case RIGHTL: return "Right L";
			case LEFTL: return "Left L";
			case T: return "T";
			case RIGHTS: return "Right S";
			case LEFTS: return "Left S";
			case SQUARE: return "Square";
			case BAR: return "Bar";
		}
		return "n/a";
	}
}
