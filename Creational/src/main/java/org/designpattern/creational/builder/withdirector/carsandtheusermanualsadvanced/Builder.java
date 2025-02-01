package org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced;

import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.Engine;
import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.GPSNavigator;
import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.Transmission;
import org.designpattern.creational.builder.withdirector.carsandtheusermanualsadvanced.carfeatures.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder
{
	void setCarType(CarType type);

	void setSeats(int seats);

	void setEngine(Engine engine);

	void setTransmission(Transmission transmission);

	void setTripComputer(TripComputer tripComputer);

	void setGPSNavigator(GPSNavigator gpsNavigator);
}