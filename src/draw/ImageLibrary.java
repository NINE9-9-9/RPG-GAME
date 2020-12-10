package draw;

import main.MainWindow;
import map.MapKind;
import map.MapObject;
import org.jsfml.graphics.Image;
import java.io.IOException;
import java.nio.file.Paths;
/**
 *@Author NINE. LIU
 *@Version 1.0
 */
public class ImageLibrary {

    private static Image timberpileMid = new Image();
    private static Image timberpileRight = new Image();
    private static Image timberpileLeft = new Image();
    private static Image timberpileLeft2 = new Image();
    private static Image timberpileRight2 = new Image();
    private static Image fenceTopLeft = new Image();
    private static Image fenceVertical = new Image();
    private static Image fenceTopRight = new Image();
    private static Image fenceBottomLeft = new Image();
    private static Image fenceBottomLeft2 = new Image();
    private static Image fenceBottomMid = new Image();
    private static Image fenceBottomRight = new Image();
    private static Image fenceBottomRight2 = new Image();
    private static Image lawn = new Image();
    private static Image lawn2 = new Image();
    private static Image lawn3 = new Image();
    private static Image lawn4 = new Image();
    private static Image lawn5 = new Image();
    private static Image lawn6 = new Image();
    private static Image lawn7 = new Image();
    private static Image lawn8 = new Image();
    private static Image lawn9 = new Image();
    private static Image lawnShadow = new Image();
    private static Image boxTop = new Image();
    private static Image boxBottom = new Image();
    private static Image houseTopLeft = new Image();
    private static Image houseTopLeft2 = new Image();
    private static Image houseTopLeft3 = new Image();
    private static Image houseTopMid = new Image();
    private static Image houseTopMid2 = new Image();
    private static Image houseTopMid3 = new Image();
    private static Image houseTopMid4 = new Image();
    private static Image houseTopMid5 = new Image();
    private static Image houseTopMid6 = new Image();
    private static Image houseTopMid7 = new Image();
    private static Image houseTopRight = new Image();
    private static Image houseTopRight2 = new Image();
    private static Image houseTopRight3 = new Image();
    private static Image houseBottomLeft = new Image();
    private static Image houseBottomLeft2 = new Image();
    private static Image houseBottomLeft3 = new Image();
    private static Image houseBottomLeft4 = new Image();
    private static Image houseBottomLeft5 = new Image();
    private static Image houseBottomLeft6 = new Image();
    private static Image houseBottomMid = new Image();
    private static Image houseBottomMid2 = new Image();
    private static Image houseBottomMid3 = new Image();
    private static Image houseBottomMid4 = new Image();
    private static Image houseBottomMid5 = new Image();
    private static Image houseBottomMid6 = new Image();
    private static Image houseBottomMid7 = new Image();
    private static Image houseBottomRight = new Image();
    private static Image houseBottomRight2 = new Image();
    private static Image houseBottomRight3 = new Image();
    private static Image houseBottomRight4 = new Image();
    private static Image houseBottomRight5 = new Image();
    private static Image houseLeft = new Image();
    private static Image houseLeft2 = new Image();
    private static Image houseLeft3 = new Image();
    private static Image houseMid = new Image();
    private static Image houseMid2 = new Image();
    private static Image houseMid3 = new Image();
    private static Image houseMid4 = new Image();
    private static Image houseMid5 = new Image();
    private static Image houseRight = new Image();
    private static Image houseRight2 = new Image();
    private static Image houseRight3 = new Image();
    private static Image wallLeft = new Image();
    private static Image wallLeft2 = new Image();
    private static Image wall = new Image();
    private static Image wall2 = new Image();
    private static Image wall3 = new Image();
    private static Image wall4 = new Image();
    private static Image wall5 = new Image();
    private static Image wallRight = new Image();
    private static Image wallRight2 = new Image();
    private static Image wallTop = new Image();
    private static Image wallTop2 = new Image();
    private static Image wallBottomLeft2 = new Image();
    private static Image wallBottomLeft = new Image();
    private static Image wallBottomMid = new Image();
    private static Image wallBottomMid2 = new Image();
    private static Image wallBottomMid3 = new Image();
    private static Image wallBottomMid4 = new Image();
    private static Image wallBottomMid5 = new Image();
    private static Image wallBottomMid6 = new Image();
    private static Image wallBottomMid7 = new Image();
    private static Image wallBottomRight = new Image();
    private static Image wallBottomRight2 = new Image();
    private static Image windowTop = new Image();
    private static Image windowTop2 = new Image();
    private static Image windowTop3 = new Image();
    private static Image windowTop4 = new Image();
    private static Image windowTop5 = new Image();
    private static Image window = new Image();
    private static Image window2 = new Image();
    private static Image window3 = new Image();
    private static Image window4 = new Image();
    private static Image window5 = new Image();
    private static Image window6 = new Image();
    private static Image poolTopLeft = new Image();
    private static Image poolTopMid = new Image();
    private static Image poolTopMid2 = new Image();
    private static Image poolTopMid3 = new Image();
    private static Image poolTopRight = new Image();
    private static Image poolTopRight2 = new Image();
    private static Image poolBottomLeft = new Image();
    private static Image poolBottomLeft2 = new Image();
    private static Image poolBottomLeft3 = new Image();
    private static Image poolBottomMid = new Image();
    private static Image poolBottomRight = new Image();
    private static Image poolBottomRight2 = new Image();
    private static Image poolLeft = new Image();
    private static Image poolMid = new Image();
    private static Image poolMid2 = new Image();
    private static Image poolRight = new Image();
    private static Image treeRoot = new Image();
    private static Image treeRoot2 = new Image();
    private static Image treeTop = new Image();
    private static Image treeTop2 = new Image();
    private static Image treeTop3 = new Image();
    private static Image treeTop4 = new Image();
    private static Image treeTop5 = new Image();
    private static Image treeTop6 = new Image();
    private static Image treeTopLeft = new Image();
    private static Image treeTopLeft4 = new Image();
    private static Image treeTopRight = new Image();
    private static Image treeBottomLeft = new Image();
    private static Image treeBottomLeft2 = new Image();
    private static Image treeBottomLeft3 = new Image();
    private static Image treeBottomLeft4 = new Image();
    private static Image treeBottomRight = new Image();
    private static Image treeBottomRight2 = new Image();
    private static Image treeBottomRight3 = new Image();
    private static Image treeBottomRight4 = new Image();
    private static Image door = new Image();
    private static Image grassTopLeft = new Image();
    private static Image grassTopMid = new Image();
    private static Image grassTopRight = new Image();
    private static Image grassLeft = new Image();
    private static Image grassMid = new Image();
    private static Image grassRight = new Image();
    private static Image grassBottomLeft = new Image();
    private static Image grassBottomMid = new Image();
    private static Image grassBottomRight = new Image();
    private static Image stoneRoad = new Image();
    private static Image roadTopLeft = new Image();
    private static Image roadTopMid = new Image();
    private static Image roadTopRight = new Image();
    private static Image roadLeft = new Image();
    private static Image roadMid = new Image();
    private static Image roadRight = new Image();
    private static Image roadBottomLeft = new Image();
    private static Image roadBottomMid = new Image();
    private static Image roadBottomRight = new Image();
    private static Image cliffTopLeft = new Image();
    private static Image cliffLeft = new Image();
    private static Image cliffLeft2 = new Image();
    private static Image cliffMid = new Image();
    private static Image cliffMid2 = new Image();
    private static Image cliffBottomLeft = new Image();
    private static Image cliffBottomLeft2 = new Image();
    private static Image cliffBottomLeft3 = new Image();
    private static Image cliffBottomMid = new Image();
    private static Image cliffBottomRight = new Image();
    private static Image cliffRight = new Image();
    private static Image lampTop = new Image();
    private static Image lamp = new Image();
    private static Image lampBottom = new Image();
    private static Image stairs = new Image();
    private static Image empty = new Image();
    private static Image black = new Image();
    private static Image carpetBottomLeft = new Image();
    private static Image carpetBottomLeft2 = new Image();
    private static Image carpetBottomLeft3 = new Image();
    private static Image carpetBottomLeft4 = new Image();
    private static Image carpetBottomMid = new Image();
    private static Image carpetBottomMid2 = new Image();
    private static Image carpetBottomRight = new Image();
    private static Image carpetBottomRight2 = new Image();
    private static Image carpetMid = new Image();
    private static Image carpetRight = new Image();
    private static Image ceilingBottomLeft = new Image();
    private static Image ceilingBottomLeft2 = new Image();
    private static Image ceilingBottomLeft3 = new Image();
    private static Image ceilingBottomMid = new Image();
    private static Image ceilingBottomRight = new Image();
    private static Image ceilingBottomRight2 = new Image();
    private static Image ceilingLeft = new Image();
    private static Image ceilingLeft2 = new Image();
    private static Image ceilingMid = new Image();
    private static Image ceilingMid2 = new Image();
    private static Image ceilingMid3 = new Image();
    private static Image ceilingRight = new Image();
    private static Image ceilingRight2 = new Image();
    private static Image ceilingRight3 = new Image();
    private static Image ceilingRight4 = new Image();
    private static Image ceilingTopLeft = new Image();
    private static Image ceilingTopLeft2 = new Image();
    private static Image ceilingTopLeft3 = new Image();
    private static Image ceilingTopMid = new Image();
    private static Image ceilingTopMid2 = new Image();
    private static Image ceilingTopMid3 = new Image();
    private static Image ceilingTopMid4 = new Image();
    private static Image ceilingTopRight = new Image();
    private static Image ceilingTopRight2 = new Image();
    private static Image ceilingTopRight3 = new Image();
    private static Image ceilingTopRight4 = new Image();
    private static Image floor = new Image();
    private static Image floor2 = new Image();
    private static Image floor3 = new Image();
    private static Image floor4 = new Image();
    private static Image floor5 = new Image();
    private static Image floor6 = new Image();
    private static Image floorLeft = new Image();
    private static Image floorLeft2 = new Image();
    private static Image floorMid = new Image();
    private static Image floorRight = new Image();
    private static Image furniture = new Image();
    private static Image furniture2 = new Image();
    private static Image furniture3 = new Image();
    private static Image furniture4 = new Image();
    private static Image furniture5 = new Image();
    private static Image furniture6 = new Image();
    private static Image furniture7 = new Image();
    private static Image furniture8 = new Image();
    private static Image furniture9 = new Image();
    private static Image furniture10 = new Image();
    private static Image furnitureBottom = new Image();
    private static Image furnitureBottom2 = new Image();
    private static Image furnitureBottom3 = new Image();
    private static Image furnitureBottom4 = new Image();
    private static Image furnitureBottom6 = new Image();
    private static Image furnitureBottom7 = new Image();
    private static Image furnitureBottomRight = new Image();
    private static Image furnitureLeft = new Image();
    private static Image furnitureLeft2 = new Image();
    private static Image furnitureLeft3 = new Image();
    private static Image furnitureMid = new Image();
    private static Image furnitureMid2 = new Image();
    private static Image furnitureMid3 = new Image();
    private static Image furnitureRight = new Image();
    private static Image furnitureRight2 = new Image();
    private static Image furnitureTop = new Image();
    private static Image furnitureTop2 = new Image();
    private static Image furnitureTop3 = new Image();
    private static Image furnitureTop4 = new Image();
    private static Image furnitureTop5 = new Image();
    private static Image furnitureTop6 = new Image();
    private static Image furnitureTopLeft = new Image();
    private static Image furnitureTopRight = new Image();
    private static Image furnitureTopLeft2 = new Image();
    private static Image furnitureTopRight2 = new Image();
    private static Image houseWallBottom = new Image();
    private static Image houseWallBottom2 = new Image();
    private static Image houseWallBottom3 = new Image();
    private static Image houseWallBottom4 = new Image();
    private static Image houseWallBottom5 = new Image();
    private static Image houseWallBottom6 = new Image();
    private static Image houseWallBottom7 = new Image();
    private static Image houseWallBottom8 = new Image();
    private static Image houseWallLeft = new Image();
    private static Image houseWallMid = new Image();
    private static Image houseWallRight = new Image();
    private static Image houseWallTop = new Image();
    private static Image houseWallTop2 = new Image();
    private static Image houseWallTop3 = new Image();
    private static Image houseWallTop4 = new Image();
    private static Image houseWallTop5 = new Image();
    private static Image houseWallTop6 = new Image();
    private static Image stair = new Image();

    private static Image passerby = new Image();
    private static Image passerby2 = new Image();
    private static Image passerby3 = new Image();
    private static Image passerby4 = new Image();
    private static Image passerby5 = new Image();
    private static Image passerby6 = new Image();
    private static Image passerby7 = new Image();
    private static Image passerby8 = new Image();
    private static Image passerby9 = new Image();
    private static Image theOld = new Image();
    private static Image monster0 = new Image();
    private static Image monster1 = new Image();
    private static Image monster2 = new Image();
    private static Image monster3 = new Image();
    private static Image monster4 = new Image();
    private static Image monster5 = new Image();
    private static Image monster6 = new Image();
    private static Image monster7 = new Image();
    private static Image monster8 = new Image();
    private static Image monster9 = new Image();

    private static Image spirit = new Image();
    private static Image spirit2 = new Image();

    private static Image weaponOwner = new Image();
    private static Image drugOwner = new Image();
    private static Image hotelOwner = new Image();
    private static Image armorOwner = new Image();


    private static Image image;
    private static MapKind imageKind;


    private static Image forest2 = new Image();
    private static Image forest3 = new Image();
    private static Image forest4 = new Image();
    private static Image forest5 = new Image();
    private static Image forest6 = new Image();
    private static Image forest7 = new Image();
    private static Image forest8 = new Image();
    private static Image forest9 = new Image();
    private static Image forest10 = new Image();
    private static Image forest11 = new Image();
    private static Image forest12 = new Image();
    private static Image forest13 = new Image();
    private static Image forest14 = new Image();
    private static Image forest15 = new Image();
    private static Image forest16 = new Image();
    private static Image forest17 = new Image();
    private static Image forest18 = new Image();
    private static Image forest19 = new Image();
    private static Image forest20 = new Image();
    private static Image forest21 = new Image();
    private static Image forest22 = new Image();
    private static Image forest23 = new Image();
    private static Image forest24 = new Image();
    private static Image forest25 = new Image();
    private static Image forest26 = new Image();
    private static Image forest27 = new Image();
    private static Image forest28 = new Image();
    private static Image forest29 = new Image();
    private static Image forest30 = new Image();
    private static Image forest31= new Image();
    private static Image forest32 = new Image();
    private static Image forest33 = new Image();
    private static Image forest34 = new Image();
    private static Image forest35 = new Image();
    private static Image forest36 = new Image();
    private static Image forest37 = new Image();
    private static Image forest38 = new Image();
    private static Image forest39 = new Image();
    private static Image forest40 = new Image();
    private static Image forest41 = new Image();
    private static Image forest42= new Image();
    private static Image forest43= new Image();
    private static Image forest44 = new Image();
    private static Image forest45 = new Image();
    private static Image forest46 = new Image();
    private static Image forest47 = new Image();
    private static Image forest48 = new Image();
    private static Image forest49 = new Image();
    private static Image forest50 = new Image();
    private static Image forest51 = new Image();
    private static Image forest52 = new Image();
    private static Image forest53 = new Image();
    private static Image forest54 = new Image();
    private static Image forest55  = new Image();
    private static Image forest56 = new Image();
    private static Image forest57 = new Image();
    private static Image forest58 = new Image();
    private static Image forest59 = new Image();
    private static Image forest60 = new Image();
    private static Image forest61 = new Image();
    private static Image forest62 = new Image();
    private static Image forest63 = new Image();
    private static Image forest64 = new Image();
    private static Image forest65 = new Image();
    private static Image forest66 = new Image();
    private static Image forest67 = new Image();

    private static Image forest68 = new Image();
    private static Image forest69 = new Image();
    private static Image forest70 = new Image();
    private static Image forest71 = new Image();
    private static Image forest72 = new Image();
    private static Image forest73 = new Image();
    private static Image forest74 = new Image();
    private static Image forest75 = new Image();
    private static Image forest76 = new Image();
    private static Image forest77 = new Image();
    private static Image forest78 = new Image();
    private static Image forest79 = new Image();
    private static Image forest80 = new Image();
    private static Image forest81 = new Image();
    private static Image forest82 = new Image();
    private static Image forest83 = new Image();
    private static Image forest84 = new Image();
    private static Image forest85 = new Image();
    private static Image forest86 = new Image();
    private static Image forest87 = new Image();
    private static Image forest88 = new Image();
    private static Image forest89 = new Image();
    private static Image forest90 = new Image();
    private static Image forest91 = new Image();
    private static Image forest92 = new Image();
    private static Image forest93 = new Image();
    private static Image forest94 = new Image();
    private static Image forest95 = new Image();
    private static Image forest96 = new Image();
    private static Image forest97 = new Image();
    private static Image forest98 = new Image();
    private static Image forest99 = new Image();
    private static Image forest100 = new Image();
    private static Image forest101 = new Image();
    private static Image forest102 = new Image();
    private static Image forest103 = new Image();
    private static Image forest104 = new Image();
    private static Image forest105 = new Image();
    private static Image forest106 = new Image();
    private static Image forest107 = new Image();
    private static Image forest108 = new Image();
    private static Image forest109 = new Image();
    private static Image forest110 = new Image();
    private static Image forest111 = new Image();
    private static Image forest112 = new Image();
    private static Image forest113 = new Image();
    private static Image forest114 = new Image();
    private static Image forest115 = new Image();
    private static Image tentLeft = new Image();
    private static Image tentMid = new Image();
    private static Image tentRight = new Image();


    private static Image armor1 = new Image();
    private static Image armor2 = new Image();
    private static Image armor3 = new Image();
    private static Image armor4 = new Image();
    private static Image armor5 = new Image();
    private static Image armor6 = new Image();
    private static Image armor7 = new Image();
    private static Image armor8 = new Image();
    private static Image armor9 = new Image();
    private static Image armor10 = new Image();
    private static Image armor11= new Image();
    private static Image armor12 = new Image();
    private static Image armor13 = new Image();
    private static Image armor14 = new Image();
    private static Image armor15 = new Image();
    private static Image armor16 = new Image();
    private static Image armor17 = new Image();
    private static Image armor18 = new Image();
    private static Image armor19 = new Image();
    private static Image armor20 = new Image();
    private static Image armor21 = new Image();
    private static Image armor22 = new Image();
    private static Image armor23 = new Image();
    private static Image armor24 = new Image();
    private static Image armor25 = new Image();
    private static Image armor26 = new Image();
    private static Image armor27 = new Image();
    private static Image armor28 = new Image();
    private static Image armor29 = new Image();
    private static Image armor30 = new Image();
    private static Image armor31 = new Image();
    private static Image armor32 = new Image();
    private static Image armor33 = new Image();
    private static Image armor34 = new Image();
    private static Image armor35 = new Image();
    private static Image armor36 = new Image();
    private static Image armor37 = new Image();
    private static Image armor38 = new Image();
    private static Image armor39 = new Image();
    private static Image armor40 = new Image();
    private static Image armor41 = new Image();
    private static Image armor42 = new Image();
    private static Image armor43 = new Image();
    private static Image armor44 = new Image();
    private static Image armor45 = new Image();



    private static Image tower1f1 = new Image();
    private static Image tower1f2 = new Image();
    private static Image tower1f3 = new Image();
    private static Image tower1f4 = new Image();
    private static Image tower1f5 = new Image();
    private static Image tower1f6 = new Image();
    private static Image tower1f7 = new Image();
    private static Image tower1f8 = new Image();
    private static Image tower1f9 = new Image();
    private static Image tower1f10 = new Image();
    private static Image tower1f11 = new Image();
    private static Image tower1f12 = new Image();
    private static Image tower1f13 = new Image();
    private static Image tower1f14 = new Image();
    private static Image tower1f15 = new Image();
    private static Image tower1f16 = new Image();
    private static Image tower1f17 = new Image();
    private static Image tower1f18 = new Image();
    private static Image tower1f19 = new Image();
    private static Image tower1f20 = new Image();
    private static Image tower1f21 = new Image();
    private static Image tower1f22 = new Image();
    private static Image tower1f23 = new Image();
    private static Image tower1f24 = new Image();
    private static Image tower1f25 = new Image();
    private static Image tower1f26 = new Image();
    private static Image tower1f27 = new Image();
    private static Image tower1f28 = new Image();
    private static Image tower1f29 = new Image();
    private static Image tower1f30 = new Image();
    private static Image tower1f31 = new Image();
    private static Image tower1f32 = new Image();
    private static Image tower1f33 = new Image();
    private static Image tower1f34 = new Image();
    private static Image tower1f35 = new Image();
    private static Image tower1f36 = new Image();
    private static Image tower1f37 = new Image();
    private static Image tower1f38 = new Image();
    private static Image tower1f39 = new Image();
    private static Image tower1f40 = new Image();
    private static Image tower1f41 = new Image();
    private static Image tower1f42 = new Image();
    private static Image tower1f43 = new Image();
    private static Image tower1f44 = new Image();
    private static Image tower1f45 = new Image();
    private static Image tower1f46 = new Image();
    private static Image tower1f47 = new Image();
    private static Image tower1f48 = new Image();
    private static Image tower1f49 = new Image();
    private static Image tower1f50 = new Image();
    private static Image tower1f51 = new Image();
    private static Image tower1f52 = new Image();
    private static Image tower1f53 = new Image();
    private static Image tower1f54 = new Image();
    private static Image tower1f55 = new Image();
    private static Image tower1f56 = new Image();
    private static Image tower1f57 = new Image();
    private static Image tower1f58 = new Image();
    private static Image tower1f59 = new Image();
    private static Image tower1f60 = new Image();
    private static Image tower1f61 = new Image();
    private static Image tower1f62 = new Image();
    private static Image tower1f63 = new Image();
    private static Image tower1f64 = new Image();
    private static Image tower1f65 = new Image();
    private static Image tower1f66 = new Image();
    private static Image tower1f67 = new Image();
    private static Image tower1f68 = new Image();
    private static Image tower1f69 = new Image();
    private static Image tower1f70 = new Image();
    private static Image tower1f71 = new Image();
    private static Image tower1f72 = new Image();
    private static Image tower1f73 = new Image();
    private static Image tower1f74 = new Image();
    private static Image tower1f75 = new Image();
    private static Image tower1f76 = new Image();
    private static Image tower1f77 = new Image();
    private static Image tower1f78 = new Image();
    private static Image tower1f79 = new Image();
    private static Image tower1f80 = new Image();
    private static Image tower1f81 = new Image();

