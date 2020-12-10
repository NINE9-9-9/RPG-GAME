package story;


import mode.RpgGame;
import org.jsfml.graphics.RenderWindow;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class Story1 extends Story {
    public Story1() {
        super(null);
        super.key="first";
        super.messageNum=8;
        super.story1Play();
    }

    @Override
    public void paint(RenderWindow w) {
        super.paint(w);

    }

    @Override
    protected void keyResponse() {

    }

    @Override
    public void run() {
        super.allStop();
        new RpgGame();
    }
}
