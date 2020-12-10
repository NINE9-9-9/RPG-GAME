package map;

import mode.LoadGame;
import modeControl.GameMode;
import story.*;

/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class MapStory extends MapObject {
    private int storyNum;
    private boolean trigger = false;

    public MapStory(int storyNum, int imageNum) {
        super(MapKind.STORY, imageNum);
        this.storyNum = storyNum;
    }

    public void run(MapObject[][] map1)
    {
        if(!trigger)
        {
            trigger=true;
            GameMode.getInstance().saveData=GameMode.getInstance().getCurrentMode().getCurrentData();
            switch (storyNum)
            {
                case 0:
                    new Story2(map1);
                    break;
                case 1:
                    new Story3(map1);
                    break;
                case 2:
                    new Story4(map1);
                    break;
                case 3:
                    new Story5(map1);
                    break;
                case 4:
                    new Story6(map1);
                    break;
                case 5:
                    new Story7(map1);
                    break;
                case 6:
                    new Story8(map1);
                    break;
                case 7:
                    new Story9(map1);
                    break;
                case 8:
                    new Story10(map1);
                    break;
                case 9:
                    new Story11(map1);
                    break;
                case 10:
                    new Story12(map1);
                    break;
                case 11:
                    new StoryEnd(map1);
                    break;
                case 12:
                    new Story13(map1);
                    break;
                default:
                    break;
            }

        }
    }
}
