package chapter_11_composition.chapter_11_01_inheritance_problem;

import java.util.Hashtable;

public class Properties {
	private Hashtable<String, String> properties =
					new Hashtable<String, String>();
	
	
	public String setProperty(String key, String value) {
		return properties.put(key, value);
	}
	
	
	public String getProperty(String key) {
		return properties.get(key);
	}
}
