import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * This is a colored floating bubble.
 *
 * @author Michael Kölling
 * @version 1.0
 */
public class Bubble extends Actor
{
    private int speed;      // assigned to be a random number in the constructor method and used in the act method
    
    /**
     * Create a Bubble that floats, with random size and random color.
     */
    public Bubble()         // first constructor, the default constructor with no argumens         
    {
        // create a random size, between 10 and 110 pixels
        this(Greenfoot.getRandomNumber(100) + 10);      // recall this is the Java name of ourself, will call the second constructor
    }
    
    /**
     * Create a Bubble that floats, with a given size and random color.
     */
    public Bubble(int size)       // second constructor, the size of the bubble is supplied as a paramenter
    {
        GreenfootImage img = new GreenfootImage(size, size);

        // create a random color, with every color channel between 30 and 230
        int red = Greenfoot.getRandomNumber(200) + 30;
        int green = Greenfoot.getRandomNumber(200) + 30;
        int blue = Greenfoot.getRandomNumber(200) + 30;
        int alpha = Greenfoot.getRandomNumber(190) + 60;
        
        img.setColor(new Color(red, green, blue, alpha));
        img.fillOval(0, 0, size-1, size-1);
        setImage(img);               // IMPORTANT CONCEPT, the image dynamically created above now becomes the image
                                      //     for this particular object at run time when it is created.
                                      //  NOTE:  No image is assigned as the default image for the Class
        
        // random speed: 1 to 4
        speed = Greenfoot.getRandomNumber(4) + 1;     // the private instance field speed is given a value  in the constructor
    }
    
    /**
     * Create a Bubble that floats, with given size and initial float direction.
     */
    public Bubble(int size, int direction)    // third constructor, both size and direction are specified as parameters
    {
        this(size);            // IMPORTANT CONCEPT, just as the first constructor calls the second constructor, so does the
                               //             third constructor call the second constructor.  That way the code to dynamically create
                               //             the individual image for the object needs to be given in only 1 place, the second constructor
        setRotation(direction);
    }
    
    /**
     * Float.
     */
    public void act() 
    {
        if (isAtEdge()) {
            turn(180);
        }
        
        move(speed);
        
        if (Greenfoot.getRandomNumber(100) < 50) {            // randomly turn 1/2 the time
            turn(Greenfoot.getRandomNumber(5) - 2);   // -2 to 2
        }
    }
}