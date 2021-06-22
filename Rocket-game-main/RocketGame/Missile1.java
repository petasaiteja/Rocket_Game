import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class missile1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile1 extends Missile
{
    public Missile1()
    {
        super(2);
    }
    public void drop()
    {
        gravity++;
        setLocation(getX(),getY()+gravity);
        
    }
    public void disappear()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
    public void act() 
    {
        move(5);
        disappear();    
        if(gravity<=8)
        {
            drop();
        }
     }    
}
