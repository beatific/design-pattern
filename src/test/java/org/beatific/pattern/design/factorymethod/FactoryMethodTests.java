package org.beatific.pattern.design.factorymethod;

import org.junit.Test;

public class FactoryMethodTests {

	@Test
	public void testFactoryMethod() {
		Creator c = new ConcreteCreator();
		Product kim = c.create("kim");
		Product lee = c.create("lee");
		Product park = c.create("park");
		
		kim.use();
		lee.use();
		park.use();
	}
}
