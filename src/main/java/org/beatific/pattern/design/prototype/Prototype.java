package org.beatific.pattern.design.prototype;

public interface Prototype extends Cloneable {

	public void use(String s);
	public Prototype createClone();
}
