package aitesting;

import java.util.Locale;
import java.util.Scanner;

import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlevoice {

	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String x=sc.nextLine();
		//lanuch site
		System.setProperty("webdriver.chrome.driver","H:\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--use-fake-ui-for-media-Stream=1");
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("http://www.google.co.in");
		WebDriverWait w=new WebDriverWait(driver,40);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gsri_ok0']")));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='gsri_ok0']")).click();
		//convert given text to voice
		Thread.sleep(1500);

		System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
		Synthesizer s=Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
		s.allocate();
		s.resume();
		s.speakPlainText(x,null);
		s.waitEngineState(s.QUEUE_EMPTY);
		s.deallocate();
		//validate result
		Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rso']")));
		String y=driver.getTitle();
		x=x.toLowerCase();
		y=y.toLowerCase();
		if(y.contains(x))
		{
			System.out.println("test passed");
			
		}
		else
		{
			System.out.println("test failed");
		}
		driver.close();
		}

}

