package org.beatific.pattern.design.prototype;

import org.junit.Test;

public class PrototypeTests {

	@Test
	public void testPrototype() {
		Client c = new Client();
		
		Prototype p1 = new FirstConcretePrototype("*");
		Prototype p2 = new SecondConcretePrototype("-");
		Prototype p3 = new FirstConcretePrototype("-");
		
		c.register("first", p1);
		c.register("second", p2);
		c.register("third", p3);
		
		Prototype first = c.create("first");
		Prototype second = c.create("second");
		Prototype third = c.create("third");
		
		first.use("Hi Hello?");
		second.use("Hi Hello?");
		third.use("Hi Hello?");
	}
	
}
