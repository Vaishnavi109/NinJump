import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftNinja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeftNinja extends Ninja
{
    /**
     * Act - do whatever the LeftNinja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld myWorldState;
    public LeftNinja(){
    }
    
    public LeftNinja(MyWorld world){
        myWorldState = world;
    }
    
   @Override
    public void goToRightNinjaState(){
        myWorldState.setNinjaState(NinjaStates.RightNinja);        
    }
}
