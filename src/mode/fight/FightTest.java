package mode.fight;

import main.Control;
import map.Map;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.RenderWindow;
import org.jsfml.window.Keyboard;
import org.jsfml.window.VideoMode;
import org.jsfml.window.WindowStyle;
import org.jsfml.window.event.Event;


import java.io.IOException;


/**
 * @Author NINE. LIU
 * @Date 2020/5/20 16:57
 * @Version 1.0
 */
public class FightTest {
    public static void main(String[] arg) throws IOException, ClassNotFoundException {
        RenderWindow w = new RenderWindow();
        w.create(new VideoMode(768,432), "Grief Sword", WindowStyle.DEFAULT);
        w.setFramerateLimit(30);


        FightGame a = new FightGame(1,5);

        while (w.isOpen()) {

            w.clear(Color.WHITE);

            a.paint(w);
            w.display();


            for (Event event : w.pollEvents()) {
                if (event.type == Event.Type.CLOSED) {
                    w.close();
                    a.getT().stop();
                }
            }
            Control.LEFT = Keyboard.isKeyPressed(Keyboard.Key.LEFT);
            Control.RIGHT = Keyboard.isKeyPressed(Keyboard.Key.RIGHT);
            Control.SPACE = Keyboard.isKeyPressed(Keyboard.Key.SPACE);
            Control.UP = Keyboard.isKeyPressed(Keyboard.Key.UP);
            Control.DOWN = Keyboard.isKeyPressed(Keyboard.Key.DOWN);
            Control.X = Keyboard.isKeyPressed(Keyboard.Key.X);
            Control.ESC = Keyboard.isKeyPressed(Keyboard.Key.ESCAPE);
            Control.H = Keyboard.isKeyPressed(Keyboard.Key.H);
        }
    }
}
