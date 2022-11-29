package edu.pacific.comp55.ProjectCode;

import edu.pacific.comp55.starter.AudioPlayer;
import edu.pacific.comp55.starter.GraphicsApplication;

public class MainApplication extends GraphicsApplication {
	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	public static final String MUSIC_FOLDER = "sounds";
	private static final String[] SOUND_FILES = { "r2d2.mp3", "somethinlikethis.mp3" };

	private SomePane somePane;
	private MenuPane menu;
	private GamePane game;
	private PausePane pause;
	private QuitPane quit;
	private GraphicsGame t;
	
	private int count;

	public void init() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	}

	public void run() {
		System.out.println("Hello, world!");
		quit = new QuitPane(this);
		pause = new PausePane(this);
		game = new GamePane(this);
		somePane = new SomePane(this);
		menu = new MenuPane(this);
		setupInteractions();
		switchToMenu();
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
