package edu.pacific.comp55.ProjectCode;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import edu.pacific.comp55.starter.GButton;
import edu.pacific.comp55.starter.GraphicsPane;

public class DifficultyPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage dScreen;
	private GButton normal;
	private GButton fast;
	private GButton faster;
	private GButton back;

	public DifficultyPane(MainApplication app) {
		this.program = app;
		dScreen = new GImage("difficulty.png", 0, 0);
		dScreen.setSize(program.WINDOW_WIDTH, program.WINDOW_HEIGHT);
		
		normal = new GButton("normal difficulty", 425, 150, 200, 100);
		normal.setColor(Color.black);
		normal.setVisible(false);
		
		fast = new GButton("fast difficulty", 425, 280, 200, 100);
		fast.setColor(Color.black);
		fast.setVisible(false);
		
		faster = new GButton("faster difficulty", 425, 410, 200, 100);
		faster.setColor(Color.black);
		faster.setVisible(false);	
		
		back = new GButton("back to main menu", 810, 500, 200, 100);
		back.setColor(Color.black);
		back.setVisible(false);
	}

	@Override
	public void showContents() {
		program.add(dScreen);
		program.add(normal);
		program.add(fast);
		program.add(faster);
		program.add(back);
	}

	@Override
	public void hideContents() {
		program.remove(dScreen);
		program.add(normal);
		program.add(fast);
		program.add(faster);
		program.add(back);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == back) {
			program.switchToMenu();
		}
		// TODO: add functionality for all difficulty buttons
	}
}
