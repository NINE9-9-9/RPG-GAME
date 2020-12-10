package map;

import mode.LoadGame;
import mode.fight.FightGame;
import modeControl.GameMode;

/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class MapFight extends MapObject {

    private int level;
    private int monster;
    private boolean trigger = false;

    public MapFight(int imageNum, int level, int monster) {
        super(MapKind.FIGHT, imageNum);
        this.level=level;
        this.monster=monster;

    }

    public void run()
    {
        if(!trigger)
        {
            trigger=true;
            GameMode.getInstance().saveData=GameMode.getInstance().getCurrentMode().getCurrentData();
            new FightGame(level,monster);
        }
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

    public boolean isTrigger()
    {
        return trigger;
    }

}
