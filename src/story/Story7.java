package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.Map;
import map.MapFight;
import map.MapKind;
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
 * @Date 2020/5/26 10:23
 * @Version 1.0
 */
public class Story7 extends Story{
    public Story7(MapObject[][] map) {
        super(map);
        super.key="h";
        super.messageNum=9;
        super.story7Play();
    }
    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw spirit = new ImageDraw(432,192, ImageLibrary.getIcon(118));
        w.draw((Drawable)spirit.getTransformable());

    }

    public void run()
    {
        super.allStop();
        ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
        ArrayList<Map> maps2 =  GameMode.getInstance().saveData.getMapLayer2();
        maps.get(16).editMap(15,12,new MapObject(MapKind.ROAD,30037));
        maps.get(16).editMap(16,12,new MapObject(MapKind.ROAD,30042));
        maps2.get(16).editMap(15,12,new MapObject(MapKind.ROAD,0000));
        GameMode.getInstance().saveData=new SaveData(maps,
                maps2,
                maps.get(16),
                maps2.get(16),
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
