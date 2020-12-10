package map;

import draw.ImageDraw;
import draw.ImageLibrary;
import draw.TextDraw;
import main.Control;
import main.Library;
import mode.Direction;
import modeControl.GameObject;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Drawable;
import org.jsfml.graphics.Image;
import org.jsfml.graphics.RenderWindow;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Paths;
import java.util.ArrayList;


/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class Map implements Serializable {

    private static final long serialVersionUID = 1L;

    private MapObject[][] map;
    public static int actorX = 2;
    public static int actorY = 6;
    private int wait = 0;
    private boolean info;
    private int messageOrder = 0;
    private MapType type = null;
    private ArrayList<String> message = new ArrayList<>();
    private ArrayList<String> messageActor = new ArrayList<>();
    private ArrayList<String> tradeName = new ArrayList<>();
    private ArrayList<String> tradeAttribute = new ArrayList<>();
    private ArrayList<String> tradePrice = new ArrayList<>();
    private ArrayList<String> tradeBrief = new ArrayList<>();
    private ArrayList<String> tradeATK = new ArrayList<>();
    private ArrayList<String> tradeDFC = new ArrayList<>();
    private ArrayList<String> tradeSPD = new ArrayList<>();
    private ArrayList<String> tradeHP = new ArrayList<>();
    private ArrayList<String> tradeMP = new ArrayList<>();
    private ItemType itemType;
    private boolean shop;
    private boolean choose = true;
    private int choice = 0;
    private static Image dialogBox = new Image();
    private static Image dialogBox2 = new Image();
    private static Image dialogBox3 = new Image();
    private static Image dialogBox4 = new Image();
    private static Image dialogBox5 = new Image();
    private enum buy {success,failure,not,poor}
    public buy buyState = buy.not;
    private int time = 0;
    static {
        try {
            dialogBox.loadFromFile(Paths.get("resource/picture/dialogBox.png"));
            dialogBox2.loadFromFile(Paths.get("resource/picture/dialogBox2.png"));
            dialogBox3.loadFromFile(Paths.get("resource/picture/dialogBox3.png"));
            dialogBox4.loadFromFile(Paths.get("resource/picture/dialogBox4.png"));
            dialogBox5.loadFromFile(Paths.get("resource/picture/dialogBox5.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Map(int x, int y) {
        map = new MapObject[x][y];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = new MapObject(MapKind.BARRIER, 0);
            }
        }
    }

    public void editMap(int x, int y, MapObject m) {
        map[x][y] = m;
    }

    public void setMap(MapObject[][] m) {
        map = m;
    }

    public void setLocation(int actorX, int actorY) {
       Map.actorX = actorX;
       Map.actorY = actorY;
    }

    public MapObject[][] getMap() {
        return map;
    }

    public void paint(RenderWindow w) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 16; j++) {
                ImageDraw mapDraw = new ImageDraw(48*j,48*i, ImageLibrary.getIcon(map[actorY + i][actorX + j]));
                w.draw((Drawable)mapDraw.getTransformable());
            }
        }



    }

    public void paint(RenderWindow w, Direction direction, boolean isRun) {
        if (isRun) {
            wait++;
            if (wait >= 1) {
                move(direction);
                wait = 0;
            }
        } else {
            wait++;
            if (wait >= 2) {
                move(direction);
                wait = 0;
            }
        }
        paint(w);

    }


    public void move(Direction direct) {
            if (direct == Direction.UP&&Actor.getInstance().getMapY()!=0 )
            {
                if (map[Actor.getInstance().getMapY() - 1][Actor.getInstance().getMapX()].getIfWalk())
                {
                    Actor.getInstance().setMap(direct);
                    if (actorY == 0 || actorY + Library.clipY == map.length) {
                        if (Actor.getInstance().getY() == Library.HEIGHT / 2 - 24 && actorY != 0)
                            actorY--;

                        else
                            Actor.getInstance().move(direct);

                    } else
                        actorY--;
                }



            }
            else if (direct == Direction.DOWN && Actor.getInstance().getMapY()!=map.length-1) {
               if(map[Actor.getInstance().getMapY() + 1][Actor.getInstance().getMapX()].getIfWalk())
               {
                   Actor.getInstance().setMap(direct);
                   if (actorY == 0 || actorY + Library.clipY == map.length) {
                       if (Actor.getInstance().getY() == Library.HEIGHT / 2 - 24 && actorY + Library.clipY != map.length)
                           actorY++;
                       else
                           Actor.getInstance().move(direct);

                   } else
                       actorY++;
               }


            } else if (direct == Direction.LEFT &&Actor.getInstance().getMapX()!=0) {
                if(map[Actor.getInstance().getMapY()][Actor.getInstance().getMapX() - 1].getIfWalk())
                {
                    Actor.getInstance().setMap(direct);
                    if (actorX == 0 || actorX + Library.clipX == map[0].length) {
                        if (Actor.getInstance().getX() == Library.WIDTH / 2 && actorX != 0)
                            actorX--;
                        else
                            Actor.getInstance().move(direct);
                    } else
                        actorX--;
                }



            }
            else if (direct == Direction.RIGHT && Actor.getInstance().getMapX()!=(map[0].length-1))
            {
                if(map[Actor.getInstance().getMapY()][Actor.getInstance().getMapX() + 1].getIfWalk())
                {
                    Actor.getInstance().setMap(direct);
                    if (actorX == 0 || actorX + Library.clipX == map[0].length) {
                        if (Actor.getInstance().getX() == Library.WIDTH / 2 && actorX + Library.clipX != map[0].length)
                            actorX++;
                        else
                            Actor.getInstance().move(direct);

                    } else
                        actorX++;
                }


            }
        }

        public boolean checkDoor(Direction direction)
        {
            switch (direction){
                case UP:
                    if(Actor.getInstance().getMapY() - 1>=0)
                    {
                        if(map[Actor.getInstance().getMapY() - 1][Actor.getInstance().getMapX()].getKind() == MapKind.DOOR)
                            return true;
                    }

                    break;
                case DOWN:
                    if(Actor.getInstance().getMapY() + 1<map.length)
                    {
                        if(map[Actor.getInstance().getMapY() + 1][Actor.getInstance().getMapX()].getKind() == MapKind.DOOR)
                            return true;
                    }

                    break;
                case LEFT:
                    if(Actor.getInstance().getMapX() - 1>=0)
                    {
                        if(map[Actor.getInstance().getMapY()][Actor.getInstance().getMapX() - 1].getKind() == MapKind.DOOR)
                            return true;
                    }

                    break;
                case RIGHT:
                    if(Actor.getInstance().getMapX() + 1<map[0].length)
                    {
                        if(map[Actor.getInstance().getMapY()][Actor.getInstance().getMapX() + 1].getKind() == MapKind.DOOR)
                            return true;
                    }

                    break;
                default:
            }
            return false;

        }

    public void keyResponse(RenderWindow w,Direction direction)
    {

        if(!info&& Control.SPACE&& getFront(direction).getKind() == MapKind.EVENT&& GameObject.checkTimeGap(300))
        {
            message = getFront(direction).getMessage();
            messageActor=getFront(direction).getActor();
            shop = getFront(direction).getShop();
            tradeName=getFront(direction).getTradeName();
            tradePrice=getFront(direction).getTradePrice();
            tradeAttribute=getFront(direction).getTradeAttribute();
            tradeBrief=getFront(direction).getTradeBrief();
            itemType=getFront(direction).getType();
            tradeATK=getFront(direction).getAtk();
            tradeDFC=getFront(direction).getDfc();
            tradeSPD=getFront(direction).getSpd();
            tradeHP=getFront(direction).getHp();
            tradeMP=getFront(direction).getMp();
            info = true;

        }
        else if(info)
        {

            ImageDraw dialog = new ImageDraw(0,300,dialogBox);
            w.draw((Drawable)dialog.getTransformable());
            if(messageOrder<message.size())
            {

                TextDraw sentenceName = new TextDraw(20,310,20,messageActor.get(messageOrder),"times.ttf", Color.WHITE);
                w.draw((Drawable) sentenceName.getTransformable());


                TextDraw sentence = new TextDraw(20,350,20,message.get(messageOrder),"times.ttf", Color.WHITE);
                w.draw((Drawable) sentence.getTransformable());
                if(Control.SPACE &&GameObject.checkTimeGap(300))
                {
                    messageOrder++;
                    if(messageOrder == message.size()&&!shop)
                    {
                        info = false;
                        messageOrder=0;
                    }
                }
            }



            if(messageOrder>=message.size()&&shop)
            {
                if(choose)
                {
                    TextDraw sentenceName = new TextDraw(20,310,20,messageActor.get(message.size()-1),"times.ttf", Color.WHITE);
                    w.draw((Drawable) sentenceName.getTransformable());
                    TextDraw sentence = new TextDraw(20,350,20,message.get(message.size()-1),"times.ttf", Color.WHITE);
                    w.draw((Drawable) sentence.getTransformable());
                    ImageDraw dialog2 = new ImageDraw(576,210,dialogBox2);
                    w.draw((Drawable)dialog2.getTransformable());
                    TextDraw sentenceName1 = new TextDraw(600,230,20,"YES","times.ttf", Color.WHITE);
                    w.draw((Drawable) sentenceName1.getTransformable());
                    TextDraw sentence1 = new TextDraw(602,260,20,"N O","times.ttf", Color.WHITE);
                    w.draw((Drawable) sentence1.getTransformable());
                    ImageDraw dialog3 = new ImageDraw(576,230+choice*30,dialogBox3);
                    w.draw((Drawable)dialog3.getTransformable());
                    if(Control.UP &&GameObject.checkTimeGap(150))
                    {
                        choice--;
                        if(choice==-1)
                            choice=1;
                    }
                    else if(Control.DOWN &&GameObject.checkTimeGap(150))
                    {
                        choice++;
                        if(choice==2)
                            choice=0;
                    }
                    else if(Control.SPACE &&GameObject.checkTimeGap(300))
                    {
                        if(choice==0)
                        {
                            choose=false;
                            choice = 0;
                        }
                        else if(choice==1)
                        {
                            info = false;
                            messageOrder=0;
                            choice=0;
                        }
                    }
                }
                else
                {
                    if(Control.UP &&GameObject.checkTimeGap(150))
                    {
                        choice--;
                        if(choice==-1)
                            choice=tradeName.size();
                    }
                    else if(Control.DOWN &&GameObject.checkTimeGap(150))
                    {
                        choice++;
                        if(choice==tradeAttribute.size()+1)
                            choice=0;
                    }
                    ImageDraw dialogBox4Draw = new ImageDraw(510,0,dialogBox4);
                     w.draw((Drawable)dialogBox4Draw.getTransformable());
                     for(int i =0;i<tradeName.size();i++)
                     {
                         TextDraw name = new TextDraw(530,35+i*30,20,tradeName.get(i),"times.ttf",Color.WHITE);
                         w.draw((Drawable)name.getTransformable());
                         TextDraw price = new TextDraw(700,35+i*30,20,tradePrice.get(i)+"G","times.ttf",Color.WHITE);
                         w.draw((Drawable)price.getTransformable());


                     }
                     TextDraw backDraw = new TextDraw(600,35+tradeName.size()*30,20,"Back","times.ttf",Color.WHITE);
                     w.draw((Drawable)backDraw.getTransformable());
                     ImageDraw box5Draw = new ImageDraw(520,35+30*choice,dialogBox5);
                     w.draw((Drawable)box5Draw.getTransformable());
                     if(choice<tradeName.size())
                     {
                         TextDraw attributeDraw = new TextDraw(30,320,24,tradeAttribute.get(choice),"times.ttf",Color.WHITE);
                         w.draw((Drawable)attributeDraw.getTransformable());
                         TextDraw briefDraw = new TextDraw(30,360,20,tradeBrief.get(choice),"times.ttf",Color.WHITE);
                         w.draw((Drawable)briefDraw.getTransformable());
                     }
                     else
                     {
                         TextDraw welcome = new TextDraw(30,340,24,"Welcome to come again","times.ttf",Color.WHITE);
                         w.draw((Drawable)welcome.getTransformable());
                     }
                     if(Control.SPACE&&choice==tradeName.size()&& GameObject.checkTimeGap(200))
                     {
                         info = false;
                         messageOrder=0;
                         choose = true;
                         choice=0;
                     }
                     else if(Control.SPACE&& GameObject.checkTimeGap(200))
                     {

                         boolean has =false;

                         switch (itemType)
                         {
                             case WEAPON:

                                 Item item = new Item(tradeName.get(choice),tradeAttribute.get(choice),itemType,Integer.parseInt(tradeATK.get(choice)),Integer.parseInt(tradeDFC.get(choice)),Integer.parseInt(tradeSPD.get(choice)));
                                 for (Item item1 : Actor.getInstance().getWeaponBag()) {

                                     if (item1.equals(item)) {
                                         has = true;
                                         break;
                                     }
                                 }

                                 if(!has&&Actor.getInstance().getAttribute().getMoney()>=Integer.parseInt(tradePrice.get(choice)))
                                 {
                                     Actor.getInstance().getAttribute().setMoney(Actor.getInstance().getAttribute().getMoney()-Integer.parseInt(tradePrice.get(choice)));
                                     Actor.getInstance().getWeaponBag().add(item);
                                     buyState=buy.success;
                                 }
                                 else if(!has&&Actor.getInstance().getAttribute().getMoney()<Integer.parseInt(tradePrice.get(choice)))
                                     buyState=buy.poor;
                                 else
                                     buyState=buy.failure;

                                 break;
                             case ARMOR:
                                 Item item2 = new Item(tradeName.get(choice),tradeAttribute.get(choice),itemType,Integer.parseInt(tradeATK.get(choice)),Integer.parseInt(tradeDFC.get(choice)),Integer.parseInt(tradeSPD.get(choice)));


                                 for (Item item4 : Actor.getInstance().getArmorBag()) {

                                     if (item4.equals(item2)) {
                                         has = true;
                                         break;
                                     }
                                 }
                                 if(!has&&Actor.getInstance().getAttribute().getMoney()>=Integer.parseInt(tradePrice.get(choice)))
                                 {
                                     Actor.getInstance().getAttribute().setMoney(Actor.getInstance().getAttribute().getMoney()-Integer.parseInt(tradePrice.get(choice)));
                                     Actor.getInstance().getArmorBag().add(item2);
                                     buyState=buy.success;
                                 }
                                 else if(!has&&Actor.getInstance().getAttribute().getMoney()<Integer.parseInt(tradePrice.get(choice)))
                                     buyState=buy.poor;
                                 else
                                     buyState=buy.failure;
                                 break;
                             case DRUG:
                                 Item item3 = new Item(tradeName.get(choice),tradeAttribute.get(choice),Integer.parseInt(tradeHP.get(choice)),Integer.parseInt(tradeMP.get(choice)));
                                 for (Item item1 : Actor.getInstance().getDrugBag()) {
                                     if (item1.equals(item3)) {
                                         has = true;
                                         break;
                                     }
                                 }
                                 if(!has&&Actor.getInstance().getAttribute().getMoney()>=Integer.parseInt(tradePrice.get(choice)))
                                 {
                                     Actor.getInstance().getAttribute().setMoney(Actor.getInstance().getAttribute().getMoney()-Integer.parseInt(tradePrice.get(choice)));
                                     Actor.getInstance().getDrugBag().add(item3);
                                     buyState=buy.success;
                                 }
                                 else if(!has&&Actor.getInstance().getAttribute().getMoney()<Integer.parseInt(tradePrice.get(choice)))
                                     buyState=buy.poor;
                                 else
                                     buyState=buy.failure;
                                 break;
                             default:
                                 break;
                         }

                     }
                   if(buyState==buy.success)
                   {
                       ImageDraw log = new ImageDraw(300,100,dialogBox2);
                       TextDraw txt = new TextDraw(315,120,20,"Purchase Succeeds","times.ttf",Color.WHITE);
                       if(time<10)
                       {
                           w.draw((Drawable) log.getTransformable());
                           w.draw((Drawable) txt.getTransformable());
                       }
                       else
                       {
                           buyState=buy.not;
                           time=0;
                       }

                       time++;
                   }
                   else if(buyState==buy.failure)
                   {
                       ImageDraw log = new ImageDraw(300,100,dialogBox2);
                       TextDraw txt = new TextDraw(315,125,20,"Already Owned","times.ttf",Color.WHITE);
                       if(time<8)
                       {
                           w.draw((Drawable) log.getTransformable());
                           w.draw((Drawable) txt.getTransformable());
                       }
                       else
                       {
                           buyState=buy.not;
                           time=0;
                       }
                       time++;
                   }
                   else if(buyState==buy.poor)
                   {
                       ImageDraw log = new ImageDraw(300,100,dialogBox2);
                       TextDraw txt = new TextDraw(315,125,20,"Not Enough Money","times.ttf",Color.WHITE);
                       if(time<8)
                       {
                           w.draw((Drawable) log.getTransformable());
                           w.draw((Drawable) txt.getTransformable());
                       }
                       else
                       {
                           buyState=buy.not;
                           time=0;
                       }
                       time++;
                   }
                }
            }
        }

        else if(Control.SPACE&&getFront(direction).getKind()==MapKind.MISSION&&GameObject.checkTimeGap(300))
        {
            MapObject[][] map1= new MapObject[Library.clipY][Library.clipX];
            for (int i = 0; i < Library.clipY; i++)
                for (int j = 0; j < Library.clipX; j++)
                {
                    map1[i][j] = map[actorY + i][actorX + j];
                }
            getFront(direction).run(map1);
        }

        else if(Control.SPACE&&getFront(direction).getKind()==MapKind.FIGHT2&&GameObject.checkTimeGap(200))
        {
            getFront(direction).run();
        }
    }

    public void checkStory(RenderWindow w,Direction direction)
    {
        if(getFront(direction)!=null&&getFront(direction).getKind()==MapKind.STORY)
        {
            MapObject[][] map1= new MapObject[Library.clipY][Library.clipX];
            for (int i = 0; i < Library.clipY; i++)
                for (int j = 0; j < Library.clipX; j++)
                {
                    map1[i][j] = map[actorY + i][actorX + j];
                }
            getFront(direction).run(map1);
        }
    }

    public MapObject getFront(Direction direction)
    {
        switch (direction)
        {
            case UP:
                if(Actor.getInstance().getMapY()-1>=0)
                    return map[Actor.getInstance().getMapY() - 1][Actor.getInstance().getMapX()];
            case DOWN:
                if(Actor.getInstance().getMapY() + 1<map.length)
                    return map[Actor.getInstance().getMapY() + 1][Actor.getInstance().getMapX()];
            case LEFT:
                if(Actor.getInstance().getMapX()-1>=0)
                    return map[Actor.getInstance().getMapY()][Actor.getInstance().getMapX() - 1];
            case RIGHT:
                if(Actor.getInstance().getMapX()+1<map[0].length)
                    return map[Actor.getInstance().getMapY()][Actor.getInstance().getMapX() + 1];
        }
        return null;
    }

    public void allPaint(RenderWindow w, int row, int column,int x,int y)
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ImageDraw mapDraw = new ImageDraw(48*j,48*i, ImageLibrary.getIcon(map[i+x][j+y]));
                w.draw((Drawable)mapDraw.getTransformable());
            }
        }
    }

    public boolean checkFight(Direction direction)
    {
        if(getFront(direction)!=null&&getFront(direction).getKind()==MapKind.FIGHT)
            return true;
        else
            return false;
    }



    public MapType getType() {
        return type;
    }

    public void setType(MapType type) {
        this.type = type;
    }

    public boolean getInfo()
    {
        return info;
    }

    public MapObject getMapObject(int x,int y)
    {
        return map[x][y];
    }
}
