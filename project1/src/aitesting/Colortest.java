package aitesting;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Colortest {

	public static void main(String[] args) throws Exception 
	{
      int count=0;
      int percentage;
      Color ec=Color.black;
      File f=new File("H:\\batch239\\project\\rukku.PNG");
      BufferedImage fullimg=ImageIO.read(f);
      //check image color pixel by pixel
      int w=fullimg.getWidth();
      int h=fullimg.getHeight();
      for(int i=0;i<w;i++)
      {
    	  for(int j=0;j<h;j++)
    	  {
    		  Color ac=new Color(fullimg.getRGB(i,j));
    		  if(ac.getRed()==ec.getRed() && ac.getGreen()==ec.getGreen()&&ac.getBlue()==ec.getBlue())
    		  {
    			  count=count+1;
    			  
    		  }  
    	  }
      }
      System.out.println("total pixel is "+(w*h));
      System.out.println("expected color pixel count:"+count);
      percentage=(count*100)/(w*h);
      System.out.println(percentage);
	  }

}
