package org.beatific.pattern.design.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstConcretePrototype implements Prototype {

	private static final Logger logger = LoggerFactory.getLogger(FirstConcretePrototype.class);
	
	private String string;
	public FirstConcretePrototype(String string) {
		this.string = string;
	}
	
	public void use(String s) {
		System.out.print("+");
		for(int i=0; i < 20; i++) {
			System.out.print(string);
		}
		System.out.println("+");
		System.out.println("|" + s + "|");
		System.out.print("+");
		for(int i=0; i < 20; i++) {
			System.out.print(string);
		}
		System.out.println("+");
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
