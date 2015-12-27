import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftBirdie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftBirdie extends Birdie
{
    /**
     * Act - do whatever the LeftBirdie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        setLocation(getX()+6,getY()+6);
    }    
}
