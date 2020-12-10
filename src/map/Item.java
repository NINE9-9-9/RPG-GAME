package map;

import java.io.Serializable;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class Item implements Serializable {
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    private String name;
    private String attribute;
    private ItemType type=null;
    private int atk=0;
    private int dec=0;
    private int spd=0;
    private int hp=0;
    private int mp =0;

    public Item(String name, String attribute,  ItemType type, int atk, int dec, int spd) {
        this.name = name;
        this.attribute = attribute;
        this.type = type;
        this.atk = atk;
        this.dec = dec;
        this.spd = spd;
    }

    public Item(String name, String attribute, int hp, int mp) {
        this.name = name;
        this.attribute = attribute;
        type=ItemType.DRUG;
        this.hp=hp;
        this.mp=mp;
    }

    @Override
    public boolean equals(Object object)
    {
        Item item = (Item) object;
        return this.name.equals(item.name);
    }

    @Override
    public int hashCode()
    {
       return name.hashCode();
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDec() {
        return dec;
    }

    public void setDec(int dec) {
        this.dec = dec;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

}
