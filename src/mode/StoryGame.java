package mode;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.Actor;
import map.MapObject;
import modeControl.GameObject;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.RenderWindow;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public abstract class  StoryGame extends GameObject {
    private MapObject[][] map;
    protected int messageNum;
    protected int messageOrder = 0;

    public StoryGame(MapObject[][] map)
    {
        this.map = map;

    }

    public void paint(RenderWindow w)
    {
        w.clear(Color.BLACK);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                if(map!=null)
                {
                    ImageDraw mapDraw = new ImageDraw(48*j,48*i, ImageLibrary.getIcon(map[i][j]));
                    w.draw((Drawable)mapDraw.getTransformable());
                    Actor.getInstance().draw(w,Actor.getInstance().getDirection());
                }
            }
        }
    }

}
