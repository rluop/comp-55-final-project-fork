package edu.pacific.comp55.ProjectCode;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import edu.pacific.comp55.starter.GraphicsPane;

public class GamePane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage game;

	public GamePane(MainApplication app) {
		this.program = app;
		game = new GImage("game1.png", 0, 0);
		game.setSize(program.WINDOW_WIDTH, program.WINDOW_HEIGHT-20);
		
		
	}

	@Override
	public void showContents() {
		program.add(game);
	}

	@Override
	public void hideContents() {
		program.remove(game);
	}
	
	
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
	
	
	
}
