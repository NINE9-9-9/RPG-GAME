package map;

import mode.Direction;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class MapObject implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean canWalk;
    private MapKind kind = null;
    private int imageNum = 0;
    public int destination;
    public int actorX;
    public int actorY;
    public int mapX;
    public int mapY;
    public int xA;
    public int yA;

    protected Direction direction;

    public MapObject(MapKind kind, int imageNum) {
        this.setKind(kind);
        this.setImageNum(imageNum);
        if (kind == MapKind.BARRIER||kind==MapKind.EVENT||kind==MapKind.FIGHT||kind==MapKind.STORY||kind==MapKind.MISSION||kind==MapKind.FIGHT2)
            canWalk = false;
        else
            canWalk = true;
    }

    public Direction getDirection() {
        return direction;
    }

    public boolean getIfWalk() {
        return canWalk;
    }

    public MapKind getKind() {
        return kind;
    }

    public void setKind(MapKind kind) {
        this.kind = kind;
    }

    public int getImageNum() { return imageNum; }

    public void setImageNum(int imageNum) {
        this.imageNum = imageNum;
    }

    public ArrayList<String> getMessage()
    {
        return null;
    }

    public ArrayList<String> getActor()
    {
        return null;
    }

    public boolean getShop(){return false;}

    public ArrayList<String> getTradeName(){return  null;}

    public ArrayList<String> getTradePrice(){return  null;}

    public ArrayList<String> getTradeAttribute(){return  null;}

    public ArrayList<String> getTradeBrief(){return  null;}

    public ArrayList<String> getAtk(){return  null;}

    public ArrayList<String> getDfc(){return  null;}

    public ArrayList<String> getSpd(){return  null;}

    public ArrayList<String> getHp(){return  null;}

    public ArrayList<String> getMp(){return  null;}

    public ItemType getType(){return null;}

    public void run(MapObject[][] map){}

    public void run(){}

    public int  getMoney() { return 0; }

}
