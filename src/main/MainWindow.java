package main;

import modeControl.GameMode;
import org.jsfml.graphics.*;
import org.jsfml.window.*;
import org.jsfml.window.event.Event;


import java.io.IOException;

/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class MainWindow {

    public static boolean ifFull = false;
    private static RenderWindow window = new RenderWindow();

    public MainWindow() throws IOException {

        window.create(new VideoMode(768,432), "Grief Sword", WindowStyle.DEFAULT);
        window.setFramerateLimit(30);
        GameMode.getInstance().init();

        while (window.isOpen()) {

            window.clear(Color.WHITE);
            GameMode.getInstance().draw(window);
            window.display();

            for (Event event : window.pollEvents()) {
                if (event.type == Event.Type.CLOSED) {
                    window.close();
                }
            }
            if(Keyboard.isKeyPressed(Keyboard.Key.LEFT))
                Control.LEFT = true;
            else
                Control.LEFT = false;
            if(Keyboard.isKeyPressed(Keyboard.Key.RIGHT))
                Control.RIGHT = true;
            else
                Control.RIGHT = false;
            if(Keyboard.isKeyPressed(Keyboard.Key.SPACE))
                Control.SPACE = true;
            else
                Control.SPACE = false;
            if(Keyboard.isKeyPressed(Keyboard.Key.UP))
                Control.UP = true;
            else
                Control.UP = false;
            if(Keyboard.isKeyPressed(Keyboard.Key.DOWN))
                Control.DOWN = true;
            else
                Control.DOWN = false;
            if(Keyboard.isKeyPressed(Keyboard.Key.X))
                Control.X = true;
            else
                Control.X = false;
            if(Keyboard.isKeyPressed(Keyboard.Key.ESCAPE))
                Control.ESC = true;
            else
                Control.ESC = false;
            if(Keyboard.isKeyPressed(Keyboard.Key.H))
                Control.H = true;
            else
                Control.H = false;

        }

    }

    public static void main(String[] arg) throws IOException {
        new MainWindow();
    }

    public static void changeScreen()
    {
        if (!ifFull)
        {
            window.create(new VideoMode(768,432), "Grief Sword", WindowStyle.DEFAULT);
        }
        else

            window.create(VideoMode.getDesktopMode(), "Grief Sword", WindowStyle.FULLSCREEN);
    }
}
