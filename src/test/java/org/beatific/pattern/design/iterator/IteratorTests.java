package org.beatific.pattern.design.iterator;

import org.beatific.pattern.design.vo.TestVo;
import org.junit.Test;

public class IteratorTests {

	@Test
	public void testIterator() {
		String[] names = new String[]{"kim", "lee", "park", "cho", "kang", "oh"};
		TestVo[] vos = TestVo.vos(names);
		Aggregate<TestVo> aggrregate = new ConcreteAggregate<TestVo>(vos);
		Iterator<TestVo> iter = aggrregate.iterator();
		while(iter.hasNext()) {
			TestVo vo = iter.next();
			System.out.println(vo);
		}
	}
}
