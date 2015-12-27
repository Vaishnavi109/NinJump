import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftGun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftGun extends Gun
{
    /**
     * Act - do whatever the LeftGun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
        setLocation(getX()+10,getY());
    }    
}
