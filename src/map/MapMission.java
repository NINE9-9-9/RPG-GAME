package map;

import mode.LoadGame;
import modeControl.GameMode;
import story.Mission1;
import story.Mission2;
import story.Story1;
import story.Story2;

/**
 * @Author NINE. LIU
 * @Date 2020/5/23 19:58
 * @Version 1.0
 */
public class MapMission extends MapObject{

    private int mission;

    public MapMission( int imageNum,int mission) {
        super(MapKind.MISSION, imageNum);
        this.mission=mission;
    }

    public void run(MapObject[][] map)
    {
        GameMode.getInstance().saveData=GameMode.getInstance().getCurrentMode().getCurrentData();
        switch (mission)
        {
            case 0:
                new Mission1(map);
                break;
            case 1:
                new Mission2(map);
                break;
            default:
                break;
        }
    }
}
