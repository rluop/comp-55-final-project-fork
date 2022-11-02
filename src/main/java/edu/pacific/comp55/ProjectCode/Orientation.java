package edu.pacific.comp55.ProjectCode;

public enum Orientation {
	UP, DOWN, LEFT, RIGHT;
	
	public String toString() {
		switch(this) {
			case UP: return "Up";
			case DOWN: return "Down";
			case LEFT: return "Left";
			case RIGHT: return "Right";
		}
		return "n/a";
	}
}
