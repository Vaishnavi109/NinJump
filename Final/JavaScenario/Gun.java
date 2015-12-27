import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Actor
{
    /**
     * Act - do whatever the Gun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(getOneIntersectingObject(LeftBirdie.class)!=null||getOneIntersectingObject(RightBirdie.class)!=null||getOneIntersectingObject(LeftBee.class)!=null||getOneIntersectingObject(RightBee.class)!=null)
        {
            MyWorld.myWorld.opp.getImage().setTransparency(0);
            MyWorld.myWorld.gun.getImage().setTransparency(0);
            MyWorld.myWorld.counter.update(1);
        }
    }    
}
