package edu.pacific.comp55.ProjectCode;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import edu.pacific.comp55.starter.GraphicsPane;

public class QuitPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage quit;

	public QuitPane(MainApplication app) {
		this.program = app;
		quit = new GImage("quit.png", 0, 0);
		quit.setSize(program.PROG_WIDTH + 250, program.PROG_HEIGHT + 10);
		
		
	}

	@Override
	public void showContents() {
		program.add(quit);
	}

	@Override
	public void hideContents() {
		program.remove(quit);
	}

}
