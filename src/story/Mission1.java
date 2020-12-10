package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.Actor;
import map.MapObject;
import mode.Direction;
import mode.LoadGame;
import mode.RpgGame;
import mode.SaveData;
import modeControl.GameMode;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.RenderWindow;

/**
 * @Author NINE. LIU
 * @Date 2020/5/24 17:51
 * @Version 1.0
 */
public class Mission1 extends Story {
    public Mission1(MapObject[][] map) {
        super(map);
        super.key="rest";
        super.messageNum=1;

    }

    @Override
    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw owner = new ImageDraw(384,96,ImageLibrary.getIcon(123));
        w.draw((Drawable)owner.getTransformable());
    }

    public void run()
    {
        Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHp());
        Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMp());
        GameMode.getInstance().saveData=new SaveData( GameMode.getInstance().saveData.getMapAll(),
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
        new RpgGame( GameMode.getInstance().saveData);
    }
}
