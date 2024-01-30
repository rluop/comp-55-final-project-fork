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
	private GImage back;
	private GButton normal;
	private GButton fast;
	private GButton faster;

	public DifficultyPane(MainApplication app) {
		this.program = app;
		back = new GImage("difficulty.png", 0, 0);
		back.setSize(program.WINDOW_WIDTH, program.WINDOW_HEIGHT);
		
		normal = new GButton("normal difficulty", 200, 200, 200, 100);
		normal.setColor(Color.black);
		normal.setVisible(true);
		
		fast = new GButton("fast difficulty", 200, 300, 200, 100);
		fast.setColor(Color.black);
		fast.setVisible(true);
		
		faster = new GButton("faster difficulty", 200, 400, 200, 100);
		faster.setColor(Color.black);
		faster.setVisible(true);		
	}

	@Override
	public void showContents() {
		program.add(back);
	}

	@Override
	public void hideContents() {
		program.remove(back);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == back) {
			program.switchToMenu();
		}
	}
}
