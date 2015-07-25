package org.beatific.pattern.design;

import java.util.ArrayList;
import java.util.List;

public class TestVo {

	private String name;
	
	public TestVo(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestVo [name=" + name + "]";
	}
	
	public static TestVo[] vos(String... names) {
		List<TestVo> list = new ArrayList<TestVo>();
		for(String name : names) {
			list.add(new TestVo(name));
		}
		return list.toArray(new TestVo[0]);
	}
}
