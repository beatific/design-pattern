package org.beatific.pattern.design.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCreator extends Creator {

	private List<String> owners = new ArrayList<String>();
	
	@Override
	protected Product createProduct(String owner) {
		return new ConcreteProduct(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((ConcreteProduct)product).getOwner());
	}

}
