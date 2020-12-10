package map;

import java.io.Serializable;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class Attribute implements Serializable {
    private int lv;
    private int exp;
    private int fullExp;
    private String name;
    private int attack;
    private int defence;
    private int speed;
    private int hp;
    private int hpNow;
    private int mp;
    private int mpNow;
    private int money;


    public Attribute(int lv, int exp, int fullExp, String name, int attack, int defence, int speed, int hp, int hpNow, int mp, int mpNow, int money) {
        this.lv = lv;
        this.exp = exp;
        this.fullExp = fullExp;
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
        this.hp = hp;
        this.hpNow = hpNow;
        this.mp = mp;
        this.mpNow = mpNow;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getMpNow() {
        return mpNow;
    }

    public void setMpNow(int mpNow) {
        this.mpNow = mpNow;
    }

    public int getHpNow() {
        return hpNow;
    }

    public void setHpNow(int hpNow) {
        this.hpNow = hpNow;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getFullExp() {
        return fullExp;
    }

    public void setFullExp(int fullExp) {
        this.fullExp = fullExp;
    }
}
