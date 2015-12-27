import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Actor implements NinjaState, Component
{
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Component component;
    public Ninja(Component c){
          component=c;
    }
    
    public Ninja(){
    }
    
    public void act() 
    {
        // Add your action code here.
        if(!MyWorld.myWorld.isDead){
            
            if(getOneIntersectingObject(LeftRoof.class)!=null||getOneIntersectingObject(RightRoof.class)!=null)
            {
                MyWorld.myWorld.isDead=true;
            }
            if(getOneIntersectingObject(LeftBirdie.class)!=null||getOneIntersectingObject(RightBirdie.class)!=null||getOneIntersectingObject(LeftBee.class)!=null||getOneIntersectingObject(RightBee.class)!=null)
            {
                if(MyWorld.opp.getImage().getTransparency()!=0){
                    if (!MyWorld.shieldOn){
                        MyWorld.myWorld.isDead=true;
                    }
                    else
                    {
                        MyWorld.myWorld.opp.getImage().setTransparency(0);
                        MyWorld.myWorld.counter.update(1);
                    }
                }           
            }
            if(Greenfoot.isKeyDown("f"))
            {
                if(MyWorld.State=="Left")
                {
                    MyWorld.myWorld.gun=new LeftGun();
                    getWorld().addObject(MyWorld.myWorld.gun,MyWorld.ninja.getX(),MyWorld.ninja.getY());
                }
                else
                {
                    MyWorld.myWorld.gun=new RightGun();
                    getWorld().addObject(MyWorld.myWorld.gun,MyWorld.ninja.getX(),MyWorld.ninja.getY());
                }
            }
        }else{
            if(MyWorld.myWorld.State=="Right"){
                MyWorld.myWorld.ninja.move(-4);
                MyWorld.myWorld.ninja.turn(-3);
            }
            else{
                MyWorld.myWorld.ninja.move(4);
                MyWorld.myWorld.ninja.turn(3);
            }
            
            if(MyWorld.myWorld.ninja.getY()>getWorld().getHeight()-15){
                Greenfoot.setWorld(new GameOver());
            }
        }
        
    }
    
    public Ninja changeState(){
        return new Ninja();
    }

    public void goToRightNinjaState(){
        
    }
    
    public void goToLeftNinjaState(){

    }
    
}
