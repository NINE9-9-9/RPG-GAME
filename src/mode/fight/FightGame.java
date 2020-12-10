package mode.fight;

import draw.ImageDraw;
import draw.TextDraw;
import main.Control;
import map.*;
import mode.Direction;
import mode.LoadGame;
import mode.RpgGame;
import mode.SaveData;
import modeControl.GameMode;
import modeControl.GameObject;
import org.jsfml.graphics.*;
import org.jsfml.system.Vector2f;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FightGame extends GameObject implements Runnable{

    private int level;
    private int monsterNum;


    public int item = 1;
    public int skill = 1;
    public boolean skill1 = false;
    public boolean skill2 = false;
    public boolean skill3 = false;
    public boolean skill4 = false;
    public boolean skill5 = false;
    public boolean skill6 = false;
    public boolean skill7 = false;

    public boolean skillOneJ = false;
    public boolean skillTwoJ = false;
    public boolean skillThreeJ = false;
    public boolean skillFourJ = false;
    public boolean skillFiveJ = false;
    public boolean skillSixJ = false;
    public boolean skillSevenJ = false;

    private Thread t = new Thread(this);

    public static int tempX=0;
    public static int tempY=0;
    public static int tempPY=340;

    public static int skillOnePPX = 0;
    public static int skillTwoPPX = 0;
    public static int skillThreePPX = 0;
    public static int skillFourPPX = 0;
    public static int skillFivePPX = 0;
    public static int skillSixPPX = 0;
    public static int skillSevenPPX = 0;

    public static int skillOnePPY = 0;
    public static int skillTwoPPY = 0;
    public static int skillThreePPY = 0;
    public static int skillFourPPY = 0;
    public static int skillFivePPY = 0;
    public static int skillSixPPY = 0;
    public static int skillSevenPPY = 0;

    public static boolean itemJ = false;
    public static boolean itemJJ = false;
    public static int itemPX = 0;
    public static int itemPY = 0;

    public Monster monster;

    public boolean checkSP = true;

    public boolean overFSS = false;
    public boolean overFSS2 = false;

    public boolean ifChoose = false;
    private int choose=0;
    private int chooseDrug=0;
    private enum Stu {FIGHT,DRUG,ESCAPE}
    private Stu stu = null;
    public Battle battle = null;
    private int drugNum = 0;
    private Situation fight = Situation.CONTINUE;
    private boolean canChoose = false;

    private boolean isDrug=false;
    private boolean isEscape= false;
    public int wait = 0;
    public int receiveMonster = 0;
    public boolean trigger=false;

    private int monsterMove = 0;
    private int actorMove =0;

    private static Image mHpI = new Image();
    private static Image mpI = new Image();
    private static Image chooseBox = new Image();
    private static Image victory = new Image();
    private static Image defeat = new Image();

    static {
        try {
            mHpI.loadFromFile(Paths.get("resource/picture/hp.png"));
            mpI.loadFromFile(Paths.get("resource/picture/mp.png"));
            chooseBox.loadFromFile(Paths.get("resource/picture/window18.png"));
            victory.loadFromFile(Paths.get("resource/picture/victory.png"));
            defeat.loadFromFile(Paths.get("resource/picture/defeat.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FightGame(int level, int monsterNum)
    {
        this.level=level;
        this.monsterNum=monsterNum;
        monster=new Monster(monsterNum);
        battle = new Battle();
        checkSP = battle.checkSpeed(monster);
        t.start();
        super.rpgStop();
        switch (monsterNum)
        {
            case 0:
                super.fight6Play();
                break;
            case 1:
                super.fight7Play();
                break;
            case 2:
                super.fight4Play();
                break;
            case 3:
                super.fight5Play();
                break;
            case 4:
                super.fight8Play();
                break;
            case 5:
                super.fight9Play();
                break;
            case 7:
                super.fight10Play();
                break;
            case 9:
                super.fight3Play();
                break;
            case 6:
                super.fightPlay();
                break;
            default:
                super.fight2Play();
                break;
        }

    }

    @Override
    public void paint(RenderWindow w) {


        w.clear();
        keyResponse();
        Image backG = new Image();
        backG.create(StaticValue.Background.get(level*2-1));
        ImageDraw background = new ImageDraw(0,0,backG);
        w.draw((Drawable)background.getTransformable());

        Image backG2 = new Image();
        backG2.create(StaticValue.Background.get(level*2-2));
        ImageDraw background2 = new ImageDraw(0,0,backG2);
        w.draw((Drawable)background2.getTransformable());

        //Draw Background
        Image board = new Image();
        board.create(StaticValue.Board);
        ImageDraw boardDraw = new ImageDraw(0,332,board);
        w.draw((Drawable)boardDraw.getTransformable());

        Image mainChr = new Image();
        mainChr.create(StaticValue.MainChr.getSubimage(tempX,tempY,64,64));
        ImageDraw mainChrDraw = new ImageDraw(550,200,mainChr);
        mainChrDraw.getTransformable().setPosition(550-actorMove*200,200);
        w.draw((Drawable)mainChrDraw.getTransformable());

        TextDraw mLv = new TextDraw(20,30,27,"LV. "+monster.lv,"times.ttf",Color.GREEN);
        w.draw((Drawable)mLv.getTransformable());


        Image monsterImage = new Image();
        if(monsterNum<=-1)
            monsterImage.create(StaticValue.Monster.get(0));
        else
            monsterImage.create(StaticValue.Monster.get(monsterNum));
        ImageDraw monsterDraw = new ImageDraw(100,100,monsterImage);
        monsterDraw.getTransformable().setPosition(100+monsterMove*200,100);
        w.draw((Drawable)monsterDraw.getTransformable());

        RectangleShape monsterHp = new RectangleShape(new Vector2f(250*(float)((monster.hp/(monster.HP*1.0))),20));
        ImageDraw mHpDraw = new ImageDraw(100,40,mHpI);
        TextDraw mHpText = new TextDraw(150,10,20,"HP: "+monster.hp+" / "+monster.HP,"times.ttf",new Color(240,15,77));
        mHpText.setStyle();
        monsterHp.setFillColor(Color.RED);
        monsterHp.setPosition(100,40);
        w.draw(monsterHp);
        w.draw((Drawable) mHpDraw.getTransformable());
        w.draw((Drawable)mHpText.getTransformable());


        RectangleShape hp = new RectangleShape(new Vector2f(250*(float)(Actor.getInstance().getAttribute().getHpNow()/(Actor.getInstance().getAttribute().getHp()*1.0)),20));
        ImageDraw hpDraw = new ImageDraw(450,40,mHpI);
        TextDraw hpText = new TextDraw(500,10,20,"HP: "+Actor.getInstance().getAttribute().getHpNow()+" / "+ Actor.getInstance().getAttribute().getHp(),"times.ttf",new Color(240,15,77));
        hpText.setStyle();
        hp.setFillColor(Color.RED);
        hp.setPosition(450,40);
        w.draw(hp);
        w.draw((Drawable) hpDraw.getTransformable());
        w.draw((Drawable)hpText.getTransformable());

        RectangleShape mp = new RectangleShape(new Vector2f(250*(float)(Actor.getInstance().getAttribute().getMpNow()/(Actor.getInstance().getAttribute().getMp()*1.0)),20));
        ImageDraw mpDraw = new ImageDraw(450,90,mpI);
        TextDraw mpText = new TextDraw(500,60,20,"MP: "+Actor.getInstance().getAttribute().getMpNow()+" / "+ Actor.getInstance().getAttribute().getMp(),"times.ttf",new Color(10,16,245));
        mpText.setStyle();
        mp.setFillColor(Color.BLUE);
        mp.setPosition(450,90);
        w.draw(mp);
        w.draw((Drawable) mpDraw.getTransformable());
        w.draw((Drawable)mpText.getTransformable());

        TextDraw lv = new TextDraw(650,5,27,"LV. "+Actor.getInstance().getAttribute().getLv(),"times.ttf",Color.GREEN);
        w.draw((Drawable)lv.getTransformable());


        TextDraw fight1 = new TextDraw(90,335,24,"FIGHT","times.ttf",Color.WHITE);
        TextDraw drug = new TextDraw(90,365,24,"DRUG","times.ttf",Color.WHITE);
        TextDraw escape = new TextDraw(80,395,24,"ESCAPE","times.ttf",Color.WHITE);
        w.draw((Drawable)fight1.getTransformable());
        w.draw((Drawable)drug.getTransformable());
        w.draw((Drawable)escape.getTransformable());

        String str12 = "Normal Attack";
        String str13 = "Endless Fanaticism";
        String str14 = "Fire Strike";
        String str15 = "Apollo's Anger";
        String str16 = "Practical & Fast.  Physical";
        String str17 = "Enhance ability.    Physical";
        String str18 = "Strength of fire.    Magical  -100MP";
        String str19 = "Very powerful!     Magical  -180MP";
        if(!ifChoose)
        {
            ImageDraw boxDraw = new ImageDraw(50,340+choose*30,chooseBox);
            w.draw((Drawable)boxDraw.getTransformable());

        }
        else if(stu == Stu.FIGHT||stu==Stu.DRUG)
        {
            ImageDraw boxDraw = new ImageDraw(270,340+chooseDrug*22,chooseBox);
            w.draw((Drawable)boxDraw.getTransformable());
        }
        else if(stu ==Stu.ESCAPE)
        {
            if(isEscape)
            {
                fight=Situation.ESCAPE;
                TextDraw draw = new TextDraw(440,365,24,"<Escape Success>","times.ttf",Color.GREEN);
                w.draw((Drawable)draw.getTransformable());
            }
            else
            {
                TextDraw draw = new TextDraw(440,365,24,"<Escape Failure>","times.ttf",Color.GREEN);
                w.draw((Drawable)draw.getTransformable());


                if(!isDrug)
                {
                    receiveMonster = battle.monsterSkill(monster);
                    switch (receiveMonster) {
                        case 5: {
                            skill5 = true;
                            break;
                        }
                        case 6: {
                            skill6 = true;
                            break;
                        }
                        case 7: {
                            skill7 = true;
                            break;
                        }
                        default:
                            throw new IllegalArgumentException("Unexpected value: " + receiveMonster);
                    }
                }
                isDrug=true;
                overFSS2=true;


            }
        }
        switch (choose)
        {
            case 0:
                Image btn1 = new Image();
                btn1.create(StaticValue.Btn.getSubimage(32,192,32,32));
                ImageDraw btn1Draw = new ImageDraw(270,340,btn1);
                btn1Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn1Draw.getTransformable());

                Image btn2 = new Image();
                btn2.create(StaticValue.Btn.getSubimage(256, 128, 32, 32));
                ImageDraw btn2Draw = new ImageDraw(270,362,btn2);
                btn2Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn2Draw.getTransformable());

                Image btn3 = new Image();
                btn3.create(StaticValue.Btn.getSubimage(0, 128, 32, 32));
                ImageDraw btn3Draw = new ImageDraw(270,384,btn3);
                btn3Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn3Draw.getTransformable());

                Image btn4 = new Image();
                btn4.create(StaticValue.Btn.getSubimage(160, 0, 32, 32));
                ImageDraw btn4Draw = new ImageDraw(270,406,btn4);
                btn4Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn4Draw.getTransformable());

                TextDraw str1Draw = new TextDraw(300,338,18,str12,"times.ttf",Color.GREEN);
                w.draw((Drawable)str1Draw.getTransformable());
                TextDraw str2Draw = new TextDraw(300,360,18,str13,"times.ttf",Color.GREEN);
                w.draw((Drawable)str2Draw.getTransformable());
                TextDraw str3Draw = new TextDraw(300,382,18,str14,"times.ttf",Color.GREEN);
                w.draw((Drawable)str3Draw.getTransformable());
                TextDraw str4Draw = new TextDraw(300,404,18,str15,"times.ttf",Color.GREEN);
                w.draw((Drawable)str4Draw.getTransformable());
                TextDraw str5Draw = new TextDraw(450,340,16,str16,"times.ttf",Color.WHITE);
                w.draw((Drawable)str5Draw.getTransformable());
                TextDraw str6Draw = new TextDraw(450,362,16,str17,"times.ttf",Color.WHITE);
                w.draw((Drawable)str6Draw.getTransformable());
                TextDraw str7Draw = new TextDraw(450,384,16,str18,"times.ttf",Color.WHITE);
                w.draw((Drawable)str7Draw.getTransformable());
                TextDraw str8Draw = new TextDraw(450,406,16,str19,"times.ttf",Color.WHITE);
                w.draw((Drawable)str8Draw.getTransformable());

                Image btn5 = new Image();
                btn5.create(StaticValue.Btn.getSubimage(288, 64, 32, 32));
                ImageDraw btn5Draw = new ImageDraw(680,362,btn5);
                btn5Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn5Draw.getTransformable());

                Image btn6 = new Image();
                btn6.create(StaticValue.Btn.getSubimage(320, 64, 32, 32));
                ImageDraw btn6Draw = new ImageDraw(702,362,btn6);
                btn6Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn6Draw.getTransformable());

                Image btn7 = new Image();
                btn7.create(StaticValue.Btn.getSubimage(352, 64, 32, 32));
                ImageDraw btn7Draw = new ImageDraw(724,362,btn7);
                btn7Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn7Draw.getTransformable());

                Image btn8 = new Image();
                btn8.create(StaticValue.Btn.getSubimage(352, 96, 32, 32));
                ImageDraw btn8Draw = new ImageDraw(680,384,btn8);
                btn8Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn8Draw.getTransformable());

                Image btn9 = new Image();
                btn9.create(StaticValue.Btn.getSubimage(320, 64, 32, 32));
                ImageDraw btn9Draw = new ImageDraw(680,406,btn9);
                btn9Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                w.draw((Drawable)btn9Draw.getTransformable());
                break;
            case 1:
                int num = 0;
                boolean ifEmpty = true;
                for(Item item : Actor.getInstance().getDrugBag())
                {
                    Image btn10 = new Image();
                    btn10.create(StaticValue.Btn.getSubimage(192, 352, 32, 32));
                    ImageDraw btn10Draw = new ImageDraw(270,340+num*22,btn10);
                    btn10Draw.getTransformable().setScale(new Vector2f((float) 0.6,(float) 0.6));
                    w.draw((Drawable)btn10Draw.getTransformable());

                    TextDraw str9Draw = new TextDraw(300,338+num*22,18,item.getName(),"times.ttf",Color.GREEN);
                    w.draw((Drawable)str9Draw.getTransformable());
                    TextDraw str10Draw = new TextDraw(450,340+num*22,16,item.getAttribute(),"times.ttf",Color.WHITE);
                    w.draw((Drawable)str10Draw.getTransformable());
                    num++;
                    ifEmpty=false;
                }
                if(ifEmpty)
                {
                    TextDraw str9Draw = new TextDraw(440,365,24,"<Empty>","times.ttf",Color.GREEN);
                    w.draw((Drawable)str9Draw.getTransformable());
                }
                break;
            default:
                break;
        }

        if((skill1 && checkSP) || (overFSS && skill1)) {
            Image skill1I = new Image();
            skill1I.create(StaticValue.skill1.getSubimage(skillOnePPX,skillOnePPY,192,192));
            ImageDraw skill1Draw = new ImageDraw(120,130,skill1I);
            w.draw((Drawable)skill1Draw.getTransformable());skillOneJ=true;
            skillOneJ=true;


        }
        else if((skill2 && checkSP) || (overFSS && skill2))
        {
            Image skill2I = new Image();
            skill2I.create(StaticValue.skill2.getSubimage(skillTwoPPX,skillTwoPPY,192,192));
            ImageDraw skill2Draw = new ImageDraw(120,130,skill2I);
            w.draw((Drawable)skill2Draw.getTransformable());

            skillTwoJ=true;

        }
        else if((skill3 && checkSP) || (overFSS && skill3))
        {
            Image skill1I = new Image();
            skill1I.create(StaticValue.skill3.getSubimage(skillThreePPX,skillThreePPY,192,192));
            ImageDraw skill1Draw = new ImageDraw(120,130,skill1I);
            w.draw((Drawable)skill1Draw.getTransformable());
            skillThreeJ=true;

        }
        else if((skill4 && checkSP) || (overFSS && skill4))
        {
            Image skill1I = new Image();
            skill1I.create(StaticValue.skill4.getSubimage(skillFourPPX,skillFourPPY,192,192));
            ImageDraw skill1Draw = new ImageDraw(120,130,skill1I);
            w.draw((Drawable)skill1Draw.getTransformable());


            skillFourJ=true;

        }
        else if(skill5 && !checkSP && receiveMonster == 5||overFSS2&&skill5&& receiveMonster == 5)
        {
            Image skill1I = new Image();
            skill1I.create(StaticValue.skill5.getSubimage(skillFivePPX,skillFivePPY,192,192));
            ImageDraw skill1Draw = new ImageDraw(480,130,skill1I);
            w.draw((Drawable)skill1Draw.getTransformable());
            skillFiveJ=true;

        }
        else if(skill6 && !checkSP && receiveMonster == 6||overFSS2&&skill6&& receiveMonster == 6)
        {
            Image skill1I = new Image();
            skill1I.create(StaticValue.skill6.getSubimage(skillSixPPX, skillSixPPY, 192, 192));
            ImageDraw skill1Draw = new ImageDraw(480, 130, skill1I);
            w.draw((Drawable) skill1Draw.getTransformable());

            skillSixJ = true;

        }
        else if(skill7 && !checkSP && receiveMonster == 7||overFSS2&&skill7&& receiveMonster == 7)
        {
            Image skill1I = new Image();
            skill1I.create(StaticValue.skill7.getSubimage(skillSevenPPX,skillSevenPPY,192,192));
            ImageDraw skill1Draw = new ImageDraw(480,130,skill1I);
            w.draw((Drawable)skill1Draw.getTransformable());


            skillSevenJ=true;

        }
        Image drugI = new Image();
        drugI.create(StaticValue.item.getSubimage(itemPX,itemPY,192,192));
        ImageDraw drugDraw = new ImageDraw(550,200,drugI);
        drugDraw.getTransformable().setScale(new Vector2f((float) 0.5,(float) 0.5));
        if(itemJ)
        {
            w.draw((Drawable) drugDraw.getTransformable());
            itemJJ=true;
        }

        if(fight==Situation.VICTORY)
        {
            super.allStop();
            if(wait==1)
                super.fightVPlay();
            if(wait>5)
            {
                ImageDraw victoryDraw = new ImageDraw(0,0,victory);
                w.draw((Drawable)victoryDraw.getTransformable());
            }

            wait++;
            if(wait== 30)
            {
                battle.getEG(monster);
                ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
                ArrayList<Map> maps2 =  GameMode.getInstance().saveData.getMapLayer2();
                switch (monsterNum)
                {
                    case -1:
                        maps.get(0).editMap(35,19,new MapObject(MapKind.ROAD,2020));
                        maps.get(0).editMap(35,20,new MapObject(MapKind.ROAD,2030));
                        maps.get(0).editMap(35,18,new MapEvent(1,2010,"cccM"));
                        maps2.get(0).editMap(35,19,new MapObject(MapKind.ROAD,0000));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(0),
                                maps2.get(0),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 7:
                        maps.get(4).editMap(45,20,new MapObject(MapKind.ROAD,40100));
                        maps2.get(4).editMap(45,20,new MapObject(MapKind.ROAD,0000));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(4),
                                maps2.get(4),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;

                    case 5:
                        maps.get(3).editMap(12,24,new MapDoor(16,0,11,0,15,0,192,20081,Direction.RIGHT));
                        maps.get(3).editMap(13,24,new MapDoor(16,0,12,0,16,0,192,20083,Direction.RIGHT));
                        maps2.get(3).editMap(12,24,new MapObject(MapKind.ROAD,0000));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(3),
                                maps2.get(3),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 6:
                        maps.get(16).editMap(10,14,new MapObject(MapKind.ROAD,30037));
                        maps2.get(16).editMap(10,14,new MapObject(MapKind.ROAD,0000));
                        maps.get(16).editMap(10,13,new MapObject(MapKind.ROAD,30036));
                        maps.get(16).editMap(10,15,new MapObject(MapKind.ROAD,30038));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(16),
                                maps2.get(16),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 8:
                        maps.get(11).editMap(20,16,new MapObject(MapKind.ROAD,40114));
                        maps2.get(11).editMap(20,16,new MapObject(MapKind.ROAD,0000));
                        maps.get(11).editMap(20,15,new MapObject(MapKind.ROAD,40143));
                        maps.get(11).editMap(20,17,new MapObject(MapKind.ROAD,40114));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(11),
                                maps2.get(11),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 10:
                        maps.get(10).editMap(28,8,new MapObject(MapKind.BARRIER,80100));
                        maps.get(10).editMap(13,8,new MapStory(7,80100));
                        maps2.get(10).editMap(13,8,new MapObject(MapKind.BARRIER,120));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(10),
                                maps2.get(10),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 11:
                        maps.get(10).editMap(13,8,new MapObject(MapKind.BARRIER,80100));
                        maps.get(10).editMap(13,32,new MapStory(8,80100));
                        maps2.get(10).editMap(13,32,new MapObject(MapKind.BARRIER,120));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(10),
                                maps2.get(10),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 12:
                        maps.get(10).editMap(13,32,new MapObject(MapKind.BARRIER,80100));
                        maps.get(10).editMap(28,32,new MapStory(9,80100));
                        maps2.get(10).editMap(28,32,new MapObject(MapKind.BARRIER,119));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(10),
                                maps2.get(10),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 13:
                        maps.get(10).editMap(28,32,new MapObject(MapKind.BARRIER,80100));
                        maps.get(10).editMap(21,20,new MapStory(10,80100));
                        maps2.get(10).editMap(21,20,new MapObject(MapKind.BARRIER,121));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(10),
                                maps2.get(10),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                    case 9:
                        maps.get(10).editMap(21,20,new MapStory(11,80122));
                        maps2.get(10).editMap(21,20,new MapObject(MapKind.BARRIER,122));
                        GameMode.getInstance().saveData=new SaveData(maps,
                                maps2,
                                maps.get(10),
                                maps2.get(10),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;


                    default:
                        GameMode.getInstance().saveData=new SaveData(maps,
                                 GameMode.getInstance().saveData.getMapLayer2(),
                                 GameMode.getInstance().saveData.getCurrentMap(),
                                 GameMode.getInstance().saveData.getCurrentMapLayer2(),
                                 GameMode.getInstance().saveData.getActorX(),
                                 GameMode.getInstance().saveData.getActorY(),
                                 GameMode.getInstance().saveData.getX(),
                                 GameMode.getInstance().saveData.getY(),
                                 GameMode.getInstance().saveData.getMapX(),
                                 GameMode.getInstance().saveData.getMapY(),
                                 GameMode.getInstance().saveData.getDirection(),
                                 GameMode.getInstance().saveData.getLastTime(),
                                Actor.getInstance().getAttribute(),
                                 GameMode.getInstance().saveData.getWeaponBag(),
                                 GameMode.getInstance().saveData.getArmorBag(),
                                 GameMode.getInstance().saveData.getDrugBag(),
                                 GameMode.getInstance().saveData.getWeapon(),
                                 GameMode.getInstance().saveData.getArmor());
                        break;
                }

                t.stop();
                new RpgGame( GameMode.getInstance().saveData);
                if(monsterNum==6)
                {
                    allStop();
                    super.rpg2Play();
                }
            }

        }
        else if(fight==Situation.DEFEAT)
        {
            super.allStop();
            if(wait==1)
                super.fightDPlay();
            if(wait>5)
            {
                ImageDraw defeatDraw = new ImageDraw(0,0,defeat);
                w.draw((Drawable)defeatDraw.getTransformable());
            }
            wait++;
            if(wait==45)
            {
                ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
                switch (monsterNum)
                {
                    case 5:
                        maps.get(3).editMap(12,22,new MapFight(20081,1,5));
                        break;
                    case 6:
                        maps.get(16).editMap(10,14,new MapFight(30037,2,6));
                        break;
                    case 7:
                        maps.get(4).editMap(45,20,new MapFight(40100,3,7));
                        break;
                    case 8:
                        maps.get(11).editMap(20,16,new MapFight(40114,3,8));
                        break;
                    case 10:
                        maps.get(10).editMap(28,8,new MapFight(80100,4,10));
                        break;
                    case 11:
                        maps.get(10).editMap(13,8,new MapFight(80100,4,11));
                        break;
                    case 12:
                        maps.get(10).editMap(13,32,new MapFight(80100,4,12));
                        break;
                    case 13:
                        maps.get(10).editMap(28,32,new MapFight(80100,4,13));
                        break;
                    case 9:
                        maps.get(10).editMap(21,20,new MapFight(80100,4,9));
                        break;

                    default:
                        break;
                }
                Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHp());
                Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMp());
                Actor.getInstance().getAttribute().setMoney(Actor.getInstance().getAttribute().getMoney()-50);
                if(Actor.getInstance().getAttribute().getMoney()<0)
                    Actor.getInstance().getAttribute().setMoney(0);
                GameMode.getInstance().saveData=new SaveData(maps,
                         GameMode.getInstance().saveData.getMapLayer2(),
                         GameMode.getInstance().saveData.getMapAll().get(1),
                         GameMode.getInstance().saveData.getMapLayer2().get(1),
                        3,
                        8,
                        384,
                        192,
                        11,
                        12,
                        Direction.UP,
                         GameMode.getInstance().saveData.getLastTime(),
                        Actor.getInstance().getAttribute(),
                         GameMode.getInstance().saveData.getWeaponBag(),
                         GameMode.getInstance().saveData.getArmorBag(),
                         GameMode.getInstance().saveData.getDrugBag(),
                         GameMode.getInstance().saveData.getWeapon(),
                         GameMode.getInstance().saveData.getArmor());
                t.stop();
                new RpgGame( GameMode.getInstance().saveData);
            }
        }
        else if(fight==Situation.ESCAPE)
        {
            super.allStop();

            wait++;
            if(wait==15)
            {
                ArrayList<Map> maps =  GameMode.getInstance().saveData.getMapAll();
                switch (monsterNum)
                {
                    case 5:
                        maps.get(3).editMap(12,22,new MapFight(20081,1,5));
                        break;
                    case 6:
                        maps.get(16).editMap(10,14,new MapFight(30037,2,6));
                        break;
                    case 7:
                        maps.get(4).editMap(45,20,new MapFight(40100,3,7));
                        break;
                    case 8:
                        maps.get(11).editMap(20,16,new MapFight(40114,3,8));
                        break;
                    case 10:
                        maps.get(10).editMap(28,8,new MapFight(80100,4,10));
                        break;
                    case 11:
                        maps.get(10).editMap(13,8,new MapFight(80100,4,11));
                        break;
                    case 12:
                        maps.get(10).editMap(13,32,new MapFight(80100,4,12));
                        break;
                    case 13:
                        maps.get(10).editMap(28,32,new MapFight(80100,4,13));
                        break;
                    case 9:
                        maps.get(10).editMap(21,20,new MapFight(80100,4,9));
                        break;

                    default:
                        break;
                }
                GameMode.getInstance().saveData=new SaveData(maps,
                         GameMode.getInstance().saveData.getMapLayer2(),
                         GameMode.getInstance().saveData.getMapAll().get(1),
                         GameMode.getInstance().saveData.getMapLayer2().get(1),
                        3,
                        8,
                        384,
                        192,
                        11,
                        12,
                        Direction.UP,
                         GameMode.getInstance().saveData.getLastTime(),
                        Actor.getInstance().getAttribute(),
                         GameMode.getInstance().saveData.getWeaponBag(),
                         GameMode.getInstance().saveData.getArmorBag(),
                         GameMode.getInstance().saveData.getDrugBag(),
                         GameMode.getInstance().saveData.getWeapon(),
                         GameMode.getInstance().saveData.getArmor());
                t.stop();
                new RpgGame( GameMode.getInstance().saveData);
            }
        }
    }

    @Override
    protected void keyResponse()
    {
        if(Control.UP&&checkTimeGap(100))
        {


            if(!ifChoose)
            {
                choose--;
                if(choose==-1)
                    choose=2;
            }
            else if(stu==Stu.FIGHT)
            {
                if(canChoose)
                {
                    chooseDrug--;
                    if (chooseDrug==-1)
                        chooseDrug = 3;
                }

            }
            else if(stu==Stu.DRUG)
            {
                if(canChoose)
                {

                        chooseDrug--;
                    if(chooseDrug==-1&&Actor.getInstance().getDrugBag().size()!=0)
                        chooseDrug=Actor.getInstance().getDrugBag().size()-1;
                    else if(chooseDrug==-1)
                        chooseDrug=0;
                }

            }

        }
        else if (Control.DOWN && checkTimeGap(100))
        {

            if(!ifChoose)
            {
                choose++;
                if(choose==3)
                    choose=0;
            }
            else if(stu==Stu.FIGHT)
            {
                if(canChoose)
                {
                    chooseDrug++;
                    if (chooseDrug == 4)
                        chooseDrug = 0;
                }

            }
            else if(stu==Stu.DRUG)
            {
                if(canChoose)
                {
                    if(Actor.getInstance().getDrugBag().size()!=0)
                       chooseDrug++;
                    if(chooseDrug==Actor.getInstance().getDrugBag().size())
                        chooseDrug=0;
                }

            }
        }
        if (Control.SPACE && checkTimeGap(200)) {
            if (!ifChoose)
            {
                ifChoose=true;
                canChoose=true;
                if(choose==0)
                {
                    stu=Stu.FIGHT;

                }
                else if(choose==1)
                {
                    stu=Stu.DRUG;

                }
                else if(choose==2)
                {

                    stu=Stu.ESCAPE;
                    isEscape=battle.escape(monster);
                }
            }
            else {

                if(canChoose)
                {
                    if (stu==Stu.FIGHT) {

                        if (chooseDrug == 0) {
                            skill1 = true;
                            canChoose=false;
                            receiveMonster = battle.monsterSkill(monster);

                            if (!checkSP) {
                                overFSS = false;
                            }
                            else
                                overFSS2=false;

                            switch (receiveMonster) {
                                case 5: {
                                    skill5 = true;
                                    break;
                                }
                                case 6: {
                                    skill6 = true;
                                    break;
                                }
                                case 7: {
                                    skill7 = true;

                                    break;
                                }
                                default:
                                    throw new IllegalArgumentException("Unexpected value: " + receiveMonster);
                            }

                        }
                        else if (chooseDrug == 1)
                        {
                            canChoose=false;
                            skill2 = true;
                            receiveMonster = battle.monsterSkill(monster);


                            if (!checkSP) {
                                overFSS = false;
                            }
                            else
                                overFSS2=false;


                            switch (receiveMonster) {
                                case 5: {
                                    skill5 = true;

                                    break;
                                }
                                case 6: {
                                    skill6 = true;

                                    break;
                                }
                                case 7: {
                                    skill7 = true;

                                    break;
                                }
                                default:
                                    throw new IllegalArgumentException("Unexpected value: " + receiveMonster);
                            }

                        }
                        else if (chooseDrug == 2 && Actor.getInstance().getAttribute().getMpNow() >= 100)
                        {
                            canChoose=false;
                            skill3 = true;
                            receiveMonster = battle.monsterSkill(monster);

                            if (!checkSP) {
                                overFSS = false;
                            }
                            else
                                overFSS2=false;

                            switch (receiveMonster) {
                                case 5: {
                                    skill5 = true;

                                    break;
                                }
                                case 6: {
                                    skill6 = true;

                                    break;
                                }
                                case 7: {
                                    skill7 = true;

                                    break;
                                }
                                default:
                                    throw new IllegalArgumentException("Unexpected value: " + receiveMonster);
                            }

                        }
                        else if (chooseDrug == 3 && Actor.getInstance().getAttribute().getMpNow() >= 180)
                        {
                            canChoose=false;
                            skill4 = true;
                            receiveMonster = battle.monsterSkill(monster);

                            if (!checkSP) {
                                overFSS = false;
                            }
                            else
                                overFSS2=false;

                            switch (receiveMonster) {
                                case 5: {
                                    skill5 = true;
                                    break;
                                }
                                case 6: {
                                    skill6 = true;
                                    break;
                                }
                                case 7: {
                                    skill7 = true;
                                    break;
                                }
                                default:
                                    throw new IllegalArgumentException("Unexpected value: " + receiveMonster);
                            }

                        } else if (skill == 5) {
                            skill5 = true;


                        } else if (skill == 6) {
                            skill6 = true;


                        } else if (skill == 7) {
                            skill7 = true;


                        } else {
                            skill1 = true;
                            canChoose=false;
                            battle.attackPlayer(monster, 1);
                            receiveMonster = battle.monsterSkill(monster);

                            if (!checkSP) {
                                overFSS = false;
                            }
                            else
                                overFSS2=false;


                            switch (receiveMonster) {
                                case 5: {
                                    skill5 = true;

                                    break;
                                }
                                case 6: {
                                    skill6 = true;

                                    break;
                                }
                                case 7: {
                                    skill7 = true;

                                    break;
                                }
                                default:
                                    throw new IllegalArgumentException("Unexpected value: " + receiveMonster);
                            }

                        }

                    }
                    else if (stu==Stu.DRUG)
                    {
                        if(Actor.getInstance().getDrugBag().size()!=0)
                        {
                            canChoose=false;
                            battle.useItem(chooseDrug);
                            itemJ=true;
                        }
                        else
                        {
                            try {
                                Thread.sleep(200);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            ifChoose=false;
                        }

                    }
                }
                }

        }
        if(Control.ESC)
        {
            ifChoose=false;
            chooseDrug=0;
        }

    }

    @Override
    public synchronized void run() {
        while(true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            };

            if(skillOneJ) {
                for(int i=0;i<4;i++) {
                    for(int j=0;j<4;j++) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        if((i+j)%2==0)
                            actorMove=1;
                        FightGame.skillOnePPX+=192;
                        System.out.println(skillOnePPX+" "+skillOnePPY+" "+i+" "+j+" "+skillOneJ);
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    FightGame.skillOnePPX=0;
                    FightGame.skillOnePPY+=192;
                }
                actorMove=0;
                battle.attackPlayer(monster,1);

                skillOnePPX=0;
                skillOnePPY=0;
                skill1=false;
                skillOneJ=false;
                fight=battle.checkBattle(monster);
                if(!checkSP) {
                    overFSS = false;
                    ifChoose=false;
                    chooseDrug=0;
                }
                else if(fight==Situation.CONTINUE)
                    overFSS2=true;

            }
            else if(skillTwoJ)
            {
                for(int i=0;i<5;i++) {
                    for(int j=0;j<4;j++) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        FightGame.skillTwoPPX+=192;
                        if((i+j)%2==0)
                            actorMove=1;
                        System.out.println(skillTwoPPX+" "+skillTwoPPY+" "+i+" "+j+" "+skillTwoJ);
                    }


                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }

                    FightGame.skillTwoPPX=0;
                    FightGame.skillTwoPPY+=192;
                }
                battle.attackPlayer(monster,2);
                actorMove=0;
                skillTwoPPX=0;
                skillTwoPPY=0;
                skill2=false;
                skillTwoJ=false;
                fight=battle.checkBattle(monster);
                if(!checkSP) {
                    overFSS = false;
                    ifChoose=false;
                    chooseDrug=0;
                }
                else if(fight==Situation.CONTINUE)
                    overFSS2=true;


                ifChoose=false;
            }
            else if(skillThreeJ)
            {

                for(int i=0;i<5;i++) {
                    for(int j=0;j<4;j++) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        FightGame.skillThreePPX+=192;
                        if((i+j)%2==0)
                            actorMove=1;
                        System.out.println(skillThreePPX+" "+skillThreePPY+" "+i+" "+j+" "+skillThreeJ);
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    FightGame.skillThreePPX=0;
                    FightGame.skillThreePPY+=192;
                }
                actorMove=0;
                battle.attackPlayer(monster,3);
                skillThreePPX=0;
                skillThreePPY=0;
                skill3=false;
                skillThreeJ=false;

                fight=battle.checkBattle(monster);
                if(!checkSP) {
                    overFSS = false;
                    ifChoose=false;
                    chooseDrug=0;
                }
                else if(fight==Situation.CONTINUE)
                    overFSS2=true;

            }
            else if(skillFourJ)
            {

                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        FightGame.skillFourPPX+=192;
                        if((i+j)%2==0)
                            actorMove=1;

                        System.out.println(skillFourPPX+" "+skillFourPPY+" "+i+" "+j+" "+skillFourJ);
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    FightGame.skillFourPPX=0;
                    FightGame.skillFourPPY+=192;
                }
                actorMove=0;

                battle.attackPlayer(monster,4);
                skillFourPPX=0;
                skillFourPPY=0;
                skill4=false;
                skillFourJ=false;

                fight=battle.checkBattle(monster);
                if(!checkSP) {
                    overFSS = false;
                    ifChoose=false;
                    chooseDrug=0;
                }
                else if(fight==Situation.CONTINUE)
                    overFSS2=true;


            }
            else if(itemJJ) {

                for(int i=0;i<3;i++) {
                    for(int j=0;j<4;j++) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        FightGame.itemPX+=192;

                        System.out.println(itemPX+" "+itemPY+" "+i+" "+j+" "+itemJ);
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    FightGame.itemPX=0;
                    FightGame.itemPY+=192;


                }

                isDrug=true;

                itemPX=0;
                itemPY=0;
                itemJ=false;
                itemJJ=false;

                receiveMonster = battle.monsterSkill(monster);
                switch (receiveMonster) {
                    case 5: {
                        skill5 = true;
                        break;
                    }
                    case 6: {
                        skill6 = true;
                        break;
                    }
                    case 7: {
                        skill7 = true;
                        break;
                    }
                    default:
                        throw new IllegalArgumentException("Unexpected value: " + receiveMonster);
                }
                overFSS2 = true;


            }
            if(skillFiveJ) {

                for(int i=0;i<5;i++) {
                    for(int j=0;j<4;j++) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        FightGame.skillFivePPX+=192;
                        if((i+j)%2==0)
                            monsterMove=1;
                        System.out.println(skillFivePPX+" "+skillFivePPY+" "+i+" "+j+" "+skillFiveJ);
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    FightGame.skillFivePPX=0;
                    FightGame.skillFivePPY+=192;

                }
                monsterMove=0;
                battle.AttackMonster(monster,5);
                skillFivePPX=0;
                skillFivePPY=0;
                skill5=false;
                skillFiveJ=false;

                fight=battle.checkBattle(monster);
                if(!checkSP&&fight==Situation.CONTINUE&&!isDrug) {
                    overFSS=true;
                }

                if(checkSP||isDrug)
                {
                    ifChoose=false;
                    chooseDrug=0;
                }

                isDrug=false;

            }
            else if(skillSixJ) {

                for(int i=0;i<5;i++) {
                    for(int j=0;j<4;j++) {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        FightGame.skillSixPPX+=192;
                        if((i+j)%2==0)
                            monsterMove=1;
                        System.out.println(skillSixPPX+" "+skillSixPPY+" "+i+" "+j+" "+skillSixJ);
                    }

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    FightGame.skillSixPPX=0;
                    FightGame.skillSixPPY+=192;


                }
                monsterMove=0;
                battle.AttackMonster(monster,6);
                skillSixPPX=0;
                skillSixPPY=0;
                skill6=false;
                skillSixJ=false;

                fight=battle.checkBattle(monster);
                if(!checkSP&&fight==Situation.CONTINUE&&!isDrug) {
                    overFSS=true;
                }

                if(checkSP||isDrug) {
                    ifChoose = false;
                    chooseDrug=0;
                }
                isDrug=false;

            }
            else if(skillSevenJ)
            {
                for (int i = 0; i < 6; i++)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        try {
                            Thread.sleep(200);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        if((i+j)%2==0)
                            monsterMove=1;
                        FightGame.skillSevenPPX += 192;
                        System.out.println(skillSevenPPX + " " + skillSevenPPY + " " + i + " " + j + " " + skillSevenJ);
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    FightGame.skillSevenPPX = 0;
                    FightGame.skillSevenPPY += 192;

                }
                monsterMove=0;
                battle.AttackMonster(monster, 7);
                skillSevenPPX = 0;
                skillSevenPPY = 0;
                skill7 = false;
                skillSevenJ = false;

                fight=battle.checkBattle(monster);
                if (!checkSP&&fight==Situation.CONTINUE&&!isDrug) {
                    overFSS = true;
                }


                if (checkSP||isDrug) {
                    ifChoose = false;
                    chooseDrug=0;

                }
                isDrug=false;

            }

        }

    }

    public Thread getT()
    {
        return t;
    }

}
