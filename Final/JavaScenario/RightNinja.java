import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RightNinja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightNinja extends Ninja
{
    /**
     * Act - do whatever the RightNinja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld myWorldState;
    public RightNinja(){

    }
    
    public RightNinja(MyWorld world){
        myWorldState = world;
    }
    
    @Override
    public void goToLeftNinjaState(){
    
         myWorldState.setNinjaState(NinjaStates.LeftNinja);
    }
}
