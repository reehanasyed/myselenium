package aitesting;

import java.util.Locale;
import java.util.Scanner;

import javax.speech.Central;
import javax.speech.EngineException;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

public class VoiceasOutput {

	public static void main(String[] args) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String x=sc.nextLine();
		System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
		Synthesizer s=Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
		s.allocate();
		s.resume();
		s.speakPlainText(x,null);
		s.waitEngineState(s.QUEUE_EMPTY);
		s.deallocate();
	}
}
