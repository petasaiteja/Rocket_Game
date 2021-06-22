import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallExplosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallExplosion extends Explosion
{
    
    public SmallExplosion()
    {
        getImage().scale(getImage().getWidth()*4,getImage().getHeight()*4);
    }
    public void act() 
    {
        delay();
    }    
}
