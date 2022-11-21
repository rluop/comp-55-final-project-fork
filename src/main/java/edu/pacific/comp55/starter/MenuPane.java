package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GLine;
import acm.graphics.GObject;

public class MenuPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GButton rect;
	private GImage menu;

	public MenuPane(MainApplication app) {
		super();
		program = app;
		rect = new GButton("Next", 610, 610, 300, 120);
		rect.setVisible(false);
		
		menu = new GImage("mainmenu.png", 0,0);
	}

	@Override
	public void showContents() {
		program.add(menu);
		program.add(rect);
	}

	@Override
	public void hideContents() {
		program.remove(menu);
		program.remove(rect);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == rect) {
			program.switchToSome();
		}
	}
}
