package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.Map;
import map.MapFight;
import map.MapObject;
import mode.LoadGame;
import mode.RpgGame;
import mode.SaveData;
import modeControl.GameMode;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.RenderWindow;

import java.util.ArrayList;

/**
 * @Author NINE. LIU
 * @Date 2020/5/25 8:58
 * @Version 1.0
 */
public class Story3 extends Story {
    public Story3(MapObject[][] map) {
        super(map);
        super.key="ccc";
        super.messageNum=8;
        super.story9Play();

    }

    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw passerby = new ImageDraw(336,240, ImageLibrary.getIcon(109));
        ImageDraw passerby2 = new ImageDraw(384,240, ImageLibrary.getIcon(110));
        w.draw((Drawable)passerby.getTransformable());
        w.draw((Drawable)passerby2.getTransformable());

    }

    public void run()
    {
        super.allStop();
        ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
        maps.get(0).editMap(35,19,new MapFight(2020,1,-1));
        GameMode.getInstance().saveData=new SaveData(maps,
                 GameMode.getInstance().saveData.getMapLayer2(),
                maps.get(0),
                 GameMode.getInstance().saveData.getCurrentMapLayer2(),
                 GameMode.getInstance().saveData.getActorX(),
                 GameMode.getInstance().saveData.getActorY(),
                 GameMode.getInstance().saveData.getX(),
                 GameMode.getInstance().saveData.getY(),
                 GameMode.getInstance().saveData.getMapX(),
                 GameMode.getInstance().saveData.getMapY(),
                 GameMode.getInstance().saveData.getDirection(),
                 GameMode.getInstance().saveData.getLastTime(),
                 GameMode.getInstance().saveData.getAttribute(),
                 GameMode.getInstance().saveData.getWeaponBag(),
                 GameMode.getInstance().saveData.getArmorBag(),
                 GameMode.getInstance().saveData.getDrugBag(),
                 GameMode.getInstance().saveData.getWeapon(),
                 GameMode.getInstance().saveData.getArmor());
        new RpgGame( GameMode.getInstance().saveData);

    }
}
