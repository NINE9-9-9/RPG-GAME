package story;

import draw.ImageDraw;
import draw.ImageLibrary;
import map.Actor;
import map.Item;
import map.ItemType;
import map.MapObject;
import mode.LoadGame;
import mode.RpgGame;
import mode.SaveData;
import modeControl.GameMode;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.RenderWindow;

/**
 * @Author NINE. LIU
 * @Date 2020/5/27 8:13
 * @Version 1.0
 */
public class Story13 extends Story{
    public Story13(MapObject[][] map) {
        super(map);
        super.key="g";
        super.messageNum=8;
        super.story2Play();
    }

    public void paint(RenderWindow w)
    {
        super.paint(w);
        ImageDraw c = new ImageDraw(384,144,ImageLibrary.getIcon(103));
        w.draw((Drawable)c.getTransformable());
    }

    public void run()
    {
        super.allStop();
        Item sword = new Item("Wooden Sword","ATK+2 SPD+3", ItemType.WEAPON,2,0,3);
        Actor.getInstance().getWeaponBag().add(sword);
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
                 GameMode.getInstance().saveData.getAttribute(),
                Actor.getInstance().getWeaponBag(),
                 GameMode.getInstance().saveData.getArmorBag(),
                 GameMode.getInstance().saveData.getDrugBag(),
                 GameMode.getInstance().saveData.getWeapon(),
                 GameMode.getInstance().saveData.getArmor());
        new RpgGame( GameMode.getInstance().saveData);
    }
}
