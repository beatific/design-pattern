package org.beatific.pattern.design.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecondConcretePrototype implements Prototype {
	
	private static final Logger logger = LoggerFactory.getLogger(SecondConcretePrototype.class);
	private String string;
	
	public SecondConcretePrototype(String string) {
		this.string = string;
	}
	
	public void use(String s) {
		for(int i=0; i < 22; i++) {
			System.out.print(string);
		}
		System.out.print("\n");
		
		System.out.println(string + s + string);
		
		for(int i=0; i < 22; i++) {
			System.out.print(string);
		}
		System.out.print("\n");
	}

	public Prototype createClone() {
		Prototype p = null;
		try {
			p = (Prototype) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
