package draw;

import org.jsfml.graphics.*;

import java.io.IOException;
import java.nio.file.Paths;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class TextDraw {
    private int x;
    private int y;
    private String contend;
    private Color color;
    private Transformable transformable;
    private int size;
    private Text text;

    public TextDraw(int x, int y, int size, String contend, String font, Color color)
    {
        this.x = x;
        this.y = y;
        this.contend = contend;
        this.color = color;
        this.size = size;

        Font fonts = new Font();
        try {
            fonts.loadFromFile(Paths.get("resource/font/"+font));
        } catch (IOException e) {
            e.printStackTrace();
        }

        text = new Text(this.contend,fonts,this.size);

        text.setColor(color);


        transformable = text;
        transformable.setPosition(x,y);



    }
    public Text getText()
    {
        return  text;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getContend() {
        return contend;
    }

    public void setContend(String contend) {
        this.contend = contend;
    }

    public Transformable getTransformable() {
        return transformable;
    }

    public void setStyle()
    {
        text.setStyle(TextStyle.BOLD);
    }
}
