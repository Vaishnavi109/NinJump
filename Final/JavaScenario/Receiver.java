import greenfoot.*;
/**
 * Write a description of class Receiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receiver  
{   
    public void playMenu(){
       Greenfoot.setWorld(new MyWorld());
    }
    
    public void helpMenu(){
        Greenfoot.setWorld(new HelpMenu());
    }
}
