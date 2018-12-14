package aitesting;


import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class Ocrimage {

	public static void main(String[] args) throws Exception 
	{
		// System.setProperty("jna.library.path", "32".equals(System.getProperty("sun.arch.data.model")) ? "lib/win32-x86" : "lib/win32-x86-64");

        File imageFile = new File("skip.png");
        Tesseract instance = new Tesseract(); 
        File tessDataFolder = LoadLibs.extractTessResources("tessdata"); 
        instance.setLanguage("eng");
        instance.setDatapath(tessDataFolder.getPath());

        try 
        {
            String result = instance.doOCR(imageFile);
            System.out.println(result);
        } 
        catch (TesseractException e) 
        {
            System.err.println(e.getMessage());
        }

	}
}
