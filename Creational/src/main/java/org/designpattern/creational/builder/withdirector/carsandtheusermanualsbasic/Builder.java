package org.designpattern.creational.builder.withdirector.carsandtheusermanualsbasic;

// The builder interface specifies methods for creating the
// different parts of the product objects.

public interface Builder
{
	Builder setCarType(String carType);

	Builder setCarModel(String carModel);

	Builder setCarColor(String carColor);

	Builder setCarEngine(String carEngine);

	Builder setCarTransmission(String carTransmission);

	Builder setCarFuelType(String carFuelType);

	Builder setCarPrice(String carPrice);
}