    private static Image weapon9 = new Image();
    private static Image weapon10 = new Image();
    private static Image weapon11 = new Image();
    private static Image weapon12 = new Image();
    private static Image weapon13 = new Image();
    private static Image weapon14 = new Image();
    private static Image weapon15 = new Image();
    private static Image weapon16 = new Image();
    private static Image weapon17 = new Image();
    private static Image weapon18 = new Image();
    private static Image weapon19 = new Image();
    private static Image weapon20 = new Image();
    private static Image weapon21 = new Image();
    private static Image weapon22 = new Image();
    private static Image weapon23 = new Image();
    private static Image weapon24 = new Image();
    private static Image weapon25 = new Image();
    private static Image weapon26 = new Image();
    private static Image weapon27 = new Image();
    private static Image weapon28 = new Image();
    private static Image weapon29 = new Image();
    private static Image weapon30 = new Image();
    private static Image weapon31 = new Image();
    private static Image weapon32 = new Image();
    private static Image weapon33 = new Image();
    private static Image weapon34 = new Image();
    private static Image weapon35 = new Image();
    private static Image weapon36 = new Image();
    private static Image weapon37 = new Image();
    private static Image weapon38 = new Image();
    private static Image weapon39 = new Image();
    private static Image weapon40 = new Image();
    private static Image weapon41 = new Image();
    private static Image weapon42 = new Image();
    private static Image weapon43 = new Image();
    private static Image weapon44 = new Image();
    private static Image weapon45 = new Image();
    private static Image weapon46 = new Image();
    private static Image weapon47 = new Image();
    private static Image weapon48 = new Image();
    private static Image weapon49 = new Image();
    private static Image weapon50 = new Image();
    private static Image weapon51 = new Image();
    private static Image weapon52 = new Image();
    private static Image weapon53 = new Image();
    private static Image weapon54 = new Image();
    private static Image weapon55 = new Image();
    private static Image weapon56 = new Image();
    private static Image weapon57 = new Image();
    private static Image weapon58 = new Image();
    private static Image weapon59 = new Image();
    private static Image weapon60 = new Image();
    private static Image weapon61 = new Image();
    private static Image weapon62 = new Image();
    private static Image weapon63 = new Image();
    private static Image weapon64 = new Image();
    private static Image weapon65 = new Image();

    private static Image hotel2F1 = new Image();

    private static Image bed1 = new Image();
    private static Image bed2 = new Image();
    private static Image bed3 = new Image();
    private static Image bed4 = new Image();
    private static Image bed5 = new Image();
    private static Image bed6 = new Image();
    private static Image bed7 = new Image();
    private static Image bed8 = new Image();
    private static Image bed9 = new Image();
    private static Image bed10 = new Image();
    private static Image bed11 = new Image();
    private static Image bed12 = new Image();
    private static Image bed13 = new Image();
    private static Image bed14 = new Image();
    private static Image bed15 = new Image();
    private static Image bed16 = new Image();
    private static Image bed17 = new Image();
    private static Image bed18 = new Image();
    private static Image bed19 = new Image();
    private static Image bed20 = new Image();
    private static Image bed21 = new Image();
    private static Image bed22 = new Image();
    private static Image bed23 = new Image();
    private static Image bed24 = new Image();
    private static Image bed25 = new Image();
    private static Image bed26 = new Image();
    private static Image bed27 = new Image();
    private static Image bed28 = new Image();
    private static Image bed29 = new Image();
    private static Image bed30 = new Image();
    private static Image bed31 = new Image();
    private static Image bed32 = new Image();
    private static Image bed33 = new Image();
    private static Image bed34 = new Image();
    private static Image bed35 = new Image();
    private static Image bed36 = new Image();
    private static Image bed37 = new Image();
    private static Image bed38 = new Image();
    private static Image bed39 = new Image();
    private static Image bed40 = new Image();
    private static Image bed41 = new Image();
    private static Image bed42 = new Image();
    private static Image bed43 = new Image();
    private static Image bed44 = new Image();
    private static Image bed45 = new Image();
    private static Image bed46 = new Image();
    private static Image bed47 = new Image();
    private static Image bed48 = new Image();
    private static Image bed49 = new Image();
    private static Image bed50 = new Image();

    private static Image drug1 = new Image();
    private static Image drug2 = new Image();
    private static Image drug3 = new Image();
    private static Image drug4 = new Image();
    private static Image drug5 = new Image();
    private static Image drug6 = new Image();
    private static Image drug7 = new Image();
    private static Image drug8 = new Image();
    private static Image drug9 = new Image();
    private static Image drug10 = new Image();
    private static Image drug11 = new Image();
    private static Image drug12 = new Image();
    private static Image drug13 = new Image();
    private static Image drug14 = new Image();
    private static Image drug15 = new Image();
    private static Image drug16 = new Image();
    private static Image drug17 = new Image();

    private static Image towertop1 = new Image();
    private static Image towertop2 = new Image();
    private static Image towertop3 = new Image();
    private static Image towertop4 = new Image();
    private static Image towertop5 = new Image();

    private static Image towertop6 = new Image();
    private static Image towertop7 = new Image();
    private static Image towertop8 = new Image();
    private static Image towertop9 = new Image();
    private static Image towertop10 = new Image();
    private static Image towertop11 = new Image();
    private static Image towertop12 = new Image();
    private static Image towertop13 = new Image();
    private static Image towertop14 = new Image();
    private static Image towertop15 = new Image();
    private static Image towertop16 = new Image();
    private static Image towertop17 = new Image();
    private static Image towertop18 = new Image();
    private static Image towertop19 = new Image();
    private static Image towertop20 = new Image();
    private static Image towertop21 = new Image();
    private static Image towertop22 = new Image();
    private static Image towertop23 = new Image();
    private static Image towertop24 = new Image();
    private static Image towertop25 = new Image();
    private static Image towertop26 = new Image();
    private static Image towertop27 = new Image();
    private static Image towertop28 = new Image();
    private static Image towertop29 = new Image();
    private static Image towertop30 = new Image();
    private static Image towertop31 = new Image();
    private static Image towertop32 = new Image();
    private static Image towertop33 = new Image();
    private static Image towertop34 = new Image();
    private static Image towertop35 = new Image();
    private static Image towertop36 = new Image();
    private static Image towertop37 = new Image();
    private static Image towertop38 = new Image();
    private static Image towertop39 = new Image();
    private static Image towertop40 = new Image();
    private static Image towertop41 = new Image();
    private static Image towertop42 = new Image();
    private static Image towertop43 = new Image();
    private static Image towertop44 = new Image();
    private static Image towertop45 = new Image();
    private static Image towertop46 = new Image();
    private static Image towertop47 = new Image();
    private static Image towertop48 = new Image();
    private static Image towertop49 = new Image();
    private static Image towertop50 = new Image();
    private static Image towertop51 = new Image();

    private static Image tower2F1 = new Image();
    private static Image tower2F2 = new Image();
    private static Image tower2F3 = new Image();
    private static Image tower2F4 = new Image();
    private static Image tower2F5 = new Image();
    private static Image tower2F6 = new Image();
    private static Image tower2F7 = new Image();
    private static Image tower2F8 = new Image();
    private static Image tower2F9 = new Image();
    private static Image tower2F10 = new Image();
    private static Image tower2F11 = new Image();
    private static Image tower2F12 = new Image();
    private static Image tower2F13 = new Image();
    private static Image tower2F14 = new Image();

    private static Image house1F1 = new Image();
    private static Image house1F2 = new Image();
    private static Image house1F3 = new Image();
    private static Image house1F4 = new Image();
    private static Image house1F5 = new Image();
    private static Image house1F6 = new Image();
    private static Image house1F7 = new Image();
    private static Image house1F8 = new Image();
    private static Image house1F9 = new Image();
    private static Image house1F10 = new Image();
    private static Image house1F11 = new Image();
    private static Image house1F12 = new Image();
    private static Image house1F13 = new Image();
    private static Image house1F14 = new Image();
    private static Image house1F15 = new Image();
    private static Image house1F16 = new Image();
    private static Image house1F17 = new Image();
    private static Image house1F18 = new Image();
    private static Image house1F19 = new Image();
    private static Image house1F20 = new Image();
    private static Image house1F21 = new Image();
    private static Image house1F22 = new Image();
    private static Image house1F23 = new Image();
    private static Image house1F24 = new Image();
    private static Image house1F25 = new Image();
    private static Image house1F26 = new Image();
    private static Image house1F27 = new Image();
    private static Image house1F28 = new Image();
    private static Image house1F29 = new Image();
    private static Image house1F30 = new Image();

    private static Image house2F1 = new Image();
    private static Image house2F2 = new Image();
    private static Image house2F3 = new Image();
    private static Image house2F4 = new Image();
    private static Image house2F5 = new Image();
    private static Image house2F6 = new Image();
    private static Image house2F7 = new Image();
    private static Image house2F8 = new Image();
    private static Image house2F9 = new Image();
    private static Image house2F10 = new Image();
    private static Image house2F11 = new Image();
    private static Image house2F12 = new Image();
    private static Image house2F13 = new Image();
    private static Image house2F14 = new Image();
    private static Image house2F15 = new Image();
    private static Image house2F16 = new Image();
    private static Image house2F17 = new Image();
    private static Image house2F18 = new Image();
    private static Image house2F19 = new Image();
    private static Image house2F20 = new Image();
    private static Image house2F21 = new Image();
    private static Image house2F22 = new Image();
    private static Image house2F23 = new Image();
    private static Image house2F24 = new Image();
    private static Image house2F25 = new Image();
    private static Image house2F26 = new Image();
    private static Image house2F27 = new Image();
    private static Image house2F28 = new Image();
    private static Image house2F29 = new Image();
    private static Image house2F30 = new Image();
    private static Image house2F31 = new Image();
    private static Image house2F32 = new Image();
    private static Image house2F33 = new Image();
    private static Image house2F34 = new Image();
    private static Image house2F35 = new Image();
    private static Image house2F36 = new Image();
    private static Image house2F37 = new Image();
    private static Image house2F38 = new Image();
    private static Image house2F39 = new Image();
    private static Image house2F40 = new Image();
    private static Image house2F41 = new Image();
    private static Image house2F42 = new Image();
    private static Image house2F43 = new Image();
    private static Image house2F44 = new Image();
    private static Image house2F45 = new Image();
    private static Image house2F46 = new Image();

    private static Image snow1 = new Image();
    private static Image snow2 = new Image();
    private static Image snow3 = new Image();
    private static Image snow4 = new Image();
    private static Image snow5 = new Image();
    private static Image snow6 = new Image();
    private static Image snow7 = new Image();
    private static Image snow8 = new Image();
    private static Image snow9 = new Image();
    private static Image snow10 = new Image();
    private static Image snow11 = new Image();
    private static Image snow12 = new Image();
    private static Image snow13 = new Image();
    private static Image snow14 = new Image();
    private static Image snow15 = new Image();
    private static Image snow16 = new Image();
    private static Image snow17 = new Image();
    private static Image snow18 = new Image();
    private static Image snow19 = new Image();
    private static Image snow20 = new Image();
    private static Image snow21 = new Image();
    private static Image snow22 = new Image();
    private static Image snow23 = new Image();
    private static Image snow24 = new Image();
    private static Image snow25 = new Image();
    private static Image snow26 = new Image();
    private static Image snow27 = new Image();
    private static Image snow28 = new Image();
    private static Image snow29 = new Image();
    private static Image snow30 = new Image();
    private static Image snow31 = new Image();
    private static Image snow32 = new Image();
    private static Image snow33 = new Image();
    private static Image snow34 = new Image();
    private static Image snow35 = new Image();
    private static Image snow36 = new Image();
    private static Image snow37 = new Image();
    private static Image snow38 = new Image();
    private static Image snow39 = new Image();
    private static Image snow40 = new Image();
    private static Image snow41 = new Image();
    private static Image snow42 = new Image();
    private static Image snow43 = new Image();
    private static Image snow44 = new Image();
    private static Image snow45 = new Image();
    private static Image snow46 = new Image();
    private static Image snow47 = new Image();
    private static Image snow48 = new Image();
    private static Image snow49 = new Image();
    private static Image snow50 = new Image();
    private static Image snow51 = new Image();
    private static Image snow52 = new Image();
    private static Image snow53 = new Image();
    private static Image snow54 = new Image();
    private static Image snow55 = new Image();
    private static Image snow56 = new Image();
    private static Image snow57 = new Image();
    private static Image snow58 = new Image();
    private static Image snow59 = new Image();
    private static Image snow60 = new Image();
    private static Image snow61 = new Image();
    private static Image snow62 = new Image();
    private static Image snow63 = new Image();
    private static Image snow64 = new Image();
    private static Image snow65 = new Image();
    private static Image snow66 = new Image();
    private static Image snow67 = new Image();
    private static Image snow68 = new Image();
    private static Image snow69 = new Image();
    private static Image snow70 = new Image();
    private static Image snow71 = new Image();
    private static Image snow72 = new Image();
    private static Image snow73 = new Image();
    private static Image snow74 = new Image();
    private static Image snow75 = new Image();
    private static Image snow76 = new Image();
    private static Image snow77 = new Image();
    private static Image snow78 = new Image();
    private static Image snow79 = new Image();
    private static Image snow80 = new Image();
    private static Image snow81 = new Image();
    private static Image snow82 = new Image();
    private static Image snow83 = new Image();
    private static Image snow84 = new Image();
    private static Image snow85 = new Image();
    private static Image snow86 = new Image();
    private static Image snow87 = new Image();
    private static Image snow88 = new Image();
    private static Image snow89 = new Image();
    private static Image snow90 = new Image();
    private static Image snow91 = new Image();
    private static Image snow92 = new Image();
    private static Image snow93 = new Image();
    private static Image snow94 = new Image();
    private static Image snow95 = new Image();
    private static Image snow96 = new Image();
    private static Image snow97 = new Image();
    private static Image snow98 = new Image();
    private static Image snow99 = new Image();
    private static Image snow100 = new Image();
    private static Image snow101 = new Image();
    private static Image snow102 = new Image();
    private static Image snow103 = new Image();
    private static Image snow104 = new Image();
    private static Image snow105 = new Image();
    private static Image snow106 = new Image();
    private static Image snow107 = new Image();
    private static Image snow108 = new Image();
    private static Image snow109 = new Image();
    private static Image snow110 = new Image();
    private static Image snow111 = new Image();
    private static Image snow112 = new Image();
    private static Image snow113 = new Image();
    private static Image snow114 = new Image();
    private static Image snow115 = new Image();
    private static Image snow116 = new Image();
    private static Image snow117 = new Image();
    private static Image snow118 = new Image();
    private static Image snow119 = new Image();
    private static Image snow120 = new Image();
    private static Image snow121 = new Image();
    private static Image snow122 = new Image();
    private static Image snow123 = new Image();
    private static Image snow124 = new Image();
    private static Image snow125 = new Image();
    private static Image snow126 = new Image();
    private static Image snow127 = new Image();
    private static Image snow128 = new Image();
    private static Image snow129 = new Image();
    private static Image snow130 = new Image();
    private static Image snow131 = new Image();
    private static Image snow132 = new Image();
    private static Image snow133 = new Image();
    private static Image snow134 = new Image();
    private static Image snow135 = new Image();
    private static Image snow136 = new Image();
    private static Image snow137 = new Image();
    private static Image snow138 = new Image();
    private static Image snow139 = new Image();
    private static Image snow140 = new Image();

    private static Image bedthree1 = new Image();
    private static Image bedthree2 = new Image();
    private static Image bedthree3 = new Image();
    private static Image bedthree4 = new Image();
    private static Image bedthree5 = new Image();
    private static Image bedthree6 = new Image();
    private static Image bedthree7 = new Image();
    private static Image bedthree8 = new Image();
    private static Image bedthree9 = new Image();
    private static Image bedthree10 = new Image();
    private static Image bedthree11 = new Image();
    private static Image bedthree12 = new Image();
    private static Image bedthree13 = new Image();
    private static Image bedthree14 = new Image();
    private static Image bedthree15 = new Image();
    private static Image bedthree16 = new Image();
    private static Image bedthree17 = new Image();
    private static Image bedthree18 = new Image();
    private static Image bedthree19 = new Image();
    private static Image bedthree20 = new Image();
    private static Image bedthree21 = new Image();
    private static Image bedthree22 = new Image();
    private static Image bedthree23 = new Image();
    private static Image bedthree24 = new Image();
    private static Image bedthree25 = new Image();
    private static Image bedthree26 = new Image();
    private static Image bedthree27 = new Image();
    private static Image bedthree28 = new Image();
    private static Image bedthree29 = new Image();
    private static Image bedthree30 = new Image();
    private static Image bedthree31 = new Image();


