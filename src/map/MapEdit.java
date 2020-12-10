package map;

import draw.ImageLibrary;
import mode.Direction;
import mode.StoryGame;

import java.io.*;
import java.util.ArrayList;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class MapEdit {
    public static void main(String[] arg) {

        int row;
        int line;
        int[][] mapMatrix;
        MapObject[][] mapObject;
        Map initTown;
        ArrayList<Map> map = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            FileReader fr = new FileReader("resource/map/tower1F.txt");
            BufferedReader bf = new BufferedReader(fr);
            String str;

            while ((str = bf.readLine()) != null) {
                arrayList.add(str);
            }
            bf.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        row = arrayList.size();
        String[] array = new String[row];
        for (int i = 0; i < row; i++) {
            String s = arrayList.get(i);
            array[i] = s;

        }
        String[] s = array[0].split("\\s+");
        line = s.length;
        mapMatrix = new int[row][line];
        mapObject = new MapObject[row][line];
        for (int i = 0; i < row; i++) {
            String[] ss = array[i].split("\\s+");
            for (int j = 0; j < line; j++) {
                mapMatrix[i][j] = Integer.parseInt(ss[j]);
                mapObject[i][j] = new MapObject(ImageLibrary.getKind(mapMatrix[i][j]), mapMatrix[i][j]);
            }
        }
        initTown = new Map(row, line);
        initTown.setMap(mapObject);
        //hotel1F(initTown);
        //hotel2F(initTown);
        //initTown(initTown);
        //bedroom(initTown);
       // armorShop(initTown);
      //  bedroom2(initTown);
       // drugShop(initTown);
        //weaponShop(initTown);
       // house1F(initTown);
       // house2F(initTown);
       // forest(initTown);
       //bedroom4(initTown);
       // forestShop(initTown);
        tower1F(initTown);
       // tower2F(initTown);
       // snow(initTown);
       // towerTop(initTown);
        //bedroom3(initTown);
        map.add(initTown);

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("resource/map/tower1F.map"));
            os.writeObject(initTown);
            os.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void initTown(Map map)
    {
        MapDoor door = new MapDoor(1,2,11,10,19,384,384,6000,Direction.UP);
        map.editMap(29,31,door);

        MapDoor door2 = new MapDoor(2,1,6,9,14,384,384,6000,Direction.UP);
        map.editMap(6,19,door2);

        MapDoor door3 = new MapDoor(3,3,0,11,0,384,0,2020 ,Direction.DOWN);
        map.editMap(39,19,door3);
        map.editMap(39,18,door3);
        map.editMap(39,20,door3);



        MapDoor door5 = new MapDoor(5,2,4,10,12,384,384,6000 ,Direction.UP);
        map.editMap(7,10,door5);

        MapDoor door6 = new MapDoor(6,2,4,10,12,384,384,6000,Direction.UP);
        map.editMap(20,26,door6);

        MapDoor door7 = new MapDoor(8,1,4,9,12,384,384,6000,Direction.UP);
        map.editMap(7,29,door7);

        MapDoor door8 = new MapDoor(9,0,6,8,14,384,384,6000,Direction.UP);
        map.editMap(31,26,door8);

        MapDoor door9 = new MapDoor(17,2,8,10,13,384,240,6000,Direction.UP);
        map.editMap(29,10,door9);

        MapDoor door11 = new MapDoor(12,3,9,11,17,384,384,6000,Direction.UP);
        map.editMap(18,9,door11);

        MapDoor door12 = new MapDoor(14,2,9,10,17,384,384,6000,Direction.UP);
        map.editMap(15,36,door12);


        MapEvent passerby = new MapEvent(7,3000,"e");
        map.editMap(25,25,passerby);

        MapEvent passerby2 = new MapEvent(4,3000,"f");
        map.editMap(30,17,passerby2);

        MapEvent passerby3 = new MapEvent(2,2020,"d");
        map.editMap(34,16,passerby3);

        MapEvent passerby4 = new MapEvent(2,3000,"c");
        map.editMap(11,15,passerby4);


        MapStory story = new MapStory(1,2020);
        map.editMap(35,19,story);

        map.editMap(35,18,new MapObject(MapKind.BARRIER,2010));
        map.editMap(35,20,new MapObject(MapKind.BARRIER,2030));


    }

    public static void hotel1F(Map map)
    {
        MapDoor door = new MapDoor(0,23,26,31,30,384,192,10000,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,23,26,31,30,384,192,10002,Direction.DOWN);
        map.editMap(19,10,door);
        map.editMap(19,11,door);
        map.editMap(19,9,door2);

        MapDoor door3 = new MapDoor(7,0,6,11,11,528,240,6001,Direction.RIGHT);
        map.editMap(14,15,door3);

        MapMission mission = new MapMission(11022,0);
        map.editMap(11,11,mission);
    }

    public static void bedroom(Map map)
    {
        MapDoor door = new MapDoor(0,11,3,19,7,384,192,10002,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,11,3,19,7,384,192,10000,Direction.DOWN);
        map.editMap(14,8,door);
        map.editMap(14,9,door2);
        MapStory story = new MapStory(0,10011);
        map.editMap(10,9,story);

    }

    public static void armorShop(Map map)
    {
        MapDoor door = new MapDoor(0,2,4,10,8,384,192,14000,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,2,4,10,8,384,192,14001,Direction.DOWN);
        map.editMap(12,10,door);
        map.editMap(12,11,door);
        map.editMap(12,9,door2);

        MapEvent shop = new MapEvent(1,16021,ItemType.ARMOR,6);
        map.editMap(6,10,shop);
    }

    public static void hotel2F(Map map)
    {
        MapDoor door = new MapDoor(1,5,10,14,14,432,192,6002,Direction.LEFT);
        map.editMap(11,12,door);

        MapEvent event = new MapEvent(1,11002,"money",100);
        map.editMap(4,14,event);

        MapEvent event1 = new MapEvent(4,10002,"f");
        map.editMap(5,2,event1);
    }

    public static void bedroom2(Map map)
    {
        MapDoor door = new MapDoor(0,21,4,29,8,384,192,70100,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,21,4,29,8,384,192,70116,Direction.DOWN);
        map.editMap(12,8,door2);
        map.editMap(12,9,door);
        map.editMap(12,10,door);

        MapEvent event = new MapEvent(8,70100,"pp");
        map.editMap(6,7,event);
    }

    public static void drugShop(Map map)
    {
        MapDoor door = new MapDoor(0,18,28,26,32,384,192,10000,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,18,28,26,32,384,192,10002,Direction.DOWN);
        map.editMap(14,8,door);
        map.editMap(14,9,door);
        map.editMap(14,7,door2);

        MapEvent shop = new MapEvent(2,11026,ItemType.DRUG,4);
        map.editMap(7,10,shop);
    }

    public static  void weaponShop(Map map)
    {
        MapDoor door = new MapDoor(0,18,17,26,21,384,192,14000,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,18,17,26,21,384,192,14001,Direction.DOWN);
        map.editMap(12,10,door);
        map.editMap(12,11,door);
        map.editMap(12,9,door2);

        MapEvent shop = new MapEvent(0,16073,ItemType.WEAPON,6);
        map.editMap(6,10,shop);
    }

    public static void house1F(Map map)
    {
        MapDoor door = new MapDoor(0,1,15,9,19,384,192,50100,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,1,15,9,19,384,192,50101,Direction.DOWN);
        map.editMap(17,11,door);
        map.editMap(17,10,door2);

        MapDoor door3 = new MapDoor(13,5,5,17,9,576,192,6001,Direction.RIGHT);
        map.editMap(8,18,door3);

        MapEvent event = new MapEvent(6,50100,"rr");
        map.editMap(7,13,event);
        MapEvent event1 = new MapEvent(1,50202,"money",100);
        map.editMap(3,16,event1);

    }

    public static void house2F(Map map)
    {
        MapDoor door = new MapDoor(12,5,4,17,8,576,192,6002,Direction.RIGHT);
        map.editMap(9,18,door);

        MapEvent event = new MapEvent(1,50125,"me");
        map.editMap(4,2,event);

        MapEvent event1 = new MapEvent(1,50224,"money",100);
        map.editMap(14,14,event1);
    }

    public static void forest(Map map)
    {
        MapDoor door = new MapDoor(0,11,31,19,39,384,384,3000,Direction.UP);
        map.editMap(0,11,door);
        map.editMap(0,12,door);

        MapDoor door2 = new MapDoor(15,0,6,8,14,384,384,6000,Direction.UP);
        map.editMap(10,5,door2);

        MapFight2 fight = new MapFight2(20081,1,0);
        map.editMap(12,11,fight);

        MapFight fight2 = new MapFight(20081,1,5);
        map.editMap(12,24,fight2);

        map.editMap(13,24,new MapObject(MapKind.BARRIER,20083));
    }

    public static void bedroom4(Map map)
    {
        MapDoor door = new MapDoor(0,24,12,36,16,576,192,10000,Direction.DOWN);
        MapDoor door2 = new MapDoor(0,24,12,36,16,576,192,10002,Direction.DOWN);
        map.editMap(17,10,door);
        map.editMap(17,9,door2);

        MapEvent event = new MapEvent(1,10004,"money",100);
        map.editMap(7,11,event);

    }

    public static void forestShop(Map map)
    {
        MapDoor door = new MapDoor(3,0,7,5,11,240,192,10000,Direction.DOWN);
        MapDoor door2 = new MapDoor(3,0,7,5,11,240,192,10002,Direction.DOWN);
        map.editMap(14,8,door);
        map.editMap(14,9,door);
        map.editMap(14,7,door2);

        MapEvent shop = new MapEvent(2,11026,ItemType.DRUG,6);
        map.editMap(7,10,shop);

        MapMission mission = new MapMission(10010,1);
        map.editMap(5,2,mission);
    }

    public static void tower1F(Map map)
    {
        MapStory story = new MapStory(2,40100);
        map.editMap(45,20,story);
        map.editMap(45,19,new MapObject(MapKind.BARRIER,40104));
        map.editMap(45,21,new MapObject(MapKind.BARRIER,40105));

        MapDoor door10 = new MapDoor(11,8,19,16,23,384,192,40008,Direction.UP);

        map.editMap(15,21,door10);
        map.editMap(15,20,door10);
        map.editMap(15,22,door10);

        MapFight2 fight = new MapFight2(40114,3,2);
        MapFight2 fight2 = new MapFight2(40114,3,3);
        map.editMap(21,5,fight);
        map.editMap(21,36,fight2);

        MapEvent money = new MapEvent(1,40005,"money",100);
        map.editMap(2,5,money);
        map.editMap(2,36,money);

        MapDoor door = new MapDoor(16,6,0,14,0,384,0,40100,Direction.DOWN);
        MapDoor door2 = new MapDoor(16,6,0,14,0,384,0,40104,Direction.DOWN);
        MapDoor door3 = new MapDoor(16,6,0,14,0,384,0,40105,Direction.DOWN);
        map.editMap(47,20,door);
        map.editMap(47,19,door2);
        map.editMap(47,21,door3);
    }

    public static void tower2F(Map map)
    {
        MapDoor door9 = new MapDoor(10,12,30,20,34,384,192,40008,Direction.UP);
        map.editMap(5,16,door9);

        MapDoor door = new MapDoor(4,13,11,21,15,384,192,40008,Direction.DOWN);
        map.editMap(24,16,door);
        map.editMap(24,15,door);
        map.editMap(24,17,door);

        MapStory story = new MapStory(3,40114);
        map.editMap(20,16,story);
        map.editMap(20,15,new MapObject(MapKind.BARRIER,40143));
        map.editMap(20,17,new MapObject(MapKind.BARRIER,40114));

        MapFight2 fight  = new MapFight2(40114,3,3);
        map.editMap(17,4,fight);
        MapFight2 fight2  = new MapFight2(40114,3,4);
        map.editMap(17,29,fight2);
    }

    public static void snow(Map map)
    {
        MapDoor door = new MapDoor(3,9,8,24,12,720,192,30037,Direction.LEFT);
        MapDoor door2 = new MapDoor(3,9,9,24,13,720,192,30042,Direction.LEFT);
        map.editMap(15,0,door);
        map.editMap(16,0,door2);

        MapEvent door4 = new MapEvent(1,30003,"ooo");
        MapEvent door5 = new MapEvent(1,30000 ,"ooo");
        map.editMap(0,14,door4);
        map.editMap(0,13,door5);
        map.editMap(0,15,door5);

        MapEvent event = new MapEvent(1,30242,"money",100);
        map.editMap(19,27,event);

        MapStory story = new MapStory(4,30037);
        map.editMap(10,14,story);
        map.editMap(10,13,new MapObject(MapKind.BARRIER,30036));
        map.editMap(10,15,new MapObject(MapKind.BARRIER,30038));

        MapFight2 fight2 = new MapFight2(30000,2,1);
        map.editMap(16,19,fight2);

        MapStory story2 = new MapStory(5,30037);
        map.editMap(15,12,story2);
        map.editMap(16,12,new MapObject(MapKind.BARRIER,30042));


    }

    public static void towerTop(Map map)
    {
        MapDoor door = new MapDoor(11,8,1,16,5,384,192,80017,Direction.DOWN);
        map.editMap(35,20,door);

        MapStory story = new MapStory(6,80100);
        map.editMap(28,8,story);
    }

    public static void bedroom3(Map map)
    {
        MapDoor door = new MapDoor(0,2,26,10,30,384,192,10000,Direction.DOWN);
        map.editMap(13,9,door);
        map.editMap(13,10,door);
        map.editMap(10,2,new MapEvent(1,10014,"money",100));

        MapStory story = new MapStory(12,10000);
        map.editMap(8,11,story);
    }
}
