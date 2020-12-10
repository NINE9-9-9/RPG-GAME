package mode;

import draw.ImageDraw;
import draw.TextDraw;
import main.Control;
import map.Actor;
import map.Item;
import modeControl.GameMode;
import modeControl.GameObject;
import org.jsfml.audio.Listener;
import org.jsfml.graphics.*;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Image;
import org.jsfml.system.Vector2f;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class LoadGame extends GameObject {

    private static Image load = new Image();
    private static Image arrow = new Image();
    private static Image face = new Image();
    private static Image hpI = new Image();
    private static Image mpI = new Image();
    private static Image expI = new Image();
    private static Image moneyI = new Image();
    private static Image background = new Image();
    private static Image window1 = new Image();
    private static Image window2 = new Image();
    private static Image window3 = new Image();
    private static Image window4 = new Image();
    private static Image window5 = new Image();
    private static Image window6 = new Image();
    private static Image window7 = new Image();
    private static Image window8 = new Image();
    private static Image window9 = new Image();
    private static Image window10 = new Image();
    private static Image window11 = new Image();
    private static Image window12 = new Image();
    private static Image window13 = new Image();
    private static Image window14 = new Image();
    private static Image window15 = new Image();
    private static Image window16 = new Image();
    private static Image window17 = new Image();
    private static Image chooseBox = new Image();
    private static Image chooseBox2 = new Image();
    private TextDraw loadGame = new TextDraw(80,0,36,"LOAD GAME","times.ttf",new Color(29,250,250));
    private TextDraw saveGame = new TextDraw(80,0,36,"SAVE GAME","times.ttf",new Color(29,250,250));
    private TextDraw number = new TextDraw(320,140,36,"No.","times.ttf",new Color(29,250,250));
    private TextDraw data = new TextDraw(555,110,36,"data","times.ttf",new Color(29,250,250));
    private TextDraw back = new TextDraw(555,390,32,"B A C K","times.ttf",new Color(29,250,250));
    private TextDraw item = new TextDraw(570,30,36,"I  T E M","times.ttf",new Color(29,250,250));
    private TextDraw save1 = new TextDraw(570,70,36,"S A V E","times.ttf",new Color(29,250,250));
    private TextDraw load1 = new TextDraw(570,110,36,"L O A D","times.ttf",new Color(29,250,250));
    private TextDraw option = new TextDraw(563,150,36,"OPTION","times.ttf",new Color(29,250,250));
    private TextDraw back1 = new TextDraw(570,190,36,"B A C K","times.ttf",new Color(29,250,250));
    private TextDraw exit = new TextDraw(570,230,36,"E X I  T","times.ttf",new Color(29,250,250));
    private TextDraw winMode = new TextDraw(270,120,24,"WIN MODE:","times.ttf",new Color(57,32,238));
    private TextDraw bgm = new TextDraw(270,150,24,"BGM SOUND:","times.ttf",new Color(57,32,238));
    private TextDraw volume = new TextDraw(270,210,24,"VOLUME:","times.ttf",new Color(57,32,238));
    private TextDraw keySound = new TextDraw(270,180,24,"KEY SOUND:","times.ttf",new Color(57,32,238));
    private TextDraw back2 = new TextDraw(350,240,30,"BACK","times.ttf",new Color(224,108,46));

    private static SaveData[] saveData = new SaveData[3];
    private static SaveData temp;
    private int choose = 0;
    private int wait = 0;
    private static File saveFile;
    public enum Status {LOAD,SAVE,SET,OPTION,ITEM};
    private static Status status = Status.LOAD;
    private boolean ifItem = true;
    private enum Type{WEAPON,ARMOR,DRUG}
    private Type type = null;
    private boolean chooseItem = false;
    private int itemChoice = 0;


	static {
		try {
			load.loadFromFile(Paths.get("resource/picture/loadSave.jpg"));
			arrow.loadFromFile(Paths.get("resource/picture/arrowRed0.png"));
			face.loadFromFile(Paths.get("resource/actor/face.png"));
            hpI.loadFromFile(Paths.get("resource/picture/hp.png"));
            mpI.loadFromFile(Paths.get("resource/picture/mp.png"));
			background.loadFromFile(Paths.get("resource/picture/DarkSpace.png"));
			window1.loadFromFile(Paths.get("resource/picture/window1.png"));
            window2.loadFromFile(Paths.get("resource/picture/window2.png"));
            window3.loadFromFile(Paths.get("resource/picture/window3.png"));
            window4.loadFromFile(Paths.get("resource/picture/window4.png"));
            window5.loadFromFile(Paths.get("resource/picture/window5.png"));
            window6.loadFromFile(Paths.get("resource/picture/window6.png"));
            window7.loadFromFile(Paths.get("resource/picture/window7.png"));
            window8.loadFromFile(Paths.get("resource/picture/window8.png"));
            window9.loadFromFile(Paths.get("resource/picture/window9.png"));
            window10.loadFromFile(Paths.get("resource/picture/window10.png"));
            window11.loadFromFile(Paths.get("resource/picture/window11.png"));
            window12.loadFromFile(Paths.get("resource/picture/window12.png"));
            window13.loadFromFile(Paths.get("resource/picture/window13.png"));
            window14.loadFromFile(Paths.get("resource/picture/window14.png"));
            window15.loadFromFile(Paths.get("resource/picture/window15.png"));
            window16.loadFromFile(Paths.get("resource/picture/window16.png"));
            window17.loadFromFile(Paths.get("resource/picture/window17.png"));

            moneyI.loadFromFile(Paths.get("resource/picture/money1.png"));
            expI.loadFromFile(Paths.get("resource/picture/exp.png"));
            chooseBox.loadFromFile(Paths.get("resource/picture/dialogBox2.png"));
            chooseBox2.loadFromFile(Paths.get("resource/picture/dialogBox3.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    public LoadGame() {
        for (int i = 0; i < 3; i++) {
            if (saveExists(i))
                saveData[i] = readData(i);
        }
    }


    @Override
    public void paint(RenderWindow w) {
        keyResponse();
        if(status==Status.LOAD||status==Status.SAVE)
        {

            ImageDraw loadDraw = new ImageDraw(0,0,load);
            ImageDraw arrowDraw = new ImageDraw(670,340,arrow);

            w.draw((Drawable)loadDraw.getTransformable());

            if (status==Status.LOAD)
                w.draw((Drawable)loadGame.getTransformable());
            else
                w.draw((Drawable)saveGame.getTransformable());

            for (int i = 0; i < 3; i++) {
                number.getText().setString("No. "+(i+1));
                number.getTransformable().setPosition(320, 110 + i * 110);
                w.draw((Drawable)number.getTransformable());


                if (saveExists(i))
                {
                    data.getText().setString(((saveData[i].getLastTime() / 1000) / 3600) + " : " +
                            (((saveData[i].getLastTime() / 1000) % 3600) / 60) + " : " +
                            ((saveData[i].getLastTime() / 1000) % 3600 % 60));
                    data.getTransformable().setPosition(500, 110 + i * 110);
                    w.draw((Drawable)data.getTransformable());
                }
            }

            w.draw((Drawable)back.getTransformable());
            wait++;
            if (wait <= 8)
            {
                if (choose == 3)
                    arrowDraw.getTransformable().setPosition(670,390);
                else
                    arrowDraw.getTransformable().setPosition( 730, 105 + choose * 110);

                w.draw((Drawable)arrowDraw.getTransformable());

            }
            if(wait > 10)
                wait =0;


        }
        else if(status==Status.SET)
        {
            ImageDraw backgroundDraw = new ImageDraw(0,0,background);
            w.draw((Drawable)backgroundDraw.getTransformable());
            ImageDraw faceDraw = new ImageDraw(30,30,face);
            w.draw((Drawable) faceDraw.getTransformable());

            TextDraw lv = new TextDraw(50,180,36,"LV. "+ Actor.getInstance().getAttribute().getLv(),"times.ttf",new Color(255,127,39));
            w.draw((Drawable)lv.getTransformable());
            RectangleShape exp = new RectangleShape(new Vector2f(330*(float)(Actor.getInstance().getAttribute().getExp()/(Actor.getInstance().getAttribute().getLv()*10*1.0)),10));
            ImageDraw expDraw = new ImageDraw(140,205,expI);
            exp.setPosition(140,205);
            exp.setFillColor(new Color(228,241,27));
            w.draw(exp);
            w.draw((Drawable)expDraw.getTransformable());
            TextDraw expText = new TextDraw(140,220,20,"EXP: "+ Actor.getInstance().getAttribute().getExp()+"/"+Actor.getInstance().getAttribute().getLv()*10,"times.ttf",new Color(228,241,27));
            expText.setStyle();
            w.draw((Drawable)expText.getTransformable());

            TextDraw hp = new TextDraw(200,40,32,"HP: "+ Actor.getInstance().getAttribute().getHpNow()+"/"+Actor.getInstance().getAttribute().getHp(),"times.ttf",new Color(240,15,77));
            w.draw((Drawable)hp.getTransformable());
            ImageDraw hpDraw = new ImageDraw(200,80,hpI);
            RectangleShape hpR = new RectangleShape(new Vector2f(250*(float)(Actor.getInstance().getAttribute().getHpNow()/(Actor.getInstance().getAttribute().getHp()*1.0)),20));
            hpR.setPosition(200,80);
            hpR.setFillColor(new Color(255,38,38));
            w.draw(hpR);
            w.draw((Drawable)hpDraw.getTransformable());

            TextDraw mp = new TextDraw(200,100,32,"MP: "+ Actor.getInstance().getAttribute().getMpNow()+"/"+Actor.getInstance().getAttribute().getMp(),"times.ttf",new Color(10,16,245));
            w.draw((Drawable)mp.getTransformable());
            ImageDraw mpDraw = new ImageDraw(200,140,mpI);
            RectangleShape mpR = new RectangleShape(new Vector2f(250*(float)(Actor.getInstance().getAttribute().getMpNow()/(Actor.getInstance().getAttribute().getMp()*1.0)),20));
            mpR.setPosition(200,140);
            mpR.setFillColor(new Color(63,72,204));
            w.draw(mpR);
            w.draw((Drawable)mpDraw.getTransformable());

            TextDraw atk = null;
            TextDraw dec = null;
            if(Actor.getInstance().getArmor()!=null&&Actor.getInstance().getWeapon()!=null)
            {
                atk = new TextDraw(200,170,28,"ATK:"+(Actor.getInstance().getArmor().getAtk()+Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getWeapon().getAtk()),"times.ttf",new Color(10,234,245));
                dec = new TextDraw(340,170,28,"DEC:"+(Actor.getInstance().getWeapon().getDec()+Actor.getInstance().getAttribute().getDefence()+Actor.getInstance().getArmor().getDec()),"times.ttf",new Color(10,234,245));
            }
            else if(Actor.getInstance().getWeapon()==null&&Actor.getInstance().getArmor()!=null)
            {
                atk = new TextDraw(200,170,28,"ATK:"+(Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getArmor().getAtk()),"times.ttf",new Color(10,234,245));
                dec = new TextDraw(340,170,28,"DEC:"+(Actor.getInstance().getAttribute().getDefence()+Actor.getInstance().getArmor().getDec()),"times.ttf",new Color(10,234,245));
            }
            else if(Actor.getInstance().getArmor()==null&&Actor.getInstance().getWeapon()!=null)
            {
                atk = new TextDraw(200,170,28,"ATK:"+(Actor.getInstance().getAttribute().getAttack()+Actor.getInstance().getWeapon().getAtk()),"times.ttf",new Color(10,234,245));
                dec = new TextDraw(340,170,28,"DEC:"+(Actor.getInstance().getAttribute().getDefence()+Actor.getInstance().getWeapon().getDec()),"times.ttf",new Color(10,234,245));
            }
            else if(Actor.getInstance().getArmor()==null&&Actor.getInstance().getWeapon()==null)
            {
                atk = new TextDraw(200,170,28,"ATK:"+Actor.getInstance().getAttribute().getAttack(),"times.ttf",new Color(10,234,245));
                dec = new TextDraw(340,170,28,"DEC:"+Actor.getInstance().getAttribute().getDefence(),"times.ttf",new Color(10,234,245));
            }


            assert atk != null;
            atk.setStyle();
            dec.setStyle();
            w.draw((Drawable)atk.getTransformable());
            w.draw((Drawable)dec.getTransformable());

            TextDraw money = new TextDraw(560,333,36,Integer.toString(Actor.getInstance().getAttribute().getMoney()),"times.ttf",new Color(237,249,6));
            money.setStyle();
            w.draw((Drawable)money.getTransformable());

            TextDraw weapon = new TextDraw(140,250,24,"WEAPON: ","times.ttf",Color.WHITE);
            weapon.setStyle();
            TextDraw weaponA;
            if(Actor.getInstance().getWeapon()!=null)
            {
                weaponA = new TextDraw(180,280,24,Actor.getInstance().getWeapon().getName(),"times.ttf",Color.WHITE);
            }
           else
            {
                weaponA = new TextDraw(180,280,24,"Empty","times.ttf",Color.WHITE);
            }
            TextDraw armor = new TextDraw(140,310,24,"ARMOR: ","times.ttf",Color.WHITE);
            armor.setStyle();
            TextDraw armorA;
            if(Actor.getInstance().getArmor()!=null)
            {
                armorA = new TextDraw(180,340,24,Actor.getInstance().getArmor().getName(),"times.ttf",Color.WHITE);
            }
            else
            {
                armorA = new TextDraw(180,340,24,"Empty","times.ttf",Color.WHITE);
            }

            w.draw((Drawable)weapon .getTransformable());
            w.draw((Drawable)weaponA.getTransformable());
            w.draw((Drawable)armor .getTransformable());
            w.draw((Drawable)armorA .getTransformable());


            ImageDraw window4Draw = new ImageDraw(540,35+40*choose,window4);
            ImageDraw window5Draw = new ImageDraw(540,35+40*choose,window5);
            ImageDraw window6Draw = new ImageDraw(540,35+40*choose,window6);
            ImageDraw window2Draw = new ImageDraw( 10 ,10, window2);
            ImageDraw window1Draw = new ImageDraw( 530 ,10, window1);
            ImageDraw window3Draw = new ImageDraw( 530 ,320, window3);
            ImageDraw moneyDraw = new ImageDraw(666,333,moneyI);

            w.draw((Drawable)window1Draw.getTransformable());
            w.draw((Drawable)window2Draw.getTransformable());
            w.draw((Drawable)window3Draw.getTransformable());
            w.draw((Drawable)moneyDraw.getTransformable());
            w.draw((Drawable)item.getTransformable());
            w.draw((Drawable)save1.getTransformable());
            w.draw((Drawable)load1.getTransformable());
            w.draw((Drawable)back1.getTransformable());
            w.draw((Drawable)option.getTransformable());
            w.draw((Drawable)exit.getTransformable());

            if(wait<=3)
                w.draw((Drawable)window4Draw.getTransformable());
            else if(wait<=6)
                w.draw((Drawable)window5Draw.getTransformable());
            else if(wait<=9)
                w.draw((Drawable)window6Draw.getTransformable());
            wait++;
            if(wait==10)
                wait=0;
        }
        else if(status == Status.OPTION)
        {

            ImageDraw backgroundDraw = new ImageDraw(0,0,background);
            w.draw((Drawable)backgroundDraw.getTransformable());
            ImageDraw window7Draw = new ImageDraw(250,100,window7);
            w.draw((Drawable)window7Draw.getTransformable());
            winMode.setStyle();
            w.draw((Drawable)winMode.getTransformable());
            bgm.setStyle();
            w.draw((Drawable)bgm.getTransformable());
            volume.setStyle();
            w.draw((Drawable)volume.getTransformable());
            keySound.setStyle();
            w.draw((Drawable)keySound.getTransformable());
            back2.setStyle();
            w.draw((Drawable)back2.getTransformable());

            TextDraw bgmMode = new TextDraw(460,150,24,super.music?"ON":"OFF","times.ttf",new Color(242,54,28));
            bgmMode.setStyle();
            w.draw((Drawable)bgmMode.getTransformable());

            TextDraw keyMode = new TextDraw(460,180,24,super.key?"ON":"OFF","times.ttf",new Color(242,54,28));
            keyMode.setStyle();
            w.draw((Drawable)keyMode.getTransformable());

            TextDraw volumeDraw = new TextDraw(460,210,24,Integer.toString ((int)Listener.getGlobalVolume()),"times.ttf",new Color(242,54,28));
            volumeDraw.setStyle();
            w.draw((Drawable)volumeDraw.getTransformable());

            ImageDraw window8Draw = new ImageDraw(270,120+choose*30,window8);
            ImageDraw window9Draw = new ImageDraw(270,120+choose*30,window9);
            ImageDraw window10Draw = new ImageDraw(270,120+choose*30,window10);
            if(wait<3)
                w.draw((Drawable)window8Draw.getTransformable());
            else if(wait<6)
                w.draw((Drawable)window9Draw.getTransformable());
            else if(wait<9)
                w.draw((Drawable)window10Draw.getTransformable());
            wait++;
            if(wait==9)
                wait=0;
        }
        else if(status==Status.ITEM)
        {
            ImageDraw backgroundDraw = new ImageDraw(0,0,background);
            w.draw((Drawable)backgroundDraw.getTransformable());
            ImageDraw window11Draw = new ImageDraw(66,41,window11);
            w.draw((Drawable)window11Draw.getTransformable());
            TextDraw weaponText = new TextDraw(120,80,30,"WEAPON","times.ttf",Color.RED);
            w.draw((Drawable)weaponText.getTransformable());
            TextDraw armorText = new TextDraw(320,80,30,"ARMOR","times.ttf",Color.RED);
            w.draw((Drawable)armorText.getTransformable());
            TextDraw drugText = new TextDraw(520,80,30,"DRUG","times.ttf",Color.RED);
            TextDraw backText = new TextDraw(540,390,30,"BACK","times.ttf",Color.RED);
            w.draw((Drawable)backText.getTransformable());
            w.draw((Drawable)drugText.getTransformable());

            int itemChoose=0;
            if((choose==0&&ifItem)||type==Type.WEAPON)
            {
                for (Item item : Actor.getInstance().getWeaponBag())
                {

                    TextDraw itemDraw = new TextDraw(120, 150+itemChoose*40, 30, item.getName(), "times.ttf", Color.WHITE);
                    w.draw((Drawable) itemDraw.getTransformable());
                    TextDraw item1Draw = new TextDraw(350, 150+itemChoose*40, 30, item.getAttribute(), "times.ttf", Color.BLUE);
                    w.draw((Drawable) item1Draw.getTransformable());
                    itemChoose++;
                }
            }
            else if((choose==1&&ifItem)||type==Type.ARMOR)
            {
                for (Item item : Actor.getInstance().getArmorBag())
                {

                    TextDraw itemDraw = new TextDraw(120, 150+itemChoose*40, 30, item.getName(), "times.ttf", Color.WHITE);
                    w.draw((Drawable) itemDraw.getTransformable());
                    TextDraw item1Draw = new TextDraw(350, 150+itemChoose*40, 30, item.getAttribute(), "times.ttf", Color.BLUE);
                    w.draw((Drawable) item1Draw.getTransformable());
                    itemChoose++;
                }
            }
            else if((choose==2&&ifItem)||type==Type.DRUG)
            {
                for (Item item : Actor.getInstance().getDrugBag())
                {

                    TextDraw itemDraw = new TextDraw(120, 150+itemChoose*40, 30, item.getName(), "times.ttf", Color.WHITE);
                    w.draw((Drawable) itemDraw.getTransformable());
                    TextDraw item1Draw = new TextDraw(350, 150+itemChoose*40, 30, item.getAttribute(), "times.ttf", Color.BLUE);
                    w.draw((Drawable) item1Draw.getTransformable());
                    itemChoose++;
                }
            }

            ImageDraw window4Draw;
            ImageDraw window5Draw;
            ImageDraw window6Draw;
            if(ifItem)
            {
                if(choose<3)
                {
                    window4Draw = new ImageDraw(110+190*choose,80,window12);
                    window5Draw = new ImageDraw(110+190*choose,80,window13);
                    window6Draw = new ImageDraw(110+190*choose,80,window14);
                }
                else {
                    window4Draw = new ImageDraw(510,390,window12);
                    window5Draw = new ImageDraw(510,390,window13);
                    window6Draw = new ImageDraw(510,390,window14);
                }
            }
            else
            {
                window4Draw = new ImageDraw(110,150+choose*40,window15);
                window5Draw = new ImageDraw(110,150+choose*40,window16);
                window6Draw = new ImageDraw(110,150+choose*40,window17);
            }
            if(wait<=3)
                w.draw((Drawable)window4Draw.getTransformable());
            else if(wait<=6)
                w.draw((Drawable)window5Draw.getTransformable());
            else if(wait<=9)
                w.draw((Drawable)window6Draw.getTransformable());
            wait++;
            if(wait==10)
                wait=0;
            if(chooseItem&&!ifItem)
            {
                ImageDraw boxDraw = new ImageDraw(320,150+choose*40,chooseBox);
                w.draw((Drawable)boxDraw.getTransformable());
                TextDraw equip = new TextDraw(370,160+40*choose,27,"EQUIP","times.ttf",Color.WHITE);
                TextDraw cancel = new TextDraw(360, 200+40*choose,27,"CANCEL","times.ttf",Color.WHITE);
                w.draw((Drawable) equip.getTransformable());
                w.draw((Drawable) cancel.getTransformable());
                ImageDraw chooseBox2Draw = new ImageDraw(320,165+40*choose+40*itemChoice,chooseBox2);
                w.draw((Drawable)chooseBox2Draw.getTransformable());
            }
        }



        // TODO Auto-generated method stub
    }

    public static void saveData(int choose) {
        saveFile = new File(".saveData");
        if (!saveFile.exists())
            saveFile.mkdirs();
        if (choose == 3) {
            saveFile = new File(saveFile.getPath() + "/publicData.dat");
        } else {
            saveFile = new File(saveFile.getPath() + "/saveData" + choose + ".dat");
        }

        ObjectOutputStream output;
        try {
            output = new ObjectOutputStream(new FileOutputStream(saveFile));
            output.writeObject(GameMode.getInstance().getCurrentMode().getCurrentData());
            readData(choose);
            output.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void saveData(SaveData saveData) {
        try {

            saveFile = new File(".saveData");
            if (!saveFile.exists())
                saveFile.mkdirs();

            saveFile = new File(saveFile.getPath() + "/publicData.dat");
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(saveFile));
            output.writeObject(saveData);
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void keyResponse() {
	    if(status==Status.LOAD||status==Status.SAVE)
        {

            if (Control.UP && checkTimeGap(60))
            {
                super.choosedPlay();
                choose--;
                if (choose < 0)
                    choose = 3;
            }
            else if (Control.DOWN && checkTimeGap(60))
            {
                super.choosedPlay();
                choose++;
                if (choose > 3)
                    choose = 0;
            }
            else if ((Control.SPACE) && checkTimeGap(150))
            {
                super.decisionPlay();
                if (status==Status.LOAD)
                {
                    if (choose == 3) {
                        if (GameMode.getInstance().getCurrentMode() instanceof RpgGame)
                            status=Status.SET;
                        else
                            GameMode.getInstance().setSave(false);
                        choose = 0;
                    }
                    else
                        {
                        if (saveExists(choose)) {
                            GameMode.getInstance().setSave(false);
                            bgm1Stop();
                            new RpgGame(saveData[choose]);
                        }
                    }
                }
                else
                {
                    if (choose == 3) {
                        if(GameMode.getInstance().getCurrentMode() instanceof RpgGame)
                        status=Status.SET;
                        else
                            GameMode.getInstance().setSave(false);
                        choose=0;
                    } else {
                        saveData(choose);
                    }
                }
            }
            else if((Control.ESC) && checkTimeGap(150))
            {
                super.decisionPlay();
                if(GameMode.getInstance().getCurrentMode() instanceof RpgGame)
                    status=Status.SET;
                else
                    GameMode.getInstance().setSave(false);
                choose=0;
            }
        }
	    else if(status==Status.SET)
        {
            if (Control.UP && checkTimeGap(60))
            {
                super.choosedPlay();
                choose--;
                if (choose < 0)
                    choose = 5;
            }
            else if (Control.DOWN && checkTimeGap(60))
            {
                super.choosedPlay();
                choose++;
                if (choose > 5)
                    choose = 0;
            }
            else if ((Control.SPACE) && checkTimeGap(150))
            {
                super.decisionPlay();
                switch (choose)
                {
                    case 0:
                        status=Status.ITEM;
                        break;
                    case 1:
                        status=Status.SAVE;
                        choose=0;
                        break;
                    case 2:
                        status=Status.LOAD;
                        choose=0;
                        break;
                    case 3:
                        status = Status.OPTION;
                        choose=0;
                        break;
                    case 4:
                        GameMode.getInstance().setSave(false);
                        break;
                    case 5:
                        choose=0;
                        super.rpgStop();
                        GameMode.getInstance().changeMode(Mode.INIT);
                        GameMode.getInstance().setSave(false);

                        break;
                }
            }
        }
	    else if(status==Status.OPTION)
        {
            if (Control.UP && checkTimeGap(60))
            {
                super.choosedPlay();
                choose--;
                if (choose < 0)
                    choose = 4;
            }
            else if (Control.DOWN && checkTimeGap(60))
            {
                super.choosedPlay();
                choose++;
                if (choose > 4)
                    choose = 0;
            }
            else if ((Control.SPACE) && checkTimeGap(150))
            {
                super.decisionPlay();
                switch (choose)
                {
                    case 0:
                        break;
                    case 1:
                        if(!super.music)
                        {
                            super.playMusic();
                            super.rpgPlay();
                        }
                        else
                            super.stopMusic();
                        break;
                    case 2:
                        if(!super.key)
                            super.playKey();
                        else
                            super.stopKey();
                        break;
                    case 4:
                        choose = 0;
                        status = Status.SET;
                        break;
                    default:
                        break;
                }
            }
            else if ((Control.LEFT) && checkTimeGap(150)&&choose==3)
                super.decVolume();
            else if ((Control.RIGHT) && checkTimeGap(150)&&choose==3)
                super.incVolume();
            else if((Control.ESC) && checkTimeGap(300))
                status=Status.SET;
        }
	    else if(status==Status.ITEM)
        {
            if(Control.LEFT&& checkTimeGap(150)&&ifItem)
            {
                super.choosedPlay();
                choose--;
                if(choose==-1)
                    choose=3;
            }
            else if(Control.RIGHT&&checkTimeGap(150)&&ifItem)
            {
                super.choosedPlay();
                choose++;
                if(choose==4)
                    choose=0;
            }
            if(Control.UP&& checkTimeGap(150)&&!ifItem)
            {
                super.choosedPlay();
                if(!chooseItem)
                {
                    switch (type)
                    {
                        case WEAPON:
                            if(Actor.getInstance().getWeaponBag().size()!=0)
                                choose--;
                            if(choose==-1)
                                choose=Actor.getInstance().getWeaponBag().size()-1;
                            break;
                        case ARMOR:
                            if(Actor.getInstance().getArmorBag().size()!=0)
                                choose--;
                            if(choose==-1)
                                choose=Actor.getInstance().getArmorBag().size()-1;
                            break;
                        case DRUG:
                            if(Actor.getInstance().getDrugBag().size()!=0)
                                choose--;
                            if(choose==-1)
                                choose=Actor.getInstance().getDrugBag().size()-1;
                            break;
                    }
                }
                else
                {
                    itemChoice--;
                    if(itemChoice==-1)
                        itemChoice=1;
                }

            }
            else if(Control.DOWN&&checkTimeGap(150)&&!ifItem)
            {
                super.choosedPlay();
                if(!chooseItem)
                {
                    switch (type)
                    {
                        case WEAPON:
                            if(Actor.getInstance().getWeaponBag().size()!=0)
                                choose++;
                            if(choose==Actor.getInstance().getWeaponBag().size())
                                choose=0;
                            break;
                        case ARMOR:
                            if(Actor.getInstance().getArmorBag().size()!=0)
                                choose++;
                            if(choose==Actor.getInstance().getArmorBag().size())
                                choose=0;
                            break;
                        case DRUG:
                            if(Actor.getInstance().getDrugBag().size()!=0)
                                choose++;
                            if(choose==Actor.getInstance().getDrugBag().size())
                                choose=0;
                            break;
                    }
                }
                else
                {
                    itemChoice++;
                    if(itemChoice==2)
                        itemChoice=0;
                }
            }
            else if(Control.ESC&&checkTimeGap(150))
            {
                super.decisionPlay();
                if(!ifItem)
                {
                    switch (type)
                    {
                        case WEAPON:
                            choose=0;
                            break;
                        case ARMOR:
                            choose=1;
                            break;
                        case DRUG:
                            choose=2;
                            break;
                    }
                    type=null;
                    ifItem = true;
                    itemChoice=0;
                }
                else
                {
                    status=Status.SET;
                    choose=0;
                }

            }
            else  if(Control.SPACE&&checkTimeGap(200))
            {
                super.decisionPlay();
                if(ifItem)
                {
                    if(choose==3)
                    {
                        choose=0;
                        status=Status.SET;
                    }
                    else
                    {
                        switch (choose)
                        {
                            case 0:
                                type=Type.WEAPON;
                                choose=0;
                                break;
                            case 1:
                                type=Type.ARMOR;
                                choose=0;
                                break;
                            case 2:
                                type=Type.DRUG;
                                choose=0;
                                break;
                            default:
                                break;
                        }
                        ifItem=false;
                    }
                }
                else
                {
                    if(!chooseItem)
                    {
                        chooseItem=true;
                    }
                    else
                    {
                        if(itemChoice==0)
                        {
                            switch (type)
                            {
                                case WEAPON:
                                    if(Actor.getInstance().getWeaponBag().size()!=0)
                                    {
                                        Actor.getInstance().setWeapon(Actor.getInstance().getWeaponBag().get(choose));
                                    }
                                    break;
                                case ARMOR:
                                    if(Actor.getInstance().getArmorBag().size()!=0)
                                    {
                                        Actor.getInstance().setArmor(Actor.getInstance().getArmorBag().get(choose));
                                    }
                                case DRUG:
                                    if(Actor.getInstance().getDrugBag().size()!=0)
                                    {
                                        Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHpNow()+Actor.getInstance().getDrugBag().get(choose).getHp());
                                        Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMpNow()+Actor.getInstance().getDrugBag().get(choose).getMp());
                                        if(Actor.getInstance().getAttribute().getHpNow()>Actor.getInstance().getAttribute().getHp())
                                            Actor.getInstance().getAttribute().setHpNow(Actor.getInstance().getAttribute().getHp());
                                        if(Actor.getInstance().getAttribute().getMpNow()>Actor.getInstance().getAttribute().getMp())
                                            Actor.getInstance().getAttribute().setMpNow(Actor.getInstance().getAttribute().getMp());
                                    }
                                default:
                                    break;
                            }
                            chooseItem=false;
                        }
                        else if(itemChoice == 1)
                        {
                            chooseItem=false;
                            itemChoice=0;
                        }
                    }
                }
            }

        }
    }

    public boolean saveExists(int step) {

        saveFile = new File(".saveData");
        if (!saveFile.exists())
            saveFile.mkdirs();
        if (step == 3) {
            saveFile = new File(saveFile.getPath() + "/publicData.dat");
        } else {
            saveFile = new File(saveFile.getPath() + "/saveData" + step + ".dat");
        }
        if (saveFile.exists())
            return true;
        else
            return false;
    }


    public static SaveData readData(int choose) {
        if (choose == 3) {
            try {
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(saveFile));
                temp = (SaveData) (input.readObject());
                input.close();
            } catch (IOException | ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return temp;
        } else {
            try {
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(saveFile));
                saveData[choose] = (SaveData) (input.readObject());
                input.close();
            } catch (IOException | ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return saveData[choose];
        }
    }

    public static void setStatus(Status sta) {
        status=sta;
    }


}
