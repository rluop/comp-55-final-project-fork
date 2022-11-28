package edu.pacific.comp55.ProjectCode;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import java.awt.event.*;

import acm.graphics.*;


public class Game {
	private Board board;
	private Timer t;
	
	public static void main(String[] args) {
		Game g = new Game();
		g.setupBoard();
		g.playGame();
	}
	
	public void setupBoard() {
		board = new Board();
	}
	
	public void playGame() {
		board.createNextBlock(Orientation.UP, false, false, 0,0);
		board.spawnBlock();
		
		while (true) {//board.fullBoard() == false) {
			wait(3000);
			System.out.println(board);
		
		}
	}
	
	public void moveDown(KeyEvent e) {
		// check if moveActiveBlockDown is true in Board
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			board.moveActiveBlockDown();
			// activeBlock.move(0, 50);
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			// check spacesOccupied in Block
			// activeBlock.setLocation(activeBlock.getX(), ?);
		}
	}
	
	public void moveHorizontal(KeyEvent e) {
		// check if moveActiveBlockLeft is true in Board
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			// activeBlock.move(-50, 0);
		}
		// check if moveActiveBlockRight is true in Board
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// activeBlock.move(50, 0);
		}
	}
	
	public void holdBlock(KeyEvent e) {
		// check if canHold is true in Board
		if (e.getKeyCode() == KeyEvent.VK_C) {
			// TODO
		}
	}
	
	public void rotate(KeyEvent e) {	
		// check if canRotate is true in Board
		// int rotationNum = 0;
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			/*
			if (rotationNum == 3) {
				rotationNum = 0;
			}
			else {
				rotationNum++;
				spaceArray(rotationNum);
			}

			*/
		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {
			/*
			if (rotationNum == 0) {
				rotationNum = 3;
			}
			else {
				rotationNum--;
				spaceArray(rotationNum);
			}
			*/
		}
	}
	
	public static void wait(int ms) {
	    try {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex) {
	        Thread.currentThread().interrupt();
	    }
	}
}
