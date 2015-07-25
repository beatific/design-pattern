package org.beatific.pattern.design.templatemethod;

public abstract class AbstractClass {

	public void print() {
		printHead();
		printBody();
		printTail();
	}
	
	protected abstract void printHead();
	protected abstract void printBody();
	protected abstract void printTail();
}
