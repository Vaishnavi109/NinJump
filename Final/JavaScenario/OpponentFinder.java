import greenfoot.Greenfoot;
import java.util.Random;
public class OpponentFinder {
    public static Opponent getOpponent(){
        Random rand = new Random();
        int max=5;
        int min=0;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        switch(randomNum){
            case 0: 
                MyWorld.myWorld.isLeftOpp=true;
                MyWorld.myWorld.posX=80;
                MyWorld.myWorld.posY=12;
                return new LeftRoof(); 
            case 1:
                MyWorld.myWorld.posX=317;
                MyWorld.myWorld.posY=12;
                MyWorld.myWorld.isLeftOpp=false;
                return new RightRoof();  
            case 2: 
                MyWorld.myWorld.isLeftOpp=true;
                MyWorld.myWorld.posX=64;
                MyWorld.myWorld.posY=12;
                return new LeftBee(); 
            case 3:
                MyWorld.myWorld.posX=341;
                MyWorld.myWorld.posY=12;
                MyWorld.myWorld.isLeftOpp=false;
                return new RightBee();
            case 4:
                MyWorld.myWorld.posX=64;
                MyWorld.myWorld.posY=12;
                MyWorld.myWorld.isLeftOpp=true;
                return new LeftBirdie(); 
            case 5:
                MyWorld.myWorld.posX=341;
                MyWorld.myWorld.posY=12;
                MyWorld.myWorld.isLeftOpp=false;
                return new RightBirdie(); 
            default:
                MyWorld.myWorld.posX=64;
                MyWorld.myWorld.posY=12;
                MyWorld.myWorld.isLeftOpp=true;
                return new LeftRoof();
        }
       }
    
   
    
}
