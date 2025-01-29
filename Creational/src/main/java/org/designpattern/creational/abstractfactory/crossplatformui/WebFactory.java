package org.designpattern.creational.abstractfactory.crossplatformui;

public class WebFactory implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new HTMLButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new HTMLCheckbox();
	}
}
