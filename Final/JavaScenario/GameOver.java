import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class ScoreCard.
     * 
     */
    public GameOver()
    {   
        super(400, 500, 1); 
        setBackground("images/newBg.jpg");
        showFinalScore();
    }
    
    public void showFinalScore(){
        showText("Final Score", getWidth()/2, getHeight()/2);
        showText(Integer.toString(MyWorld.counter.getValue()),getWidth()/2+5,getHeight()/2+25);
    }
    
    public void act(){
      if (Greenfoot.mouseClicked(this))  
      {  
          Greenfoot.setWorld(new BeginningWorld());
      }  
    }
}
