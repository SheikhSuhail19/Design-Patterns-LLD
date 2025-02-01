package org.designpattern.creational.builder.withdirector.carsandtheusermanualsbasic;

// Using the Builder pattern makes sense only when your products
// are quite complex and require extensive configuration. The
// following two products are related, although they don't have
// a common interface.

public class Car
{
	private final String carType;
	private final String carModel;
	private final String carColor;
	private final String carEngine;
	private final String carTransmission;
	private final String carFuelType;
	private final String carPrice;

	public Car(String carType, String carModel, String carColor, String carEngine, String carTransmission, String carFuelType, String carPrice)
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
		return "Car{" +
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
