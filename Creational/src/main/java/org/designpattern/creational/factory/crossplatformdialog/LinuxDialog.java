package org.designpattern.creational.factory.crossplatformdialog;

public class LinuxDialog extends Dialog
{
	@Override
	Button createButton()
	{
		return new LinuxButton();
	}
}
