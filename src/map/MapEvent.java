package map;

import mode.Direction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class MapEvent extends MapObject {


    private ArrayList<String> message = new ArrayList<>();
    private static ArrayList<String> empty = new ArrayList<>();
    private static Properties properties = new Properties();
    private ArrayList<String> messageFigure = new ArrayList<>();
    private static Properties propertiesFigure = new Properties();
    private static Properties shop = new Properties();

    private ItemType type = null;
    private ArrayList<String> tradeName = new ArrayList<>();
    private ArrayList<String> tradePrice = new ArrayList<>();
    private ArrayList<String> tradeBrief = new ArrayList<>();
    private ArrayList<String> tradeAttribute = new ArrayList<>();
    private ArrayList<String> atk = new ArrayList<>();
    private ArrayList<String> dfc = new ArrayList<>();
    private ArrayList<String> spd = new ArrayList<>();
    private ArrayList<String> hp = new ArrayList<>();
    private ArrayList<String> mp = new ArrayList<>();

    public int money=0;

    private boolean isShown = false;
    private boolean ifShop = false;


    static {
        try {
            properties.load(new FileInputStream(new File("resource/story/storyContent.properties")));
            propertiesFigure.load(new FileInputStream(new File("resource/story/storyActor.properties")));
            shop.load(new FileInputStream(new File(("resource/story/item.properties"))));
            empty.add("Empty");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public MapEvent(int messageNum,  int imageNum, String key) {
        super(MapKind.EVENT, imageNum);
        ifShop =false;
        for(int i = 0; i<messageNum; i++)
        {
            messageFigure.add(propertiesFigure.getProperty(key+i));
            message.add(properties.getProperty(key+i));

        }
    }
    public MapEvent(int messageNum,  int imageNum,ItemType tradeType,int tradeNum) {
        super(MapKind.EVENT, imageNum);
        ifShop = true;
        type=tradeType;
        messageFigure.add(shop.getProperty("shop"+messageNum));
        message.add(shop.getProperty("content"+messageNum));

        for (int i =0;i<tradeNum;i++)
        {
            switch (type)
            {
                case WEAPON:
                    tradeName.add(shop.getProperty("weapon"+i));
                    tradePrice.add(shop.getProperty("priceW"+i));
                    tradeAttribute.add(shop.getProperty("AttributeW"+i));
                    tradeBrief.add(shop.getProperty("briefW"+i));
                    atk.add(shop.getProperty("ATKW"+i));
                    dfc.add(shop.getProperty("DFCW"+i));
                    spd.add(shop.getProperty("SPDW"+i));
                    break;
                case ARMOR:
                    tradeName.add(shop.getProperty("armor"+i));
                    tradePrice.add(shop.getProperty("priceA"+i));
                    tradeAttribute.add(shop.getProperty("AttributeA"+i));
                    tradeBrief.add(shop.getProperty("briefA"+i));
                    atk.add(shop.getProperty("ATKA"+i));
                    dfc.add(shop.getProperty("DFCA"+i));
                    spd.add(shop.getProperty("SPDA"+i));
                    break;
                case DRUG:
                    tradeName.add(shop.getProperty("drug"+i));
                    tradePrice.add(shop.getProperty("priceD"+i));
                    tradeAttribute.add(shop.getProperty("AttributeD"+i));
                    tradeBrief.add(shop.getProperty("briefD"+i));
                    hp.add(shop.getProperty("HP"+i));
                    mp.add(shop.getProperty("MP"+i));
                    break;
                default:
                    break;
            }
        }
    }

    public MapEvent(int messageNum,  int imageNum, String key,int money) {
        super(MapKind.EVENT, imageNum);
        ifShop =false;
        this.money=money;
        for(int i = 0; i<messageNum; i++)
        {
            messageFigure.add(propertiesFigure.getProperty(key+i));
            message.add(properties.getProperty(key+i));

        }
    }

    @Override
    public ArrayList<String> getMessage() {
        if(!isShown&&money!=0)
        {
            Actor.getInstance().getAttribute().setMoney(Actor.getInstance().getAttribute().getMoney()+money);
            isShown=true;
            return message;
        }
        else if(isShown&&money!=0)
        {
            return empty;
        }
        else
            return message;

    }

    @Override
    public ArrayList<String> getActor() {
        return messageFigure;
    }

    @Override
    public boolean getShop() {
        return ifShop;
    }

    @Override
    public ArrayList<String> getTradeBrief()
    {
        return tradeBrief;
    }

    @Override
    public ArrayList<String> getTradeName()
    {
        return tradeName;
    }

    @Override
    public ArrayList<String> getTradeAttribute() {
        return tradeAttribute;
    }

    @Override
    public ArrayList<String> getTradePrice() {
        return tradePrice;
    }

    @Override
    public ArrayList<String> getAtk() {
        return atk;
    }

    @Override
    public ArrayList<String> getDfc() {
        return dfc;
    }

    @Override
    public ArrayList<String> getSpd() {
        return spd;
    }

    @Override
    public ArrayList<String> getHp() {
        return hp;
    }

    @Override
    public ArrayList<String> getMp() {
        return mp;
    }

    @Override
    public ItemType getType(){return type;}

    @Override
    public int getMoney() {
        return money;
    }
}
