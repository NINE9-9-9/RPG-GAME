package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.MapObject;
import mode.LoadGame;
import mode.LoadingGame;
import mode.Mode;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.RenderWindow;

/**
 * @Author NINE. LIU
 * @Date 2020/5/26 16:02
 * @Version 1.0
 */
public class StoryEnd extends Story {
    public StoryEnd(MapObject[][] map) {
        super(map);
        super.key="ii";
        super.messageNum=4;
        super.storyEndPlay();
    }

    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw spirit = new ImageDraw(384,144, ImageLibrary.getIcon(122));
        w.draw((Drawable)spirit.getTransformable());
    }

    public void run()
    {
        super.allStop();
        new LoadingGame(Mode.END,null);
    }
}
