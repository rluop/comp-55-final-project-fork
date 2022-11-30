package edu.pacific.comp55.ProjectCode;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.Timer;

import acm.graphics.GLabel;
import edu.pacific.comp55.starter.AudioPlayer;
import edu.pacific.comp55.starter.GraphicsApplication;
import javafx.scene.paint.Color;

public class MainApplication extends GraphicsApplication {
	public static final int WINDOW_WIDTH = 1050;
	public static final int WINDOW_HEIGHT = 650;
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "r2d2.mp3", "somethinlikethis.mp3" };

	private SomePane somePane;
	private MenuPane menu;
	private GamePane game;
	private PausePane pause;
	private QuitPane quit;
	private Board board;
	
	private GLabel timer;
	private GLabel score;
	
	private int min = 0;
	private int sec = 0;
	private int scoreNum = 0;
	
	private Timer time = new Timer(1000, this);
	
	private int count;

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		requestFocus();
	}

	public void run() {
		timer = new GLabel("timer", 0, 100);
		add(timer);
		
		System.out.println("Hello, world!");
		quit = new QuitPane(this);
		pause = new PausePane(this);
		game = new GamePane(this);
		somePane = new SomePane(this);
		menu = new MenuPane(this);
		setupInteractions();
		switchToMenu();
	}
	
	public void actionPerformed(ActionEvent e) {
		min++;
		sec++;
		
		timer.setFont(Font.MONOSPACED);
		timer.setLocation(90, 90);
		timer.sendToFront();
		timer.setLabel(min/60 + ":" + sec);
		if(sec == 59) {
			sec = 0;
		}
		
		score.setFont(Font.MONOSPACED);
		score.setLocation(90, 190); // not sure just a guesstimate
		
		/*if(board.clearLine() == true) {
			scoreNum+=100;
		}*/
		
		score.setLabel("SCORE " + scoreNum);
		
	}
	
	public void startTime() {
		time.start();
	}
	
	public void stopTime() {
		time.stop();
	}

	public void switchToMenu() {
		//playRandomSound();
		count++;
		switchToScreen(menu);
	}

	public void switchToSome() {
		//playRandomSound();
		switchToScreen(somePane);
	}
	
	public void switchToGame() {
		//time.start();
		switchToScreen(game);
	}
	
	public void switchToPause() {
		switchToScreen(pause);
	}
	
	public void switchToQuit() {
		switchToScreen(quit);
	}

	

	private void playRandomSound() {
		AudioPlayer audio = AudioPlayer.getInstance();
		audio.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
	}
	
	public static void main(String[] args) {
		new MainApplication().start();
	}
}
