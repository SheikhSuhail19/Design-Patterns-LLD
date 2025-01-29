package org.designpattern.creational.factory.crossplatformdialog;

public class WindowsDialog extends Dialog
{
	@Override
	public Button createButton()
	{
		return new WindowsButton();
	}
}