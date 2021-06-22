import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Missile extends Actor
{
    protected int gravity;
    public Missile(int imgSize)
    {
        getImage().scale(getImage().getWidth()/imgSize,getImage().getHeight()/imgSize);
    }
    abstract public void drop();
    public void act() 
    {
        // Add your action code here.
    }    
}
