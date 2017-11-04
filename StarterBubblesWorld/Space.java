import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.PINK);
        getBackground().fill();
        //setup28();
        //setup29();
        //setup30();
        //setup31();
        //setup32();
        //setup33();
        setup34();
    }

    private void setup28()
    {
        addObject(new Bubble(),getWidth()/2,getHeight()/2);   // NOTE:  use getWidth()/2 and getHeight()/2 for the center
    }

    private void setup29()
    {
        int i = 0;   // declare and initialize the variable i
        while ( i < 21 )                   // test the value of i
        {
            addObject(new Bubble(),getWidth()/2,getHeight()/2); //    Do something
            i = i + 1;                 // adjust the value of i
        } 
    }

    private void setup30()
    {
        int i = 0;
        while (i < 21)
        {
            addObject(new Bubble(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight())); 
            i = i + 1;
        }
    }

    private void setup31()
    {
        int i = 0;
        while (i < 21)
        {
            addObject(new Bubble(),30*i,30*i); 
            i = i + 1;
        }
    }

    private void setup32()
    {
        int i = 0;
        while (i < 21)
        {
            addObject(new Bubble(),45*i,30*i); 
            i = i + 1;
        }  
    }

    private void setup33()
    {
        int i = 0;
        while (i < 21)
        {
            addObject(new Bubble(), 45*i,30*i); 
            i = i + 1;
        }
        int b = 0;
        while (b < 10)
        {
            addObject(new Bubble(),300 + b * 40, 100);
            b = b + 1;
        }
    }

    private void setup34()
    {
        int i = 0;
        while ( i < 18 )
        {
            addObject(new Bubble(190-i*10,i + i*20),getWidth()/2,getHeight()/2); 
            i = i + 1;
        }
    }
}
