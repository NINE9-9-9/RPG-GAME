package map;

import draw.ImageDraw;
import mode.Direction;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.Image;
import org.jsfml.graphics.RenderWindow;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class Actor {
    private static Actor leadActor = new Actor(1);
    private int x;
    private int y;
    private int mapX;
    private int mapY;
    private int walkWait = 0;
    private int runWait = 0;
    private int action = 0;
    private Attribute attribute = new Attribute(1, 0, 100, "Su Qing",36,27,18,120, 120, 100, 100, 500);
    private ArrayList<Item> weaponBag = new ArrayList<>();
    private ArrayList<Item> armorBag = new ArrayList<>();
    private ArrayList<Item> drugBag = new ArrayList<>();
    private Item weapon= new Item("Empty",null,ItemType.WEAPON,0,0,0);
    private Item armor = new Item("Empty",null,ItemType.ARMOR,0,0,0);
    private Direction direct = Direction.LEFT;
    private BufferedImage walk;
    private BufferedImage[] walkUp = new BufferedImage[3];
    private BufferedImage[] walkDown = new BufferedImage[3];
    private BufferedImage[] walkLeft = new BufferedImage[3];
    private BufferedImage[] walkRight = new BufferedImage[3];
    private Image[] walku = new Image[3];
    private Image[] walkd = new Image[3];
    private Image[] walkl = new Image[3];
    private Image[] walkr = new Image[3];

    public Actor(int actNum) {
        try {
            walk = ImageIO.read(new FileInputStream("resource/actor/Actor" + actNum + ".png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        for (int i = 0; i < walkUp.length; i++) {
            assert walk != null;
            walkUp[i] = walk.getSubimage(i * (walk.getWidth() / 3), 3 * (walk.getHeight() / 4), walk.getWidth() / 3, walk.getHeight() / 4);
            walku[i] = new Image();
            walku[i].create(walkUp[i]);

        }
        for (int i = 0; i < walkDown.length; i++) {
            walkDown[i] = walk.getSubimage(i * (walk.getWidth() / 3), 0, walk.getWidth() / 3, walk.getHeight() / 4);
            walkd[i] = new Image();
            walkd[i].create(walkDown[i]);
        }
        for (int i = 0; i < walkLeft.length; i++) {
            walkLeft[i] = walk.getSubimage(i * (walk.getWidth() / 3), walk.getHeight() / 4, walk.getWidth() / 3, walk.getHeight() / 4);
            walkl[i] = new Image();
            walkl[i].create(walkLeft[i]);
        }
        for (int i = 0; i < walkRight.length; i++) {
            walkRight[i] = walk.getSubimage(i * (walk.getWidth() / 3), walk.getHeight() / 2, walk.getWidth() / 3, walk.getHeight() / 4);
            walkr[i] = new Image();
            walkr[i].create(walkRight[i]);
        }

        x = 768 / 2;
        y = 432 / 2 - walk.getHeight() / 8;
        mapX = 10;
        mapY = 10;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void move(Direction direct) {

        if (direct == Direction.UP) {
            y -= 48;
        } else if (direct == Direction.DOWN)
            y += 48;
        else if (direct == Direction.LEFT)
            x -= 48;
        else if (direct == Direction.RIGHT)
            x += 48;

    }

    public void draw(RenderWindow w, boolean isRun, Direction direction) {
        direct = direction;
        if (!isRun) {
            if (direction == Direction.UP)
            {
                ImageDraw walkU = new ImageDraw(x,y,walku[action]);
                w.draw((Drawable)walkU.getTransformable());
            }
            else if (direction == Direction.DOWN)
            {
                ImageDraw walkD = new ImageDraw(x,y,walkd[action]);
                w.draw((Drawable)walkD.getTransformable());
            }

            else if (direction == Direction.LEFT)
            {
                ImageDraw walkL = new ImageDraw(x,y,walkl[action]);
                w.draw((Drawable)walkL.getTransformable());
            }
            else if (direction == Direction.RIGHT)
            {
                ImageDraw walkR = new ImageDraw(x,y,walkr[action]);
                w.draw((Drawable)walkR.getTransformable());
            }
            walkWait++;
            if (walkWait == 2) {
                walkWait = 0;
                action++;
            }
        } else {
            if (direction == Direction.UP)
            {
                ImageDraw walkU = new ImageDraw(x,y,walku[action]);
                w.draw((Drawable)walkU.getTransformable());
            }
            else if (direction == Direction.DOWN)
            {
                ImageDraw walkD = new ImageDraw(x,y,walkd[action]);
                w.draw((Drawable)walkD.getTransformable());
            }

            else if (direction == Direction.LEFT)
            {
                ImageDraw walkL = new ImageDraw(x,y,walkl[action]);
                w.draw((Drawable)walkL.getTransformable());
            }
            else if (direction == Direction.RIGHT)
            {
                ImageDraw walkR = new ImageDraw(x,y,walkr[action]);
                w.draw((Drawable)walkR.getTransformable());
            }
            runWait++;
            if (runWait == 1) {
                runWait = 0;
                action++;
            }
        }


        if (action == 3)
            action = 0;
    }

    public void draw(RenderWindow w, Direction direction) {
        if (direction == Direction.UP)
        {
            ImageDraw walkU = new ImageDraw(x,y,walku[1]);
            w.draw((Drawable)walkU.getTransformable());
        }
        else if (direction == Direction.DOWN)
        {
            ImageDraw walkD = new ImageDraw(x,y,walkd[1]);
            w.draw((Drawable)walkD.getTransformable());
        }

        else if (direction == Direction.LEFT)
        {
            ImageDraw walkL = new ImageDraw(x,y,walkl[1]);
            w.draw((Drawable)walkL.getTransformable());
        }
        else if (direction == Direction.RIGHT)
        {
            ImageDraw walkR = new ImageDraw(x,y,walkr[1]);
            w.draw((Drawable)walkR.getTransformable());
        }
    }

    public Direction getDirection() {
        return direct;
    }

    public static Actor getInstance() {
        return leadActor;
    }

    public int getMapY() {
        return mapY;
    }

    public int getMapX() {
        return mapX;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }

    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    public void setMap(Direction dir) {
        if (dir == Direction.UP)
            mapY--;
        else if (dir == Direction.DOWN)
            mapY++;
        else if (dir == Direction.LEFT)
            mapX--;
        else if (dir == Direction.RIGHT)
            mapX++;
    }
    public void newActor()
    {
        leadActor = new Actor(1);
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon= weapon;
    }


    public Item getArmor() {
        return armor;
    }

    public void setArmor(Item armor) {
        this.armor = armor;
    }

    public ArrayList<Item> getWeaponBag() {
        return weaponBag;
    }

    public void setWeaponBag(ArrayList<Item> weaponBag)
    {
        this.weaponBag=weaponBag;
    }

    public void setArmorBag(ArrayList<Item> armorBag)
    {
        this.armorBag=armorBag;
    }

    public void setDrugBag(ArrayList<Item> drugBag)
    {
        this.drugBag=drugBag;
    }

    public ArrayList<Item> getArmorBag() {
        return armorBag;
    }

    public ArrayList<Item> getDrugBag() {
        return drugBag;
    }
}
