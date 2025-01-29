package org.designpattern.creational.abstractfactory.crossplatformui;

public class MacFactory implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new MacCheckbox();
	}
}
