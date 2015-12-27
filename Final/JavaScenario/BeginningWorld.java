import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class BeginningWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BeginningWorld extends World
{

    /**
     * Constructor for objects of class BeginningWosrld.
     * 
     */

    public BeginningWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(400, 500, 1); 
        prepare();


    }
    public void act(){
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       Receiver playRcv = new Receiver();
        Receiver helpRcv = new Receiver();
        
        PlayCommand pc=new PlayCommand();  // creating commands
        HelpCommand hc=new HelpCommand();
        
        pc.setReceiver(playRcv);                  // assigning receiver to the command
        hc.setReceiver(helpRcv); 
        
        ButtonPlay bp = new ButtonPlay();      
        ButtonHelp bh = new ButtonHelp();
        
        bp.setCommand(pc);
        bh.setCommand(hc);
        
        addObject(bp, 317, 285);
        addObject(bh, 317, 348);
        setBackground("images/finalbkg.png");
        
        
    }
    
}
