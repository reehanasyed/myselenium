package aitesting;


import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class Test1 {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		File fo=LoadLibs.extractTessResources("tessdata");
		//create object to apply ocr on image
		Tesseract obj=new Tesseract();
		obj.setDatapath(fo.getAbsolutePath());
		//take screenshot file which has text in content
		File d=new File("H:\\Skipad.PNG");
		try
		{
			obj.setLanguage("eng");
		String result=obj.doOCR(d);
		Thread.sleep(20000);
		System.out.println(result);
		}catch(TesseractException e) 
        {
            System.err.println(e.getMessage());
        }
	}

}
