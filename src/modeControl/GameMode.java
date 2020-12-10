package modeControl;

import mode.*;
import org.jsfml.graphics.RenderWindow;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class GameMode {
    private static GameMode game = new GameMode();
    private boolean isSave = false;
    private Mode mode = Mode.INIT;
    public GameObject currentGame;
    public GameObject loadGame;
    public SaveData saveData;

    public GameMode() {
    }

    public GameMode(Mode m) {
        mode = m;
    }

    public void init() {
        new InitGame();
        loadGame = new LoadGame();
    }


    public void setMode(GameObject game) {
        currentGame = game;
    }

    public void changeMode(Mode m) {
        mode = m;
        if (mode == Mode.INIT) {
            new InitGame();
        } else if (mode == Mode.RPG) {
            new RpgGame();
        } else if (mode == Mode.FIGHT) {


        }
    }

    public static GameMode getInstance() {
        return game;
    }

    public void draw(RenderWindow w) {

        if (isSave)
            loadGame.paint(w);
        else
            currentGame.paint(w);
    }

    public void setSave(boolean isSave) {
        this.isSave = isSave;
        if (isSave)
            loadGame = new LoadGame();
    }

    public boolean isSave() {
        return isSave;
    }

    public GameObject getCurrentMode() {
        return currentGame;
    }

}
