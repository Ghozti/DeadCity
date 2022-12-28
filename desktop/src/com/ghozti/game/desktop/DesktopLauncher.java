package com.ghozti.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ghozti.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.foregroundFPS = 60;
		config.backgroundFPS = 0;
		config.title = "Dead City";
		config.width = 1900;
		config.height = 1070;
		config.resizable = true;
		new LwjglApplication(new Game(), config);
	}
}
