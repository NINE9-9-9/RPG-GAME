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
 * @Date 2020/5/26 12:00
 * @Version 1.0
 */
public class Story9 extends Story {
    public Story9(MapObject[][] map) {
        super(map);
        super.key="dd";
        super.messageNum=4;
        super.story4Play();
    }

    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw mons = new ImageDraw(384,144, ImageLibrary.getIcon(120));
        w.draw((Drawable)mons.getTransformable());
    }

    public void run()
    {
        super.allStop();
        ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
        maps.get(10).editMap(13,8,new MapFight(80100,4,11));
        GameMode.getInstance().saveData=new SaveData(maps,
                 GameMode.getInstance().saveData.getMapLayer2(),
                maps.get(10),
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
