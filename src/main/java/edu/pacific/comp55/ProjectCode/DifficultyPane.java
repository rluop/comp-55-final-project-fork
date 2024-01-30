package edu.pacific.comp55.ProjectCode;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import edu.pacific.comp55.starter.GraphicsPane;

public class DifficultyPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage back;

	public DifficultyPane(MainApplication app) {
		this.program = app;
		back = new GImage("difficulty.png", 0, 0);
		back.setSize(program.WINDOW_WIDTH, program.WINDOW_HEIGHT);
		
		
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
