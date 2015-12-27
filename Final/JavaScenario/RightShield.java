import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftShield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RightShield extends Shield
{
    private Ninja addedNinja;
    public RightShield(Component c)
    {
        super(c);
    }
    public Ninja changeState(){
        addedNinja=super.changeState();
        return addShield(addedNinja);
    }
    public Ninja addShield(Ninja ninja){
        MyWorld.State="Right";
        ninja = new ShieldedRightNinja();
        return ninja;
    }
    /**
     * Act - do whatever the LeftShield wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
