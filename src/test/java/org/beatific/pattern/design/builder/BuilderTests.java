package org.beatific.pattern.design.builder;

import org.junit.Test;

public class BuilderTests {

	@Test
	public void testBuilder() {
		ConcreteBuilder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		String result = builder.getResult();
		System.out.println(result);
	}
}
