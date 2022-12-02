package edu.pacific.comp55.ProjectCode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import javax.swing.Timer;

import acm.graphics.GImage;
import acm.graphics.GObject;
import edu.pacific.comp55.starter.GraphicsPane;

public class GamePane extends GraphicsPane implements ActionListener {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage game;
	
	private Board board;
	private Timer startGameTimer;

	public GamePane(MainApplication app) {
		this.program = app;
		game = new GImage("game1.png", 0, 0);
		game.setSize(program.WINDOW_WIDTH, program.WINDOW_HEIGHT-20);
		board = new Board();
		startGameTimer = new Timer(500, this);
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub				
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
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
		// TODO Auto-generated method stub
	}
	//KEY EVENT FUNCTIONS
	public void moveDown() {
		board.moveActiveBlockDown();
	}
	public void instantFall() {
		board.instantFall();
	}
	public void moveRight() {
		board.moveActiveBlockRight();
	}
	public void moveLeft() {
		board.moveActiveBlockLeft();
	}
	public void holdBlock() {
//		if (e.getKeyCode() == KeyEvent.VK_C) {
//			// TODO
//		}
	}
	public void rotateRight() {
		board.rotateBlockRight();
	}
	public void rotateLeft() {
		board.rotateBlockLeft();
	}
	
	void playGame() {
		board.createNextBlock(Orientation.UP, false, false, 0,0);
		createNextBlock();
		board.spawnBlock();
		
		int counter = 0;
		int waitTime = 500;
		while (board.fullBoard() == false) {
			board.clearLine();    
			if(counter % 2 == 0) {
				board.moveActiveBlockDown();
			}
			System.out.println(board);
			if(counter % 10 == 0) {
				waitTime--;
			}
			wait(waitTime);
			counter++;
			//check for clearing line
			while(board.canClearLine() != -1) {
				board.clearLine();
			}
		}
		System.out.println("game over!");
	}
	
	public void drawBoard() {
		program.add(game);
	}
	
	public void removeBoard() {
		program.remove(game);
	}
	
	public void drawDriver() {
		//this needs to 1 remove whatever is currently on the screen, 2 draw whatever should be on the screen according to the Game object
		//should be run maybe 3 times a second!
		//Space[] allSpacesOccupied = consoleGame.board.board.board; idea for later
	}
	
	public static void wait(int ms) {
	    try {
	        Thread.sleep(ms);
	    }
	    catch(InterruptedException ex) {
	        Thread.currentThread().interrupt();
	    }
	}
	
	private void createNextBlock() {
		System.out.println("create the next block");
		GImage next = new GImage("media\\s.png", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
		switch(board.getNextBlock().getBlockType()) {
		case T:
			next = new GImage("media\\t.png", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
			break;
		case SQUARE:
			next = new GImage("media\\square.jpg", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
			break;
		case BAR:
			next = new GImage("media\\bar.jpg", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
			break;
		case RIGHTS:
			next = new GImage("media\\s.png", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
			break;
		case LEFTS:
			next = new GImage("media\\s2.png", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
			break;
		case RIGHTL:
			next = new GImage("media\\l.png", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
			break;
		case LEFTL:
			next = new GImage("media\\l2.png", program.WINDOW_WIDTH - 200, program.WINDOW_HEIGHT / 2);
			break;
		}
		program.add(next);
	}
	

	public void actionPerformed( ActionEvent e) {
		System.out.println("Game Started");
		playGame();
		startGameTimer.stop();
	}

	@Override
	public void showContents() {
		System.out.println("Game showed");
		drawBoard();
		startGameTimer.start();
		
	}

	@Override
	public void hideContents() {
		
	}
	
	/*
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if(keyCode == KeyEvent.VK_ESCAPE) {
			//System.out.println("esc pressed");
			program.pauseSound();
			program.stopTime();
			program.switchToPause();
		}
	}
	*/
	
	
}
