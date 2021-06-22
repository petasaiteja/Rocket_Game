import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile2 extends Missile
{
     public Missile2()
    {   
        super(3);
    }
     public void drop()
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        else
        {
        gravity++;
        setLocation(getX(),getY()+gravity);
        }
    }
    public void act() 
    {
         drop();
    }    
}
