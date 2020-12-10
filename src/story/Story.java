package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import draw.TextDraw;
import main.Control;
import map.MapObject;
import mode.LoadGame;
import mode.RpgGame;
import mode.StoryGame;
import modeControl.GameObject;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.Image;
import org.jsfml.graphics.RenderWindow;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
/**
 *@Author NINE. LIU BJTU
 *@Version 2.0
 */
public class Story extends StoryGame {
    protected Properties properties = new Properties();
    protected Properties propertiesC = new Properties();
    protected String key = null;
    private Image dialogBox = new Image();
    public Story(MapObject[][] map) {
        super(map);
        try {
            properties.load(new FileInputStream(new File("resource/story/storyContent.properties")));
            propertiesC.load(new FileInputStream(new File("resource/story/storyActor.properties")));
            dialogBox.loadFromFile(Paths.get("resource/picture/dialogBox.png"));
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        super.allStop();
    }

    @Override
    public void paint(RenderWindow w) {
        super.paint(w);
        keyResponse();

        if(messageOrder == super.messageNum){
            run();
            return;
        }
        ImageDraw dialog = new ImageDraw(0,300,dialogBox);
        w.draw((Drawable)dialog.getTransformable());
        TextDraw sentence = new TextDraw(20,350,20,properties.getProperty(key+messageOrder),"times.ttf", Color.WHITE);
        w.draw((Drawable)sentence.getTransformable());
        if(propertiesC.getProperty(key+messageOrder)!=null)
        {
            TextDraw chr = new TextDraw(20,310,20,propertiesC.getProperty(key+messageOrder),"times.ttf",Color.WHITE);
            w.draw((Drawable)chr.getTransformable());
        }
        if(Control.SPACE && checkTimeGap(200)){
            messageOrder++;
        }


    }

    @Override
    protected void keyResponse() {

    }

    public void run()
    {
        new RpgGame(LoadGame.readData(3));

    }
}
