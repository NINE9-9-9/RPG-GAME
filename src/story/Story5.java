package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.Actor;
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
 * @Date 2020/5/25 18:33
 * @Version 1.0
 */
public class Story5 extends Story {
    public Story5(MapObject[][] map) {
        super(map);
        super.key="aa";
        super.messageNum=8;
        super.story3Play();
    }

    @Override
    public void paint(RenderWindow w) {
        super.paint(w);
        ImageDraw mons = new ImageDraw(384,144,ImageLibrary.getIcon(116));
        w.draw((Drawable)mons.getTransformable());
    }

    @Override
    public void run() {
        super.allStop();
        ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
        maps.get(11).editMap(20,16,new MapFight(40114,3,8));
        GameMode.getInstance().saveData=new SaveData(maps,
                 GameMode.getInstance().saveData.getMapLayer2(),
                maps.get(11),
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
