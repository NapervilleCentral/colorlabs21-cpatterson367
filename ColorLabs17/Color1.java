import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Write a description of class Color here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Color1
{
    public static void main(String[] args)
    {
        //adjustRed
        
        /**
        final double FACTOR = 100;
        Picture pic = new Picture("images//c2.jpeg");
    
        Pixel[] pix;
        pix = pic.getPixels();
        
        int r;
        for (Pixel i : pix)
        {
            r = i.getRed();
            r = (int)(r * FACTOR);
            if (r > 255)
                r = 255;
            
            i.setRed(r);
        }
        
        pic.explore();
        **/
        
        //negate
        Picture pic = new Picture("images//c2.jpeg");
    
        Pixel[] pix;
        pix = pic.getPixels();
        
        Color col;
        int r,g,b;
        for (Pixel i : pix)
        {
            col = i.getColor();
            
            
        }
            
    }
}
