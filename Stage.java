import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Stage extends World
{
    public Stage()
    {    
        super(1200, 600, 1);
        this.setBackground(new GreenfootImage("sky.jpg"));
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player = new Player();
        addObject(player,116,503);
    }
}
