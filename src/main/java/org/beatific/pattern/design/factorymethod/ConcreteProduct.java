package org.beatific.pattern.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteProduct extends Product {

	private static final Logger logger = LoggerFactory.getLogger(ConcreteProduct.class);
	private String owner;
	public ConcreteProduct(String owner) {
		this.owner = owner;
	}

	@Override
	public void use() {
		logger.debug("owner [{}] use", owner);
	}

	public String getOwner() {
		return owner;
	}

}
