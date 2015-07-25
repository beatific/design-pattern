package org.beatific.pattern.design.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton {

	private static final Logger logger = LoggerFactory.getLogger(Singleton.class);
	private static Singleton singleton;
	
	private int count = 0;
	
	private Singleton() {
		logger.debug("this is singleton");
	}
	
	public static Singleton getInstance() {
		if(singleton == null)singleton = new Singleton();
		return singleton;
	}
	
	public synchronized void add() {
	    ++count;
	}
	
	public synchronized void print() {
		logger.debug("singleton count : [{}]", count);
	}
}
