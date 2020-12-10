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
 * @Date 2020/5/26 9:15
 * @Version 1.0
 */
public class Story6 extends Story{

    public Story6(MapObject[][] map) {
        super(map);
        super.key="j";
        super.messageNum=6;
        super.story6Play();
    }

    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw mons = new ImageDraw(384,144, ImageLibrary.getIcon(117));
        w.draw((Drawable)mons.getTransformable());
    }

    public void run()
    {
        super.allStop();
        ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
        maps.get(16).editMap(10,14,new MapFight(30037,2,6));
        GameMode.getInstance().saveData=new SaveData(maps,
                 GameMode.getInstance().saveData.getMapLayer2(),
                maps.get(16),
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
