package edu.pacific.comp55.ProjectCode;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class GraphicsGame extends GraphicsProgram {
	public static final int PROGRAM_WIDTH = 1;
	public static final int PROGRAM_HEIGHT = 1;
	private Timer t = new Timer(1000, this); // 1000 ms = 1 second
	private Game game;
	private GLabel timer;
	private GLabel score;
	private int timerCount = 0;
	private int scoreCount = 0;
	
	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		//needed for graphics program
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void showMenu() {
		
	}
	
	public void showControl() {
		
	}
	
	public void showGame() {
		
	}
	
	public void showTime() {
		
	}
	
	public void showScore() {
		
	}
}