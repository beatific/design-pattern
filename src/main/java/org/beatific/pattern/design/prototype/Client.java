package org.beatific.pattern.design.prototype;

import java.util.HashMap;
import java.util.Map;

public class Client {

	private Map<String, Prototype> showcase = new HashMap<String, Prototype>();
	
	public void register(String name, Prototype prototype) {
		showcase.put(name,  prototype);
	}
	
	public Prototype create(String name) {
		Prototype p = showcase.get(name);
		return p.createClone();
	}
}
