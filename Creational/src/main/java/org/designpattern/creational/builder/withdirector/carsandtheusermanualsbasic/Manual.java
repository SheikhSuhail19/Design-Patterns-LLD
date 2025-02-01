package org.designpattern.creational.builder.withdirector.carsandtheusermanualsbasic;

// Each car should have a user manual that corresponds to
// the car's configuration and describes all its features.

public class Manual
{
	private final String carType;
	private final String carModel;
	private final String carColor;
	private final String carEngine;
	private final String carTransmission;
	private final String carFuelType;
	private final String carPrice;

	public Manual(String carType, String carModel, String carColor, String carEngine, String carTransmission, String carFuelType, String carPrice)
	{
		this.carType = carType;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carEngine = carEngine;
		this.carTransmission = carTransmission;
		this.carFuelType = carFuelType;
		this.carPrice = carPrice;
	}

	public String getCarType()
	{
		return carType;
	}

	public String getCarModel()
	{
		return carModel;
	}

	public String getCarColor()
	{
		return carColor;
	}

	public String getCarEngine()
	{
		return carEngine;
	}

	public String getCarTransmission()
	{
		return carTransmission;
	}

	public String getCarFuelType()
	{
		return carFuelType;
	}

	public String getCarPrice()
	{
		return carPrice;
	}

	@Override
	public String toString()
	{
		return "Manual{" +
				"carType='" + carType + '\'' +
				", carModel='" + carModel + '\'' +
				", carColor='" + carColor + '\'' +
				", carEngine='" + carEngine + '\'' +
				", carTransmission='" + carTransmission + '\'' +
				", carFuelType='" + carFuelType + '\'' +
				", carPrice='" + carPrice + '\'' +
				'}';
	}
}
