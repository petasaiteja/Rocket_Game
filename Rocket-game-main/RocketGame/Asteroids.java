import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Astroids here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroids extends Actor
{
    private int widthSize;
    private int heightSize;
    private int choice;
    public Asteroids()
     {
        
     }
    private void hitByMissile()
    {
        if(isTouching(Missile1.class))
        {
            removeTouching(Missile1.class);
            getWorld().addObject(new SmallExplosion(),getX(),getY());
            Space.rocket.Score++;
            if(getImage().getWidth()<=58)
            {
                getWorld().removeObject(this);
            }
            else
            {
            divideAsteroids(new Asteroids());
            divideAsteroids(new Asteroids());
            getWorld().removeObject(this);
            }
        }
    }
    private void divideAsteroids(Asteroids a)
    {
       getWorld().addObject(a,getX(),getY());
       int rn = Greenfoot.getRandomNumber(360);
       a.setRotation(rn);
    }
    public Asteroids(int widthSize,int heightSize,int choice)
    {
        this.widthSize=widthSize;
        this.heightSize=heightSize;
        if(choice == 1)
        {
            changeIncSize();
        }
        if(choice == 0)
        {
            changeDecSize();
        }
    }
    private void changeIncSize()
    {
        getImage().scale(getImage().getWidth()*this.widthSize,getImage().getHeight()*this.heightSize);
    }
    private void changeDecSize()
    {
        getImage().scale(getImage().getWidth()/this.widthSize,getImage().getHeight()/this.heightSize);
    }
    private void bounceBack()
    {
        if(isAtEdge())
        {
            int randomDegree = Greenfoot.getRandomNumber(8);
            turn(randomDegree);
        }
    }
    public void act() 
    {
        move(2);
        bounceBack();
        hitByMissile();
    }    
}
