package story;

import map.Actor;
import map.Map;
import map.MapFight;
import map.MapObject;
import mode.LoadGame;
import mode.RpgGame;
import mode.SaveData;
import modeControl.GameMode;

import java.util.ArrayList;

/**
 * @Author NINE. LIU
 * @Date 2020/5/25 15:42
 * @Version 1.0
 */
public class Story4 extends Story {
    public Story4(MapObject[][] map) {
        super(map);
        super.key="w";
        super.messageNum=10;
        super.story8Play();
    }



    public void run()
    {
        super.allStop();
        ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
        maps.get(4).editMap(45,20,new MapFight(40100,3,7));
        GameMode.getInstance().saveData=new SaveData(maps,
                 GameMode.getInstance().saveData.getMapLayer2(),
                maps.get(4),
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
