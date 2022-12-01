package edu.pacific.comp55.ProjectCode;

import java.awt.event.*;

public class Game implements KeyListener {
	private Board board;
	
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
		
		while (board.fullBoard() == false) {
			System.out.println(board);
			wait(3000);
			board.moveActiveBlockDown();
		}
	}
	
	public void moveDown(KeyEvent e) {
		// check if moveActiveBlockDown is true in Board
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("DOWN");
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
			System.out.println("LEFT");
			board.moveActiveBlockLeft();
			// activeBlock.move(-50, 0);
		}
		// check if moveActiveBlockRight is true in Board
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("RIGHT");
			board.moveActiveBlockRight();
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
		if (board.canRotate()) {
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				board.rotateBlockRight();
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
				board.rotateBlockRight();
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
	}
	
	public static void wait(int ms) {
	    try {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex) {
	        Thread.currentThread().interrupt();
	    }
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("YES");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
