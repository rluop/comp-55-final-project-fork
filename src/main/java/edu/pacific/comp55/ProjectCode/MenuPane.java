package edu.pacific.comp55.ProjectCode;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import acm.graphics.GImage;
import acm.graphics.GObject;
import edu.pacific.comp55.starter.GButton;
import edu.pacific.comp55.starter.GraphicsPane;

public class MenuPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GButton rect;
	private GImage menu;
	
	private GButton play;
	private GButton quit;
	

	public MenuPane(MainApplication app) {
		super();
		program = app;
		rect = new GButton("controls", 430, 430, 200, 100);
		rect.setColor(Color.black);
		rect.setVisible(false);
		
		play = new GButton("play", 240, 350, 150, 80);
		play.setFillColor(Color.red);
		play.setVisible(false);
		
		quit = new GButton("quit", 640, 350, 200, 80);
		quit.setFillColor(Color.red);
		//quit.setVisible(false);
		
		menu = new GImage("mainmenu.png", 0,0);
		menu.setSize(program.PROG_WIDTH + 250, program.PROG_HEIGHT + 10);
	}

	@Override
	public void showContents() {
		program.add(menu);
		program.add(rect);
		program.add(play);
		program.add(quit);
	}

	@Override
	public void hideContents() {
		program.remove(menu);
		program.remove(rect);
		program.remove(play);
		program.remove(quit);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == rect) {
			program.switchToSome();
		}else if(obj == play) {
			program.switchToGame();
		}else if(obj == quit) {
			program.switchToQuit();
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
