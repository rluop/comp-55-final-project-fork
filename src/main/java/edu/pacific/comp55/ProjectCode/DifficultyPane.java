package edu.pacific.comp55.ProjectCode;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import acm.graphics.GImage;
import acm.graphics.GObject;
import edu.pacific.comp55.starter.GButton;
import edu.pacific.comp55.starter.GParagraph;
import edu.pacific.comp55.starter.GraphicsPane;

public class DifficultyPane extends GraphicsPane {
	private MainApplication program; // you will use program to get access to
										// all of the GraphicsProgram calls
	private GImage dScreen;
	private GButton normal;
	private GButton fast;
	private GButton faster;
	private GButton back;
	private File fileName;
	private File directory;
	private File difficultyFile;
	private FileWriter outputFile;

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
		
		fileName = new File("bin\\main\\output.txt");
		System.out.println(fileName.getParent());
		
		try {
			if (fileName.createNewFile()) {
				System.out.println("File created successfully!");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			outputFile = new FileWriter("bin\\main\\output.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*
		try {
			getDifficulty();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
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
	
	/*
	public FileReader getDifficulty() throws IOException {		
		FileReader read = new FileReader(fileName);
		
		System.out.println(read.read());
		
		return read;
	}
	*/

	@Override
	public void mousePressed(MouseEvent e) {
		GObject obj = program.getElementAt(e.getX(), e.getY());
		if (obj == back) {
			program.switchToMenu();
			
			try {
				outputFile.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (obj == normal) {
			try {
				System.out.println("difficulty is now normal!");
				outputFile.write("1");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (obj == fast) {
			try {	
				System.out.println("difficulty is now fast!");
				outputFile.write("2");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (obj == faster) {
			try {
				System.out.println("difficulty is now faster!");
				outputFile.write("3");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
