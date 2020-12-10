package draw;

import org.jsfml.graphics.*;


/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class ImageDraw {
    private int x;
    private int y;
    private Transformable transformable;
    private Image image;

    public ImageDraw(int x, int y, Image image)
    {
        this.x = x;
        this.y = y;
        this.image =image;
        Texture imgTexture = new Texture( );

        try {
            imgTexture.loadFromImage(image);
        } catch (TextureCreationException e) {
            e.printStackTrace();
        }
        imgTexture.setSmooth(true);
        transformable = new Sprite(imgTexture);
        transformable.setPosition(x,y);
        transformable.setOrigin(0,0);
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Transformable getTransformable() {
        return transformable;
    }
}
