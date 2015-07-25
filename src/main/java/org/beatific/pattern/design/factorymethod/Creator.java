package org.beatific.pattern.design.factorymethod;

public abstract class Creator {

	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
