package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.*;
import mode.Direction;
import mode.LoadGame;
import mode.RpgGame;
import mode.SaveData;
import modeControl.GameMode;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.RenderWindow;

import java.util.ArrayList;

/**
 * @Author NINE. LIU
 * @Date 2020/5/25 11:19
 * @Version 1.0
 */
public class Mission2 extends Story {
    private ArrayList<Map> maps = new ArrayList<Map>();

    public Mission2(MapObject[][] map) {
        super(map);
        maps=  GameMode.getInstance().saveData.getMapAll();


        if(maps.get(16).getMapObject(10,14).getKind()== MapKind.FIGHT||maps.get(16).getMapObject(10,14).getKind()== MapKind.STORY)
        {
            super.key="oo";
            super.messageNum=1;
        }
        else if(maps.get(16).getMapObject(10,14).getKind()== MapKind.ROAD&&maps.get(4).getMapObject(45,20).getKind()!=MapKind.ROAD)
        {
            super.key="o";
            super.messageNum=21;
            MapDoor door4 = new MapDoor(4,12,39,20,47,384,384,30003 , Direction.UP);
            MapDoor door5 = new MapDoor(4,12,39,20,47,384,384,30000 ,Direction.UP);
            maps.get(16).editMap(0,14,door4);
            maps.get(16).editMap(0,13,door5);
            maps.get(16).editMap(0,15,door5);
            GameMode.getInstance().saveData=new SaveData(maps,
                     GameMode.getInstance().saveData.getMapLayer2(),
                     GameMode.getInstance().saveData.getCurrentMap(),
                     GameMode.getInstance().saveData.getCurrentMapLayer2(),
                     GameMode.getInstance().saveData.getActorX(),
                     GameMode.getInstance().saveData.getActorY(),
                     GameMode.getInstance().saveData.getX(),
                     GameMode.getInstance().saveData.getY(),
                     GameMode.getInstance().saveData.getMapX(),
                     GameMode.getInstance().saveData.getMapY(),
                     GameMode.getInstance().saveData.getDirection(),
                     GameMode.getInstance().saveData.getLastTime(),
                    Actor.getInstance().getAttribute(),
                     GameMode.getInstance().saveData.getWeaponBag(),
                     GameMode.getInstance().saveData.getArmorBag(),
                     GameMode.getInstance().saveData.getDrugBag(),
                     GameMode.getInstance().saveData.getWeapon(),
                     GameMode.getInstance().saveData.getArmor());
        }
        else if(maps.get(4).getMapObject(45,20).getKind()==MapKind.ROAD)
        {
            super.key="p";
            super.messageNum=3;
            maps.get(15).editMap(5,2,new MapEvent(2,10010,"p"));
            Actor.getInstance().getAttribute().setMoney(Actor.getInstance().getAttribute().getMoney()+100);
            GameMode.getInstance().saveData=new SaveData(maps,
                     GameMode.getInstance().saveData.getMapLayer2(),
                    maps.get(15),
                     GameMode.getInstance().saveData.getCurrentMapLayer2(),
                     GameMode.getInstance().saveData.getActorX(),
                     GameMode.getInstance().saveData.getActorY(),
                     GameMode.getInstance().saveData.getX(),
                     GameMode.getInstance().saveData.getY(),
                     GameMode.getInstance().saveData.getMapX(),
                     GameMode.getInstance().saveData.getMapY(),
                     GameMode.getInstance().saveData.getDirection(),
                     GameMode.getInstance().saveData.getLastTime(),
                    Actor.getInstance().getAttribute(),
                     GameMode.getInstance().saveData.getWeaponBag(),
                     GameMode.getInstance().saveData.getArmorBag(),
                     GameMode.getInstance().saveData.getDrugBag(),
                     GameMode.getInstance().saveData.getWeapon(),
                     GameMode.getInstance().saveData.getArmor());
        }
        super.story7Play();


    }

    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw cha = new ImageDraw(96,192, ImageLibrary.getIcon(112));
        w.draw((Drawable)cha.getTransformable());
    }

    public void run()
    {
        super.allStop();
        new RpgGame( GameMode.getInstance().saveData);

    }


}
