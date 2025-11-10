
/**
 * Kevin Hayes
 * Test Picture Classes
 *
 * @author (Kevin Hayes)
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture17
{

    /**
     * main method, to test the picture
     *
     */
    public static void main(String[] args)
    {
      //opens picture using a dialog box
      /**/
     // String fileName = FileChooser.pickAFile();
     // Picture pictObj = new Picture(fileName);
     // pictObj.explore();
    
     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     
     //relative path
     Picture apic = new Picture("images\\c2.jpeg");
     Picture ferris1 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris2 = new Picture("images/2000 ferris wheel2.jpg");
     Picture ferris3 = new Picture("images/2000 ferris wheel2.jpg");
    
     //apic.explore();
     
     
     //makes an array of pixels
     Pixel[] pixels;
     //gets pixels from picture and assigns to pixels array
     pixels = apic.getPixels();
    
     //how many pixels or how large array
    System.out.println("This is a large array"+pixels.length  );
    
    
    /**/
        //access each index
    System.out.println(pixels[17]);
    //access each pixel
    Color red = new Color(255,0,0);
    
    Pixel spot = apic.getPixel(100,100);
    spot.setColor(red);
    
    /*
    System.out.println(pixels[17].getColor());
    System.out.println(spot);
    
    for(int i=0; i<10000; i++)
    {
        Pixel a = apic.getPixel((int)(Math.random() * 1000),(int)(Math.random() * 1000));
        a.setColor(red);
    }
    */
   
   
   
    //apic.explore();
    /*
    pixels[17].setColor(Color.blue);
    spot.setColor(new Color(252,252,252));
    pixels[500034].setColor(Color.blue);
    
    ferris1.explore();
    */
    // loop to access indexes of array or collection
    
    // for each loop spot  is a ?
    
    Color white = new Color(255,255,255);
    Color grey = new Color(128,128,128);
    Color black = new Color(0,0,0);
    int r,g,b,a;
    for (Pixel i : pixels)
    {
        r = i.getRed();
        g = i.getGreen();
        b = i.getBlue();
        
        /*
        a = (int)((r+g+b)/3);
        if (a>=170)
            i.setColor(white);
        else if (r > 128 && r > b && r > g)
            i.setColor(red);
        else
            i.setColor(black);
        */
        
        Color what = i.getColor();
        what.negate();
        
        

    }
    
    apic.explore();
    
    /**/
    
    /**
    * Method to clear red from picture
    * @param none
    * @return none
    */
    /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
           
    
        }
    ferris1.explore();
    
    /**/
    /**
    * Method to reduce red from picture by a factor of n
    * @param none
    * @return none
    */
    
    /*
    int value;
    final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {
    
        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);
    
        //decrease the red value by 50%
        
        //set the red value of the current pixel to the new value
        
    
    }
    // use new picture when changing or it will make changes to 
    // pic you already changed
    ferris1.explore();
    ferris2.explore();
    
    /**/ 
    //write/save a picture as a file
    ferris1.write("images/ferris11.jpg");
    
    /**/
    }//main
}//class
