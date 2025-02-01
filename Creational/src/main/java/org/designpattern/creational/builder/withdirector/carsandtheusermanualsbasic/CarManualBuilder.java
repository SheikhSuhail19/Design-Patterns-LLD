package org.designpattern.creational.builder.withdirector.carsandtheusermanualsbasic;

// Unlike other creational patterns, builder lets you construct
// products that don't follow the common interface.

public class CarManualBuilder implements Builder
{
	private String carType;
	private String carModel;
	private String carColor;
	private String carEngine;
	private String carTransmission;
	private String carFuelType;
	private String carPrice;

	@Override
	public Builder setCarType(String carType)
	{
		this.carType = carType;
		return this;
	}

	@Override
	public Builder setCarModel(String carModel)
	{
		this.carModel = carModel;
		return this;
	}

	@Override
	public Builder setCarColor(String carColor)
	{
		this.carColor = carColor;
		return this;
	}

	@Override
	public Builder setCarEngine(String carEngine)
	{
		this.carEngine = carEngine;
		return this;
	}

	@Override
	public Builder setCarTransmission(String carTransmission)
	{
		this.carTransmission = carTransmission;
		return this;
	}

	@Override
	public Builder setCarFuelType(String carFuelType)
	{
		this.carFuelType = carFuelType;
		return this;
	}

	@Override
	public Builder setCarPrice(String carPrice)
	{
		this.carPrice = carPrice;
		return this;
	}

	public Manual build()
	{
		return new Manual(carType, carModel, carColor, carEngine, carTransmission, carFuelType, carPrice);
	}
}