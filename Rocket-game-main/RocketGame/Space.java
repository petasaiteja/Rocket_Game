import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    public static Rocket rocket;
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 650, 1);
        rocket = new Rocket(2);
        addObject(rocket,getWidth()/2,getHeight()/2);
        addObject(new Asteroids(),203,409);
        addObject(new Asteroids(2,3,1),906,241);
        addObject(new Asteroids(2,2,0),479,462);
    }
    public void youWin()
    {
        if(Space.rocket.Score == 5)
        {
            addObject(new YouWin(),getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }
    public void gameOver()
    {
        if(Space.rocket.lives == 0)
        {
            addObject(new GameOver(),getWidth()/2,getHeight()/2);
            Greenfoot.stop();
        }
    }
    public void act()
    {
        showText("Score : "+Space.rocket.Score,100,50);
        showText("lives : "+Space.rocket.lives,200,50);
        youWin();
        gameOver();
    }
}
