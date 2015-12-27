import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class leftWall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leftWall extends Walls
{
    /**
     * Act - do whatever the leftWall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5);  
    }    
}
