import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftBirdOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftBee extends Bee
{
    /**
     * Act - do whatever the LeftBirdOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if(MyWorld.myWorld.ctrBee==50){
            setLocation(getX()+8,getY());
        }else{
            MyWorld.myWorld.ctrBee++;
        }    
    }    
}
