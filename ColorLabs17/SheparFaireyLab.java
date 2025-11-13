
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List


public class SheparFaireyLab
{
    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter output filename: ");
        String name = "shepFairey/" + kb.next() + ".jpeg";
        
        Picture pic = new Picture("shepFairey/source/c6.jpeg");
        Pixel[] pix;
        pix = pic.getPixels();
        
        Color col, grey, c1, c2, c3, c4, c5;
        c1 = new Color(234,234,184);
        c2 = new Color(247,154,211);
        c3 = new Color(182,111,201);
        c4 = new Color(124,81,143);
        c5 = new Color(95,82,132);
        
        
        
        
        int a; // average light level
        for (Pixel i : pix)
        {
            //greyscale
            col = i.getColor();
            a = (col.getRed()+col.getGreen()+col.getBlue()) / 3;
            
            if (a < 50)
            {
                i.setColor(c5);
            }
            else if (a < 85)
            {
                i.setColor(c4);
            }
            else if (a < 138)
            {
                i.setColor(c3);
            }
            else if (a < 186)
            {
                i.setColor(c2);
            }
            else if (a < 256)
            {
                i.setColor(c1);
            }
            
        }        
        
        pic.explore();
        
        pic.write(name);
         
         
         
    
         
    }//main       
}//class