    static{

        try {
            timberpileMid.loadFromFile(Paths.get("resource/map/icon1/timberpileMid.jpg"));
            timberpileRight.loadFromFile(Paths.get("resource/map/icon1/timberpileRight.jpg"));
            timberpileLeft.loadFromFile(Paths.get("resource/map/icon1/timberpileLeft.jpg"));
            timberpileLeft2.loadFromFile(Paths.get("resource/map/icon1/timberpileLeft2.jpg"));
            timberpileRight2.loadFromFile(Paths.get("resource/map/icon1/timberpileRight2.jpg"));
            fenceTopLeft.loadFromFile(Paths.get("resource/map/icon1/fenceTopLeft.jpg"));
            fenceVertical.loadFromFile(Paths.get("resource/map/icon1/fenceVertical.jpg"));
            fenceTopRight.loadFromFile(Paths.get("resource/map/icon1/fenceTopRight.jpg"));
            fenceBottomLeft.loadFromFile(Paths.get("resource/map/icon1/fenceBottomLeft.jpg"));
            fenceBottomLeft2.loadFromFile(Paths.get("resource/map/icon1/fenceBottomLeft2.jpg"));
            fenceBottomMid.loadFromFile(Paths.get("resource/map/icon1/fenceBottomMid.jpg"));
            fenceBottomRight.loadFromFile(Paths.get("resource/map/icon1/fenceBottomRight.jpg"));
            fenceBottomRight2.loadFromFile(Paths.get("resource/map/icon1/fenceBottomRight2.jpg"));
            lawn.loadFromFile(Paths.get("resource/map/icon1/lawn.png"));
            lawn2.loadFromFile(Paths.get("resource/map/icon1/lawn2.jpg"));
            lawn3.loadFromFile(Paths.get("resource/map/icon1/lawn3.jpg"));
            lawn4.loadFromFile(Paths.get("resource/map/icon1/lawn4.jpg"));
            lawn5.loadFromFile(Paths.get("resource/map/icon1/lawn5.jpg"));
            lawn6.loadFromFile(Paths.get("resource/map/icon1/lawn6.jpg"));
            lawn7.loadFromFile(Paths.get("resource/map/icon1/lawn7.jpg"));
            lawn8.loadFromFile(Paths.get("resource/map/icon1/lawn8.jpg"));
            lawn9.loadFromFile(Paths.get("resource/map/icon1/lawn9.jpg"));
            lawnShadow.loadFromFile(Paths.get("resource/map/icon1/lawnShadow.jpg"));
            boxTop.loadFromFile(Paths.get("resource/map/icon1/boxTop.jpg"));
            boxBottom.loadFromFile(Paths.get("resource/map/icon1/boxBottom.jpg"));
            houseTopLeft.loadFromFile(Paths.get("resource/map/icon1/houseTopLeft.png"));
            houseTopLeft2.loadFromFile(Paths.get("resource/map/icon1/houseTopLeft2.png"));
            houseTopLeft3.loadFromFile(Paths.get("resource/map/icon1/houseTopLeft3.png"));
            houseTopMid.loadFromFile(Paths.get("resource/map/icon1/houseTopMid.png"));
            houseTopMid2.loadFromFile(Paths.get("resource/map/icon1/houseTopMid2.png"));
            houseTopMid3.loadFromFile(Paths.get("resource/map/icon1/houseTopMid3.jpg"));
            houseTopMid4.loadFromFile(Paths.get("resource/map/icon1/houseTopMid4.jpg"));
            houseTopMid5.loadFromFile(Paths.get("resource/map/icon1/houseTopMid5.jpg"));
            houseTopMid6.loadFromFile(Paths.get("resource/map/icon1/houseTopMid6.jpg"));
            houseTopMid7.loadFromFile(Paths.get("resource/map/icon1/houseTopMid7.png"));
            houseTopRight.loadFromFile(Paths.get("resource/map/icon1/houseTopRight.png"));
            houseTopRight2.loadFromFile(Paths.get("resource/map/icon1/houseTopRight2.png"));
            houseTopRight3.loadFromFile(Paths.get("resource/map/icon1/houseTopRight3.png"));
            houseBottomLeft.loadFromFile(Paths.get("resource/map/icon1/houseBottomLeftOut2.png"));
            houseBottomLeft2.loadFromFile(Paths.get("resource/map/icon1/houseBottomLeftIn.png"));
            houseBottomLeft3.loadFromFile(Paths.get("resource/map/icon1/houseBottomLeftOut3.jpg"));
            houseBottomLeft4.loadFromFile(Paths.get("resource/map/icon1/houseBottomLeftIn4.jpg"));
            houseBottomLeft5.loadFromFile(Paths.get("resource/map/icon1/houseBottomLeftOut5.png"));
            houseBottomLeft6.loadFromFile(Paths.get("resource/map/icon1/houseBottomLeftIn6.jpg"));
            houseBottomMid.loadFromFile(Paths.get("resource/map/icon1/houseBottomMid.jpg"));
            houseBottomMid2.loadFromFile(Paths.get("resource/map/icon1/houseBottomMid2.jpg"));
           // houseBottomMid3.loadFromFile(Paths.get("resource/map/icon1/houseBottomMid3.jpg"));
            houseBottomMid4.loadFromFile(Paths.get("resource/map/icon1/houseBottomMid4.jpg"));
            houseBottomMid5.loadFromFile(Paths.get("resource/map/icon1/houseBottomMid5.jpg"));
            houseBottomMid6.loadFromFile(Paths.get("resource/map/icon1/houseBottomMid6.jpg"));
            houseBottomMid7.loadFromFile(Paths.get("resource/map/icon1/houseBottomMid7.jpg"));
            houseBottomRight.loadFromFile(Paths.get("resource/map/icon1/houseBottomRightOut.jpg"));
            houseBottomRight2.loadFromFile(Paths.get("resource/map/icon1/houseBottomRightIn2.jpg"));
            houseBottomRight3.loadFromFile(Paths.get("resource/map/icon1/houseBottomRight3.jpg"));
            houseBottomRight4.loadFromFile(Paths.get("resource/map/icon1/houseBottomRightIn4.jpg"));
            houseBottomRight5.loadFromFile(Paths.get("resource/map/icon1/houseBottomRightOut5.jpg"));
            houseLeft.loadFromFile(Paths.get("resource/map/icon1/houseLeft.png"));
            houseLeft2.loadFromFile(Paths.get("resource/map/icon1/houseLeft2.png"));
            houseLeft3.loadFromFile(Paths.get("resource/map/icon1/houseLeft3.png"));
            houseMid.loadFromFile(Paths.get("resource/map/icon1/houseMid.png"));
            houseMid2.loadFromFile(Paths.get("resource/map/icon1/houseMid2.png"));
            houseMid3.loadFromFile(Paths.get("resource/map/icon1/houseMid3.jpg"));
            houseMid4.loadFromFile(Paths.get("resource/map/icon1/houseMid4.jpg"));
            houseMid5.loadFromFile(Paths.get("resource/map/icon1/houseMid5.jpg"));
            houseRight.loadFromFile(Paths.get("resource/map/icon1/houseRight.png"));
            houseRight2.loadFromFile(Paths.get("resource/map/icon1/houseRight2.png"));
            houseRight3.loadFromFile(Paths.get("resource/map/icon1/houseRight3.png"));
            wallLeft.loadFromFile(Paths.get("resource/map/icon1/wallLeft.jpg"));
            wallLeft2.loadFromFile(Paths.get("resource/map/icon1/wallLeft2.jpg"));
            wall.loadFromFile(Paths.get("resource/map/icon1/wall.jpg"));
            wall2.loadFromFile(Paths.get("resource/map/icon1/wall2.jpg"));
            wall3.loadFromFile(Paths.get("resource/map/icon1/wall3.jpg"));
            wall4.loadFromFile(Paths.get("resource/map/icon1/wall4.jpg"));
            wall5.loadFromFile(Paths.get("resource/map/icon1/wall5.jpg"));
            wallRight.loadFromFile(Paths.get("resource/map/icon1/wallRight.jpg"));
            wallRight2.loadFromFile(Paths.get("resource/map/icon1/wallRight2.jpg"));
            wallTop.loadFromFile(Paths.get("resource/map/icon1/wallTop.jpg"));
            wallTop2.loadFromFile(Paths.get("resource/map/icon1/wallTop2.jpg"));
            wallBottomLeft2.loadFromFile(Paths.get("resource/map/icon1/wallBottomLeft2.jpg"));
            wallBottomLeft.loadFromFile(Paths.get("resource/map/icon1/wallBottomLeft.jpg"));
            wallBottomMid.loadFromFile(Paths.get("resource/map/icon1/wallBottomMid.jpg"));
            wallBottomMid2.loadFromFile(Paths.get("resource/map/icon1/wallBottomMid2.jpg"));
            wallBottomMid3.loadFromFile(Paths.get("resource/map/icon1/wallBottomMid3.jpg"));
            wallBottomMid4.loadFromFile(Paths.get("resource/map/icon1/wallBottomMid4.jpg"));
            wallBottomMid5.loadFromFile(Paths.get("resource/map/icon1/wallBottomMid5.jpg"));
            wallBottomMid6.loadFromFile(Paths.get("resource/map/icon1/wallBottomMid6.jpg"));
            wallBottomMid7.loadFromFile(Paths.get("resource/map/icon1/wallBottomMid7.jpg"));
            wallBottomRight.loadFromFile(Paths.get("resource/map/icon1/wallBottomRight.jpg"));
            wallBottomRight2.loadFromFile(Paths.get("resource/map/icon1/wallBottomRight2.jpg"));
            windowTop.loadFromFile(Paths.get("resource/map/icon1/windowTop.jpg"));
            windowTop2.loadFromFile(Paths.get("resource/map/icon1/windowTop2.jpg"));
            windowTop3.loadFromFile(Paths.get("resource/map/icon1/windowTop3.jpg"));
            windowTop4.loadFromFile(Paths.get("resource/map/icon1/windowTop4.jpg"));
            windowTop5.loadFromFile(Paths.get("resource/map/icon1/windowTop5.jpg"));
            window.loadFromFile(Paths.get("resource/map/icon1/window.jpg"));
            window2.loadFromFile(Paths.get("resource/map/icon1/window2.jpg"));
            window3.loadFromFile(Paths.get("resource/map/icon1/window3.jpg"));
            window4.loadFromFile(Paths.get("resource/map/icon1/window4.jpg"));
            window5.loadFromFile(Paths.get("resource/map/icon1/window5.jpg"));
            window6.loadFromFile(Paths.get("resource/map/icon1/window6.jpg"));
            poolTopLeft.loadFromFile(Paths.get("resource/map/icon1/poolTopLeft.jpg"));
            poolTopMid.loadFromFile(Paths.get("resource/map/icon1/poolTopMid.jpg"));
            poolTopMid2.loadFromFile(Paths.get("resource/map/icon1/poolTopMidRight.jpg"));
            poolTopMid3.loadFromFile(Paths.get("resource/map/icon1/poolTopMid3.jpg"));
            poolTopRight.loadFromFile(Paths.get("resource/map/icon1/poolTopRight.jpg"));
            poolTopRight2.loadFromFile(Paths.get("resource/map/icon1/poolTopRight2.jpg"));
            poolBottomLeft.loadFromFile(Paths.get("resource/map/icon1/poolBottomLeft.jpg"));
            poolBottomLeft2.loadFromFile(Paths.get("resource/map/icon1/poolBottomLeft2.jpg"));
            poolBottomLeft3.loadFromFile(Paths.get("resource/map/icon1/poolTreeLeft.jpg"));
            poolBottomMid.loadFromFile(Paths.get("resource/map/icon1/poolBottomMid.jpg"));
            poolBottomRight.loadFromFile(Paths.get("resource/map/icon1/poolBottomRight.jpg"));
            poolBottomRight2.loadFromFile(Paths.get("resource/map/icon1/poolBottomRight2.jpg"));
            poolLeft.loadFromFile(Paths.get("resource/map/icon1/poolLeft.jpg"));
            poolMid.loadFromFile(Paths.get("resource/map/icon1/poolMid.jpg"));
            poolMid2.loadFromFile(Paths.get("resource/map/icon1/poolMid2.jpg"));
            poolRight.loadFromFile(Paths.get("resource/map/icon1/poolRight.jpg"));
            treeRoot.loadFromFile(Paths.get("resource/map/icon1/treeRoot.jpg"));
            treeRoot2.loadFromFile(Paths.get("resource/map/icon1/treeRoot2.jpg"));
            treeTop.loadFromFile(Paths.get("resource/map/icon1/treeTop.png"));
            treeTop2.loadFromFile(Paths.get("resource/map/icon1/treeTop2.jpg"));
            treeTop3.loadFromFile(Paths.get("resource/map/icon1/treeTop3.jpg"));
            treeTop4.loadFromFile(Paths.get("resource/map/icon1/treeTop4.jpg"));
            treeTop5.loadFromFile(Paths.get("resource/map/icon1/treeTop5.jpg"));
            treeTop6.loadFromFile(Paths.get("resource/map/icon1/treeTop6.jpg"));
            treeTopLeft.loadFromFile(Paths.get("resource/map/icon1/treeTopLeft.png"));
            treeTopLeft4.loadFromFile(Paths.get("resource/map/icon1/treeTopLeft4.jpg"));
            treeTopRight.loadFromFile(Paths.get("resource/map/icon1/treeTopRight.png"));
            treeBottomLeft.loadFromFile(Paths.get("resource/map/icon1/treeBottomLeft.jpg"));
            treeBottomLeft2.loadFromFile(Paths.get("resource/map/icon1/treeBottomLeft2.jpg"));
            treeBottomLeft3.loadFromFile(Paths.get("resource/map/icon1/treeBottomLeft3.jpg"));
            treeBottomLeft4.loadFromFile(Paths.get("resource/map/icon1/treeBottomLeft4.jpg"));
            treeBottomRight.loadFromFile(Paths.get("resource/map/icon1/treeBottomRight.jpg"));
            treeBottomRight2.loadFromFile(Paths.get("resource/map/icon1/treeBottomRight2.jpg"));
            treeBottomRight3.loadFromFile(Paths.get("resource/map/icon1/treeBottomRight3.jpg"));
            treeBottomRight4.loadFromFile(Paths.get("resource/map/icon1/treeBottomRight4.jpg"));
            door.loadFromFile(Paths.get("resource/map/icon1/door.jpg"));
            grassTopLeft.loadFromFile(Paths.get("resource/map/icon1/grassTopLeft.jpg"));
            grassTopMid.loadFromFile(Paths.get("resource/map/icon1/grassTopMid.jpg"));
            grassTopRight.loadFromFile(Paths.get("resource/map/icon1/grassTopRight.jpg"));
            grassLeft.loadFromFile(Paths.get("resource/map/icon1/grassLeft.jpg"));
            grassMid.loadFromFile(Paths.get("resource/map/icon1/grassMid.jpg"));
            grassRight.loadFromFile(Paths.get("resource/map/icon1/grassRight.jpg"));
            grassBottomLeft.loadFromFile(Paths.get("resource/map/icon1/grassBottomLeft.jpg"));
            grassBottomMid.loadFromFile(Paths.get("resource/map/icon1/grassBottomMid.jpg"));
            grassBottomRight.loadFromFile(Paths.get("resource/map/icon1/grassBottomRight.jpg"));
            stoneRoad.loadFromFile(Paths.get("resource/map/icon1/stoneRoad.jpg"));
            roadTopLeft.loadFromFile(Paths.get("resource/map/icon1/roadTopLeft.png"));
            roadTopMid.loadFromFile(Paths.get("resource/map/icon1/roadTopMid.jpg"));
            roadTopRight.loadFromFile(Paths.get("resource/map/icon1/roadTopRight.png"));
            roadLeft.loadFromFile(Paths.get("resource/map/icon1/roadLeft.jpg"));
            roadMid.loadFromFile(Paths.get("resource/map/icon1/roadMid.png"));
            roadRight.loadFromFile(Paths.get("resource/map/icon1/roadRight.jpg"));
            roadBottomLeft.loadFromFile(Paths.get("resource/map/icon1/roadBottomLeft.png"));
            roadBottomMid.loadFromFile(Paths.get("resource/map/icon1/roadBottomMid.jpg"));
            roadBottomRight.loadFromFile(Paths.get("resource/map/icon1/roadBottomRight.png"));
            cliffTopLeft.loadFromFile(Paths.get("resource/map/icon1/cliffTopLeft.jpg"));
            cliffLeft.loadFromFile(Paths.get("resource/map/icon1/cliffLeft.jpg"));
            cliffLeft2.loadFromFile(Paths.get("resource/map/icon1/cliffLeft2.jpg"));
            cliffMid.loadFromFile(Paths.get("resource/map/icon1/cliffMid.jpg"));
            cliffMid2.loadFromFile(Paths.get("resource/map/icon1/cliffMid2.jpg"));
            cliffBottomLeft.loadFromFile(Paths.get("resource/map/icon1/cliffBottomLeft.jpg"));
            cliffBottomLeft2.loadFromFile(Paths.get("resource/map/icon1/cliffBottomLeft2.jpg"));
            cliffBottomLeft3.loadFromFile(Paths.get("resource/map/icon1/cliffBottomLeft3.jpg"));
            cliffBottomMid.loadFromFile(Paths.get("resource/map/icon1/cliffBottomMid.jpg"));
            cliffBottomRight.loadFromFile(Paths.get("resource/map/icon1/cliffBottomRight.jpg"));
            cliffRight.loadFromFile(Paths.get("resource/map/icon1/cliffRight.jpg"));
            lampTop.loadFromFile(Paths.get("resource/map/icon1/lampTop.png"));
            lamp.loadFromFile(Paths.get("resource/map/icon1/lamp.png"));
            lampBottom.loadFromFile(Paths.get("resource/map/icon1/lampBottom.jpg"));
            stairs.loadFromFile(Paths.get("resource/map/icon1/stairs.jpg"));
            empty.loadFromFile(Paths.get("resource/map/icon1/0000.png"));
            stair.loadFromFile(Paths.get("resource/map/hotel1F/stair.png"));
            black.loadFromFile(Paths.get("resource/map/hotel1F/black.png"));
            floor.loadFromFile(Paths.get("resource/map/hotel1F/floor.png"));
            floor2.loadFromFile(Paths.get("resource/map/hotel1F/floor2.png"));
            floor3.loadFromFile(Paths.get("resource/map/hotel1F/floor3.png"));
            floor4.loadFromFile(Paths.get("resource/map/hotel1F/floor4.png"));
            floor5.loadFromFile(Paths.get("resource/map/hotel1F/floor5.png"));
            floor6.loadFromFile(Paths.get("resource/map/hotel1F/floor6.png"));
            floorLeft.loadFromFile(Paths.get("resource/map/hotel1F/floorLeft.png"));
            floorLeft2.loadFromFile(Paths.get("resource/map/hotel1F/floorLeft2.png"));
            floorMid.loadFromFile(Paths.get("resource/map/hotel1F/floorMid.png"));
            floorRight.loadFromFile(Paths.get("resource/map/hotel1F/floorRight.png"));
            carpetBottomLeft.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomLeft.png"));
            carpetBottomLeft2.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomLeft2.png"));
            carpetBottomLeft3.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomLeft3.png"));
            carpetBottomLeft4.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomLeft4.png"));
            carpetBottomMid.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomMid.png"));
            carpetBottomMid2.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomMid2.png"));
            carpetBottomRight.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomRight.png"));
            carpetBottomRight2.loadFromFile(Paths.get("resource/map/hotel1F/carpetBottomRight2.png"));
            carpetMid.loadFromFile(Paths.get("resource/map/hotel1F/carpetMid.png"));
            carpetRight.loadFromFile(Paths.get("resource/map/hotel1F/carpetRight.png"));
            ceilingBottomLeft.loadFromFile(Paths.get("resource/map/hotel1F/ceilingBottomLeft.png"));
            ceilingBottomLeft2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingBottomLeft2.png"));
            ceilingBottomLeft3.loadFromFile(Paths.get("resource/map/hotel1F/ceilingBottomLeft3.png"));
            ceilingBottomMid.loadFromFile(Paths.get("resource/map/hotel1F/ceilingBottomMid.png"));
            ceilingBottomRight.loadFromFile(Paths.get("resource/map/hotel1F/ceilingBottomRight.png"));
            ceilingBottomRight2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingBottomRight2.png"));
            ceilingLeft.loadFromFile(Paths.get("resource/map/hotel1F/ceilingLeft.png"));
            ceilingLeft2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingLeft2.png"));
            ceilingMid.loadFromFile(Paths.get("resource/map/hotel1F/ceilingMid.png"));
            ceilingMid2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingMid2.png"));
            ceilingMid3.loadFromFile(Paths.get("resource/map/hotel1F/ceilingMid3.png"));
            ceilingRight.loadFromFile(Paths.get("resource/map/hotel1F/ceilingRight.png"));
            ceilingRight2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingRight2.png"));
            ceilingRight3.loadFromFile(Paths.get("resource/map/hotel1F/ceilingRight3.png"));
            ceilingRight4.loadFromFile(Paths.get("resource/map/hotel1F/ceilingRight4.png"));
            ceilingTopLeft.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopLeft.png"));
            ceilingTopLeft2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopLeft2.png"));
            ceilingTopLeft3.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopLeft3.png"));
            ceilingTopMid.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopMid.png"));
            ceilingTopMid2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopMid2.png"));
            ceilingTopMid3.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopMid3.png"));
            ceilingTopMid4.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopMid4.png"));
            ceilingTopRight.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopRight.png"));
            ceilingTopRight2.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopRight2.png"));
            ceilingTopRight3.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopRight3.png"));
            ceilingTopRight4.loadFromFile(Paths.get("resource/map/hotel1F/ceilingTopRight4.png"));
            furniture.loadFromFile(Paths.get("resource/map/hotel1F/furniture.png"));
            furniture2.loadFromFile(Paths.get("resource/map/hotel1F/furniture2.png"));
            furniture3.loadFromFile(Paths.get("resource/map/hotel1F/furniture3.png"));
            furniture4.loadFromFile(Paths.get("resource/map/hotel1F/furniture4.png"));
            furniture5.loadFromFile(Paths.get("resource/map/hotel1F/furniture5.png"));
            furniture6.loadFromFile(Paths.get("resource/map/hotel1F/furniture6.png"));
            furniture7.loadFromFile(Paths.get("resource/map/hotel1F/furniture7.png"));
            furniture8.loadFromFile(Paths.get("resource/map/hotel1F/furniture8.png"));
            furniture9.loadFromFile(Paths.get("resource/map/hotel1F/furniture9.png"));
            furniture10.loadFromFile(Paths.get("resource/map/hotel1F/furniture10.png"));
            furnitureBottom.loadFromFile(Paths.get("resource/map/hotel1F/furnitureBottom.png"));
            furnitureBottom2.loadFromFile(Paths.get("resource/map/hotel1F/furnitureBottom2.png"));
            furnitureBottom3.loadFromFile(Paths.get("resource/map/hotel1F/furnitureBottom3.png"));
            furnitureBottom4.loadFromFile(Paths.get("resource/map/hotel1F/furnitureBottom4.png"));
            furnitureBottom6.loadFromFile(Paths.get("resource/map/hotel1F/furnitureBottom6.png"));
            furnitureBottom7.loadFromFile(Paths.get("resource/map/hotel1F/furnitureBottom7.png"));
            furnitureBottomRight.loadFromFile(Paths.get("resource/map/hotel1F/furnitureBottomRight.png"));
            furnitureLeft.loadFromFile(Paths.get("resource/map/hotel1F/furnitureLeft.png"));
            furnitureLeft2.loadFromFile(Paths.get("resource/map/hotel1F/furnitureLeft2.png"));
            furnitureLeft3.loadFromFile(Paths.get("resource/map/hotel1F/furnitureLeft3.png"));
            furnitureMid.loadFromFile(Paths.get("resource/map/hotel1F/furnitureMid.png"));
            furnitureMid2.loadFromFile(Paths.get("resource/map/hotel1F/furnitureMid2.png"));
            furnitureMid3.loadFromFile(Paths.get("resource/map/hotel1F/furnitureMid3.png"));
            furnitureRight.loadFromFile(Paths.get("resource/map/hotel1F/furnitureRight.png"));
            furnitureRight2.loadFromFile(Paths.get("resource/map/hotel1F/furnitureRight2.png"));
            furnitureTop.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTop.png"));
            furnitureTop2.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTop2.png"));
            furnitureTop3.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTop3.png"));
            furnitureTop4.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTop4.png"));
            furnitureTop5.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTop5.png"));
            furnitureTop6.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTop6.png"));
            furnitureTopLeft.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTopLeft.png"));
            furnitureTopRight.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTopRight.png"));
            furnitureTopLeft2.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTopLeft2.png"));
            furnitureTopRight2.loadFromFile(Paths.get("resource/map/hotel1F/furnitureTopRight2.png"));
            houseWallBottom.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom.png"));
            houseWallBottom2.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom2.png"));
            houseWallBottom3.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom3.png"));
            houseWallBottom4.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom4.png"));
            houseWallBottom5.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom5.png"));
            houseWallBottom6.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom6.png"));
            houseWallBottom7.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom7.png"));
            houseWallBottom8.loadFromFile(Paths.get("resource/map/hotel1F/houseWallBottom8.png"));
            houseWallLeft.loadFromFile(Paths.get("resource/map/hotel1F/houseWallLeft.png"));
            houseWallMid.loadFromFile(Paths.get("resource/map/hotel1F/houseWallMid.png"));
            houseWallRight.loadFromFile(Paths.get("resource/map/hotel1F/houseWallRight.png"));
            houseWallTop.loadFromFile(Paths.get("resource/map/hotel1F/houseWallTop.png"));
            houseWallTop2.loadFromFile(Paths.get("resource/map/hotel1F/houseWallTop2.png"));
            houseWallTop3.loadFromFile(Paths.get("resource/map/hotel1F/houseWallTop3.png"));
            houseWallTop4.loadFromFile(Paths.get("resource/map/hotel1F/houseWallTop4.png"));
            houseWallTop5.loadFromFile(Paths.get("resource/map/hotel1F/houseWallTop5.png"));
            houseWallTop6.loadFromFile(Paths.get("resource/map/hotel1F/houseWallTop6.png"));
            tentLeft.loadFromFile(Paths.get("resource/map/forest/tentLeft.png"));
            tentMid.loadFromFile(Paths.get("resource/map/forest/tentMid.png"));
            tentRight.loadFromFile(Paths.get("resource/map/forest/tentRight.png"));

            passerby.loadFromFile(Paths.get("resource/actor/passerby.png"));
            passerby2.loadFromFile(Paths.get("resource/actor/passerby2.png"));
            passerby3.loadFromFile(Paths.get("resource/actor/passerby3.png"));
            passerby4.loadFromFile(Paths.get("resource/actor/passerby4.png"));
            passerby5.loadFromFile(Paths.get("resource/actor/passerby5.png"));
            passerby6.loadFromFile(Paths.get("resource/actor/passerby6.png"));
            passerby7.loadFromFile(Paths.get("resource/actor/passerby7.png"));
            passerby8.loadFromFile(Paths.get("resource/actor/passerby8.png"));
            passerby9.loadFromFile(Paths.get("resource/actor/passerby9.png"));
            theOld.loadFromFile(Paths.get("resource/actor/theOld.png"));
            monster0.loadFromFile(Paths.get("resource/actor/monster0.png"));
            monster1.loadFromFile(Paths.get("resource/actor/monster1.png"));
            monster2.loadFromFile(Paths.get("resource/actor/monster2.png"));
            monster3.loadFromFile(Paths.get("resource/actor/monster3.png"));
            monster4.loadFromFile(Paths.get("resource/actor/monster4.png"));
            monster5.loadFromFile(Paths.get("resource/actor/monster5.png"));
            monster6.loadFromFile(Paths.get("resource/actor/monster6.png"));
            monster7.loadFromFile(Paths.get("resource/actor/monster7.png"));
            monster8.loadFromFile(Paths.get("resource/actor/monster8.png"));
            monster9.loadFromFile(Paths.get("resource/actor/monster9.png"));
            spirit.loadFromFile(Paths.get("resource/actor/spirit2.png"));
            spirit2.loadFromFile(Paths.get("resource/actor/spirit.png"));

            weaponOwner.loadFromFile(Paths.get("resource/actor/weaponShop.png"));
            drugOwner.loadFromFile(Paths.get("resource/actor/drugShop.png"));
            hotelOwner.loadFromFile(Paths.get("resource/actor/hotel.png"));


            forest2.loadFromFile(Paths.get("resource/map/forest/20000.png"));
            forest3.loadFromFile(Paths.get("resource/map/forest/20001.png"));
            forest4.loadFromFile(Paths.get("resource/map/forest/20002.png"));
            forest5.loadFromFile(Paths.get("resource/map/forest/20003.png"));
            forest6.loadFromFile(Paths.get("resource/map/forest/20005.png"));
            forest7.loadFromFile(Paths.get("resource/map/forest/20007.png"));
            forest8.loadFromFile(Paths.get("resource/map/forest/20010.png"));
            forest9.loadFromFile(Paths.get("resource/map/forest/20012.png"));
            forest10.loadFromFile(Paths.get("resource/map/forest/20015.png"));
            forest11.loadFromFile(Paths.get("resource/map/forest/20020.png"));
            forest12.loadFromFile(Paths.get("resource/map/forest/20022.png"));
            forest13.loadFromFile(Paths.get("resource/map/forest/20025.png"));
            forest14.loadFromFile(Paths.get("resource/map/forest/20030.png"));
            forest15.loadFromFile(Paths.get("resource/map/forest/20032.png"));
            forest16.loadFromFile(Paths.get("resource/map/forest/20040.png"));
            forest17.loadFromFile(Paths.get("resource/map/forest/20050.png"));
            forest18.loadFromFile(Paths.get("resource/map/forest/20052.png"));
            forest19.loadFromFile(Paths.get("resource/map/forest/20060.png"));
            forest20.loadFromFile(Paths.get("resource/map/forest/20061.png"));
            forest21.loadFromFile(Paths.get("resource/map/forest/20062.png"));
            forest22.loadFromFile(Paths.get("resource/map/forest/20070.png"));
            forest23.loadFromFile(Paths.get("resource/map/forest/20071.png"));
            forest24.loadFromFile(Paths.get("resource/map/forest/20072.png"));
            forest25.loadFromFile(Paths.get("resource/map/forest/20073.png"));
            forest26.loadFromFile(Paths.get("resource/map/forest/20074.png"));
            forest27.loadFromFile(Paths.get("resource/map/forest/20075.png"));
            forest28.loadFromFile(Paths.get("resource/map/forest/20076.png"));
            forest29.loadFromFile(Paths.get("resource/map/forest/20077.png"));
            forest30.loadFromFile(Paths.get("resource/map/forest/20078.png"));
            forest31.loadFromFile(Paths.get("resource/map/forest/20079.png"));
            forest32.loadFromFile(Paths.get("resource/map/forest/20080.png"));
            forest33.loadFromFile(Paths.get("resource/map/forest/20081.png"));
            forest34.loadFromFile(Paths.get("resource/map/forest/20082.png"));
            forest35.loadFromFile(Paths.get("resource/map/forest/20083.png"));
            forest36.loadFromFile(Paths.get("resource/map/forest/20084.png"));
            forest37.loadFromFile(Paths.get("resource/map/forest/20085.png"));
            forest38.loadFromFile(Paths.get("resource/map/forest/20086.png"));
            forest39.loadFromFile(Paths.get("resource/map/forest/20087.png"));

            forest40.loadFromFile(Paths.get("resource/map/forest/20100.png"));

            forest41.loadFromFile(Paths.get("resource/map/forest/20101.png"));
            forest42.loadFromFile(Paths.get("resource/map/forest/20102.png"));
            forest43.loadFromFile(Paths.get("resource/map/forest/20103.png"));
            forest44.loadFromFile(Paths.get("resource/map/forest/20104.png"));
            forest45.loadFromFile(Paths.get("resource/map/forest/20105.png"));
            forest46.loadFromFile(Paths.get("resource/map/forest/20106.png"));
            forest47.loadFromFile(Paths.get("resource/map/forest/20110.png"));
            forest48.loadFromFile(Paths.get("resource/map/forest/20111.png"));
            forest49.loadFromFile(Paths.get("resource/map/forest/20114.png"));
            forest50.loadFromFile(Paths.get("resource/map/forest/20116.png"));
            forest51.loadFromFile(Paths.get("resource/map/forest/20120.png"));
            forest52.loadFromFile(Paths.get("resource/map/forest/20121.png"));
            forest53.loadFromFile(Paths.get("resource/map/forest/20124.png"));
            forest54.loadFromFile(Paths.get("resource/map/forest/20126.png"));
            forest55.loadFromFile(Paths.get("resource/map/forest/20134.png"));
            forest56.loadFromFile(Paths.get("resource/map/forest/20136.png"));
            forest57.loadFromFile(Paths.get("resource/map/forest/20146.png"));
            forest58.loadFromFile(Paths.get("resource/map/forest/20156.png"));
            forest59.loadFromFile(Paths.get("resource/map/forest/20180.png"));
            forest60.loadFromFile(Paths.get("resource/map/forest/20190.png"));
            forest61.loadFromFile(Paths.get("resource/map/forest/20201.png"));
            forest62.loadFromFile(Paths.get("resource/map/forest/20203.png"));
            forest63.loadFromFile(Paths.get("resource/map/forest/20204.png"));
            forest64.loadFromFile(Paths.get("resource/map/forest/20205.png"));
            forest65.loadFromFile(Paths.get("resource/map/forest/20206.png"));
            forest66.loadFromFile(Paths.get("resource/map/forest/20207.png"));
            forest67.loadFromFile(Paths.get("resource/map/forest/20210.png"));
            forest68.loadFromFile(Paths.get("resource/map/forest/20211.png"));
            forest69.loadFromFile(Paths.get("resource/map/forest/20212.png"));
            forest70.loadFromFile(Paths.get("resource/map/forest/20213.png"));
            forest71.loadFromFile(Paths.get("resource/map/forest/20214.png"));
            forest72.loadFromFile(Paths.get("resource/map/forest/20215.png"));
            forest73.loadFromFile(Paths.get("resource/map/forest/20216.png"));
            forest74.loadFromFile(Paths.get("resource/map/forest/20217.png"));
            forest75.loadFromFile(Paths.get("resource/map/forest/20220.png"));
            forest76.loadFromFile(Paths.get("resource/map/forest/20221.png"));
            forest77.loadFromFile(Paths.get("resource/map/forest/20222.png"));
            forest78.loadFromFile(Paths.get("resource/map/forest/20223.png"));
            forest79.loadFromFile(Paths.get("resource/map/forest/20224.png"));
            forest80.loadFromFile(Paths.get("resource/map/forest/20225.png"));
            forest81.loadFromFile(Paths.get("resource/map/forest/20226.png"));
            forest82.loadFromFile(Paths.get("resource/map/forest/20227.png"));
            forest83.loadFromFile(Paths.get("resource/map/forest/20233.png"));
            forest84.loadFromFile(Paths.get("resource/map/forest/20236.png"));
            forest85.loadFromFile(Paths.get("resource/map/forest/20243.png"));
            forest86.loadFromFile(Paths.get("resource/map/forest/20246.png"));
            forest87.loadFromFile(Paths.get("resource/map/forest/20256.png"));
            forest88.loadFromFile(Paths.get("resource/map/forest/20266.png"));
            forest89.loadFromFile(Paths.get("resource/map/forest/20276.png"));
            forest90.loadFromFile(Paths.get("resource/map/forest/20300.png"));
            forest91.loadFromFile(Paths.get("resource/map/forest/20301.png"));
            forest92.loadFromFile(Paths.get("resource/map/forest/20302.png"));
            forest93.loadFromFile(Paths.get("resource/map/forest/20303.png"));
            forest94.loadFromFile(Paths.get("resource/map/forest/20304.png"));
            forest95.loadFromFile(Paths.get("resource/map/forest/20305.png"));
            forest96.loadFromFile(Paths.get("resource/map/forest/20306.png"));
            forest97.loadFromFile(Paths.get("resource/map/forest/20312.png"));
            forest98.loadFromFile(Paths.get("resource/map/forest/20313.png"));
            forest99.loadFromFile(Paths.get("resource/map/forest/20315.png"));
            forest100.loadFromFile(Paths.get("resource/map/forest/20323.png"));
            forest101.loadFromFile(Paths.get("resource/map/forest/20325.png"));
            forest102.loadFromFile(Paths.get("resource/map/forest/20333.png"));
            forest103.loadFromFile(Paths.get("resource/map/forest/20335.png"));
            forest104.loadFromFile(Paths.get("resource/map/forest/20343.png"));
            forest105.loadFromFile(Paths.get("resource/map/forest/20345.png"));
            forest106.loadFromFile(Paths.get("resource/map/forest/20353.png"));
            forest107.loadFromFile(Paths.get("resource/map/forest/20355.png"));
            forest108.loadFromFile(Paths.get("resource/map/forest/20363.png"));
            forest109.loadFromFile(Paths.get("resource/map/forest/20366.png"));
            forest110.loadFromFile(Paths.get("resource/map/forest/20367.png"));
            forest111.loadFromFile(Paths.get("resource/map/forest/20373.png"));
            forest112.loadFromFile(Paths.get("resource/map/forest/20375.png"));
            forest113.loadFromFile(Paths.get("resource/map/forest/20383.png"));
            forest114.loadFromFile(Paths.get("resource/map/forest/20385.png"));
            forest115.loadFromFile(Paths.get("resource/map/forest/20393.png"));

            armor1.loadFromFile(Paths.get("resource/map/armor/1.png"));
            armor2.loadFromFile(Paths.get("resource/map/armor/2.png"));
            armor3.loadFromFile(Paths.get("resource/map/armor/3.png"));
            armor4.loadFromFile(Paths.get("resource/map/armor/4.png"));
            armor5.loadFromFile(Paths.get("resource/map/armor/5.png"));
            armor6.loadFromFile(Paths.get("resource/map/armor/6.png"));
            armor7.loadFromFile(Paths.get("resource/map/armor/armor.png"));
            armor8.loadFromFile(Paths.get("resource/map/armor/armor2.png"));
            armor9.loadFromFile(Paths.get("resource/map/armor/armor3.png"));
            armor10.loadFromFile(Paths.get("resource/map/armor/armor4.png"));
            armor11.loadFromFile(Paths.get("resource/map/armor/armor5.png"));
            armor12.loadFromFile(Paths.get("resource/map/armor/armor6.png"));
            armor13.loadFromFile(Paths.get("resource/map/armor/armor7.png"));
            armor14.loadFromFile(Paths.get("resource/map/armor/armor8.png"));
            armor15.loadFromFile(Paths.get("resource/map/armor/armor9.png"));
            //  armor16.loadFromFile(Paths.get("resource/map/armor/black.png"));
            armor17.loadFromFile(Paths.get("resource/map/armor/rockcarpetBottomLeft.png"));
            armor18.loadFromFile(Paths.get("resource/map/armor/rockcarpetBottomMid.png"));
            armor19.loadFromFile(Paths.get("resource/map/armor/rockcarpetBottomRight.png"));
            armor20.loadFromFile(Paths.get("resource/map/armor/rockceiling.png"));
            armor21.loadFromFile(Paths.get("resource/map/armor/rockfloor1.png"));
            armor22.loadFromFile(Paths.get("resource/map/armor/rockfloor2.png"));
            armor23.loadFromFile(Paths.get("resource/map/armor/rockfloor3.png"));
            armor24.loadFromFile(Paths.get("resource/map/armor/rockfloor4.png"));
            armor25.loadFromFile(Paths.get("resource/map/armor/rockfloor5.png"));
            armor26.loadFromFile(Paths.get("resource/map/armor/rockfurnitureleft.png"));
            armor27.loadFromFile(Paths.get("resource/map/armor/rockfurnituremid.png"));
            armor28.loadFromFile(Paths.get("resource/map/armor/rockfurnituremid2.png"));
            armor29.loadFromFile(Paths.get("resource/map/armor/rockfurnitureright.png"));
            armor30.loadFromFile(Paths.get("resource/map/armor/rockhouseWallBottom.png"));
            armor31.loadFromFile(Paths.get("resource/map/armor/rockhouseWallBottom2.png"));
            armor32.loadFromFile(Paths.get("resource/map/armor/rockhouseWallBottomleft.png"));
            armor33.loadFromFile(Paths.get("resource/map/armor/rockhouseWallBottommid.png"));
            armor34.loadFromFile(Paths.get("resource/map/armor/rockhouseWallBottomright.png"));
            armor35.loadFromFile(Paths.get("resource/map/armor/rockhouseWallTop.png"));
            armor36.loadFromFile(Paths.get("resource/map/armor/rockhouseWallTop2.png"));
            armor37.loadFromFile(Paths.get("resource/map/armor/rockhouseWallTopLeft.png"));
            armor38.loadFromFile(Paths.get("resource/map/armor/rockhouseWallTopmid.png"));
            armor39.loadFromFile(Paths.get("resource/map/armor/rockhouseWallTopright.png"));
            armor40.loadFromFile(Paths.get("resource/map/armor/armor10.png"));
            armor41.loadFromFile(Paths.get("resource/map/armor/armor11.png"));
            armor42.loadFromFile(Paths.get("resource/map/armor/armor12.png"));
            armor43.loadFromFile(Paths.get("resource/map/armor/rockceiling2.png"));
            armor44.loadFromFile(Paths.get("resource/map/armor/rockfurnitureleft2.png"));
            armor45.loadFromFile(Paths.get("resource/map/armor/rockfurnitureTop.png"));
            armorOwner.loadFromFile(Paths.get("resource/actor/armorShop.png"));

            tower1f1.loadFromFile(Paths.get("resource/map/tower1F/black1.png"));
            tower1f2.loadFromFile(Paths.get("resource/map/tower1F/black2.png"));
            tower1f3.loadFromFile(Paths.get("resource/map/tower1F/black3.png"));
            tower1f4.loadFromFile(Paths.get("resource/map/tower1F/black4.png"));
            tower1f5.loadFromFile(Paths.get("resource/map/tower1F/black5.png"));
            tower1f6.loadFromFile(Paths.get("resource/map/tower1F/black6.png"));
            tower1f7.loadFromFile(Paths.get("resource/map/tower1F/black7.png"));
            tower1f8.loadFromFile(Paths.get("resource/map/tower1F/black8.png"));
            tower1f9.loadFromFile(Paths.get("resource/map/tower1F/black9.png"));
            tower1f10.loadFromFile(Paths.get("resource/map/tower1F/black10.png"));
            tower1f11.loadFromFile(Paths.get("resource/map/tower1F/black11.png"));
            tower1f12.loadFromFile(Paths.get("resource/map/tower1F/black12.png"));
            tower1f13.loadFromFile(Paths.get("resource/map/tower1F/black13.png"));
            tower1f14.loadFromFile(Paths.get("resource/map/tower1F/towerfloor1.png"));
            tower1f15.loadFromFile(Paths.get("resource/map/tower1F/towerfloor2.png"));
            tower1f16.loadFromFile(Paths.get("resource/map/tower1F/towerfloor3.png"));
            tower1f17.loadFromFile(Paths.get("resource/map/tower1F/towerfloor4.png"));
            tower1f18.loadFromFile(Paths.get("resource/map/tower1F/towerfloor5.png"));
            tower1f19.loadFromFile(Paths.get("resource/map/tower1F/towerfloor6.png"));
            tower1f20.loadFromFile(Paths.get("resource/map/tower1F/towerfloor7.png"));
            tower1f21.loadFromFile(Paths.get("resource/map/tower1F/towerfloor8.png"));
            tower1f22.loadFromFile(Paths.get("resource/map/tower1F/towerfloor9.png"));
            tower1f23.loadFromFile(Paths.get("resource/map/tower1F/towerfloor10.png"));
            tower1f24.loadFromFile(Paths.get("resource/map/tower1F/towerfloor11.png"));
            tower1f25.loadFromFile(Paths.get("resource/map/tower1F/towerfloor12.png"));
            tower1f26.loadFromFile(Paths.get("resource/map/tower1F/towerfloor13.png"));
            tower1f27.loadFromFile(Paths.get("resource/map/tower1F/towerfloor14.png"));
            tower1f28.loadFromFile(Paths.get("resource/map/tower1F/towerfloor15.png"));
            tower1f29.loadFromFile(Paths.get("resource/map/tower1F/towerfloor16.png"));
            tower1f30.loadFromFile(Paths.get("resource/map/tower1F/towerfloor17.png"));
            tower1f31.loadFromFile(Paths.get("resource/map/tower1F/towerfloor18.png"));
            tower1f32.loadFromFile(Paths.get("resource/map/tower1F/towerfloor19.png"));
            tower1f33.loadFromFile(Paths.get("resource/map/tower1F/towerfloor20.png"));
            tower1f34.loadFromFile(Paths.get("resource/map/tower1F/towerfloor21.png"));
            tower1f35.loadFromFile(Paths.get("resource/map/tower1F/towerfloor22.png"));
            tower1f36.loadFromFile(Paths.get("resource/map/tower1F/towerfloor23.png"));
            tower1f37.loadFromFile(Paths.get("resource/map/tower1F/towerfloor24.png"));
            tower1f38.loadFromFile(Paths.get("resource/map/tower1F/towerfloor25.png"));
            tower1f39.loadFromFile(Paths.get("resource/map/tower1F/towerfloor26.png"));
            tower1f40.loadFromFile(Paths.get("resource/map/tower1F/towerfloor27.png"));
            tower1f41.loadFromFile(Paths.get("resource/map/tower1F/towerfloor28.png"));
            tower1f42.loadFromFile(Paths.get("resource/map/tower1F/towerfloor29.png"));
            tower1f43.loadFromFile(Paths.get("resource/map/tower1F/towerfloor30.png"));
            tower1f44.loadFromFile(Paths.get("resource/map/tower1F/towerfloor31.png"));
            tower1f45.loadFromFile(Paths.get("resource/map/tower1F/towerfloor32.png"));
            tower1f46.loadFromFile(Paths.get("resource/map/tower1F/towerfloor33.png"));
            tower1f47.loadFromFile(Paths.get("resource/map/tower1F/towefloor34.png"));
            tower1f48.loadFromFile(Paths.get("resource/map/tower1F/towerfloor35.png"));
            tower1f49.loadFromFile(Paths.get("resource/map/tower1F/towerfloor36.png"));
            tower1f50.loadFromFile(Paths.get("resource/map/tower1F/towerfloor37.png"));
            tower1f51.loadFromFile(Paths.get("resource/map/tower1F/towerfloor38.png"));
            tower1f52.loadFromFile(Paths.get("resource/map/tower1F/towerfloor39.png"));
            tower1f53.loadFromFile(Paths.get("resource/map/tower1F/towerobject1.png"));
            tower1f54.loadFromFile(Paths.get("resource/map/tower1F/towerobject2.png"));
            tower1f55.loadFromFile(Paths.get("resource/map/tower1F/towerobject3.png"));
            tower1f56.loadFromFile(Paths.get("resource/map/tower1F/towerobject4.png"));
            tower1f57.loadFromFile(Paths.get("resource/map/tower1F/towerobject5.png"));
            tower1f58.loadFromFile(Paths.get("resource/map/tower1F/towerobject6.png"));
            tower1f59.loadFromFile(Paths.get("resource/map/tower1F/towerobject7.png"));
            tower1f60.loadFromFile(Paths.get("resource/map/tower1F/towerobject8.png"));
            tower1f61.loadFromFile(Paths.get("resource/map/tower1F/towerobject9.png"));
            tower1f62.loadFromFile(Paths.get("resource/map/tower1F/towerobject10.png"));
            tower1f63.loadFromFile(Paths.get("resource/map/tower1F/towerobject11.png"));
            tower1f64.loadFromFile(Paths.get("resource/map/tower1F/towerobject12.png"));
            tower1f65.loadFromFile(Paths.get("resource/map/tower1F/towerobject13.png"));
            tower1f66.loadFromFile(Paths.get("resource/map/tower1F/towerobject14.png"));
            tower1f67.loadFromFile(Paths.get("resource/map/tower1F/towerobject15.png"));
            tower1f68.loadFromFile(Paths.get("resource/map/tower1F/towerobject16.png"));
            tower1f69.loadFromFile(Paths.get("resource/map/tower1F/towerobject17.png"));
            tower1f70.loadFromFile(Paths.get("resource/map/tower1F/towerobject18.png"));
            tower1f71.loadFromFile(Paths.get("resource/map/tower1F/towerwall.png"));
            tower1f72.loadFromFile(Paths.get("resource/map/tower1F/towerwall2.png"));
            tower1f73.loadFromFile(Paths.get("resource/map/tower1F/towerwall3.png"));
            tower1f74.loadFromFile(Paths.get("resource/map/tower1F/towerwall4.png"));
            tower1f75.loadFromFile(Paths.get("resource/map/tower1F/towerwall5.png"));
            tower1f76.loadFromFile(Paths.get("resource/map/tower1F/towerwall6.png"));
            tower1f77.loadFromFile(Paths.get("resource/map/tower1F/towerwall7.png"));
            tower1f78.loadFromFile(Paths.get("resource/map/tower1F/towerwall8.png"));
            tower1f79.loadFromFile(Paths.get("resource/map/tower1F/towerwall9.png"));
            tower1f80.loadFromFile(Paths.get("resource/map/tower1F/towerwall10.png"));
            tower1f81.loadFromFile(Paths.get("resource/map/tower1F/towerwall11.png"));

            weapon9 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)1.png"));
            weapon10 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)2.png"));
            weapon11 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)3.png"));
            weapon12 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)4.png"));
            weapon13 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)5.png"));
            weapon14 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)6.png"));
            weapon15 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)7.png"));
            weapon16 .loadFromFile(Paths.get("resource/map/weaponshop/armor(3)8.png"));
            weapon17 .loadFromFile(Paths.get("resource/map/weaponshop/armor(4).png"));
            weapon18 .loadFromFile(Paths.get("resource/map/weaponshop/armor(4)2.png"));
            weapon19 .loadFromFile(Paths.get("resource/map/weaponshop/armor(4)3.png"));
            weapon20 .loadFromFile(Paths.get("resource/map/weaponshop/armor(4)4.png"));
            weapon21 .loadFromFile(Paths.get("resource/map/weaponshop/armor(4)5.png"));
            weapon22 .loadFromFile(Paths.get("resource/map/weaponshop/armor(4)6.png"));
            weapon23 .loadFromFile(Paths.get("resource/map/weaponshop/armor(4)7.png"));
            weapon24 .loadFromFile(Paths.get("resource/map/weaponshop/furniture.png"));
            weapon25 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2).png"));
            weapon26 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)2.png"));
            weapon27 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)3.png"));
            weapon28 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)4.png"));
            weapon29 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)5.png"));
            weapon30 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)6.png"));
            weapon31 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)7.png"));
            weapon32 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)8.png"));
            weapon33 .loadFromFile(Paths.get("resource/map/weaponshop/furniture(2)9.png"));
            weapon34 .loadFromFile(Paths.get("resource/map/weaponshop/furniture3.png"));
            weapon35 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingbottomright.png"));
            weapon36 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingmidleft.png"));
            weapon37 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingmidright.png"));
            weapon38 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingtopleft.png"));
            weapon39 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingtopmid.png"));
            weapon40 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingtopright.png"));
            weapon41 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor.png"));
            weapon42 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor2.png"));
            weapon43 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor3.png"));
            weapon44 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor4.png"));
            weapon45 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor5.png"));
            weapon46 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor6.png"));
            weapon47 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor7.png"));
            weapon48 .loadFromFile(Paths.get("resource/map/weaponshop/rockfloor8.png"));
            weapon49 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallbottom3.png"));
            weapon50 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallbottom4.png"));
            weapon51 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallbottom5.png"));
            weapon52 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallbottom6.png"));
            weapon53 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallbottom7.png"));
            weapon54 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallTop3.png"));
            weapon55 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallTop4.png"));
            weapon56 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallTop5.png"));
            weapon57 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallTop6.png"));
            weapon58 .loadFromFile(Paths.get("resource/map/weaponshop/rockhouseWallTop7.png"));
            weapon59 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingmid.png"));
            weapon60 .loadFromFile(Paths.get("resource/map/weaponshop/rockceilingmid2.png"));
            weapon61.loadFromFile(Paths.get("resource/map/weaponshop/rockceiling.png"));
            weapon62.loadFromFile(Paths.get("resource/map/weaponshop/rockceilingbottomleft.png"));
            weapon63.loadFromFile(Paths.get("resource/map/weaponshop/rockceilingbottommid.png"));
            weapon64.loadFromFile(Paths.get("resource/map/weaponshop/rockceilingmidleft2.png"));
            weapon65.loadFromFile(Paths.get("resource/map/weaponshop/rockceilingmidright2.png"));

            hotel2F1.loadFromFile(Paths.get("resource/map/hotel2F/6002.png"));

            bed1.loadFromFile(Paths.get("resource/map/bedroom2/70000.png"));
            bed2.loadFromFile(Paths.get("resource/map/bedroom2/70001.png"));
            bed3.loadFromFile(Paths.get("resource/map/bedroom2/70002.png"));
            bed4.loadFromFile(Paths.get("resource/map/bedroom2/70003.png"));
            bed5.loadFromFile(Paths.get("resource/map/bedroom2/70004.png"));
            bed6.loadFromFile(Paths.get("resource/map/bedroom2/70005.png"));
            bed7.loadFromFile(Paths.get("resource/map/bedroom2/70006.png"));
            bed8.loadFromFile(Paths.get("resource/map/bedroom2/70007.png"));
            bed9.loadFromFile(Paths.get("resource/map/bedroom2/70008.png"));
            bed10.loadFromFile(Paths.get("resource/map/bedroom2/70009.png"));
            bed11.loadFromFile(Paths.get("resource/map/bedroom2/70010.png"));
            bed12.loadFromFile(Paths.get("resource/map/bedroom2/70011.png"));
            bed13.loadFromFile(Paths.get("resource/map/bedroom2/70012.png"));
            bed14.loadFromFile(Paths.get("resource/map/bedroom2/70013.png"));
            bed15.loadFromFile(Paths.get("resource/map/bedroom2/70014.png"));
            bed16.loadFromFile(Paths.get("resource/map/bedroom2/70015.png"));
            bed17.loadFromFile(Paths.get("resource/map/bedroom2/70016.png"));
            bed18.loadFromFile(Paths.get("resource/map/bedroom2/70017.png"));
            bed19.loadFromFile(Paths.get("resource/map/bedroom2/70018.png"));
            bed20.loadFromFile(Paths.get("resource/map/bedroom2/70019.png"));
            bed21.loadFromFile(Paths.get("resource/map/bedroom2/70020.png"));
            bed22.loadFromFile(Paths.get("resource/map/bedroom2/70021.png"));
            bed23.loadFromFile(Paths.get("resource/map/bedroom2/70022.png"));
            bed24.loadFromFile(Paths.get("resource/map/bedroom2/70023.png"));
            bed25.loadFromFile(Paths.get("resource/map/bedroom2/70024.png"));
            bed26.loadFromFile(Paths.get("resource/map/bedroom2/70025.png"));
            bed27.loadFromFile(Paths.get("resource/map/bedroom2/70026.png"));
            bed28.loadFromFile(Paths.get("resource/map/bedroom2/70027.png"));
            bed29.loadFromFile(Paths.get("resource/map/bedroom2/70028.png"));
            bed30.loadFromFile(Paths.get("resource/map/bedroom2/70029.png"));
            bed31.loadFromFile(Paths.get("resource/map/bedroom2/70030.png"));
            bed32.loadFromFile(Paths.get("resource/map/bedroom2/70031.png"));
            bed33.loadFromFile(Paths.get("resource/map/bedroom2/70031.png"));
            bed34.loadFromFile(Paths.get("resource/map/bedroom2/70100.png"));
            bed35.loadFromFile(Paths.get("resource/map/bedroom2/70101.png"));
            bed36.loadFromFile(Paths.get("resource/map/bedroom2/70102.png"));
            bed37.loadFromFile(Paths.get("resource/map/bedroom2/70103.png"));
            bed38.loadFromFile(Paths.get("resource/map/bedroom2/70104.png"));
            bed39.loadFromFile(Paths.get("resource/map/bedroom2/70105.png"));
            bed40.loadFromFile(Paths.get("resource/map/bedroom2/70106.png"));
            bed41.loadFromFile(Paths.get("resource/map/bedroom2/70107.png"));
            bed42.loadFromFile(Paths.get("resource/map/bedroom2/70108.png"));
            bed43.loadFromFile(Paths.get("resource/map/bedroom2/70109.png"));
            bed44.loadFromFile(Paths.get("resource/map/bedroom2/70110.png"));
            bed45.loadFromFile(Paths.get("resource/map/bedroom2/70111.png"));
            bed46.loadFromFile(Paths.get("resource/map/bedroom2/70112.png"));
            bed47.loadFromFile(Paths.get("resource/map/bedroom2/70113.png"));
            bed48.loadFromFile(Paths.get("resource/map/bedroom2/70114.png"));
            bed49.loadFromFile(Paths.get("resource/map/bedroom2/70115.png"));
            bed50.loadFromFile(Paths.get("resource/map/bedroom2/70116.png"));

            drug1.loadFromFile(Paths.get("resource/map/drugshop/6004.png"));
            drug2.loadFromFile(Paths.get("resource/map/drugshop/6005.png"));
            drug3.loadFromFile(Paths.get("resource/map/drugshop/6006.png"));
            drug4.loadFromFile(Paths.get("resource/map/drugshop/6007.png"));
            drug5.loadFromFile(Paths.get("resource/map/drugshop/6008.png"));
            drug6.loadFromFile(Paths.get("resource/map/drugshop/6009.png"));
            drug7.loadFromFile(Paths.get("resource/map/drugshop/11107.png"));
            drug8.loadFromFile(Paths.get("resource/map/drugshop/11023.png"));
            drug9.loadFromFile(Paths.get("resource/map/drugshop/11024.png"));
            drug10.loadFromFile(Paths.get("resource/map/drugshop/11025.png"));
            drug11.loadFromFile(Paths.get("resource/map/drugshop/11026.png"));
            drug12.loadFromFile(Paths.get("resource/map/drugshop/6010.png"));
            drug13.loadFromFile(Paths.get("resource/map/drugshop/6011.png"));
            drug14.loadFromFile(Paths.get("resource/map/drugshop/6020.png"));
            drug15.loadFromFile(Paths.get("resource/map/drugshop/6021.png"));
            drug16.loadFromFile(Paths.get("resource/map/drugshop/6030.png"));
            drug17.loadFromFile(Paths.get("resource/map/drugshop/6031.png"));

            towertop1.loadFromFile(Paths.get("resource/map/towertop/80000.png"));
            towertop2.loadFromFile(Paths.get("resource/map/towertop/80001.png"));
            towertop3.loadFromFile(Paths.get("resource/map/towertop/80002.png"));
            towertop4.loadFromFile(Paths.get("resource/map/towertop/80003.png"));
            towertop5.loadFromFile(Paths.get("resource/map/towertop/80004.png"));
            towertop6.loadFromFile(Paths.get("resource/map/towertop/80005.png"));
            towertop7.loadFromFile(Paths.get("resource/map/towertop/80006.png"));
            towertop8.loadFromFile(Paths.get("resource/map/towertop/80007.png"));
            towertop9.loadFromFile(Paths.get("resource/map/towertop/80008.png"));
            towertop10.loadFromFile(Paths.get("resource/map/towertop/80009.png"));
            towertop11.loadFromFile(Paths.get("resource/map/towertop/80010.png"));
            towertop12.loadFromFile(Paths.get("resource/map/towertop/80011.png"));
            towertop13.loadFromFile(Paths.get("resource/map/towertop/80012.png"));
            towertop14.loadFromFile(Paths.get("resource/map/towertop/80013.png"));
            towertop15.loadFromFile(Paths.get("resource/map/towertop/80014.png"));
            towertop16.loadFromFile(Paths.get("resource/map/towertop/80015.png"));
            towertop17.loadFromFile(Paths.get("resource/map/towertop/80016.png"));
            towertop18.loadFromFile(Paths.get("resource/map/towertop/80017.png"));
            towertop19.loadFromFile(Paths.get("resource/map/towertop/80019.png"));
            towertop20.loadFromFile(Paths.get("resource/map/towertop/80100.png"));
            towertop21.loadFromFile(Paths.get("resource/map/towertop/80101.png"));
            towertop22.loadFromFile(Paths.get("resource/map/towertop/80102.png"));
            towertop23.loadFromFile(Paths.get("resource/map/towertop/80103.png"));
            towertop24.loadFromFile(Paths.get("resource/map/towertop/80104.png"));
            towertop25.loadFromFile(Paths.get("resource/map/towertop/80105.png"));
            towertop26.loadFromFile(Paths.get("resource/map/towertop/80106.png"));
            towertop27.loadFromFile(Paths.get("resource/map/towertop/80107.png"));
            towertop28.loadFromFile(Paths.get("resource/map/towertop/80108.png"));
            towertop29.loadFromFile(Paths.get("resource/map/towertop/80109.png"));
            towertop30.loadFromFile(Paths.get("resource/map/towertop/80110.png"));
            towertop31.loadFromFile(Paths.get("resource/map/towertop/80111.png"));
            towertop32.loadFromFile(Paths.get("resource/map/towertop/80112.png"));
            towertop33.loadFromFile(Paths.get("resource/map/towertop/80113.png"));
            towertop34.loadFromFile(Paths.get("resource/map/towertop/80115.png"));
            towertop35.loadFromFile(Paths.get("resource/map/towertop/80116.png"));
            towertop36.loadFromFile(Paths.get("resource/map/towertop/80117.png"));
            towertop37.loadFromFile(Paths.get("resource/map/towertop/80118.png"));
            towertop38.loadFromFile(Paths.get("resource/map/towertop/80119.png"));
            towertop39.loadFromFile(Paths.get("resource/map/towertop/80120.png"));
            towertop40.loadFromFile(Paths.get("resource/map/towertop/80121.png"));
            towertop41.loadFromFile(Paths.get("resource/map/towertop/80122.png"));
            towertop42.loadFromFile(Paths.get("resource/map/towertop/80123.png"));
            towertop43.loadFromFile(Paths.get("resource/map/towertop/80124.png"));
            towertop44.loadFromFile(Paths.get("resource/map/towertop/80125.png"));
            towertop45.loadFromFile(Paths.get("resource/map/towertop/80126.png"));
            towertop46.loadFromFile(Paths.get("resource/map/towertop/80127.png"));
            towertop47.loadFromFile(Paths.get("resource/map/towertop/80128.png"));
            towertop48.loadFromFile(Paths.get("resource/map/towertop/80129.png"));
            towertop49.loadFromFile(Paths.get("resource/map/towertop/80130.png"));

            towertop50.loadFromFile(Paths.get("resource/map/towertop/80131.png"));
            towertop51.loadFromFile(Paths.get("resource/map/towertop/80132.png"));

            tower2F1.loadFromFile(Paths.get("resource/map/tower2F/00013.png"));
            tower2F2.loadFromFile(Paths.get("resource/map/tower2F/00014.png"));
            tower2F3.loadFromFile(Paths.get("resource/map/tower2F/00015.png"));
            tower2F4.loadFromFile(Paths.get("resource/map/tower2F/00016.png"));
            tower2F5.loadFromFile(Paths.get("resource/map/tower2F/40139.png"));
            tower2F6.loadFromFile(Paths.get("resource/map/tower2F/40140.png"));
            tower2F7.loadFromFile(Paths.get("resource/map/tower2F/40141.png"));
            tower2F8.loadFromFile(Paths.get("resource/map/tower2F/40142.png"));
            tower2F9.loadFromFile(Paths.get("resource/map/tower2F/40143.png"));
            tower2F10.loadFromFile(Paths.get("resource/map/tower2F/40144.png"));
            tower2F11.loadFromFile(Paths.get("resource/map/tower2F/40145.png"));
            tower2F12.loadFromFile(Paths.get("resource/map/tower2F/40146.png"));
            tower2F13.loadFromFile(Paths.get("resource/map/tower2F/40218.png"));
            tower2F14.loadFromFile(Paths.get("resource/map/tower2F/40219.png"));

            house1F1.loadFromFile(Paths.get("resource/map/house1F/50000.png"));
            house1F2.loadFromFile(Paths.get("resource/map/house1F/50100.png"));
            house1F3.loadFromFile(Paths.get("resource/map/house1F/50101.png"));
            house1F4.loadFromFile(Paths.get("resource/map/house1F/50102.png"));
            house1F5.loadFromFile(Paths.get("resource/map/house1F/50103.png"));
            house1F6.loadFromFile(Paths.get("resource/map/house1F/50104.png"));
            house1F7.loadFromFile(Paths.get("resource/map/house1F/50105.png"));
            house1F8.loadFromFile(Paths.get("resource/map/house1F/50106.png"));
            house1F9.loadFromFile(Paths.get("resource/map/house1F/50107.png"));
            house1F10.loadFromFile(Paths.get("resource/map/house1F/50108.png"));
            house1F11.loadFromFile(Paths.get("resource/map/house1F/50109.png"));
            house1F12.loadFromFile(Paths.get("resource/map/house1F/50110.png"));
            house1F13.loadFromFile(Paths.get("resource/map/house1F/50111.png"));
            house1F14.loadFromFile(Paths.get("resource/map/house1F/50112.png"));
            house1F15.loadFromFile(Paths.get("resource/map/house1F/50113.png"));
            house1F16.loadFromFile(Paths.get("resource/map/house1F/50114.png"));
            house1F17.loadFromFile(Paths.get("resource/map/house1F/50115.png"));
            house1F18.loadFromFile(Paths.get("resource/map/house1F/50116.png"));
            house1F19.loadFromFile(Paths.get("resource/map/house1F/50117.png"));
            house1F20.loadFromFile(Paths.get("resource/map/house1F/50118.png"));
            house1F21.loadFromFile(Paths.get("resource/map/house1F/50119.png"));
            house1F22.loadFromFile(Paths.get("resource/map/house1F/50120.png"));
            house1F23.loadFromFile(Paths.get("resource/map/house1F/50121.png"));
            house1F24.loadFromFile(Paths.get("resource/map/house1F/50122.png"));
            house1F25.loadFromFile(Paths.get("resource/map/house1F/50123.png"));
            house1F26.loadFromFile(Paths.get("resource/map/house1F/50124.png"));
            house1F27.loadFromFile(Paths.get("resource/map/house1F/50200.png"));
            house1F28.loadFromFile(Paths.get("resource/map/house1F/50201.png"));
            house1F29.loadFromFile(Paths.get("resource/map/house1F/50202.png"));
            house1F30.loadFromFile(Paths.get("resource/map/house1F/50203.png"));

            house2F1.loadFromFile(Paths.get("resource/map/house2F/50125.png"));
            house2F2.loadFromFile(Paths.get("resource/map/house2F/50126.png"));
            house2F3.loadFromFile(Paths.get("resource/map/house2F/50127.png"));
            house2F4.loadFromFile(Paths.get("resource/map/house2F/50128.png"));
            house2F5.loadFromFile(Paths.get("resource/map/house2F/50129.png"));
            house2F6.loadFromFile(Paths.get("resource/map/house2F/50130.png"));
            house2F7.loadFromFile(Paths.get("resource/map/house2F/50131.png"));
            house2F8.loadFromFile(Paths.get("resource/map/house2F/50132.png"));
            house2F9.loadFromFile(Paths.get("resource/map/house2F/50133.png"));
            house2F10.loadFromFile(Paths.get("resource/map/house2F/50134.png"));
            house2F11.loadFromFile(Paths.get("resource/map/house2F/50135.png"));
            house2F12.loadFromFile(Paths.get("resource/map/house2F/50136.png"));
            house2F13.loadFromFile(Paths.get("resource/map/house2F/50137.png"));
            house2F14.loadFromFile(Paths.get("resource/map/house2F/50138.png"));
            house2F15.loadFromFile(Paths.get("resource/map/house2F/50139.png"));
            house2F16.loadFromFile(Paths.get("resource/map/house2F/50140.png"));
            house2F17.loadFromFile(Paths.get("resource/map/house2F/50141.png"));
            house2F18.loadFromFile(Paths.get("resource/map/house2F/50142.png"));
            house2F19.loadFromFile(Paths.get("resource/map/house2F/50143.png"));
            house2F20.loadFromFile(Paths.get("resource/map/house2F/50144.png"));
            house2F21.loadFromFile(Paths.get("resource/map/house2F/50145.png"));
            house2F22.loadFromFile(Paths.get("resource/map/house2F/50146.png"));
            house2F23.loadFromFile(Paths.get("resource/map/house2F/50147.png"));
            house2F24.loadFromFile(Paths.get("resource/map/house2F/50204.png"));
            house2F25.loadFromFile(Paths.get("resource/map/house2F/50205.png"));
            house2F26.loadFromFile(Paths.get("resource/map/house2F/50206.png"));
            house2F27.loadFromFile(Paths.get("resource/map/house2F/50207.png"));
            house2F28.loadFromFile(Paths.get("resource/map/house2F/50208.png"));
            house2F29.loadFromFile(Paths.get("resource/map/house2F/50209.png"));
            house2F30.loadFromFile(Paths.get("resource/map/house2F/50210.png"));
            house2F31.loadFromFile(Paths.get("resource/map/house2F/50211.png"));
            house2F32.loadFromFile(Paths.get("resource/map/house2F/50212.png"));
            house2F33.loadFromFile(Paths.get("resource/map/house2F/50213.png"));
            house2F34.loadFromFile(Paths.get("resource/map/house2F/50214.png"));
            house2F35.loadFromFile(Paths.get("resource/map/house2F/50215.png"));
            house2F36.loadFromFile(Paths.get("resource/map/house2F/50216.png"));
            house2F37.loadFromFile(Paths.get("resource/map/house2F/50217.png"));
            house2F38.loadFromFile(Paths.get("resource/map/house2F/50218.png"));
            house2F39.loadFromFile(Paths.get("resource/map/house2F/50219.png"));
            house2F40.loadFromFile(Paths.get("resource/map/house2F/50220.png"));
            house2F41.loadFromFile(Paths.get("resource/map/house2F/50221.png"));
            house2F42.loadFromFile(Paths.get("resource/map/house2F/50222.png"));
            house2F43.loadFromFile(Paths.get("resource/map/house2F/50223.png"));
            house2F44.loadFromFile(Paths.get("resource/map/house2F/50224.png"));
            house2F45.loadFromFile(Paths.get("resource/map/house2F/50225.png"));
            house2F46.loadFromFile(Paths.get("resource/map/house2F/50226.png"));

            snow1.loadFromFile(Paths.get("resource/map/snow/30000.png"));
            snow2.loadFromFile(Paths.get("resource/map/snow/30001.png"));
            snow3.loadFromFile(Paths.get("resource/map/snow/30002.png"));
            snow4.loadFromFile(Paths.get("resource/map/snow/30003.png"));
            snow5.loadFromFile(Paths.get("resource/map/snow/30004.png"));
            snow6.loadFromFile(Paths.get("resource/map/snow/30005.png"));
            snow7.loadFromFile(Paths.get("resource/map/snow/30006.png"));
            snow8.loadFromFile(Paths.get("resource/map/snow/30007.png"));
            snow9.loadFromFile(Paths.get("resource/map/snow/30008.png"));
            snow10.loadFromFile(Paths.get("resource/map/snow/30009.png"));
            snow11.loadFromFile(Paths.get("resource/map/snow/30010.png"));
            snow12.loadFromFile(Paths.get("resource/map/snow/30011.png"));
            snow13.loadFromFile(Paths.get("resource/map/snow/30012.png"));
            snow14.loadFromFile(Paths.get("resource/map/snow/30013.png"));
            snow15.loadFromFile(Paths.get("resource/map/snow/30014.png"));
            snow16.loadFromFile(Paths.get("resource/map/snow/30015.png"));
            snow17.loadFromFile(Paths.get("resource/map/snow/30016.png"));
            snow18.loadFromFile(Paths.get("resource/map/snow/30017.png"));
            snow19.loadFromFile(Paths.get("resource/map/snow/30018.png"));
            snow20.loadFromFile(Paths.get("resource/map/snow/30019.png"));
            snow21.loadFromFile(Paths.get("resource/map/snow/30020.png"));
            snow22.loadFromFile(Paths.get("resource/map/snow/30021.png"));
            snow23.loadFromFile(Paths.get("resource/map/snow/30022.png"));
            snow24.loadFromFile(Paths.get("resource/map/snow/30023.png"));
            snow25.loadFromFile(Paths.get("resource/map/snow/30024.png"));
            snow26.loadFromFile(Paths.get("resource/map/snow/30025.png"));
            snow27.loadFromFile(Paths.get("resource/map/snow/30026.png"));
            snow28.loadFromFile(Paths.get("resource/map/snow/30027.png"));
            snow29.loadFromFile(Paths.get("resource/map/snow/30028.png"));
            snow30.loadFromFile(Paths.get("resource/map/snow/30029.png"));
            snow31.loadFromFile(Paths.get("resource/map/snow/30030.png"));
            snow32.loadFromFile(Paths.get("resource/map/snow/30031.png"));
            snow33.loadFromFile(Paths.get("resource/map/snow/30032.png"));
            snow34.loadFromFile(Paths.get("resource/map/snow/30033.png"));
            snow35.loadFromFile(Paths.get("resource/map/snow/30034.png"));
            snow36.loadFromFile(Paths.get("resource/map/snow/30035.png"));
            snow37.loadFromFile(Paths.get("resource/map/snow/30036.png"));
            snow38.loadFromFile(Paths.get("resource/map/snow/30037.png"));
            snow39.loadFromFile(Paths.get("resource/map/snow/30038.png"));
            snow40.loadFromFile(Paths.get("resource/map/snow/30039.png"));
            snow41.loadFromFile(Paths.get("resource/map/snow/30040.png"));
            snow42.loadFromFile(Paths.get("resource/map/snow/30041.png"));
            snow43.loadFromFile(Paths.get("resource/map/snow/30042.png"));
            snow44.loadFromFile(Paths.get("resource/map/snow/30043.png"));
            snow45.loadFromFile(Paths.get("resource/map/snow/30044.png"));
            snow46.loadFromFile(Paths.get("resource/map/snow/30045.png"));
            snow47.loadFromFile(Paths.get("resource/map/snow/30046.png"));
            snow48.loadFromFile(Paths.get("resource/map/snow/30047.png"));
            snow49.loadFromFile(Paths.get("resource/map/snow/30048.png"));
            snow50.loadFromFile(Paths.get("resource/map/snow/30049.png"));
            snow51.loadFromFile(Paths.get("resource/map/snow/30050.png"));
            snow52.loadFromFile(Paths.get("resource/map/snow/30051.png"));
            snow53.loadFromFile(Paths.get("resource/map/snow/30052.png"));
            snow54.loadFromFile(Paths.get("resource/map/snow/30100.png"));
            snow55.loadFromFile(Paths.get("resource/map/snow/30101.png"));
            snow56.loadFromFile(Paths.get("resource/map/snow/30102.png"));
            snow57.loadFromFile(Paths.get("resource/map/snow/30103.png"));
            snow58.loadFromFile(Paths.get("resource/map/snow/30104.png"));
            snow59.loadFromFile(Paths.get("resource/map/snow/30105.png"));
            snow60.loadFromFile(Paths.get("resource/map/snow/30106.png"));
            snow61.loadFromFile(Paths.get("resource/map/snow/30107.png"));
            snow62.loadFromFile(Paths.get("resource/map/snow/30108.png"));
            snow63.loadFromFile(Paths.get("resource/map/snow/30109.png"));
            snow64.loadFromFile(Paths.get("resource/map/snow/30110.png"));
            snow65.loadFromFile(Paths.get("resource/map/snow/30111.png"));
            snow66.loadFromFile(Paths.get("resource/map/snow/30112.png"));
            snow67.loadFromFile(Paths.get("resource/map/snow/30113.png"));
            snow68.loadFromFile(Paths.get("resource/map/snow/30114.png"));
            snow69.loadFromFile(Paths.get("resource/map/snow/30115.png"));
            snow70.loadFromFile(Paths.get("resource/map/snow/30116.png"));
            snow71.loadFromFile(Paths.get("resource/map/snow/30120.png"));
            snow72.loadFromFile(Paths.get("resource/map/snow/30121.png"));
            snow73.loadFromFile(Paths.get("resource/map/snow/30122.png"));
            snow74.loadFromFile(Paths.get("resource/map/snow/30123.png"));
            snow75.loadFromFile(Paths.get("resource/map/snow/30124.png"));
            snow76.loadFromFile(Paths.get("resource/map/snow/30125.png"));
            snow77.loadFromFile(Paths.get("resource/map/snow/30126.png"));
            snow78.loadFromFile(Paths.get("resource/map/snow/30127.png"));
            snow79.loadFromFile(Paths.get("resource/map/snow/30128.png"));
            snow80.loadFromFile(Paths.get("resource/map/snow/30129.png"));
            snow81.loadFromFile(Paths.get("resource/map/snow/30130.png"));
            snow82.loadFromFile(Paths.get("resource/map/snow/30131.png"));
            snow83.loadFromFile(Paths.get("resource/map/snow/30132.png"));
            snow84.loadFromFile(Paths.get("resource/map/snow/30133.png"));
            snow85.loadFromFile(Paths.get("resource/map/snow/30134.png"));
            snow86.loadFromFile(Paths.get("resource/map/snow/30135.png"));
            snow87.loadFromFile(Paths.get("resource/map/snow/30136.png"));
            snow88.loadFromFile(Paths.get("resource/map/snow/30137.png"));
            snow89.loadFromFile(Paths.get("resource/map/snow/30138.png"));
            snow90.loadFromFile(Paths.get("resource/map/snow/30139.png"));
            snow91.loadFromFile(Paths.get("resource/map/snow/30140.png"));
            snow92.loadFromFile(Paths.get("resource/map/snow/30141.png"));
            snow93.loadFromFile(Paths.get("resource/map/snow/30142.png"));
            snow94.loadFromFile(Paths.get("resource/map/snow/30143.png"));
            snow95.loadFromFile(Paths.get("resource/map/snow/30144.png"));
            snow96.loadFromFile(Paths.get("resource/map/snow/30145.png"));
            snow97.loadFromFile(Paths.get("resource/map/snow/30146.png"));
            snow98.loadFromFile(Paths.get("resource/map/snow/30147.png"));
            snow99.loadFromFile(Paths.get("resource/map/snow/30148.png"));
            snow100.loadFromFile(Paths.get("resource/map/snow/30149.png"));
            snow101.loadFromFile(Paths.get("resource/map/snow/30150.png"));
            snow102.loadFromFile(Paths.get("resource/map/snow/30200.png"));
            snow103.loadFromFile(Paths.get("resource/map/snow/30201.png"));
            snow104.loadFromFile(Paths.get("resource/map/snow/30202.png"));
            snow105.loadFromFile(Paths.get("resource/map/snow/30203.png"));
            snow106.loadFromFile(Paths.get("resource/map/snow/30204.png"));
            snow107.loadFromFile(Paths.get("resource/map/snow/30205.png"));
            snow108.loadFromFile(Paths.get("resource/map/snow/30206.png"));
            snow109.loadFromFile(Paths.get("resource/map/snow/30207.png"));
            snow110.loadFromFile(Paths.get("resource/map/snow/30208.png"));
            snow111.loadFromFile(Paths.get("resource/map/snow/30209.png"));
            snow112.loadFromFile(Paths.get("resource/map/snow/30210.png"));
            snow113.loadFromFile(Paths.get("resource/map/snow/30211.png"));
            snow114.loadFromFile(Paths.get("resource/map/snow/30212.png"));
            snow115.loadFromFile(Paths.get("resource/map/snow/30213.png"));
            snow116.loadFromFile(Paths.get("resource/map/snow/30214.png"));
            snow117.loadFromFile(Paths.get("resource/map/snow/30215.png"));
            snow118.loadFromFile(Paths.get("resource/map/snow/30216.png"));
            snow119.loadFromFile(Paths.get("resource/map/snow/30217.png"));
            snow120.loadFromFile(Paths.get("resource/map/snow/30218.png"));
            snow121.loadFromFile(Paths.get("resource/map/snow/30219.png"));
            snow122.loadFromFile(Paths.get("resource/map/snow/30224.png"));
            snow123.loadFromFile(Paths.get("resource/map/snow/30225.png"));
            snow124.loadFromFile(Paths.get("resource/map/snow/30226.png"));
            snow125.loadFromFile(Paths.get("resource/map/snow/30227.png"));
            snow126.loadFromFile(Paths.get("resource/map/snow/30228.png"));
            snow127.loadFromFile(Paths.get("resource/map/snow/30229.png"));
            snow128.loadFromFile(Paths.get("resource/map/snow/30230.png"));
            snow129.loadFromFile(Paths.get("resource/map/snow/30231.png"));
            snow130.loadFromFile(Paths.get("resource/map/snow/30232.png"));
            snow131.loadFromFile(Paths.get("resource/map/snow/30233.png"));
            snow132.loadFromFile(Paths.get("resource/map/snow/30234.png"));
            snow133.loadFromFile(Paths.get("resource/map/snow/30235.png"));
            snow134.loadFromFile(Paths.get("resource/map/snow/30236.png"));
            snow135.loadFromFile(Paths.get("resource/map/snow/30237.png"));
            snow136.loadFromFile(Paths.get("resource/map/snow/30238.png"));
            snow137.loadFromFile(Paths.get("resource/map/snow/30239.png"));
            snow138.loadFromFile(Paths.get("resource/map/snow/30240.png"));
            snow139.loadFromFile(Paths.get("resource/map/snow/30241.png"));
            snow140.loadFromFile(Paths.get("resource/map/snow/30242.png"));

            bedthree1.loadFromFile(Paths.get("resource/map/bedroom3/10006.png"));
            bedthree2.loadFromFile(Paths.get("resource/map/bedroom3/10007.png"));
            bedthree3.loadFromFile(Paths.get("resource/map/bedroom3/10010.png"));
            bedthree4.loadFromFile(Paths.get("resource/map/bedroom3/10011.png"));
            bedthree5.loadFromFile(Paths.get("resource/map/bedroom3/10012.png"));
            bedthree6.loadFromFile(Paths.get("resource/map/bedroom3/10013.png"));
            bedthree7.loadFromFile(Paths.get("resource/map/bedroom3/10014.png"));
            bedthree8.loadFromFile(Paths.get("resource/map/bedroom3/10015.png"));
            bedthree9.loadFromFile(Paths.get("resource/map/bedroom3/10221.png"));
            bedthree10.loadFromFile(Paths.get("resource/map/bedroom3/10222.png"));
            bedthree11.loadFromFile(Paths.get("resource/map/bedroom3/10223.png"));
            bedthree12.loadFromFile(Paths.get("resource/map/bedroom3/11104.png"));
            bedthree13.loadFromFile(Paths.get("resource/map/bedroom3/11105.png"));
            bedthree14.loadFromFile(Paths.get("resource/map/bedroom3/11203.png"));
            bedthree15.loadFromFile(Paths.get("resource/map/bedroom3/11204.png"));
            bedthree16.loadFromFile(Paths.get("resource/map/bedroom3/12104.png"));
            bedthree17.loadFromFile(Paths.get("resource/map/bedroom3/12105.png"));
            bedthree18.loadFromFile(Paths.get("resource/map/bedroom3/12106.png"));
            bedthree19.loadFromFile(Paths.get("resource/map/bedroom3/12107.png"));
            bedthree20.loadFromFile(Paths.get("resource/map/bedroom3/12108.png"));
            bedthree21.loadFromFile(Paths.get("resource/map/bedroom3/12109.png"));
            bedthree22.loadFromFile(Paths.get("resource/map/bedroom3/12206.png"));
            bedthree23.loadFromFile(Paths.get("resource/map/bedroom3/12207.png"));
            bedthree24.loadFromFile(Paths.get("resource/map/bedroom3/12208.png"));
            bedthree25.loadFromFile(Paths.get("resource/map/bedroom3/12209.png"));
            bedthree26.loadFromFile(Paths.get("resource/map/bedroom3/13012.png"));
            bedthree27.loadFromFile(Paths.get("resource/map/bedroom3/13122.png"));
            bedthree28.loadFromFile(Paths.get("resource/map/bedroom3/13123.png"));
            bedthree29.loadFromFile(Paths.get("resource/map/bedroom3/90000.png"));
            bedthree30.loadFromFile(Paths.get("resource/map/bedroom3/13125.png"));
            bedthree31.loadFromFile(Paths.get("resource/map/bedroom3/13132.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void chooseIcon(int mapNumber) {
        if (mapNumber == 0000 || mapNumber == 9999)
            image = empty;
        else if(mapNumber == 0001)
            image = black;
        else if (mapNumber == 1020)
            image = timberpileMid;
        else if (mapNumber == 1010)
            image = timberpileLeft;
        else if (mapNumber == 1030)
            image = timberpileRight;
        else if (mapNumber == 1011)
            image = timberpileLeft2;
        else if (mapNumber == 1031)
            image = timberpileRight2;
        else if (mapNumber == 1110)
            image = fenceTopLeft;
        else if (mapNumber == 1000)
            image = fenceVertical;
        else if (mapNumber == 1130)
            image = fenceTopRight;
        else if (mapNumber == 1210)
            image = fenceBottomLeft;
        else if (mapNumber == 1211)
            image = fenceBottomLeft2;
        else if (mapNumber == 1220)
            image = fenceBottomMid;
        else if (mapNumber == 1230)
            image = fenceBottomRight;
        else if (mapNumber == 1231)
            image = fenceBottomRight2;
        else if (mapNumber == 2001)
            image = stoneRoad;
        else if (mapNumber == 2110)
            image = roadTopLeft;
        else if (mapNumber == 2120)
            image = roadTopMid;
        else if (mapNumber == 2130)
            image = roadTopRight;
        else if (mapNumber == 2010)
            image = roadLeft;
        else if (mapNumber == 2020)
            image = roadMid;
        else if (mapNumber == 2030)
            image = roadRight;
        else if (mapNumber == 2210)
            image = roadBottomLeft;
        else if (mapNumber == 2220)
            image = roadBottomMid;
        else if (mapNumber == 2230)
            image = roadBottomRight;
        else if (mapNumber == 3000)
            image = lawn;
        else if (mapNumber == 3001)
            image = lawn2;
        else if (mapNumber == 3002)
            image = lawn3;
        else if (mapNumber == 3003)
            image = lawn4;
        else if (mapNumber == 3004)
            image = lawn5;
        else if (mapNumber == 3005)
            image = lawn6;
        else if (mapNumber == 3006)
            image = lawn7;
        else if (mapNumber == 3007)
            image = lawn8;
        else if (mapNumber == 3008)
            image = lawn9;
        else if (mapNumber == 3009)
            image = lawnShadow;
        else if (mapNumber == 3119)
            image = grassTopLeft;
        else if (mapNumber == 3129)
            image = grassTopMid;
        else if (mapNumber == 3139)
            image = grassTopRight;
        else if (mapNumber == 3019)
            image = grassLeft;
        else if (mapNumber == 3029)
            image = grassMid;
        else if (mapNumber == 3039)
            image = grassRight;
        else if (mapNumber == 3219)
            image = grassBottomLeft;
        else if (mapNumber == 3229)
            image = grassBottomMid;
        else if (mapNumber == 3239)
            image = grassBottomRight;
        else if (mapNumber == 3100)
            image = boxTop;
        else if (mapNumber == 3200)
            image = boxBottom;
        else if (mapNumber == 3101)
            image = treeTop;
        else if (mapNumber == 3102)
            image = treeTop2;
        else if (mapNumber == 3103)
            image = treeTop3;
        else if (mapNumber == 3104)
            image = treeTop4;
        else if (mapNumber == 3105)
            image = treeTop5;
        else if (mapNumber == 3106)
            image = treeTop6;
        else if (mapNumber == 3201)
            image = treeRoot;
        else if (mapNumber == 3202)
            image = treeRoot2;
        else if (mapNumber == 3110)
            image = treeTopLeft;
        else if (mapNumber == 3113)
            image = treeTopLeft4;
        else if (mapNumber == 3130)
            image = treeTopRight;
        else if (mapNumber == 3210)
            image = treeBottomLeft;
        else if (mapNumber == 3211)
            image = treeBottomLeft2;
        else if (mapNumber == 3212)
            image = treeBottomLeft3;
        else if (mapNumber == 3213)
            image = treeBottomLeft4;
        else if (mapNumber == 3230)
            image = treeBottomRight;
        else if (mapNumber == 3231)
            image = treeBottomRight2;
        else if (mapNumber == 3232)
            image = treeBottomRight3;
        else if (mapNumber == 3233)
            image = treeBottomRight4;
        else if (mapNumber == 5110)
            image = houseTopLeft;
        else if (mapNumber == 5111)
            image = houseTopLeft2;
        else if (mapNumber == 5112)
            image = houseTopLeft3;
        else if (mapNumber == 5120)
            image = houseTopMid;
        else if (mapNumber == 5121)
            image = houseTopMid2;
        else if (mapNumber == 5122)
            image = houseTopMid3;
        else if (mapNumber == 5123)
            image = houseTopMid4;
        else if (mapNumber == 5124)
            image = houseTopMid5;
        else if (mapNumber == 5125)
            image = houseTopMid6;
        else if (mapNumber == 5126)
            image = houseTopMid7;
        else if (mapNumber == 5130)
            image = houseTopRight;
        else if (mapNumber == 5131)
            image = houseTopRight2;
        else if (mapNumber == 5132)
            image = houseTopRight3;
        else if (mapNumber == 5010)
            image = houseLeft;
        else if (mapNumber == 5011)
            image = houseLeft2;
        else if (mapNumber == 5012)
            image = houseLeft3;
        else if (mapNumber == 5020)
            image = houseMid;
        else if (mapNumber == 5021)
            image = houseMid2;
        else if (mapNumber == 5022)
            image = houseMid3;
        else if (mapNumber == 5023)
            image = houseMid4;
        else if (mapNumber == 5024)
            image = houseMid5;
        else if (mapNumber == 5030)
            image = houseRight;
        else if (mapNumber == 5031)
            image = houseRight2;
        else if (mapNumber == 5032)
            image = houseRight3;
        else if (mapNumber == 5210)
            image = houseBottomLeft;
        else if (mapNumber == 5211)
            image = houseBottomLeft2;
        else if (mapNumber == 5212)
            image = houseBottomLeft3;
        else if (mapNumber == 5213)
            image = houseBottomLeft4;
        else if (mapNumber == 5214)
            image = houseBottomLeft5;
        else if (mapNumber == 5215)
            image = houseBottomLeft6;
        else if (mapNumber == 5220)
            image = houseBottomMid;
        else if (mapNumber == 5221)
            image = houseBottomMid2;
        else if (mapNumber == 5222)
            image = houseBottomMid3;
        else if (mapNumber == 5223)
            image = houseBottomMid4;
        else if (mapNumber == 5224)
            image = houseBottomMid5;
        else if (mapNumber == 5225)
            image = houseBottomMid6;
        else if (mapNumber == 5226)
            image = houseBottomMid7;
        else if (mapNumber == 5230)
            image = houseBottomRight;
        else if (mapNumber == 5231)
            image = houseBottomRight2;
        else if (mapNumber == 5232)
            image = houseBottomRight3;
        else if (mapNumber == 5233)
            image = houseBottomRight4;
        else if (mapNumber == 5234)
            image = houseBottomRight5;
        else if (mapNumber == 6000)
            image = door;
        else if (mapNumber == 6010)
            image = wallLeft;
        else if (mapNumber == 6011)
            image = wallLeft2;
        else if (mapNumber == 6020)
            image = wall;
        else if (mapNumber == 6021)
            image = wall2;
        else if (mapNumber == 6022)
            image = wall3;
        else if (mapNumber == 6023)
            image = wall4;
        else if (mapNumber == 6024)
            image = wall5;
        else if (mapNumber == 6030)
            image = wallRight;
        else if (mapNumber == 6031)
            image = wallRight2;
        else if (mapNumber == 6120)
            image = wallTop;
        else if (mapNumber == 6121)
            image = wallTop2;
        else if (mapNumber == 6211)
            image = wallBottomLeft2;
        else if (mapNumber == 6210)
            image = wallBottomLeft;
        else if (mapNumber == 6220)
            image = wallBottomMid;
        else if (mapNumber == 6221)
            image = wallBottomMid2;
        else if (mapNumber == 6222)
            image = wallBottomMid3;
        else if (mapNumber == 6223)
            image = wallBottomMid4;
        else if (mapNumber == 6224)
            image = wallBottomMid5;
        else if (mapNumber == 6225)
            image = wallBottomMid6;
        else if (mapNumber == 6226)
            image = wallBottomMid7;
        else if (mapNumber == 6230)
            image = wallBottomRight;
        else if (mapNumber == 6231)
            image = wallBottomRight2;
        else if (mapNumber == 6100)
            image = windowTop;
        else if (mapNumber == 6101)
            image = windowTop2;
        else if (mapNumber == 6102)
            image = windowTop3;
        else if (mapNumber == 6103)
            image = windowTop4;
        else if (mapNumber == 6104)
            image = windowTop5;
        else if (mapNumber == 6200)
            image = window;
        else if (mapNumber == 6201)
            image = window2;
        else if (mapNumber == 6202)
            image = window3;
        else if (mapNumber == 6203)
            image = window4;
        else if (mapNumber == 6204)
            image = window5;
        else if (mapNumber == 6205)
            image = window6;
        else if (mapNumber == 4110)
            image = poolTopLeft;
        else if (mapNumber == 4120)
            image = poolTopMid;
        else if (mapNumber == 4121)
            image = poolTopMid2;
        else if (mapNumber == 4122)
            image = poolTopMid3;
        else if (mapNumber == 4130)
            image = poolTopRight;
        else if (mapNumber == 4131)
            image = poolTopRight2;
        else if (mapNumber == 4210)
            image = poolBottomLeft;
        else if (mapNumber == 4211)
            image = poolBottomLeft2;
        else if (mapNumber == 4212)
            image = poolBottomLeft3;
        else if (mapNumber == 4220)
            image = poolBottomMid;
        else if (mapNumber == 4230)
            image = poolBottomRight;
        else if (mapNumber == 4231)
            image = poolBottomRight2;
        else if (mapNumber == 4010)
            image = poolLeft;
        else if (mapNumber == 4020)
            image = poolMid;
        else if (mapNumber == 4021)
            image = poolMid2;
        else if (mapNumber == 4030)
            image = poolRight;
        else if (mapNumber == 7000)
            image = stairs;
        else if (mapNumber == 7100)
            image = lampTop;
        else if (mapNumber == 7001)
            image = lamp;
        else if (mapNumber == 7200)
            image = lampBottom;
        else if (mapNumber == 8110)
            image = cliffTopLeft;
        else if (mapNumber == 8010)
            image = cliffLeft;
        else if (mapNumber == 8011)
            image = cliffLeft2;
        else if (mapNumber == 8020)
            image = cliffMid;
        else if (mapNumber == 8021)
            image = cliffMid2;
        else if (mapNumber == 8030)
            image = cliffRight;
        else if (mapNumber == 8210)
            image = cliffBottomLeft;
        else if (mapNumber == 8211)
            image = cliffBottomLeft2;
        else if (mapNumber == 8212)
            image = cliffBottomLeft3;
        else if (mapNumber == 8220)
            image = cliffBottomMid;
        else if (mapNumber == 8230)
            image = cliffBottomRight;
        else if(mapNumber == 10000)
            image = floor;
        else if(mapNumber == 10001)
            image = floor2;
        else if(mapNumber == 10002)
            image = floor3;
        else if(mapNumber == 10003)
            image = floor4;
        else if(mapNumber == 10004)
            image = floor5;
        else if(mapNumber == 10005)
            image = floor6;
        else if(mapNumber == 10010)
            image = floorLeft;
        else if(mapNumber == 10011)
            image = floorLeft2;
        else if(mapNumber == 10021)
            image = floorMid;
        else if(mapNumber == 10031)
            image = floorRight;
        else if(mapNumber == 10210)
            image = carpetBottomLeft;
        else if(mapNumber == 10211)
            image = carpetBottomLeft2;
        else if(mapNumber == 10212)
            image = carpetBottomLeft3;
        else if(mapNumber == 10213)
            image = carpetBottomLeft4;
        else if(mapNumber == 10220)
            image = carpetBottomMid;
        else if(mapNumber == 10221)
            image = carpetBottomMid2;
        else if(mapNumber == 10222)
            image = armor18;
        else if(mapNumber == 10230)
            image = carpetBottomRight;
        else if(mapNumber == 10231)
            image = carpetBottomRight2;
        else if(mapNumber == 10020)
            image = carpetMid;
        else if(mapNumber == 10030)
            image = carpetRight;
        else if(mapNumber == 13210)
            image = ceilingBottomLeft;
        else if(mapNumber == 13211)
            image = ceilingBottomLeft2;
        else if(mapNumber == 13212)
            image = ceilingBottomLeft3;
        else if(mapNumber == 13220)
            image = ceilingBottomMid;
        else if(mapNumber == 13230)
            image = ceilingBottomRight;
        else if(mapNumber == 13231)
            image = ceilingBottomRight2;
        else if(mapNumber == 13010)
            image = ceilingLeft;
        else if(mapNumber == 13011)
            image = ceilingLeft2;
        else if(mapNumber == 13020)
            image = ceilingMid;
        else if(mapNumber == 13021)
            image = ceilingMid2;
        else if(mapNumber == 13022)
            image = ceilingMid3;
        else if(mapNumber == 13030)
            image = ceilingRight;
        else if(mapNumber == 13031)
            image = ceilingRight2;
        else if(mapNumber == 13032)
            image = ceilingRight3;
        else if(mapNumber == 13033)
            image = ceilingRight4;
        else if(mapNumber == 13110)
            image = ceilingTopLeft;
        else if(mapNumber == 13111)
            image = ceilingTopLeft2;
        else if(mapNumber == 13112)
            image = ceilingTopLeft3;
        else if(mapNumber == 13120)
            image =ceilingTopMid;
        else if(mapNumber == 13121)
            image =ceilingTopMid2;
        else if(mapNumber == 13122)
            image =ceilingTopMid3;
        else if(mapNumber == 13123)
            image =ceilingTopMid4;
        else if(mapNumber == 13130)
            image =ceilingTopRight;
        else if(mapNumber == 13131)
            image =ceilingTopRight2;
        else if(mapNumber == 13132)
            image =ceilingTopRight3;
        else if(mapNumber == 13133)
            image =ceilingTopRight4;
        else if(mapNumber == 11000)
            image =furniture;
        else if(mapNumber == 11001)
            image =furniture2;
        else if(mapNumber == 11002)
            image =furniture3;
        else if(mapNumber == 11003)
            image =furniture4;
        else if(mapNumber == 11004)
            image =furniture5;
        else if(mapNumber == 11005)
            image =furniture6;
        else if(mapNumber == 11006)
            image =furniture7;
        else if(mapNumber == 11007)
            image =furniture8;
        else if(mapNumber == 11008)
            image =furniture9;
        else if(mapNumber == 11009)
            image =furniture10;
        else if(mapNumber == 11200)
            image =furnitureBottom;
        else if(mapNumber == 11201)
            image =furnitureBottom2;
        else if(mapNumber == 11202)
            image =furnitureBottom3;
        else if(mapNumber == 11203)
            image =furnitureBottom4;
        else if(mapNumber == 11205)
            image =furnitureBottom6;
        else if(mapNumber == 11206)
            image =furnitureBottom7;
        else if(mapNumber == 11230)
            image =furnitureBottomRight;
        else if(mapNumber == 11010)
            image =furnitureLeft;
        else if(mapNumber == 11011)
            image =furnitureLeft2;
        else if(mapNumber == 11012)
            image =furnitureLeft3;
        else if(mapNumber == 11020)
            image =furnitureMid;
        else if(mapNumber == 11021)
            image =furnitureMid2;
        else if(mapNumber == 11022)
            image =furnitureMid3;
        else if(mapNumber == 11030)
            image =furnitureRight;
        else if(mapNumber == 11031)
            image =furnitureRight2;
        else if(mapNumber == 11100)
            image =furnitureTop;
        else if(mapNumber == 11101)
            image =furnitureTop2;
        else if(mapNumber == 11102)
            image =furnitureTop3;
        else if(mapNumber == 11103)
            image =furnitureTop4;
        else if(mapNumber == 11104)
            image =furnitureTop5;
        else if(mapNumber == 11105)
            image =furnitureTop6;
        else if(mapNumber == 11110)
            image =furnitureTopLeft;
        else if(mapNumber == 11130)
            image =furnitureTopRight;
        else if(mapNumber == 11111)
            image =furnitureTopLeft2;
        else if(mapNumber == 11131)
            image =furnitureTopRight2;
        else if(mapNumber == 12200)
            image = houseWallBottom;
        else if(mapNumber == 12201)
            image = houseWallBottom2;
        else if(mapNumber == 12202)
            image = houseWallBottom3;
        else if(mapNumber == 12203)
            image = houseWallBottom4;
        else if(mapNumber == 12204)
            image = houseWallBottom5;
        else if(mapNumber == 12205)
            image = houseWallBottom6;
        else if(mapNumber == 12206)
            image = houseWallBottom7;
        else if(mapNumber == 12207)
            image = houseWallBottom8;
        else if(mapNumber == 12010)
            image = houseWallLeft;
        else if(mapNumber == 12020)
            image = houseWallMid;
        else if(mapNumber == 12030)
            image = houseWallRight;
        else if(mapNumber == 12100)
            image = houseWallTop;
        else if(mapNumber == 12101)
            image = houseWallTop2;
        else if(mapNumber == 12102)
            image = houseWallTop3;
        else if(mapNumber == 12103)
            image = houseWallTop4;
        else if(mapNumber == 12104)
            image = houseWallTop5;
        else if(mapNumber == 12105)
            image = houseWallTop6;
        else if(mapNumber == 6001)
            image = stair;
        else if(mapNumber == 6002)
            image = hotel2F1;


        //forest
        else if(mapNumber == 20100)
            image = forest40;
        else if(mapNumber == 20101)
            image = forest41;
        else if(mapNumber == 20000)
            image = forest2;
        else if(mapNumber == 20001)
            image = forest3;
        else if(mapNumber == 20002)
            image = forest4;
        else if(mapNumber == 20003)
            image = forest5;
        else if(mapNumber == 20012)
            image = forest9;
        else if(mapNumber == 20106)
            image = forest46;
        else if(mapNumber == 20116)
            image = forest50;
        else if(mapNumber == 20126)
            image = forest54;

        else if(mapNumber == 20111)
            image = forest48;
        else if(mapNumber == 20110)
            image = forest47;
        else if(mapNumber == 20103)
            image = forest43;
        else if(mapNumber == 20005)
            image = forest6;
        else if(mapNumber == 20015)
            image = forest10;
        else if(mapNumber == 20190)
            image = forest60;


        else if(mapNumber == 20102)
            image = forest42;
        else if(mapNumber == 20007)
            image = forest7;
        else if(mapNumber == 20025)
            image = forest13;
        else if(mapNumber == 20301)
            image = forest91;
        else if(mapNumber == 20010)
            image = forest8;
        else if(mapNumber == 20020)
            image = forest11;
        else if(mapNumber == 20180)
            image = forest59;
        else if(mapNumber == 20114)
            image = forest49;
        else if(mapNumber == 20302)
            image = forest92;
        else if(mapNumber == 20201)
            image = forest61;
        else if(mapNumber == 20030)
            image = forest14;
        else if(mapNumber == 20105)
            image = forest45;
        else if(mapNumber == 10121)
            image = forest52;
        else if(mapNumber == 20120)
            image = forest51;
        else if(mapNumber == 20303)
            image = forest93;
        else if(mapNumber == 20104)
            image = forest44;
        else if(mapNumber == 20050)
            image = forest17;
        else if(mapNumber == 20060)
            image = forest19;
        else if(mapNumber == 20212)
            image = forest69;
        else if(mapNumber == 20211)
            image = forest68;
        else if(mapNumber == 20210)
            image = forest67;

        else if(mapNumber == 20032)
            image = forest15;
        else if(mapNumber == 20203)
            image = forest62;
        else if(mapNumber == 20204)
            image = forest63;
        else if(mapNumber == 20205)
            image = forest64;
        else if(mapNumber == 20220)
            image = forest75;
        else if(mapNumber == 20221)
            image = forest76;
        else if(mapNumber == 20222)
            image = forest77;
        else if(mapNumber == 20304)
            image = forest94;
        else if(mapNumber == 20213)
            image = forest70;
        else if(mapNumber == 20214)
            image = forest71;
        else if(mapNumber == 20215)
            image = forest72;
        else if(mapNumber == 20223)
            image = forest78;
        else if(mapNumber == 20224)
            image = forest79;
        else if(mapNumber == 20225)
            image = forest80;

        else if(mapNumber == 20305)
            image = forest95;
        else if(mapNumber == 20385)
            image = forest114;

        else if(mapNumber == 20306)
            image = forest96;
        else if(mapNumber == 20300)
            image = forest90;
        else if(mapNumber == 20040)
            image = forest16;
        else if(mapNumber == 20052)
            image = forest18;
        else if(mapNumber == 20061)
            image = forest20;
        else if(mapNumber == 20062)
            image = forest21;
        else if(mapNumber == 20070)
            image = forest22;
        else if(mapNumber == 20071)
            image = forest23;
        else if(mapNumber == 20072)
            image = forest24;
        else if(mapNumber == 20073)
            image = forest25;
        else if(mapNumber == 20074)
            image = forest26;
        else if(mapNumber == 20075)
            image = forest27;
        else if(mapNumber == 20076)
            image = forest28;
        else if(mapNumber == 20077)
            image = forest29;
        else if(mapNumber == 20078)
            image = forest30;
        else if(mapNumber == 20079)
            image = forest31;
        else if(mapNumber == 20080)
            image = forest32;
        else if(mapNumber == 20081)
            image = forest33;
        else if(mapNumber == 20082)
            image = forest34;
        else if(mapNumber == 20083)
            image = forest35;
        else if(mapNumber == 20084)
            image = forest36;
        else if(mapNumber == 20085)
            image = forest37;
        else if(mapNumber == 20086)
            image = forest38;
        else if(mapNumber == 20087)
            image = forest39;
        else if(mapNumber == 20121)
            image = forest52;
        else if(mapNumber == 20124)
            image = forest53;
        else if(mapNumber == 20134)
            image = forest55;
        else if(mapNumber == 20136)
            image = forest56;
        else if(mapNumber == 20146)
            image = forest57;
        else if(mapNumber == 20156)
            image = forest58;
        else if(mapNumber == 20206)
            image = forest65;
        else if(mapNumber == 20207)
            image = forest66;
        else if(mapNumber == 20216)
            image = forest73;
        else if(mapNumber == 20217)
            image = forest74;
        else if(mapNumber == 20226)
            image = forest81;
        else if(mapNumber == 20227)
            image = forest82;
        else if(mapNumber == 20233)
            image = forest83;
        else if(mapNumber == 20236)
            image = forest84;
        else if(mapNumber == 20243)
            image = forest85;
        else if(mapNumber == 20246)
            image = forest86;
        else if(mapNumber == 20256)
            image = forest87;
        else if(mapNumber == 20266)
            image = forest88;
        else if(mapNumber == 20276)
            image = forest89;

        else if(mapNumber == 20312)
            image = forest97;
        else if(mapNumber == 20313)
            image = forest98;
        else if(mapNumber == 20315)
            image = forest99;

        else if(mapNumber == 20323)
            image = forest100;
        else if(mapNumber == 20325)
            image = forest101;
        else if(mapNumber == 20333)
            image = forest102;
        else if(mapNumber == 20335)
            image = forest103;
        else if(mapNumber == 20343)
            image = forest104;
        else if(mapNumber == 20345)
            image = forest105;
        else if(mapNumber == 20353)
            image = forest106;
        else if(mapNumber == 20355)
            image = forest107;
        else if(mapNumber == 20363)
            image = forest108;
        else if(mapNumber == 20366)
            image = forest109;
        else if(mapNumber == 20367)
            image = forest110;
        else if(mapNumber == 20373)
            image = forest111;
        else if(mapNumber == 20375)
            image = forest112;
        else if(mapNumber == 20383)
            image = forest113;
        else if(mapNumber == 20393)
            image = forest115;
        else if(mapNumber == 20011)
            image = tentLeft;
        else if(mapNumber == 21012)
            image = tentMid;
        else if(mapNumber == 20013)
            image = tentRight;



        else if(mapNumber == 16040)
            image = armor1;

        else if(mapNumber == 16041)
            image = armor2;
        else if(mapNumber ==  16042)
            image = armor3;
        else if(mapNumber == 16043)
            image = armor4;
        else if(mapNumber ==16044)
            image = armor5;
        else if(mapNumber ==16045)
            image = armor6;
        else if(mapNumber ==16000)
            image= armor7;
        else if(mapNumber ==16001)
            image = armor8;
        else if(mapNumber ==16002)
            image = armor9;
        else if(mapNumber ==16003)
            image = armor10;
        else if(mapNumber == 16004)
            image= armor11;

        else if(mapNumber ==  16005)
            image = armor12;
        else if(mapNumber ==16006)
            image = armor13;
        else if(mapNumber ==  16007)
            image = armor14;
        else if(mapNumber ==16008)
            image = armor15;
        else if(mapNumber ==16009)
            image = armor40;
        else if(mapNumber ==  15000)
            image = armor20;
        else if(mapNumber ==  15001)
            image = armor43;
        else if(mapNumber ==14000)
            image = armor21;
        else if(mapNumber ==14001)
            image = armor22;
        else if(mapNumber == 14002)
            image =  armor23;
        else if(mapNumber == 14003)
            image = armor24;
        else if(mapNumber == 14004)
            image = armor25;
        else if(mapNumber == 16010)
            image = armor26;
        else if(mapNumber == 16020)
            image = armor27;
        else if(mapNumber ==  16021)
            image = armor28;
        else if(mapNumber ==  16030)
            image = armor29;
        else if(mapNumber == 14200)
            image = armor30;
        else if(mapNumber == 14201)
            image = armor31;
        else if(mapNumber == 14210)
            image = armor32;
        else if(mapNumber ==14220)
            image = armor33;
        else if(mapNumber == 14230)
            image = armor34;
        else if(mapNumber ==14100)
            image = armor35;
        else if(mapNumber == 14101)
            image = armor36;
        else if(mapNumber == 14110)
            image = armor37;
        else if(mapNumber ==14120)
            image = armor38;
        else if(mapNumber == 14130)
            image = armor39;
        else if(mapNumber == 16231)
            image = armor41;
        else if(mapNumber == 16210)
            image = armor42;
        else if(mapNumber == 16100)
            image = armor45;
        else if(mapNumber == 16011)
            image = armor44;


        else if(mapNumber == 44440)
            image = tower1f1;
        else if(mapNumber == 44441)
            image = tower1f2;
        else if(mapNumber == 44442)
            image = tower1f3;
        else if(mapNumber ==44443)
            image = tower1f4;
        else if(mapNumber ==44444 )
            image = tower1f5;
        else if(mapNumber == 44445)
            image = tower1f6;
        else if(mapNumber == 44446)
            image = tower1f7;
        else if(mapNumber == 44447)
            image = tower1f8;
        else if(mapNumber == 44448)
            image = tower1f9;
        else if(mapNumber == 44449)
            image = tower1f10;
        else if(mapNumber ==44450)
            image = tower1f11;
        else if(mapNumber == 44451)
            image = tower1f12;
        else if(mapNumber ==44452)
            image = tower1f13;
        else if(mapNumber == 40100)
            image = tower1f14;
        else if(mapNumber == 40101)
            image = tower1f15;
        else if(mapNumber == 40102)
            image = tower1f16;
        else if(mapNumber ==40103)
            image = tower1f17;
        else if(mapNumber == 40104)
            image = tower1f18;
        else if(mapNumber == 40105)
            image = tower1f19;
        else if(mapNumber ==40106)
            image = tower1f20;
        else if(mapNumber == 40107)
            image = tower1f21;
        else if(mapNumber == 40108)
            image = tower1f22;
        else if(mapNumber == 40109)
            image = tower1f23;
        else if(mapNumber == 40110)
            image = tower1f24;
        else if(mapNumber == 40111)
            image = tower1f25;
        else if(mapNumber == 40112)
            image = tower1f26;
        else if(mapNumber == 40113)
            image = tower1f27;
        else if(mapNumber == 40114)
            image = tower1f28;
        else if(mapNumber == 40115)
            image = tower1f29;
        else if(mapNumber ==40116)
            image = tower1f30;
        else if(mapNumber ==40117 )
            image = tower1f31;
        else if(mapNumber ==40118 )
            image = tower1f32;
        else if(mapNumber == 40119)
            image = tower1f33;
        else if(mapNumber == 40120)
            image = tower1f34;
        else if(mapNumber == 40121)
            image = tower1f35;
        else if(mapNumber ==40122)
            image = tower1f36;
        else if(mapNumber == 40123)
            image = tower1f37;
        else if(mapNumber ==40124)
            image = tower1f38;
        else if(mapNumber == 41025)
            image = tower1f39;
        else if(mapNumber == 40126)
            image = tower1f40;
        else if(mapNumber == 40127)
            image = tower1f41;
        else if(mapNumber == 40128)
            image = tower1f42;
        else if(mapNumber == 40129)
            image = tower1f43;
        else if(mapNumber == 40130)
            image = tower1f44;
        else if(mapNumber == 40131)
            image = tower1f45;
        else if(mapNumber == 40132)
            image = tower1f46;
        else if(mapNumber == 40133)
            image = tower1f47;
        else if(mapNumber == 40134)
            image = tower1f48;
        else if(mapNumber == 40135)
            image = tower1f49;
        else if(mapNumber == 40136)
            image = tower1f50;
        else if(mapNumber == 40137)
            image = tower1f51;
        else if(mapNumber == 40125)
            image = tower1f52;
        else if(mapNumber == 40200)
            image = tower1f53;
        else if(mapNumber == 40201)
            image = tower1f54;
        else if(mapNumber == 40202)
            image = tower1f55;
        else if(mapNumber == 40203)
            image = tower1f56;
        else if(mapNumber == 40204)
            image = tower1f57;
        else if(mapNumber == 40205)
            image = tower1f58;
        else if(mapNumber == 40206)
            image = tower1f59;
        else if(mapNumber == 40207)
            image = tower1f60;
        else if(mapNumber == 40208)
            image = tower1f61;
        else if(mapNumber == 40209)
            image = tower1f62;
        else if(mapNumber == 40210)
            image = tower1f63;
        else if(mapNumber == 40211)
            image = tower1f64;
        else if(mapNumber == 40212)
            image = tower1f65;
        else if(mapNumber == 40213)
            image = tower1f66;
        else if(mapNumber == 40214)
            image = tower1f67;
        else if(mapNumber == 40215)
            image = tower1f68;
        else if(mapNumber == 40216)
            image = tower1f69;
        else if(mapNumber == 40217)
            image = tower1f70;
        else if(mapNumber == 40000 )
            image = tower1f71;
        else if(mapNumber ==40001)
            image = tower1f72;
        else if(mapNumber == 40002)
            image = tower1f73;
        else if(mapNumber == 40003)
            image = tower1f74;
        else if(mapNumber == 40004)
            image = tower1f75;
        else if(mapNumber == 40005)
            image = tower1f76;
        else if(mapNumber == 40006)
            image = tower1f77;
        else if(mapNumber == 40007)
            image = tower1f78;
        else if(mapNumber == 40008)
            image = tower1f79;
        else if(mapNumber == 40009)
            image = tower1f80;
        else if(mapNumber == 40010)
            image = tower1f81;

        else if(mapNumber ==16050 )
            image = weapon9;
        else if(mapNumber == 16051)
            image = weapon10;
        else if(mapNumber ==16052 )
            image = weapon11;
        else if(mapNumber == 16053)
            image = weapon12;
        else if(mapNumber == 16054)
            image = weapon13;
        else if(mapNumber ==16055 )
            image = weapon14;
        else if(mapNumber ==16056 )
            image = weapon15;
        else if(mapNumber == 16057)
            image = weapon16;
        else if(mapNumber == 16060)
            image = weapon17;
        else if(mapNumber == 16061)
            image = weapon18;
        else if(mapNumber == 16063)
            image = weapon20;
        else if(mapNumber == 16064)
            image = weapon21;
        else if(mapNumber ==16065 )
            image = weapon22;
        else if(mapNumber ==16066 )
            image = weapon23;

        else if(mapNumber == 16069)
            image = weapon24;
        else if(mapNumber ==16070 )
            image = weapon25;
        else if(mapNumber == 16071)
            image = weapon26;
        else if(mapNumber == 16072)
            image = weapon27;
        else if(mapNumber == 16073)
            image = weapon28;
        else if(mapNumber == 16074)
            image = weapon29;
        else if(mapNumber == 16075)
            image = weapon30;
        else if(mapNumber == 16076)
            image = weapon31;
        else if(mapNumber == 16077)
            image = weapon32;

        else if(mapNumber == 16078)
            image = weapon33;
        else if(mapNumber == 16079)
            image = weapon34;
        else if(mapNumber ==15230 )
            image = weapon35;
        else if(mapNumber ==15010 )
            image = weapon36;
        else if(mapNumber == 15030)
            image = weapon37;
        else if(mapNumber == 15110)
            image = weapon38;
        else if(mapNumber == 15120)
            image = weapon39;
        else if(mapNumber ==15130 )
            image = weapon40;
        else if(mapNumber == 14005)
            image = weapon46;
        else if(mapNumber == 14006)
            image = weapon47;
        else if(mapNumber == 14007)
            image = weapon48;

        else if(mapNumber == 14202)
            image = weapon49;
        else if(mapNumber == 14203)
            image = weapon50;
        else if(mapNumber == 14204)
            image = weapon51;
        else if(mapNumber == 14205)
            image = weapon52;
        else if(mapNumber == 14206)//bo7
            image = weapon53;

        else if(mapNumber ==14103 )
            image = weapon54;
        else if(mapNumber ==14104 )
            image = weapon55;
        else if(mapNumber == 14105)//top5
            image = weapon56;
        else if(mapNumber == 14106)//top6
            image = weapon57;
        else if(mapNumber == 14107)
            image = weapon58;

        else if(mapNumber == 15020)
            image = weapon59;
        else if(mapNumber == 15021)
            image = weapon60;


        else if(mapNumber == 15999)
            image = weapon61;
        else if(mapNumber== 15210)
            image = weapon62;
        else if(mapNumber == 15220)
            image = weapon63;
        else if(mapNumber == 15011)
            image = weapon64;
        else if(mapNumber == 15031)
            image = weapon65;


        else if(mapNumber == 100)
            image = armorOwner;
        else if(mapNumber == 101)
            image = passerby;
        else if(mapNumber == 102)
            image = passerby2;
        else if(mapNumber == 103)
            image = passerby3;
        else if(mapNumber == 104)
            image = passerby4;
        else if(mapNumber == 109)
            image = passerby5;
        else if(mapNumber == 110)
            image = passerby6;
        else if(mapNumber == 105)
            image = theOld;
        else if(mapNumber == 106)
            image = monster0;
        else if(mapNumber == 107)
            image = weaponOwner;
        else if(mapNumber == 108)
            image = drugOwner;
        else if(mapNumber == 111)
            image = monster1;
        else if(mapNumber == 112)
            image = passerby7;
        else if(mapNumber == 113)
            image = monster2;
        else if(mapNumber == 114)
            image = monster3;
        else if(mapNumber == 115)
            image = monster4;
        else if(mapNumber == 116)
            image = monster5;
        else if(mapNumber == 117)
            image = monster6;
        else if(mapNumber == 118)
            image = spirit;
        else if(mapNumber == 119)
            image = monster7;
        else if(mapNumber == 120)
            image = monster8;
        else if(mapNumber == 121)
            image = monster9;
        else if(mapNumber == 122)
            image = spirit2;
        else if(mapNumber == 123)
            image = hotelOwner;
        else if(mapNumber == 124)
            image = passerby8;
        else if(mapNumber == 125)
            image = passerby8;

        else if(mapNumber ==70000 )
            image = bed1;
        else if(mapNumber ==70001 )
            image = bed2;
        else if(mapNumber == 70002)
            image = bed3;
        else if(mapNumber == 70003)
            image = bed4;
        else if(mapNumber == 70004)
            image = bed5;
        else if(mapNumber == 70005)
            image = bed6;
        else if(mapNumber == 70006)
            image = bed7;
        else if(mapNumber == 70007)
            image = bed8;
        else if(mapNumber == 70008)
            image = bed9;
        else if(mapNumber ==70009 )
            image = bed10;
        else if(mapNumber ==70010 )
            image = bed11;
        else if(mapNumber == 70011)
            image = bed12;
        else if(mapNumber == 70012)
            image = bed13;
        else if(mapNumber ==70013 )
            image = bed14;
        else if(mapNumber ==70014 )
            image = bed15;
        else if(mapNumber == 70015)
            image = bed16;
        else if(mapNumber == 70016)
            image = bed17;
        else if(mapNumber == 70017)
            image = bed18;
        else if(mapNumber == 70018)
            image = bed19;
        else if(mapNumber ==70019 )
            image = bed20;
        else if(mapNumber == 70020)
            image = bed21;
        else if(mapNumber == 70021)
            image = bed22;
        else if(mapNumber ==70022 )
            image = bed23;
        else if(mapNumber == 70023)
            image = bed24;
        else if(mapNumber == 70024)
            image = bed25;
        else if(mapNumber == 70025)
            image = bed26;
        else if(mapNumber == 70026)
            image = bed27;
        else if(mapNumber == 70027)
            image = bed28;
        else if(mapNumber == 70028)
            image = bed29;
        else if(mapNumber == 70029)
            image = bed30;
        else if(mapNumber ==70030 )
            image = bed31;
        else if(mapNumber ==70031 )
            image = bed32;
        else if(mapNumber == 70032)
            image = bed33;
        else if(mapNumber == 70100)
            image = bed34;
        else if(mapNumber == 70101)
            image = bed35;
        else if(mapNumber ==70102 )
            image = bed36;
        else if(mapNumber == 70103)
            image = bed37;
        else if(mapNumber ==70104 )
            image = bed38;
        else if(mapNumber == 70105)
            image = bed39;
        else if(mapNumber == 70106)
            image = bed40;
        else if(mapNumber ==70107 )
            image = bed41;
        else if(mapNumber == 70108)
            image = bed42;
        else if(mapNumber == 70109)
            image = bed43;
        else if(mapNumber ==70110 )
            image = bed44;
        else if(mapNumber == 70111)
            image = bed45;
        else if(mapNumber == 70112)
            image = bed46;
        else if(mapNumber == 70113)
            image = bed47;
        else if(mapNumber == 70114)
            image = bed48;
        else if(mapNumber == 70115)
            image = bed49;
        else if(mapNumber == 70116)
            image = bed50;

        else if(mapNumber == 60040)
            image = drug1;
        else if(mapNumber ==60050 )
            image = drug2;
        else if(mapNumber == 60060)
            image = drug3;
        else if(mapNumber ==60070 )
            image = drug4;
        else if(mapNumber == 60080 )
            image = drug5;
        else if(mapNumber == 60090)
            image = drug6;
        else if(mapNumber == 11107)
            image = drug7;
        else if(mapNumber == 11023)
            image = drug8;
        else if(mapNumber == 11024)
            image = drug9;
        else if(mapNumber == 11025)
            image = drug10;
        else if(mapNumber == 11026)
            image = drug11;

        else if(mapNumber == 60100)
            image = drug12;
        else if(mapNumber == 60110)
            image = drug13;
        else if(mapNumber == 60200)
            image = drug14;
        else if(mapNumber == 60210)
            image = drug15;
        else if(mapNumber == 60300)
            image = drug16;
        else if(mapNumber == 60310)
            image = drug17;

        else if(mapNumber == 80000)
            image = towertop1;
        else if(mapNumber == 80001)
            image = towertop2;
        else if(mapNumber == 80002)
            image = towertop3;
        else if(mapNumber == 80003)
            image = towertop4;
        else if(mapNumber == 80004)
            image = towertop5;
        else if(mapNumber == 80005)
            image = towertop6;
        else if(mapNumber == 80006)
            image = towertop7;
        else if(mapNumber == 80007)
            image = towertop8;
        else if(mapNumber == 80008)
            image = towertop9;
        else if(mapNumber ==80009 )
            image = towertop10;
        else if(mapNumber == 80010)
            image = towertop11;
        else if(mapNumber == 80011)
            image = towertop12;
        else if(mapNumber == 80012)
            image = towertop13;
        else if(mapNumber == 80013)
            image = towertop14;
        else if(mapNumber == 80014)
            image = towertop15;
        else if(mapNumber ==80015 )
            image = towertop16;
        else if(mapNumber == 80016)
            image = towertop17;
        else if(mapNumber == 80017)
            image = towertop18;
        else if(mapNumber == 80019)
            image = towertop19;
        else if(mapNumber == 80100)
            image = towertop20;
        else if(mapNumber == 80101)
            image = towertop21;
        else if(mapNumber == 80102)
            image = towertop22;
        else if(mapNumber == 80103)
            image = towertop23;
        else if(mapNumber == 80104)
            image = towertop24;
        else if(mapNumber ==80105 )
            image = towertop25;
        else if(mapNumber == 80106)
            image = towertop26;
        else if(mapNumber == 80107)
            image = towertop27;
        else if(mapNumber ==80108 )
            image = towertop28;
        else if(mapNumber == 80109)
            image = towertop29;
        else if(mapNumber == 80110)
            image = towertop30;
        else if(mapNumber == 80111)
            image = towertop31;
        else if(mapNumber == 80112)
            image = towertop32;
        else if(mapNumber == 80113)
            image = towertop33;
        else if(mapNumber == 80115)
            image = towertop34;
        else if(mapNumber == 80116)
            image = towertop35;
        else if(mapNumber == 80117)
            image = towertop36;
        else if(mapNumber == 80118)
            image = towertop37;
        else if(mapNumber == 80119)
            image = towertop38;
        else if(mapNumber == 80120)
            image = towertop39;
        else if(mapNumber == 80121)
            image = towertop40;
        else if(mapNumber == 80122)
            image = towertop41;
        else if(mapNumber == 80123)
            image = towertop42;
        else if(mapNumber == 80124)
            image = towertop43;
        else if(mapNumber == 80125)
            image = towertop44;
        else if(mapNumber == 80126)
            image = towertop45;
        else if(mapNumber == 80127)
            image = towertop46;
        else if(mapNumber == 80128)
            image = towertop47;
        else if(mapNumber == 80129)
            image = towertop48;
        else if(mapNumber == 80130)
            image = towertop49;
        else if(mapNumber == 80131)
            image = towertop50;
        else if(mapNumber == 80132)
            image = towertop51;

        else if(mapNumber == 44453)
            image = tower2F1;
        else if(mapNumber == 44454)
            image = tower2F2;
        else if(mapNumber == 44455)
            image = tower2F3;
        else if(mapNumber == 44456)
            image = tower2F4;
        else if(mapNumber == 40139)
            image = tower2F5;
        else if(mapNumber == 40140)
            image = tower2F6;
        else if(mapNumber == 40141)
            image = tower2F7;
        else if(mapNumber == 40142)
            image = tower2F8;
        else if(mapNumber == 40143)
            image = tower2F9;
        else if(mapNumber == 40144)
            image = tower2F10;
        else if(mapNumber == 40145)
            image = tower2F11;
        else if(mapNumber == 40146)
            image = tower2F12;
        else if(mapNumber == 40218)
            image = tower2F13;
        else if(mapNumber == 40219)
            image = tower2F14;

        else if(mapNumber == 50000)
            image = house1F1;
        else if(mapNumber == 50100)
            image = house1F2;
        else if(mapNumber == 50101)
            image = house1F3;
        else if(mapNumber == 50102)
            image = house1F4;
        else if(mapNumber == 50103)
            image = house1F5;
        else if(mapNumber == 50104)
            image = house1F6;
        else if(mapNumber == 50105)
            image = house1F7;
        else if(mapNumber == 50106)
            image = house1F8;
        else if(mapNumber == 50107)
            image = house1F9;
        else if(mapNumber == 50108)
            image = house1F10;
        else if(mapNumber == 50109)
            image = house1F11;
        else if(mapNumber == 50110)
            image = house1F12;
        else if(mapNumber == 50111)
            image = house1F13;
        else if(mapNumber == 50112)
            image = house1F14;
        else if(mapNumber == 50113)
            image = house1F15;
        else if(mapNumber == 50114)
            image = house1F16;
        else if(mapNumber == 50115)
            image = house1F17;
        else if(mapNumber == 50116)
            image = house1F18;
        else if(mapNumber == 50117)
            image = house1F19;
        else if(mapNumber == 50118)
            image = house1F20;
        else if(mapNumber == 50119)
            image = house1F21;
        else if(mapNumber == 50120)
            image = house1F22;
        else if(mapNumber == 50121)
            image = house1F23;
        else if(mapNumber == 50122)
            image = house1F24;
        else if(mapNumber == 50123)
            image = house1F25;
        else if(mapNumber == 50124)
            image = house1F26;
        else if(mapNumber == 50200)
            image = house1F27;
        else if(mapNumber == 50201)
            image = house1F28;
        else if(mapNumber == 50202)
            image = house1F29;
        else if(mapNumber == 50203)
            image = house1F30;

        else if(mapNumber == 50125)
            image = house2F1;
        else if(mapNumber == 50126)
            image = house2F2;
        else if(mapNumber == 50127)
            image = house2F3;
        else if(mapNumber == 50128)
            image = house2F4;
        else if(mapNumber == 50129)
            image = house2F5;
        else if(mapNumber == 50130)
            image = house2F6;
        else if(mapNumber == 50131)
            image = house2F7;
        else if(mapNumber == 50132)
            image = house2F8;
        else if(mapNumber == 50133)
            image = house2F9;
        else if(mapNumber == 50134)
            image = house2F10;
        else if(mapNumber == 50135)
            image = house2F11;
        else if(mapNumber == 50136)
            image = house2F12;
        else if(mapNumber == 50137)
            image = house2F13;
        else if(mapNumber == 50138)
            image = house2F14;
        else if(mapNumber == 50139)
            image = house2F15;
        else if(mapNumber == 50140)
            image = house2F16;
        else if(mapNumber == 50141)
            image = house2F17;
        else if(mapNumber == 50142)
            image = house2F18;
        else if(mapNumber == 50143)
            image = house2F19;
        else if(mapNumber == 50144)
            image = house2F20;
        else if(mapNumber == 50145)
            image = house2F21;
        else if(mapNumber == 50146)
            image = house2F22;
        else if(mapNumber == 50147)
            image = house2F23;
        else if(mapNumber == 50204)
            image = house2F24;
        else if(mapNumber == 50205)
            image = house2F25;
        else if(mapNumber == 50206)
            image = house2F26;
        else if(mapNumber == 50207)
            image = house2F27;
        else if(mapNumber == 50208)
            image = house2F28;
        else if(mapNumber == 50209)
            image = house2F29;
        else if(mapNumber == 50210)
            image = house2F30;
        else if(mapNumber == 50211)
            image = house2F31;
        else if(mapNumber == 50212)
            image = house2F32;
        else if(mapNumber == 50213)
            image = house2F33;
        else if(mapNumber == 50214)
            image = house2F34;
        else if(mapNumber == 50215)
            image = house2F35;
        else if(mapNumber == 50216)
            image = house2F36;
        else if(mapNumber == 50217)
            image = house2F37;
        else if(mapNumber == 50218)
            image = house2F38;
        else if(mapNumber == 50219)
            image = house2F39;
        else if(mapNumber == 50220)
            image = house2F40;
        else if(mapNumber == 50221)
            image = house2F41;
        else if(mapNumber == 50222)
            image = house2F42;
        else if(mapNumber == 50223)
            image = house2F43;
        else if(mapNumber == 50224)
            image = house2F44;
        else if(mapNumber == 50225)
            image = house2F45;
        else if(mapNumber == 50226)
            image = house2F46;
        else if(mapNumber == 30000)
            image = snow1;
        else if(mapNumber == 30001)
            image = snow2;
        else if(mapNumber == 30002)
            image = snow3;
        else if(mapNumber == 30003)
            image = snow4;
        else if(mapNumber == 30004)
            image = snow5;
        else if(mapNumber == 30005)
            image = snow6;
        else if(mapNumber == 30006)
            image = snow7;
        else if(mapNumber == 30007)
            image = snow8;
        else if(mapNumber == 30008)
            image = snow9;
        else if(mapNumber == 30009)
            image = snow10;
        else if(mapNumber == 30010)
            image = snow11;
        else if(mapNumber == 30011)
            image = snow12;
        else if(mapNumber == 30012)
            image = snow13;
        else if(mapNumber == 30013)
            image = snow14;
        else if(mapNumber == 30014)
            image = snow15;
        else if(mapNumber == 30015)
            image = snow16;
        else if(mapNumber == 30016)
            image = snow17;
        else if(mapNumber == 30017)
            image = snow18;
        else if(mapNumber == 30018)
            image = snow19;
        else if(mapNumber == 30019)
            image = snow20;
        else if(mapNumber == 30020)
            image = snow21;
        else if(mapNumber == 30021)
            image = snow22;
        else if(mapNumber == 30022)
            image = snow23;
        else if(mapNumber == 30023)
            image = snow24;
        else if(mapNumber == 30024)
            image = snow25;
        else if(mapNumber == 30025)
            image = snow26;
        else if(mapNumber == 30026)
            image = snow27;
        else if(mapNumber == 30027)
            image = snow28;
        else if(mapNumber == 30028)
            image = snow29;
        else if(mapNumber == 30029)
            image = snow30;
        else if(mapNumber == 30030)
            image = snow31;
        else if(mapNumber == 30031)
            image = snow32;
        else if(mapNumber == 30032)
            image = snow33;
        else if(mapNumber == 30033)
            image = snow34;
        else if(mapNumber == 30034)
            image = snow35;
        else if(mapNumber == 30035)
            image = snow36;
        else if(mapNumber == 30036)
            image = snow37;
        else if(mapNumber == 30037)
            image = snow38;
        else if(mapNumber == 30038)
            image = snow39;
        else if(mapNumber == 30039)
            image = snow40;
        else if(mapNumber == 30040)
            image = snow41;
        else if(mapNumber == 30041)
            image = snow42;
        else if(mapNumber == 30042)
            image = snow43;
        else if(mapNumber == 30043)
            image = snow44;
        else if(mapNumber == 30044)
            image = snow45;
        else if(mapNumber == 30045)
            image = snow46;
        else if(mapNumber == 30046)
            image = snow47;
        else if(mapNumber == 30047)
            image = snow48;
        else if(mapNumber == 30048)
            image = snow49;
        else if(mapNumber == 30049)
            image = snow50;
        else if(mapNumber == 30050)
            image = snow51;
        else if(mapNumber == 30051)
            image = snow52;
        else if(mapNumber == 30052)
            image = snow53;
        else if(mapNumber == 30100)
            image = snow54;
        else if(mapNumber == 30101)
            image = snow55;
        else if(mapNumber == 30102)
            image = snow56;
        else if(mapNumber == 30103)
            image = snow57;
        else if(mapNumber == 30104)
            image = snow58;
        else if(mapNumber == 30105)
            image = snow59;
        else if(mapNumber == 30106)
            image = snow60;
        else if(mapNumber == 30107)
            image = snow61;
        else if(mapNumber == 30108)
            image = snow62;
        else if(mapNumber == 30109)
            image = snow63;
        else if(mapNumber == 30110)
            image = snow64;
        else if(mapNumber == 30111)
            image = snow65;
        else if(mapNumber == 30112)
            image = snow66;
        else if(mapNumber == 30113)
            image = snow67;
        else if(mapNumber == 30114)
            image = snow68;
        else if(mapNumber == 30115)
            image = snow69;
        else if(mapNumber == 30116)
            image = snow70;
        else if(mapNumber == 30120)
            image = snow71;
        else if(mapNumber == 30121)
            image = snow72;
        else if(mapNumber == 30122)
            image = snow73;
        else if(mapNumber == 30123)
            image = snow74;
        else if(mapNumber == 30124)
            image = snow75;
        else if(mapNumber == 30125)
            image = snow76;
        else if(mapNumber == 30126)
            image = snow77;
        else if(mapNumber == 30127)
            image = snow78;
        else if(mapNumber == 30128)
            image = snow79;
        else if(mapNumber == 30129)
            image = snow80;
        else if(mapNumber == 30130)
            image = snow81;
        else if(mapNumber == 30131)
            image = snow82;
        else if(mapNumber == 30132)
            image = snow83;
        else if(mapNumber == 30133)
            image = snow84;
        else if(mapNumber == 30134)
            image = snow85;
        else if(mapNumber == 30135)
            image = snow86;
        else if(mapNumber == 30136)
            image = snow87;
        else if(mapNumber == 30137)
            image = snow88;
        else if(mapNumber == 30138)
            image = snow89;
        else if(mapNumber == 30139)
            image = snow90;
        else if(mapNumber == 30140)
            image = snow91;
        else if(mapNumber == 30141)
            image = snow92;
        else if(mapNumber == 30142)
            image = snow93;
        else if(mapNumber == 30143)
            image = snow94;
        else if(mapNumber == 30144)
            image = snow95;
        else if(mapNumber == 30145)
            image = snow96;
        else if(mapNumber == 30146)
            image = snow97;
        else if(mapNumber == 30147)
            image = snow98;
        else if(mapNumber == 30148)
            image = snow99;
        else if(mapNumber == 30149)
            image = snow100;
        else if(mapNumber == 30150)
            image = snow101;
        else if(mapNumber == 30200)
            image = snow102;
        else if(mapNumber == 30201)
            image = snow103;
        else if(mapNumber == 30202)
            image = snow104;
        else if(mapNumber == 30203)
            image = snow105;
        else if(mapNumber == 30204)
            image = snow106;
        else if(mapNumber == 30205)
            image = snow107;
        else if(mapNumber == 30206)
            image = snow108;
        else if(mapNumber == 30207)
            image = snow109;
        else if(mapNumber == 30208)
            image = snow110;
        else if(mapNumber == 30209)
            image = snow111;
        else if(mapNumber == 30210)
            image = snow112;
        else if(mapNumber == 30211)
            image = snow113;
        else if(mapNumber == 30212)
            image = snow114;
        else if(mapNumber == 30213)
            image = snow115;
        else if(mapNumber == 30214)
            image = snow116;
        else if(mapNumber == 30215)
            image = snow117;
        else if(mapNumber == 30216)
            image = snow118;
        else if(mapNumber == 30217)
            image = snow119;
        else if(mapNumber == 30218)
            image = snow120;
        else if(mapNumber == 30219)
            image = snow121;

        else if(mapNumber == 30224)
            image = snow122;
        else if(mapNumber == 30225)
            image = snow123;
        else if(mapNumber == 30226)
            image = snow124;
        else if(mapNumber == 30227)
            image = snow125;
        else if(mapNumber == 30228)
            image = snow126;
        else if(mapNumber == 30229)
            image = snow127;
        else if(mapNumber == 30230)
            image = snow128;
        else if(mapNumber == 30231)
            image = snow129;
        else if(mapNumber == 30232)
            image = snow130;
        else if(mapNumber == 30233)
            image = snow131;
        else if(mapNumber == 30234)
            image = snow132;
        else if(mapNumber == 30235)
            image = snow133;
        else if(mapNumber == 30236)
            image = snow134;
        else if(mapNumber == 30237)
            image = snow135;
        else if(mapNumber == 30238)
            image = snow136;
        else if(mapNumber == 30239)
            image = snow137;
        else if(mapNumber == 30240)
            image = snow138;
        else if(mapNumber == 30241)
            image = snow139;
        else if(mapNumber == 30242)
            image = snow140;

        else if(mapNumber ==10006 )
            image = bedthree1;
        else if(mapNumber == 10007)
            image = bedthree2;
        else if(mapNumber == 90010)
            image = bedthree3;
        else if(mapNumber == 10011)
            image = bedthree4;
        else if(mapNumber == 10012)
            image = bedthree5;
        else if(mapNumber == 10013)
            image = bedthree6;
        else if(mapNumber == 10014)
            image = bedthree7;
        else if(mapNumber == 10015)
            image = bedthree8;
        else if(mapNumber == 90221)
            image = bedthree9;
        else if(mapNumber == 10222)
            image = bedthree10;
        else if(mapNumber == 10223)
            image = bedthree11;
        else if(mapNumber == 91104)
            image = bedthree12;
        else if(mapNumber == 91105)
            image = bedthree13;
        else if(mapNumber == 91203)
            image = bedthree14;
        else if(mapNumber == 11204)
            image = bedthree15;
        else if(mapNumber == 92104)
            image = bedthree16;
        else if(mapNumber == 92105)
            image = bedthree17;
        else if(mapNumber == 12106)
            image = bedthree18;
        else if(mapNumber == 12107)
            image = bedthree19;
        else if(mapNumber == 12108)
            image = bedthree20;
        else if(mapNumber == 12109)
            image = bedthree21;
        else if(mapNumber == 92206)
            image = bedthree22;
        else if(mapNumber == 92207)
            image = bedthree23;
        else if(mapNumber == 12208)
            image = bedthree24;
        else if(mapNumber == 12209)
            image = bedthree25;
        else if(mapNumber == 13012)
            image = bedthree26;
        else if(mapNumber == 13122)
            image = bedthree27;
        else if(mapNumber == 13123)
            image = bedthree28;



        else if(mapNumber == 90000)
            image = bedthree29;

        else if(mapNumber == 13125)
            image = bedthree30;
        else if(mapNumber == 13132)
            image = bedthree31;

    }

    private static void chooseKind(int mapNumber) {
        if (mapNumber == 0000)
            imageKind = MapKind.ROAD;
        if (mapNumber == 2001)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2110)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2120)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2130)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2010)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2020)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2030)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2210)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2220)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 2230)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3000)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3003)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3004)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3005)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3007)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3009)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3119)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3129)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3139)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3019)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3029)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3039)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3219)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3229)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3239)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3101)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3110)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 3130)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5110)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5111)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5112)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5120)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5121)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5122)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5123)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5124)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5125)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5126)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5130)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5131)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 5132)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 7000)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 7100)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 7101)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 7001)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 7002)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 7003)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 6000)
            imageKind = MapKind.DOOR;
        else if (mapNumber == 6001)
            imageKind = MapKind.DOOR;
        else if (mapNumber == 10000)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10001)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10002)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10003)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10210)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10211)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10220)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10221)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10222)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10230)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10231)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10020)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10030)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10010)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10011)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10021)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 10031)
            imageKind = MapKind.ROAD;
        else if(mapNumber == 10212)
            imageKind = MapKind.ROAD;
        else if(mapNumber == 10213)
            imageKind = MapKind.ROAD;
        else if(mapNumber == 14000)
            imageKind = MapKind.ROAD;
        else if(mapNumber == 14001)
            imageKind = MapKind.ROAD;


        else if (mapNumber==20000)
            imageKind = MapKind.ROAD;
        else if (mapNumber == 20007)
            imageKind = MapKind.ROAD;
        else if (mapNumber==20010)
            imageKind = MapKind.ROAD;
        else if (mapNumber==20020)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20030)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20040)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20050)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20060)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20061)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20062)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20070)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20071)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20072)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20073)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20074)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20075)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20076)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20077)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20078)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20080)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20081)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20082)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20083)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20084)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20085)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20086)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20087)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20001)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20201)
            imageKind = MapKind.ROAD;
        else if(mapNumber==20079)
            imageKind = MapKind.ROAD;


        else if(mapNumber== 40100)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40101)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40102)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40103)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40104)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40105)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40106)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40107)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40108)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40109)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40110)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40111)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40112)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40113)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40114)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40115)
            imageKind = MapKind.ROAD;

        else if(mapNumber== 40128)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40129)
            imageKind = MapKind.ROAD;

        else if(mapNumber== 40133)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40134)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40135)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40136)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40137)
            imageKind = MapKind.ROAD;
        else if(mapNumber == 40008)
            imageKind =MapKind.ROAD;

        else if(mapNumber== 40138 )
            imageKind = MapKind.ROAD;

        else if(mapNumber== 14002 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 14003 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 14004 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 14005 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 14006 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 14007)
            imageKind = MapKind.ROAD;

        else if(mapNumber== 70100 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 70110 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 70115 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 70116 )
            imageKind = MapKind.ROAD;

        else if(mapNumber== 80100 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80101)
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80109 )
            imageKind = MapKind.ROAD;

        else if(mapNumber== 80118 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80119 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80109 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80010 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80120 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80121 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80122 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80123 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80124 )
            imageKind = MapKind.ROAD;

        else if(mapNumber== 80125 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 80126 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40139 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40140 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 40143)
            imageKind = MapKind.ROAD;

        else if(mapNumber== 50100 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50101 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50123 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50124 )
            imageKind = MapKind.ROAD;

        else if(mapNumber== 50138 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50139 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50126 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50128 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50146 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50102 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50103 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50104 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50105 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50107 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50108 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50112 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50116 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50118 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50119 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50120 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50121 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50122 )
            imageKind = MapKind.ROAD;

        else if(mapNumber== 30000 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30001 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30002 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30004 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30005 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30008 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30009 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 300010 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 300014 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 300019 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30024 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30023 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30025 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30026 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30027 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30028 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30029 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30030 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30031 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30036 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30037 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30038 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30039 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30040 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30041 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30042 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30043 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30044 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30045 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30046 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30047 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30049 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30050 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30051 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30052 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30202 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 30003 )
            imageKind = MapKind.ROAD;

        else if(mapNumber== 10006 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 10007 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 90010 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 90221 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 10012 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 10222 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 10223 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 92104 )
            imageKind = MapKind.ROAD;
        else if(mapNumber== 50135 )
            imageKind = MapKind.ROAD;

        else
            imageKind = MapKind.BARRIER;

    }

    public static MapKind getKind(int mapNum) {
        chooseKind(mapNum);
        return imageKind;
    }

    public static Image getIcon(MapObject m) {
        chooseIcon(m.getImageNum());
        return image;
    }

    public static Image getIcon(int mapNum) {
        chooseIcon(mapNum);
        return image;
    }

}
