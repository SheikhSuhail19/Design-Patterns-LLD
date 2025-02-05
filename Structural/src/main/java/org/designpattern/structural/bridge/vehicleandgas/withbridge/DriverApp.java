package org.designpattern.structural.bridge.vehicleandgas.withbridge;

import org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction.Bike;
import org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction.Car;
import org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction.Truck;
import org.designpattern.structural.bridge.vehicleandgas.withbridge.abstraction.Vehicle;
import org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation.Electricity;
import org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation.Gasoline;
import org.designpattern.structural.bridge.vehicleandgas.withbridge.implementation.HydrogenGas;

public class DriverApp
{
	public static void main(String[] args)
	{
		Vehicle bike = new Bike(new Gasoline());
		bike.manufacture();

		Vehicle car = new Car(new Electricity());
		car.manufacture();

		Vehicle truck = new Truck(new HydrogenGas());
		truck.manufacture();
	}
}
