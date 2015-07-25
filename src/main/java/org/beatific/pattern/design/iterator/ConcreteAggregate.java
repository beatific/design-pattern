package org.beatific.pattern.design.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteAggregate<T> implements Aggregate<T> {

	private static final Logger logger = LoggerFactory.getLogger(ConcreteAggregate.class);
	private T[] objects;
	
	int length() {
		return objects.length;
	}
	
	T indexAt(int index) {
		return objects[index];
	}
	
	public ConcreteAggregate(T[] objects) {
		this.objects = objects;
	}
	
	public Iterator<T> iterator() {
		return new ConcreteIterator<T>(this);
	}

}
