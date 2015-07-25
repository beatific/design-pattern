package org.beatific.pattern.design.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteIterator<T> implements Iterator<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(ConcreteIterator.class);
	private ConcreteAggregate<T> aggregate;
	private int index = 0;

	public ConcreteIterator(ConcreteAggregate<T> aggregate) {
		this.aggregate = aggregate;
	}
	
	public boolean hasNext() {
		if(aggregate.length() > index) return true;
		return false;
	}

	public T next() {
		return aggregate.indexAt(index++);
	}

}
