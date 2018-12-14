package appium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Smallclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> mp=new HashMap<String, String>();
		mp.put("546","fklghk");
		mp.put("564", "dklfj");
		Set<Map.Entry<String,String>> st=mp.entrySet();
           for(Map.Entry<String,String> as:st) {
        System.out.println(as.getKey());
        System.out.println(as.getValue());
           }
	}

}
