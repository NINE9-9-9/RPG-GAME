package mode;

import map.Attribute;
import map.Item;
import map.Map;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class SaveData implements Serializable {
    private static final long serialVersionUID = 1L;
    private ArrayList<Map> mapAll = null;
    private ArrayList<Map> mapLayer2 = null;
    private  Map currentMapLayer2 = null;
    private Map currentMap = null;
    private long lastTime = 0;
    private int actorX;
    private int actorY;
    private int mapX;
    private int mapY;
    private int x;
    private int y;
    private Direction direction;
    private Attribute attribute;
    private ArrayList<Item> weaponBag;
    private ArrayList<Item> armorBag;
    private ArrayList<Item> drugBag;
    private Item weapon;
    private Item armor;

    public SaveData() {
    }

    public SaveData(ArrayList<Map> mapAll, ArrayList<Map> mapLayer2, Map currentMap, Map currentMapLayer2, int actorX, int actorY, int x, int y, int mapX, int mapY, Direction direction, long lastTime, Attribute attribute, ArrayList<Item> weaponBag, ArrayList<Item> armorBag, ArrayList<Item> drugBag, Item weapon, Item armor) {
        this.mapAll = mapAll;
        this.currentMap = currentMap;
        this.mapLayer2 = mapLayer2;
        this.currentMapLayer2 = currentMapLayer2;
        this.actorX = actorX;
        this.actorY = actorY;
        this.mapX = mapX;
        this.mapY = mapY;
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.lastTime = lastTime;
        this.attribute = attribute;
        this.weaponBag = weaponBag;
        this.armorBag = armorBag;
        this.drugBag = drugBag;
        this.weapon = weapon;
        this.armor = armor;
    }

    public Map getCurrentMap() {
        return currentMap;
    }

    public long getLastTime() {
        return lastTime;
    }

    public int getMapX() {
        return mapX;
    }

    public int getMapY() {
        return mapY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public ArrayList<Map> getMapAll() {
        return mapAll;
    }

    public int getActorX() {
        return actorX;
    }

    public int getActorY() {
        return actorY;
    }

    public Map getCurrentMapLayer2() {
        return currentMapLayer2;
    }

    public ArrayList<Map> getMapLayer2() {
        return mapLayer2;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public ArrayList<Item> getWeaponBag() {
        return weaponBag;
    }

    public ArrayList<Item> getArmorBag() {
        return armorBag;
    }

    public ArrayList<Item> getDrugBag() {
        return drugBag;
    }

    public Item getWeapon() {
        return weapon;
    }

    public Item getArmor() {
        return armor;
    }
}
