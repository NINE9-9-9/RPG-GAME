package mode;

import draw.ImageDraw;
import draw.TextDraw;
import main.Control;
import main.MainWindow;
import modeControl.GameMode;
import modeControl.GameObject;
import org.jsfml.graphics.*;
import org.jsfml.graphics.Color;
import org.jsfml.graphics.Image;
import org.jsfml.system.Vector2f;
import org.jsfml.window.VideoMode;


import java.awt.*;
import java.io.IOException;

import java.nio.file.Paths;

/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class InitGame extends GameObject {

    private static Image arrows = new Image();
    private static Image image =new Image();
    private ImageDraw imageDraw = new ImageDraw(0,0,image);
    static {
        try {
            arrows.loadFromFile(Paths.get("resource/picture/arrowRed0.png"));
            image.loadFromFile(Paths.get("resource/picture/1.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int arrow = 0;
    private int choose = 0;
    private int wait = 0;
    private enum Option {
        INIT, START, HELP, SETTING}
    private Option option = Option.INIT;


    public InitGame(){
        super.bgm1Play();

    }

    @Override
    protected void keyResponse() {
        if (Control.UP && checkTimeGap(60))
        {
            super.choosedPlay();
            switch (option) {
                case INIT:

                    choose--;
                    if (choose < 0)
                        choose = 3;

                    break;
                case START:
                case SETTING:
                    choose--;
                    if (choose < 0)
                        choose = 2;

                    break;

                default:
                    break;
            }


        }
        else if (Control.DOWN && checkTimeGap(60))
        {
            super.choosedPlay();
            switch (option) {
                case INIT:

                    choose++;
                    if (choose > 3)
                        choose = 0;

                    break;
                case START:
                case SETTING:
                    choose++;
                    if (choose > 2)
                        choose = 0;

                    break;

                default:
                    break;
            }

        } else if (Control.SPACE && checkTimeGap(150)) {
            super.decisionPlay();
            switch (option) {
                case INIT:

                    if (choose == 0)
                        option = Option.START;

                    else if (choose == 1) {
                        option = Option.SETTING;
                        choose = 0;
                    } else if (choose == 2)
                        option = Option.HELP;

                    else if (choose == 3)
                        System.exit(0);

                    break;

                case START:

                    if (choose == 0) {
                        bgm1Stop();
                        new LoadingGame(Mode.RPG,null);

                    } else if (choose == 1) {
                        LoadGame.setStatus(LoadGame.Status.LOAD);
                        GameMode.getInstance().setSave(true);
                    } else if (choose == 2) {
                        option = Option.INIT;
                        choose = 0;
                    }

                    break;

                case HELP:
                    option = Option.INIT;
                    choose = 2;
                    //super.choose();
                    break;
                case SETTING:
                    if (choose == 0) {
                        MainWindow.ifFull = !MainWindow.ifFull;
                        MainWindow.changeScreen();

                    } else if (choose == 1) {
                        if (super.music) {
                            super.music=false;
                            super.key=false;
                            super.bgm1Stop();
                        } else {
                            super.music=true;
                            super.key=true;
                            super.bgm1Play();
                        }
                    } else if (choose == 2) {
                        option = Option.INIT;
                        choose = 1;

                    }
                    break;

                default:
                    break;
            }

        }
        else if (Control.H&&checkTimeGap(200))
        {
            option = Option.HELP;
        }

    }


    public void paint(RenderWindow w) {
        keyResponse();


        w.draw((Drawable) imageDraw.getTransformable());

        TextDraw text = new TextDraw(400,50,50,"Grief Sword","ALGER.TTF", new Color(255,250,250));
        w.draw((Drawable) text.getTransformable());




        switch (option) {
            case INIT:

                TextDraw start = new TextDraw(485,150,24,"S T A R T","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw setting = new TextDraw(458,195,24,"SE TT IN GS","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw help = new TextDraw(490,240,24,"H E L P","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw exit = new TextDraw(490,285,24,"E  X I  T","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw help2 = new TextDraw(250,400,20,"<<PRESS \"H\" TO GET HELP>>","ELEPHNT.ttf",new Color(255,250,250));
                w.draw((Drawable)help2.getTransformable());
                w.draw((Drawable)start.getTransformable());
                w.draw((Drawable)setting.getTransformable());
                w.draw((Drawable)help.getTransformable());
                w.draw((Drawable)exit.getTransformable());

                ImageDraw arrowDraw1 = new ImageDraw(637,145+45*choose,arrows);
                ImageDraw arrowDraw2 = new ImageDraw(657,145+45*choose,arrows);
                ImageDraw arrowDraw3 = new ImageDraw(677,145+45*choose,arrows);
                w.draw((Drawable)arrowDraw1.getTransformable());


                if (arrow >= 1) {
                    w.draw((Drawable)arrowDraw2.getTransformable());

                }
                if (arrow >= 2)
                    w.draw((Drawable)arrowDraw3.getTransformable());

                wait++;
                if (wait > 10) {
                    arrow++;
                    wait = 0;
                }
                if (arrow == 4)
                    arrow = 0;


                break;

            case START:
                TextDraw newGame = new TextDraw(450,150,24,"N E W GAME","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw loadGame = new TextDraw(450,216,24,"LOAD GAME","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw back = new TextDraw(490,282,24,"B A C K","ELEPHNT.ttf",new Color(29,250,250));
                w.draw((Drawable)newGame.getTransformable());
                w.draw((Drawable)loadGame.getTransformable());
                w.draw((Drawable)back.getTransformable());


                ImageDraw arrowDraw11 = new ImageDraw(637,145+66*choose,arrows);
                ImageDraw arrowDraw22 = new ImageDraw(657,145+66*choose,arrows);
                ImageDraw arrowDraw33 = new ImageDraw(677,145+66*choose,arrows);
                w.draw((Drawable)arrowDraw11.getTransformable());


                if (arrow >= 1) {
                    w.draw((Drawable)arrowDraw22.getTransformable());

                }
                if (arrow >= 2)
                    w.draw((Drawable)arrowDraw33.getTransformable());

                wait++;
                if (wait > 9) {
                    arrow++;
                    wait = 0;
                }
                if (arrow == 3)
                    arrow = 0;

                break;
            case HELP:
                Image helpImage = new Image();
                try {
                    helpImage.loadFromFile(Paths.get("resource/picture/help.png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                ImageDraw helpDraw = new ImageDraw(400,130,helpImage);
                w.draw((Drawable)helpDraw.getTransformable());
                TextDraw back2 = new TextDraw(515,332,24,"B A C K","ELEPHNT.ttf",new Color(29,250,250));
                w.draw((Drawable)back2.getTransformable());

                ImageDraw arrowDraw111 = new ImageDraw(630,325,arrows);
                ImageDraw arrowDraw222 = new ImageDraw(650,325,arrows);
                ImageDraw arrowDraw333 = new ImageDraw(670,325,arrows);
                w.draw((Drawable)arrowDraw111.getTransformable());

                if (arrow >= 1)
                    w.draw((Drawable)arrowDraw222.getTransformable());

                if (arrow >= 2)
                    w.draw((Drawable)arrowDraw333.getTransformable());

                wait++;
                if (wait > 15) {
                    arrow++;
                    wait = 0;
                }
                if (arrow == 3)
                    arrow = 0;


                break;

            case SETTING:
                TextDraw WinMode = new TextDraw(455,150,24,"WIN MODE","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw Music = new TextDraw(480,220,24,"M U S I C","ELEPHNT.ttf",new Color(29,250,250));
                TextDraw back3 = new TextDraw(490,290,24,"B A C K","ELEPHNT.ttf",new Color(29,250,250));
                w.draw((Drawable)WinMode.getTransformable());
                w.draw((Drawable)Music.getTransformable());
                w.draw((Drawable)back3.getTransformable());



                ImageDraw arrowDraw1111 = new ImageDraw(637,145+70*choose,arrows);
                ImageDraw arrowDraw2222 = new ImageDraw(657,145+70*choose,arrows);
                ImageDraw arrowDraw3333 = new ImageDraw(677,145+70*choose,arrows);
                w.draw((Drawable)arrowDraw1111.getTransformable());


                if (arrow >= 1) {
                    w.draw((Drawable)arrowDraw2222.getTransformable());

                }
                if (arrow >= 2)
                    w.draw((Drawable)arrowDraw3333.getTransformable());

                wait++;
                if (wait > 15) {
                    arrow++;
                    wait = 0;
                }
                if (arrow == 3)
                    arrow = 0;


                break;

            default:
                break;
        }

    }

}
