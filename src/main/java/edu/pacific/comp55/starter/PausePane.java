package edu.pacific.comp55.starter;
import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;

public class PausePane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage pause;
	private GButton resume;
	private GButton menu;

	public PausePane(MainApplication app) {
		this.program = app;
		pause = new GImage("pause.png", 0, 0);
		
		resume = new GButton("controls", 610, 610, 300, 120);
		resume.setColor(Color.black);
		//resume.setVisible(false);
		
		menu = new GButton("controls", 610, 610, 300, 120);
		menu.setColor(Color.red);
		//menu.setVisible(false);
	}

	@Override
	public void showContents() {
		program.add(pause);
	}

	@Override
	public void hideContents() {
		program.remove(pause);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//para.setText("you need\nto click\non the eyes\nto go back");
		//TODO CREATE BUTTONS FOR THIS AND CHANGE IT
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == pause) {
			program.switchToMenu();
		}
	}
}
