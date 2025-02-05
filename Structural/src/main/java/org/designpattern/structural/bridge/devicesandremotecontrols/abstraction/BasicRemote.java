package org.designpattern.structural.bridge.devicesandremotecontrols.abstraction;

// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all of the real work to this object.

import org.designpattern.structural.bridge.devicesandremotecontrols.implementation.Device;

public class BasicRemote implements Remote
{
	protected Device device;

	public BasicRemote()
	{
	}

	public BasicRemote(Device device)
	{
		this.device = device;
	}

	@Override
	public void power()
	{
		System.out.println("Remote: power toggle");
		if (device.isEnabled())
		{
			device.disable();
		}
		else
		{
			device.enable();
		}
	}

	@Override
	public void volumeDown()
	{
		System.out.println("Remote: volume down");
		device.setVolume(device.getVolume() - 10);
	}

	@Override
	public void volumeUp()
	{
		System.out.println("Remote: volume up");
		device.setVolume(device.getVolume() + 10);
	}

	@Override
	public void channelDown()
	{
		System.out.println("Remote: channel down");
		device.setChannel(device.getChannel() - 1);
	}

	@Override
	public void channelUp()
	{
		System.out.println("Remote: channel up");
		device.setChannel(device.getChannel() + 1);
	}
}