package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;

public class MenuPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GButton rect;
	private GImage menu;
	
	private GButton play;
	//private GImage game;
	

	public MenuPane(MainApplication app) {
		super();
		program = app;
		rect = new GButton("controls", 610, 610, 300, 120);
		rect.setColor(Color.black);
		rect.setVisible(false);
		
		play = new GButton("play", 350, 510, 250, 120);
		play.setFillColor(Color.black);
		play.setVisible(false);
		
		menu = new GImage("mainmenu.png", 0,0);
		
		//game = new GImage("game.png", 0,0);
	}

	@Override
	public void showContents() {
		program.add(menu);
		program.add(rect);
		program.add(play);
	}

	@Override
	public void hideContents() {
		program.remove(menu);
		program.remove(rect);
		program.remove(play);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == rect) {
			program.switchToSome();
		}else if(obj == play) {
			program.switchToMenu();// NEED TO CHANGE SCREEN
		}
	}
	
	/*@Override
	public void keyPressed(KeyEvent e) {
		GObject obj = program.getElementAt(e.getID(), e.getID());
		int keyCode = e.getKeyCode();
		//System.out.println(keyCode);
		if(keyCode == 10) {
			if (obj == rect) {
				program.switchToSome();
			}
		}
	}*/
}
