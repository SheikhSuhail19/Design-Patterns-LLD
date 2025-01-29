package org.designpattern.creational.abstractfactory.crossplatformui;

public class WinFactory implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new WinButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new WinCheckbox();
	}
}
