package org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced;

import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.Engine;
import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.GPSNavigator;
import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.Transmission;
import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.TripComputer;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder
{
	private CarType type;
	private int seats;
	private Engine engine;
	private Transmission transmission;
	private TripComputer tripComputer;
	private GPSNavigator gpsNavigator;

	public void setCarType(CarType type)
	{
		this.type = type;
	}

	@Override
	public void setSeats(int seats)
	{
		this.seats = seats;
	}

	@Override
	public void setEngine(Engine engine)
	{
		this.engine = engine;
	}

	@Override
	public void setTransmission(Transmission transmission)
	{
		this.transmission = transmission;
	}

	@Override
	public void setTripComputer(TripComputer tripComputer)
	{
		this.tripComputer = tripComputer;
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator)
	{
		this.gpsNavigator = gpsNavigator;
	}

	public Car getResult()
	{
		return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
	}
}