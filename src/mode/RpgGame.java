package mode;

import main.Control;
import map.Actor;
import map.Map;
import map.MapObject;
import modeControl.GameMode;
import modeControl.GameObject;
import org.jsfml.graphics.RenderWindow;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class RpgGame extends GameObject {
    private ArrayList<Map> map = new ArrayList<Map>();
    private ArrayList<Map> mapLayer2 = new ArrayList<>();
    private static Map mapNow;
    private static Map mapNowLayer2;
    private ObjectInputStream read;
    private static boolean isRun = false;
    private static boolean isStand = true;

    protected  Direction direction = Direction.LEFT;
    private long startTime = System.currentTimeMillis();
    private long lastTime = 0;



    public RpgGame() {
        super.clearGame();
        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/initTown.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/initTown2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/hotel1F.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/hotel1FLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/bedroom.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/bedroomLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/forest.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/forestLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/tower1F.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/tower1FLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/armorShop.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/armorShopLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/weaponShop.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/weaponShopLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/hotel2F.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/hotel2FLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/bedroom2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/bedroom2Layer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/drugShop.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/drugShopLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/towerTop.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/towerTopLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/tower2F.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/tower2FLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/house1F.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/house1FLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/house2F.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/house2FLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/bedroom4.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/bedroom4Layer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/forestShop.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/forestShopLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/snow.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/snowLayer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {

            read = new ObjectInputStream(new FileInputStream("resource/map/bedroom3.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            map.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            read = new ObjectInputStream(new FileInputStream("resource/map/bedroom3Layer2.map"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            mapLayer2.add((Map) read.readObject());
        } catch (ClassNotFoundException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        mapNow = map.get(2);
        mapNowLayer2 = mapLayer2.get(2);
        super.rpgPlay();
    }

    public RpgGame(SaveData saveData) {
        map = saveData.getMapAll();
        mapLayer2 = saveData.getMapLayer2();
        mapNowLayer2 = saveData.getCurrentMapLayer2();
        mapNow = saveData.getCurrentMap();
        mapNow.setLocation(saveData.getActorX(),saveData.getActorY());
        direction = saveData.getDirection();
        lastTime = saveData.getLastTime();
        Actor.getInstance().setX(saveData.getX());
        Actor.getInstance().setY(saveData.getY());
        Actor.getInstance().setMapX(saveData.getMapX());
        Actor.getInstance().setMapY(saveData.getMapY());
        Actor.getInstance().setAttribute(saveData.getAttribute());
        Actor.getInstance().setWeapon(saveData.getWeapon());
        Actor.getInstance().setArmor(saveData.getArmor());
        Actor.getInstance().setArmorBag(saveData.getArmorBag());
        Actor.getInstance().setWeaponBag(saveData.getWeaponBag());
        Actor.getInstance().setDrugBag(saveData.getDrugBag());
        super.rpgPlay();

    }

    @Override
    protected void keyResponse() {
        isStand = false;
        if (Control.ESC && super.checkStartGap(300)) {
            super.decisionPlay();

            LoadGame.setStatus(LoadGame.Status.SET);
            GameMode.getInstance().setSave(true);
            isStand = true;
            return;
        }
        if (Control.UP) {
            direction = Direction.UP;
        } else if (Control.DOWN) {
            direction = Direction.DOWN;
        } else if (Control.LEFT) {
            direction = Direction.LEFT;
        } else if (Control.RIGHT) {
            direction = Direction.RIGHT;
        } else {
            isStand = true;
        }
        isRun = Control.X;

    }



    public void paint(RenderWindow w) {
        if(!mapNow.getInfo())
        {
            keyResponse();
        }

        w.clear();
        if (isStand) {

            mapNow.paint(w);
            Actor.getInstance().draw(w, direction);
            mapNowLayer2.paint(w);
            mapNow.keyResponse(w,direction);

        } else {

            if(mapNow.checkDoor(direction)&&direction==mapNow.getFront(direction).getDirection())
            {
                MapObject door = mapNow.getFront(direction);
                mapNow = map.get(door.destination);
                mapNowLayer2 = mapLayer2.get(door.destination);
                mapNow.setLocation(door.actorX,door.actorY);
                mapNowLayer2.setLocation(door.actorX,door.actorY);
                Actor.getInstance().setMapX(door.mapX);
                Actor.getInstance().setMapY(door.mapY);
                Actor.getInstance().setX(door.xA);
                Actor.getInstance().setY(door.yA);
            }

            mapNow.paint(w, direction, isRun);
            Actor.getInstance().draw(w, isRun, direction);
            mapNowLayer2.paint(w);
        }
        mapNow.checkStory(w,direction);
        if(mapNow.checkFight(direction))
        {
            mapNow.getFront(direction).run();
        }




    }

    public SaveData getCurrentData() {
        return new SaveData(map,mapLayer2, mapNow,mapNowLayer2, Map.actorX, Map.actorY,
                Actor.getInstance().getX(), Actor.getInstance().getY(), Actor.getInstance().getMapX(), Actor.getInstance().getMapY(), direction, lastTime + (System.currentTimeMillis() - startTime), Actor.getInstance().getAttribute(), Actor.getInstance().getWeaponBag(), Actor.getInstance().getArmorBag(), Actor.getInstance().getDrugBag(), Actor.getInstance().getWeapon(), Actor.getInstance().getArmor());
    }

}
