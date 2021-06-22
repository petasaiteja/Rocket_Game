import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int delayTime;
    public void delay()
    {
        
        delayTime++;
        if(delayTime >8)
        {
            getWorld().removeObject(this);
            
        }
     
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
