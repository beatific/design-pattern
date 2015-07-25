package org.beatific.pattern.design.singleton;

import org.junit.Test;

public class SingletoneTests {

	@Test
	public void testSingleton() {
		Singleton singleton = Singleton.getInstance();
		singleton.add();
		singleton.print();
		
		Singleton singletwo = Singleton.getInstance();
		singletwo.print();
		singletwo.add();
		
		singleton.print();
	}
}
