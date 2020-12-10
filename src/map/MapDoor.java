package map;

import mode.Direction;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class MapDoor extends MapObject {



    public MapDoor(int destination, int actorX, int actorY, int mapX, int mapY, int xA, int yA, int imageNum, Direction direction) {
        super(MapKind.DOOR, imageNum);
        super.direction=direction;
        super.actorX = actorX;
        super.actorY = actorY;
        super.destination = destination;
        super.mapX = mapX;
        super.mapY = mapY;
        super.xA = xA;
        super.yA = yA;

    }

}
