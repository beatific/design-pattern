package org.beatific.pattern.design.adapter;

import java.util.Date;

public class Adaptee {

	public String contents;
	
	public Adaptee(String contents) {
		this.contents = contents;
	}
	
	public void printWithTime() {
		System.out.println("****************************");
		System.out.println("*start time : " + new Date());
		System.out.println("*contents : " + contents);
		System.out.println("*end time : " + new Date());
		System.out.println("****************************");
	}
	
	public void printWithoutTime() {
		System.out.println("****************************");
		System.out.println("*contents : " + contents);
		System.out.println("****************************");
	}
	
}
