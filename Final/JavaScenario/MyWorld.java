import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World implements Subject
{
    int counterr=0;
    public static MyWorld myWorld = new MyWorld();
    static private ArrayList<Observer> observerList = new ArrayList <Observer>();
    static public Counter counter;//score object
    public Observer observer;
    public static Ninja ninja;
    public static String State;
    public static Gun gun;
    public static boolean shieldOn;
    public static boolean isDead;
    
    //State Design Pattern
    NinjaState stateRightNinja;
    NinjaState stateLeftNinja;
    NinjaState stateCurrentNinja;
    
    // Opponent
    public static Opponent opp;
    public static boolean isLeftOpp;
    public static int posX, posY;
    static int ctrBee;
    
    public MyWorld()
    {    
        super(400, 500, 1,false); 

        shieldOn=false;
        isLeftOpp =false;
        isDead =false;
        ctrBee=0;
        opp=OpponentFinder.getOpponent();
        myWorld=this;
        stateRightNinja = new RightNinja(myWorld);
        stateLeftNinja = new LeftNinja(myWorld);
        stateCurrentNinja = stateRightNinja;
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setBackground("images/newBg.jpg");

        ninja = (Ninja)stateCurrentNinja;
        State="Right";
        addObject(ninja,338,380);
        leftWall lw=new leftWall();
        RightWall rw= new RightWall();
        leftWall lw1=new leftWall();
        RightWall rw1= new RightWall();
        
        addObject(opp,posX,posY);
        addObject(lw1, 14, 277);
        addObject(rw1, 387, 277);
        addObject(lw, 14, 0);
        addObject(rw, 387, 0);
        
        counter = new Counter();
        counter.setPrefix("Score: ");
        addObject(counter, 200, 42);
        
        act();
        add();
    }
    
    public void setNinjaState(NinjaStates nextNinjaState){
        switch(nextNinjaState){
           case RightNinja:
                stateCurrentNinja=stateRightNinja;
                State="Right";
                break;
           case LeftNinja:
                stateCurrentNinja=stateLeftNinja;
                State="Left";
                break;
        }
        
    }
    

    public void act(){
       counterr++;
       if(counterr==25){
            leftWall lw=new leftWall();
            RightWall rw= new RightWall();
            addObject(lw, 14, 0);
            addObject(rw, 387, 0);
            counterr=0;
            MyWorld.myWorld.notifyObserver(1);
            if(opp.getY()>getHeight()){
                removeObject(opp);
                ctrBee=0;
                opp = OpponentFinder.getOpponent();            
                addObject(opp,posX,posY);
            }
       }
        
     if(Greenfoot.isKeyDown("s")){
            removeObject(ninja);
            if(State=="Right"){
                Component ninObj  = new RightShield(new Ninja());
                ninja = ninObj.changeState();
                addObject(ninja,315,380);
            }else{
                Component ninObj  = new LeftShield(new Ninja());
                ninja = ninObj.changeState();
                addObject(ninja,84,380 );
            }
            
            shieldOn = true;
       }else if(Greenfoot.isKeyDown("left")){
            if(shieldOn){
                removeObject(ninja);
                Component ninObj  = new LeftShield(new Ninja());
                ninja = ninObj.changeState();       
                // add gun
                addObject(ninja,84,380 );
            
            }else{
                if(ninja!=null){
                    removeObject(ninja);
                    changeToLeftNinja();
                    ninja = (Ninja)stateCurrentNinja;
                    addObject(ninja,62,380 );
                }
            }
            
       }else if(Greenfoot.isKeyDown("right")){
            if(shieldOn){ 
                removeObject(ninja);
                Component ninObj  = new RightShield(new Ninja());
                ninja = ninObj.changeState();
                addObject(ninja,315,380 );
            }else{  
                if(ninja!=null){
                    removeObject(ninja);                   
                    changeToRightNinja();
                    ninja = (Ninja)stateCurrentNinja;
                    
                    addObject(ninja,338,380 );
                }
            }
       }
    }
    
    public void changeToRightNinja(){
        stateCurrentNinja.goToRightNinjaState();
    }
    
    public void changeToLeftNinja(){
        
        stateCurrentNinja.goToLeftNinjaState();
    }
    
    
    public void addObserver(Observer observer) {
        // TODO Auto-generated method stub
        if(observerList!=null){
            observerList.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        observerList.remove(observer);
    }

    public void notifyObserver(int updatescore) {
            // TODO Auto-generated method stub
        for(int i=0;i<observerList.size();i++){
            observerList.get(i).update(updatescore);
        }
    }
    
    
    private void scrollBackground()
    {
        GreenfootImage bg = new GreenfootImage(getBackground());
        getBackground().drawImage(bg, 0, -5);
        getBackground().drawImage(bg, 0, getHeight()-1);
    }

    
    
    private void add(){
        if(myWorld!=null){
            observer= counter;
            if(observer!=null){
                addObserver(observer);
            }
        }
    }
    
}

