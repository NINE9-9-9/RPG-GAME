package mode.fight;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class StaticValue extends FightGame {

    public static int level = 3;

    public static int monster = 3;

    public static int boss = 0;

    public static BufferedImage MainChr = null;

    public static List<BufferedImage> Background = new ArrayList<>();

    public static BufferedImage Background1A = null;

    public static BufferedImage face = null;

    public static BufferedImage item = null;

    public static BufferedImage Board = null;

    public static BufferedImage Btn = null;

    public static List<BufferedImage> Monster = new ArrayList<>();



    public static List<BufferedImage> Effect = new ArrayList<>();

    public static BufferedImage skill1 = null;

    public static BufferedImage skill2 = null;

    public static BufferedImage skill3 = null;

    public static BufferedImage skill4 = null;

    public static BufferedImage skill5 = null;

    public static BufferedImage skill6 = null;

    public static BufferedImage skill7 = null;

    public static String imagePath = "resource/fight";

    static {

        try {
            item = ImageIO.read(new File(imagePath + "/Item.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            skill7 = ImageIO.read(new File(imagePath + "/Skill7.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            skill6 = ImageIO.read(new File(imagePath + "/Skill6.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            skill5 = ImageIO.read(new File(imagePath + "/Skill5.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            skill4 = ImageIO.read(new File(imagePath + "/Skill4.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            skill3 = ImageIO.read(new File(imagePath + "/Skill3.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            skill2 = ImageIO.read(new File(imagePath + "/Skill2.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            skill1 = ImageIO.read(new File(imagePath + "/Skill1.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            MainChr = ImageIO.read(new File(imagePath + "/Player2.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {
            Btn = ImageIO.read(new File(imagePath + "/Btn2.png"));
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        for(int i=1; i <= 8; i++) {
            try {
                Background.add(ImageIO.read(new File(imagePath + "/Bkg"+i+".png")));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        for(int i=0; i < 14; i++) {
            try {
                Monster.add(ImageIO.read(new File(imagePath + "/Monster"+i+".png")));
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }



        try {
            BufferedImage temp = ImageIO.read(new File(imagePath + "/Pane2.png"));
            Board = new BufferedImage(temp.getWidth(), temp.getHeight(), BufferedImage.TYPE_INT_ARGB);
            int a;
            for(int i=0; i<temp.getWidth(); i++) {
                for(int j=0; j<temp.getHeight(); j++) {
                    a = temp.getRGB(i, j);
                    Color color = new Color(a);
                    Color newColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), 180);

                    Board.setRGB(i, j, newColor.getRGB());
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            face = ImageIO.read(new File(imagePath + "/face.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public StaticValue(int level, int monsterNum) {
        super(level, monsterNum);
    }
}
