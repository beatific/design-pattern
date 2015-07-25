package org.beatific.pattern.design.templatemethod;

public class FirstConcreteClass extends AbstractClass {

	private String string;
	
	public FirstConcreteClass(String string) {
		this.string = string;
	}
	
	@Override
	protected void printHead() {
		System.out.println("<head>");
		System.out.println("</head>");
	}

	@Override
	protected void printBody() {
		System.out.println("<body>");
		System.out.println("<table>");
		System.out.println("<tr>");
		System.out.println("<td>" + string + "</td>");
		System.out.println("<td>");
		System.out.println("</td>");
		System.out.println("</tr>");
		System.out.println("</table>");
		System.out.println("</body>");
	}

	@Override
	protected void printTail() {
		
	}

}
