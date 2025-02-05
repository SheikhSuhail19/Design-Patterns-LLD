package org.designpattern.structural.bridge.devicesandremotecontrols.abstraction;

// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all of the real work to this object.

import org.designpattern.structural.bridge.devicesandremotecontrols.implementation.Device;

public class AdvancedRemote extends BasicRemote
{
	public AdvancedRemote(Device device)
	{
		super.device = device;
	}

	public void mute()
	{
		System.out.println("Remote: mute");
		device.setVolume(0);
	}
}