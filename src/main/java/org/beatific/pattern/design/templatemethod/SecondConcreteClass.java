package org.beatific.pattern.design.templatemethod;

public class SecondConcreteClass extends AbstractClass {

	private String string;
	
	public SecondConcreteClass(String string) {
		this.string = string;
	}
	
	@Override
	protected void printHead() {
		System.out.println("+------------------+");
	}

	@Override
	protected void printBody() {
		System.out.println("|" + string + "|");
		
	}

	@Override
	protected void printTail() {
		System.out.println("+------------------+");
		
	}

	
}
