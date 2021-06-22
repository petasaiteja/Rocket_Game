
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (K.Manoj) 
 * @version (Rocket v1.0 or 24/12/2020)
 */
public class Rocket extends Actor
{
    private int speed;
    private int reloadTime;
    public int lives=5;
    public int Score;
    private void hitByAsteroid()
    {
        if(isTouching(Asteroids.class))
        {
            getWorld().addObject(new BigExplosion(),getX(),getY());
            lives--;
            setLocation(60,550);
        }
    }
    
    public Rocket(int speed)
    {
        this.speed=speed;
    }
    
    private void fire()
    {
        if(Greenfoot.isKeyDown("f"))
        {
            addMissile(new Missile1());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            addMissile(new Missile2());
        }
        
    }
    private void addMissile(Missile m)
    {
        getWorld().addObject(m,getX(),getY());
        reloadTime = 0;
        if(m instanceof Missile1)
        {
            m.setRotation(getRotation());
        }
    }
    public void act() 
    {
        
        move(this.speed);
        moveAround();
        wrapAround();
        rotate();
        hitByAsteroid();
        
        reloadTime++;
        if(reloadTime>=25)
        {
            fire();
        }
        if(reloadTime>=50)
        {
           fire(); 
        }
        
        // Add your action code here.
    } 
    private void moveAround()
    {
        setImage("rocketWithoutBooster.png");
        this.speed=2;
        if(Greenfoot.isKeyDown("right"))
        {
            setImage("rocketWithBooster.png");
            this.speed=5;
            setRotation(0);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setImage("rocketWithBooster.png");
            this.speed=5;
            setRotation(180);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setImage("rocketWithBooster.png");
            this.speed=5;
            setRotation(270);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setImage("rocketWithBooster.png");
            this.speed=5;
            setRotation(90);
        }
    }
    private void wrapAround()
    {
        int rx = getX();
        int ry = getY();
        World w = getWorld();
        int worldWidth = w.getWidth()-1;
        int worldHeight = w.getHeight()-1;
        if (rx == worldWidth)
        {
            setLocation(0,ry);
        }
        if (rx == 0)
        {
            setLocation(worldWidth,ry);
        }
        if (ry == worldHeight)
        {
            setLocation(rx,0);
        }
        if (ry == 0)
        {
            setLocation(rx,worldHeight);
        }
       
        
    }
     private void rotate()
        {
            if(Greenfoot.isKeyDown("a"))
            {
                turn(-5);
            }
            if(Greenfoot.isKeyDown("s"))
            {
                turn(5);
            }
            
        }
    
    
    
    
    
    
    
    
    
    
    
}
