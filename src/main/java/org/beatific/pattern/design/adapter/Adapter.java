package org.beatific.pattern.design.adapter;

public class Adapter extends Adaptee implements Target {

	public Adapter(String contents) {
		super(contents);
	}
	
	public void print() {
		printWithoutTime();
	}
	
	public void memo() {
		printWithTime();
	}

}
