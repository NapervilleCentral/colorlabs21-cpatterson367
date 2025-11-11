import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Write a description of class Color here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorLabs
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
        
        
        /**
        //negate
        Picture pic = new Picture("images//c2.jpeg");
    
        Pixel[] pix;
        pix = pic.getPixels();
        
        Color col;
        int r,g,b;
        for (Pixel i : pix)
        {
            col = i.getColor();
            i.setRed(255-col.getRed());
            i.setGreen(255-col.getGreen());
            i.setBlue(255-col.getBlue());
            
        }
            
        pic.explore();
        **/
        
        /**
        // gresycale
        Picture pic = new Picture("images//c2.jpeg");
    
        Pixel[] pix;
        pix = pic.getPixels();
        
        Color col, grey;
        int a;
        for (Pixel i : pix)
        {
            col = i.getColor();
            a = (col.getRed()+col.getGreen()+col.getBlue()) / 3;
            grey = new Color(a,a,a);
            i.setColor(grey);
        }
        
        pic.explore();
        
        **/
        
        /**
        //lighten
        
        
        Picture pic = new Picture("images//c2.jpeg");
    
        Pixel[] pix;
        pix = pic.getPixels();
        
        Color col,colBright;
        int r,g,b;
        final int AMT = 50;
        for (Pixel i : pix)
        {
            col = i.getColor();
            r = col.getRed() + AMT;
            g = col.getGreen() + AMT;
            b = col.getBlue() + AMT;
            if (r>255)
                r=255;
            if (g>255)
                g=255;
            if (b>255)
                b=255;
    
            colBright = new Color(r,g,b);
            i.setColor(colBright);
        }
        
        pic.explore();
        **/
        
        /**
        //changeColor
        Picture pic = new Picture("images//c2.jpeg");
    
        Pixel[] pix;
        pix = pic.getPixels();
        
        Color col, colChanged;
        int r,g,b;
        final int RAMT=100,GAMT=-100,BAMT=0;
        for (Pixel i : pix)
        {
            col = i.getColor();
            r = col.getRed() + RAMT;
            g = col.getGreen() + GAMT;
            b = col.getBlue() + BAMT;
            
            if (r>255)
                r=255;
            if (g>255)
                g=255;
            if (b>255)
                b=255;
            
            if (r<0)
                r=0;
            if (g<0)
                g=0;
            if (b<0)
                b=0;
                
            colChanged = new Color(r,g,b);
            i.setColor(colChanged);
        }
        pic.explore();
        **/
        
        
        //blueify
        Picture pic = new Picture("images//c2.jpeg");
    
        Pixel[] pix;
        pix = pic.getPixels();
        
        Color colChanged;
        int r,g,b;
        final int RFACE=200,GFACE=140,BFACE=130,TOL=30,TOLR=90;
        for (Pixel i : pix)
        {
            r=i.getRed();
            g=i.getGreen();
            b=i.getBlue();
            
            if (Math.abs(RFACE - r) < TOLR && Math.abs(GFACE - g) < TOL && Math.abs(RFACE - r) < TOL)
            {
                colChanged = new Color((int)(r*.7),(int)(g*.7),255);
                i.setColor(colChanged);
            }
        }
        
        
        pic.explore();
        
    }
}
