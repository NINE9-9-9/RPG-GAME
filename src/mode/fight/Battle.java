package mode.fight;


import draw.TextDraw;
import map.Actor;
import map.Item;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Drawable;

import java.util.ArrayList;


public class Battle {

    private ArrayList<Item> drugBag = new ArrayList<>();

    public Battle()
    {
        drugBag.addAll(Actor.getInstance().getDrugBag());
    }

    public void getEG(Monster monster) {

        Actor.getInstance().getAttribute().setExp(Actor.getInstance().getAttribute().getExp()+monster.exp);
        Actor.getInstance().getAttribute().setMoney(Actor.getInstance().getAttribute().getMoney()+monster.gold);

        if(Actor.getInstance().getAttribute().getExp()>=Actor.getInstance().getAttribute().getLv()*10) {

            Actor.getInstance().getAttribute().setExp(Actor.getInstance().getAttribute().getExp()%(Actor.getInstance().getAttribute().getLv()*10));
            if(Actor.getInstance().getAttribute().getLv()<=30)
                Actor.getInstance().getAttribute().setLv(Actor.getInstance().getAttribute().getLv()+1);

            Actor.getInstance().getAttribute().setHp(Actor.getInstance().getAttribute().getHp()+10+5*Actor.getInstance().getAttribute().getLv());
            Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHp());
            Actor.getInstance().getAttribute().setMp(Actor.getInstance().getAttribute().getMp()+5+2*Actor.getInstance().getAttribute().getLv());
            Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMp());
            Actor.getInstance().getAttribute().setAttack(Actor.getInstance().getAttribute().getAttack()+5+2*Actor.getInstance().getAttribute().getLv());
            Actor.getInstance().getAttribute().setDefence(Actor.getInstance().getAttribute().getDefence()+2+Actor.getInstance().getAttribute().getLv());
            Actor.getInstance().getAttribute().setSpeed(Actor.getInstance().getAttribute().getSpeed()+1+Actor.getInstance().getAttribute().getLv());

        }

    }

    public Situation checkBattle(Monster monster) {
        if (Actor.getInstance().getAttribute().getHpNow() <= 0 )
        {
            return Situation.DEFEAT;
        }
        else if(monster.hp <= 0)
            return  Situation.VICTORY;
        else
            return Situation.CONTINUE;

    }

    public void attackPlayer(Monster monster, int skill) {

        int hurt = 0;

        if(skill == 4 && Actor.getInstance().getAttribute().getMpNow()>=180) {
            if(Math.random()>0.9) {
                hurt = (int)(monster.hp*(Math.random()*0.3+0.65));
            } else {
                hurt = (int)(((Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk() - monster.defence)*((double)Actor.getInstance().getAttribute().getLv()/monster.lv)
                        + Math.random()*Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk() - Math.random()*Actor.getInstance().getAttribute().getAttack())
                        *(Math.random()*2.5+1.6));
            }
            Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMpNow()-180);
        } else if(skill == 2) {

            hurt = (int)((Actor.getInstance().getAttribute().getAttack() +Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk()- monster.defence)*((double)Actor.getInstance().getAttribute().getLv()/monster.lv)*0.9
                    + Math.random()*Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk()- Math.random()*Actor.getInstance().getAttribute().getAttack());
            if(hurt>=0)
            {
                Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMpNow()+(int)(hurt*0.5));
                Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHpNow()+(int)(hurt*0.5));
            }
            if( Actor.getInstance().getAttribute().getHpNow()> Actor.getInstance().getAttribute().getHp())
                Actor.getInstance().getAttribute().setHpNow( Actor.getInstance().getAttribute().getHp());
            if( Actor.getInstance().getAttribute().getMpNow()> Actor.getInstance().getAttribute().getMp())
                Actor.getInstance().getAttribute().setMpNow( Actor.getInstance().getAttribute().getMp());

        } else if(skill == 3 && Actor.getInstance().getAttribute().getMpNow()>=100) {
            hurt = (int)(((Actor.getInstance().getAttribute().getAttack() +Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk()- monster.defence)*((double)Actor.getInstance().getAttribute().getLv()/monster.lv)
                    + Math.random()*Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk() - Math.random()*Actor.getInstance().getAttribute().getAttack())
                    *(Math.random()*2+1.3));
            Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMpNow()-100);
        } else if(skill == 1) {
            hurt = (int)((Actor.getInstance().getAttribute().getAttack() +Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk()- monster.defence)*((double)Actor.getInstance().getAttribute().getLv()/monster.lv)
                    + Math.random()*Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getWeapon().getAtk()- Math.random()*Actor.getInstance().getAttribute().getAttack());
        }

        if(hurt<=0)
            hurt=3;

        monster.hp -= hurt;
        if(monster.hp<0)
            monster.hp=0;

    }

    public void AttackMonster(Monster monster,int skill)
    {
        int hurt = 0;
        if(skill==7)
        {
            hurt = (int)(((monster.attack - Actor.getInstance().getAttribute().getDefence()+Actor.getInstance().getArmor().getDec()+Actor.getInstance().getWeapon().getDec())*((double)monster.lv/Actor.getInstance().getAttribute().getLv())
                    + Math.random()*monster.attack - Math.random()*monster.attack)*2.3);
            monster.mp -= 190;
        }
        else if(skill==6)
        {
            hurt = (int)(((monster.attack - Actor.getInstance().getAttribute().getDefence()+Actor.getInstance().getArmor().getDec()+Actor.getInstance().getWeapon().getDec())*((double)monster.lv/Actor.getInstance().getAttribute().getLv())
                    + Math.random()*monster.attack - Math.random()*monster.attack)*1.7);
            monster.mp -= 110;
        }
        else
        {
            hurt = (int)((monster.attack - Actor.getInstance().getAttribute().getDefence()+Actor.getInstance().getArmor().getDec()+Actor.getInstance().getWeapon().getDec())*((double)monster.lv/Actor.getInstance().getAttribute().getLv())
                    + Math.random()*monster.attack - Math.random()*monster.attack);
        }
        if(hurt<=0)
            hurt=2;

        Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHpNow()-hurt);

        if(Actor.getInstance().getAttribute().getHpNow() < 0)
            Actor.getInstance().getAttribute().setHpNow(0);
    }

    public int monsterSkill(Monster monster) {
        if(Math.random()<0.2 && monster.mp>=190) {
            return 7;
        } else if(Math.random()<0.5 && monster.mp>=110) {

            return 6;
        } else {
            return 5;
        }





    }

    public boolean checkSpeed( Monster monster) {

        boolean checkSP = true;
        if(monster.speed > Actor.getInstance().getAttribute().getSpeed())
            checkSP = false;
        return checkSP;

    }

    public void useItem(int type) {

        Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHpNow()+drugBag.get(type).getHp());
        Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMpNow()+drugBag.get(type).getMp());
        if(Actor.getInstance().getAttribute().getHpNow()>Actor.getInstance().getAttribute().getHp())
            Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHp());
        if(Actor.getInstance().getAttribute().getMpNow()>Actor.getInstance().getAttribute().getMp())
            Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMp());

    }

    public boolean escape(Monster monster)
    {
        return Actor.getInstance().getAttribute().getSpeed() / (monster.speed * 1.0) * Math.random() > 0.5;
    }
}
