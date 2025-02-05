package org.designpattern.structural.bridge.documentprocessingdevices.abstraction;

import org.designpattern.structural.bridge.documentprocessingdevices.implementation.OutputDevice;

public abstract class AbstractDocument implements Document
{
	protected OutputDevice outputDevice;  // Bridge to OutputDevice

	public AbstractDocument(OutputDevice outputDevice)
	{
		this.outputDevice = outputDevice;
	}

	public abstract String getContent(); // Each document has its own content

	@Override
	public void render()
	{
		outputDevice.renderContent(getContent());
	}
}

