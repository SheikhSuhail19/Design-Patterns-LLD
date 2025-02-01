package org.designpattern.creational.builder.withdirector.carsandtheusermanualsbasic;

// The director is only responsible for executing the building
// steps in a particular sequence. It's helpful when producing
// products according to a specific order or configuration.
// Strictly speaking, the director class is optional, since the
// client can control builders directly.

public class Director
{
	// The director works with any builder instance that the
	// client code passes to it. This way, the client code may
	// alter the final type of the newly assembled product.
	// The director can construct several product variations
	// using the same building steps.

	public void constructSportsCar(Builder builder)
	{
		builder.setCarType("Sports Car")
				.setCarModel("Ferrari")
				.setCarColor("Red")
				.setCarEngine("V8")
				.setCarTransmission("Automatic")
				.setCarFuelType("Petrol")
				.setCarPrice("200000");
	}

	public void constructSUVCar(Builder builder)
	{
		builder.setCarType("SUV Car")
				.setCarModel("Toyota")
				.setCarColor("White")
				.setCarEngine("V6")
				.setCarTransmission("Automatic")
				.setCarFuelType("Petrol")
				.setCarPrice("50000");
	}
}
