package edu.pacific.comp55.ProjectCode;

import acm.program.*;

import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

import java.awt.event.*;

public class Game implements KeyListener {
	private static Board board;
	
	public static void main(String[] args) {
		Game g = new Game();

		JFrame frame = new JFrame("Key Listener");
        Container contentPane = frame.getContentPane();
		KeyListener listener = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println("key typed");
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key pressed");
				if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					//TODO find some way to implement fasterFall here (if down is held down)
					moveDown();
				}
				else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
					instantFall();
				}
				else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
					moveRight();
				}
				else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					moveLeft();
				}
				else if(e.getKeyCode() == KeyEvent.VK_C) {
					holdBlock();
				}
				else if(e.getKeyCode() == KeyEvent.VK_UP) {
					rotateRight();
				}
				else if(e.getKeyCode() == KeyEvent.VK_Z) {
					rotateLeft();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("key released");
				// TODO Auto-generated method stub
			}
			//KEY EVENT FUNCTIONS
			public void moveDown() {
				System.out.println("moveDown called");
				board.moveActiveBlockDown();
			}
			public void instantFall() {
				System.out.println("instantFall called");
				board.instantFall();
			}
			public void moveRight() {
				System.out.println("moveRight called");
				board.moveActiveBlockRight();
			}
			public void moveLeft() {
				System.out.println("moveLeft called");
				board.moveActiveBlockLeft();
			}
			public void holdBlock() {
//				if (e.getKeyCode() == KeyEvent.VK_C) {
//					// TODO 
//				}
			}
			public void rotateRight() {
				board.rotateBlockRight();
			}
			public void rotateLeft() {
				board.rotateBlockLeft();
			}
		};
		JTextField textField = new JTextField();
        textField.addKeyListener(listener);
        contentPane.add(textField, BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
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
