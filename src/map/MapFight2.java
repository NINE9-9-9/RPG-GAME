package map;

import mode.LoadGame;
import mode.fight.FightGame;
import modeControl.GameMode;

/**
 * @Author NINE. LIU
 * @Date 2020/5/24 19:28
 * @Version 1.0
 */
public class MapFight2 extends MapObject {

    private int level;
    private int monster;
    private boolean trigger = false;

    public MapFight2(int imageNum, int level, int monster) {
        super(MapKind.FIGHT2, imageNum);
        this.level=level;
        this.monster=monster;

    }

    public void run()
    {
        GameMode.getInstance().saveData=GameMode.getInstance().getCurrentMode().getCurrentData();
        new FightGame(level,monster);

    }


    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMonster() {
        return monster;
    }

    public void setMonster(int monster) {
        this.monster = monster;
    }

    public void setTrigger(boolean trigger)
    {
        this.trigger = trigger;
    }

}