package org.beatific.pattern.design.adapter;

import org.junit.Test;

public class AdapterTests {

	@Test
	public void testAdapter() {
		
		String contents = "My name is Cho Su Hwan.";
		Target target = new Adapter(contents);
		target.print();
		target.memo();
	}
}
