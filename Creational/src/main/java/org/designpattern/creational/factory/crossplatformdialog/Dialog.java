package org.designpattern.creational.factory.crossplatformdialog;

// The creator class declares the factory method that must
// return an object of a product class. The creator's subclasses
// usually provide the implementation of this method.

public abstract class Dialog
{
	// The creator may also provide some default implementation
	// of the factory method.
	abstract Button createButton();

	// Note that, despite its name, the creator's primary
	// responsibility isn't creating products. It usually
	// contains some core business logic that relies on product
	// objects returned by the factory method. Subclasses can
	// indirectly change that business logic by overriding the
	// factory method and returning a different type of product
	// from it.
	public void render()
	{
		// Call the factory method to create a product object.
		Button okButton = createButton();
		// Call the operation implemented by the product
		// and pass it to the client code.
		okButton.render();
		okButton.onClick();
	}
}
