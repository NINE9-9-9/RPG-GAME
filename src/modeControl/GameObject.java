package modeControl;

import map.Actor;
import map.Map;
import mode.LoadGame;
import mode.SaveData;
import org.jsfml.audio.Listener;
import org.jsfml.audio.Music;
import org.jsfml.graphics.RenderWindow;

import java.io.IOException;
import java.nio.file.Paths;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public abstract class GameObject {

    private double startTime = 0;
    private static long mill = 0;
    protected boolean music = true;
    protected boolean key = true;

    private static Music bgm1 = new Music();
    private static Music choosed = new Music();
    private static Music decision = new Music();
    private static Music rpg = new Music();
    private static Music rpg2 = new Music();
    private static Music story1 = new Music();
    private static Music story2 = new Music();
    private static Music story3 = new Music();
    private static Music story4 = new Music();
    private static Music story5 = new Music();
    private static Music story6 = new Music();
    private static Music story7 = new Music();
    private static Music story8 = new Music();
    private static Music story9 = new Music();
    private static Music storyEnd = new Music();
    private static Music fight = new Music();
    private static Music fight2 = new Music();
    private static Music fight3 = new Music();
    private static Music fight4 = new Music();
    private static Music fight5 = new Music();
    private static Music fight6 = new Music();
    private static Music fight7 = new Music();
    private static Music fight8 = new Music();
    private static Music fight9 = new Music();
    private static Music fight10 = new Music();

    private static Music fightV = new Music();
    private static Music fightD = new Music();
    static
    {
        try {
            bgm1.openFromFile(Paths.get("resource/music/Victory.wav"));
            choosed.openFromFile(Paths.get("resource/music/choosed.wav"));
            decision.openFromFile(Paths.get("resource/music/decision.wav"));
            rpg.openFromFile(Paths.get("resource/music/rpg.wav"));
            rpg2.openFromFile(Paths.get("resource/music/rpg2.wav"));
            story1.openFromFile(Paths.get("resource/music/story1.wav"));
            story2.openFromFile(Paths.get("resource/music/story2.wav"));
            story3.openFromFile(Paths.get("resource/music/story3.wav"));
            story4.openFromFile(Paths.get("resource/music/story4.wav"));
            story5.openFromFile(Paths.get("resource/music/story5.wav"));
            story6.openFromFile(Paths.get("resource/music/story6.wav"));
            story7.openFromFile(Paths.get("resource/music/story7.wav"));
            story8.openFromFile(Paths.get("resource/music/story8.wav"));
            story9.openFromFile(Paths.get("resource/music/story9.wav"));
            storyEnd.openFromFile(Paths.get("resource/music/storyEnd.wav"));
            fight.openFromFile(Paths.get("resource/music/fight.wav"));
            fight2.openFromFile(Paths.get("resource/music/fight2.wav"));
            fight3.openFromFile(Paths.get("resource/music/fight3.wav"));
            fight4.openFromFile(Paths.get("resource/music/fight4.wav"));
            fight5.openFromFile(Paths.get("resource/music/fight5.wav"));
            fight6.openFromFile(Paths.get("resource/music/fight6.wav"));
            fight7.openFromFile(Paths.get("resource/music/fight7.wav"));
            fight8.openFromFile(Paths.get("resource/music/fight8.wav"));
            fight9.openFromFile(Paths.get("resource/music/fight9.wav"));
            fight10.openFromFile(Paths.get("resource/music/fight10.wav"));
            fightV.openFromFile(Paths.get("resource/music/fightV.wav"));
            fightD.openFromFile(Paths.get("resource/music/fightD.wav"));
            fight.setLoop(true);
            fight2.setLoop(true);
            fight3.setLoop(true);
            fight4.setLoop(true);
            fight5.setLoop(true);
            fight6.setLoop(true);
            fight7.setLoop(true);
            fight8.setLoop(true);
            fight9.setLoop(true);
            fight10.setLoop(true);
            story1.setLoop(true);
            story2.setLoop(true);
            story3.setLoop(true);
            story4.setLoop(true);
            story5.setLoop(true);
            story6.setLoop(true);
            story7.setLoop(true);
            story8.setLoop(true);
            story9.setLoop(true);
            storyEnd.setLoop(true);

            rpg.setLoop(true);
            rpg2.setLoop(true);
            bgm1.setLoop(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public GameObject(){
        startTime = System.currentTimeMillis();
        if (!(this instanceof LoadGame)) {
            GameMode.getInstance().setMode(this);
        }

    }

    public static boolean checkTimeGap(int gap) {
        boolean timeGap = false;
        if (Math.abs(mill - System.currentTimeMillis()) > gap) {
            timeGap = true;
        }
        mill = System.currentTimeMillis();
        return timeGap;
    }

    protected boolean checkStartGap(long gap) {
        long mill = System.currentTimeMillis();
        if (mill - startTime > gap)
            return true;
        return false;
    }


    public abstract void paint(RenderWindow w);

    protected abstract void keyResponse();


    public SaveData getCurrentData() {
        return new SaveData();
    }

    public GameObject getType() {
        return this;
    }

    public void bgm1Play()
    {
        if(music)
        { bgm1.play(); }

    }
    public void bgm1Stop()
    {
        bgm1.stop();
    }

    public void rpgPlay() {if(music) { rpg.play(); } }
    public void rpgStop() { rpg.stop(); }

    public void rpg2Play() {if(music) { rpg2.play(); } }
    public void rpg2Stop() { rpg2.stop(); }


    public void fightPlay() { if(music) { fight.play(); } }
    public void fight3Play() { if(music) { fight3.play(); } }
    public void fight4Play() { if(music) { fight4.play(); } }
    public void fight5Play() { if(music) { fight5.play(); } }
    public void fight6Play() { if(music) { fight6.play(); } }
    public void fight7Play() { if(music) { fight7.play(); } }
    public void fight8Play() { if(music) { fight8.play(); } }
    public void fight9Play() { if(music) { fight9.play(); } }
    public void fight10Play() { if(music) { fight10.play(); } }
    public void fightVPlay() { if(music) { fightV.play(); } }
    public void fightDPlay()
    {
        if(music) {
            fightD.play();
        }
    }
    public void fightStop()
    {
        fight.stop();
    }

    public void fight2Play()
    {
        if(music) {
            fight2.play();
        }
    }
    public void fight2Stop()
    {
        fight2.stop();
    }

    public void story1Play() { if(music) { story1.play(); } }
    public void story2Play() { if(music) { story2.play(); } }
    public void story3Play() { if(music) { story3.play(); } }
    public void story4Play() { if(music) { story4.play(); } }
    public void story5Play() { if(music) { story5.play(); } }
    public void story6Play() { if(music) { story6.play(); } }
    public void story7Play() { if(music) { story7.play(); } }
    public void story8Play() { if(music) { story8.play(); } }
    public void story9Play() { if(music) { story9.play(); } }
    public void storyEndPlay() { if(music) { storyEnd.play(); } }

    public void choosedPlay()
    {
        if(key)
            choosed.play();
    }

    public void decisionPlay()
    {
        if(key)
            decision.play();
    }

    protected void clearGame()
    {
        Map.actorX=2;
        Map.actorY=6;
        Actor.getInstance().newActor();
    }

    protected void incVolume()
    {
        if(Listener.getGlobalVolume()<=80)
            Listener.setGlobalVolume(Listener.getGlobalVolume()+20);
        else
            Listener.setGlobalVolume(100);
    }

    protected void decVolume()
    {
        if(Listener.getGlobalVolume()>=20)
            Listener.setGlobalVolume(Listener.getGlobalVolume()-20);
        else
            Listener.setGlobalVolume(0);
    }

    protected void stopMusic()
    {
        music=false;
        bgm1.stop();
        rpg.stop();
    }

    protected void playMusic()
    {
        music=true;
    }

    protected void stopKey()
    {
        key=false;
    }

    protected void playKey()
    {
        key=true;
    }

    protected void allStop()
    {
        rpg.stop();
        rpg2.stop();
        bgm1.stop();
        fight.stop();
        fight2.stop();
        fight3.stop();
        fight4.stop();
        fight5.stop();
        fight6.stop();
        fight7.stop();
        fight8.stop();
        fight9.stop();
        fight10.stop();
        story1.stop();
        story2.stop();
        story3.stop();
        story4.stop();
        story5.stop();
        story6.stop();
        story7.stop();
        story8.stop();
        story9.stop();
        storyEnd.stop();

    }

}