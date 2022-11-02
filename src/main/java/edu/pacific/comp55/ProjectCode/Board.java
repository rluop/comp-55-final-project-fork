package edu.pacific.comp55.ProjectCode;

import java.util.*;

public class Board {
	private int numRows;
	private int numCols;
	
	//Block[] list; made a list instead like a vector to input easier
	private ArrayList<Block>block = new ArrayList<Block>();
	
	private Block activeBlock;
	
	public Board(int rows, int cols) {
		numRows = rows;
		numCols = cols;
	}
	
	public void addBlock(){
		//TODO
	}
}
