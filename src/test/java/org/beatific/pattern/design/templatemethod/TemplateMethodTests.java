package org.beatific.pattern.design.templatemethod;

import org.junit.Test;

public class TemplateMethodTests {

	@Test
	public void testTemplateMethod() {
		AbstractClass ac1 = new FirstConcreteClass("Hello");
		AbstractClass ac2 = new SecondConcreteClass("Bye");
		
		ac1.print();
		ac2.print();
	}
}
