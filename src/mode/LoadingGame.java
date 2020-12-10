package mode;

import draw.ImageDraw;
import draw.TextDraw;
import modeControl.GameObject;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.Image;
import org.jsfml.graphics.RenderWindow;
import story.Story1;

import java.io.IOException;
import java.nio.file.Paths;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class LoadingGame extends GameObject {
    private int wait = 0;
    private static Image loading = new Image();
    private static Image end = new Image();
    private Mode mode;
    private SaveData save;
    static {
        try {

            loading.loadFromFile(Paths.get("resource/picture/loading.jpg"));
            end.loadFromFile(Paths.get("resource/picture/end.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public LoadingGame(Mode mode, SaveData save)
    {
        this.mode = mode;
        this.save = save;
    }



    @Override
    public void paint(RenderWindow w) {

        if(mode==Mode.RPG)
        {
            if(wait==100)
            {
                if(save == null)
                    new Story1();
                else
                    new RpgGame(save);
            }

            ImageDraw loadDraw = new ImageDraw(0,0,loading);
            w.draw((Drawable)loadDraw.getTransformable());

            TextDraw progressBar = new TextDraw(350,305,36,Integer.toString(wait)+"%","times.ttf",new Color(57,32,238));
            w.draw((Drawable)progressBar.getTransformable());
            wait++;
        }
        else if(mode == Mode.END)
        {
            if(wait==30)
            {
                new InitGame();
            }

            ImageDraw loadDraw = new ImageDraw(0,0,end);
            w.draw((Drawable)loadDraw.getTransformable());

            wait++;
        }



    }

    @Override
    protected void keyResponse() {

    }
}
