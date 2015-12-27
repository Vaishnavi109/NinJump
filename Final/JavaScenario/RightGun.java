import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightGun extends Gun
{
    /**
     * Act - do whatever the RightGun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        setLocation(getX()-10,getY());
    }
    
}
