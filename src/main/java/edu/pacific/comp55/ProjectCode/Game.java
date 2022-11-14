package edu.pacific.comp55.ProjectCode;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.awt.*;
import java.awt.event.*;

public class Game {
	private Board activeBlock;
	
	public void moveDown(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			// activeBlock.move(0, 50);
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			// TODO
		}
	}
	
	public void moveHorizontal(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			// TODO
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			// TODO
		}
	}
	
	public void drawBlock() {
		// TODO
	}
	
	public void holdBlock(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_C) {
			// TODO
		}
	}
	
	public void rotate(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			// TODO
		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {
			// TODO
		}
	}
}
