package package1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Calculator {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		//Launch cal
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(3000);
        StringSelection x1=new StringSelection("23");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x1,null);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		//click +
		r1.keyPress(KeyEvent.VK_SUBTRACT);
		r1.keyRelease(KeyEvent.VK_SUBTRACT);
		Thread.sleep(2000);
		//enter 2nd input
		StringSelection y1=new StringSelection("22");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y1,null);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_V);
		r1.keyRelease(KeyEvent.VK_CONTROL);
		//click =
		r1.keyPress(KeyEvent.VK_EQUALS);
		r1.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(3000);
		//get output and display
		r1.keyPress(KeyEvent.VK_CONTEXT_MENU);
        r1.keyRelease(KeyEvent.VK_CONTEXT_MENU);
        r1.keyPress(KeyEvent.VK_DOWN);
        r1.keyRelease(KeyEvent.VK_DOWN);
        r1.keyPress(KeyEvent.VK_ENTER);
        r1.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        String z1=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        System.out.println(z1);
        //close cal
        r1.keyPress(KeyEvent.VK_ALT);
        r1.keyPress(KeyEvent.VK_F4);
        r1.keyRelease(KeyEvent.VK_F4);
        r1.keyRelease(KeyEvent.VK_ALT);
        
	}

}
