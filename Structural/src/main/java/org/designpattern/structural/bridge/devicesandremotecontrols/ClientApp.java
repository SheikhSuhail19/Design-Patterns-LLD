package org.designpattern.structural.bridge.devicesandremotecontrols;

import org.designpattern.structural.bridge.devicesandremotecontrols.abstraction.AdvancedRemote;
import org.designpattern.structural.bridge.devicesandremotecontrols.abstraction.BasicRemote;
import org.designpattern.structural.bridge.devicesandremotecontrols.implementation.Device;
import org.designpattern.structural.bridge.devicesandremotecontrols.implementation.Radio;
import org.designpattern.structural.bridge.devicesandremotecontrols.implementation.TV;

public class ClientApp
{
	public static void main(String[] args)
	{
		testDevice(new TV());
		testDevice(new Radio());
	}

	public static void testDevice(Device device)
	{
		System.out.println("Tests with basic remote.");
		BasicRemote basicRemote = new BasicRemote(device);
		basicRemote.power();
		basicRemote.channelUp();
		basicRemote.volumeDown();
		device.printStatus();

		System.out.println("Tests with advanced remote.");
		AdvancedRemote advancedRemote = new AdvancedRemote(device);
		advancedRemote.power();
		advancedRemote.mute();
		device.printStatus();
	}
}
