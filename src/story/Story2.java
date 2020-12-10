package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.Map;
import map.MapEvent;
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
 * @Date 2020/5/21 7:55
 * @Version 1.0
 */
public class Story2 extends Story {
    public Story2(MapObject[][] map) {
        super(map);
        super.key="a";
        super.messageNum=16;
        super.story2Play();
    }

    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw theOld = new ImageDraw(336,192, ImageLibrary.getIcon(105));
        w.draw((Drawable)theOld.getTransformable());
    }

    public void run()
    {
        super.allStop();
        ArrayList<Map> maps = GameMode.getInstance().saveData.getMapAll();
        maps.get(2).editMap(10,9,new MapEvent(2,10011,"aaaa"));
        GameMode.getInstance().saveData=new SaveData(maps,
                GameMode.getInstance().saveData.getMapLayer2(),
                maps.get(2),
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
        new RpgGame(GameMode.getInstance().saveData);
    }
}
