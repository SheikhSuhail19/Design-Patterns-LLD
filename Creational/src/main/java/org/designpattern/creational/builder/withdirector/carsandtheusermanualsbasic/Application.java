package org.designpattern.creational.builder.withdirector.carsandtheusermanualsbasic;

// The client code creates a builder object, passes it to the
// director and then initiates the construction process. The end
// result is retrieved from the builder object.

public class Application
{
	private void makeCar()
	{
		Director director = new Director();

		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);

		// The final product is often retrieved from a builder
		// object since the director isn't aware of and not
		// dependent on concrete builders and products.
		Car sportsCar = builder.build();

		System.out.println("Sports Car: " + sportsCar.getCarType() + " " + sportsCar.getCarModel() + " " + sportsCar.getCarColor() + " " + sportsCar.getCarEngine() + " " + sportsCar.getCarTransmission() + " " + sportsCar.getCarFuelType() + " " + sportsCar.getCarPrice());

		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCar(manualBuilder);

		// The final product is often retrieved from a builder
		// object since the director isn't aware of and not
		// dependent on concrete builders and products.
		Manual sportsCarManual = manualBuilder.build();

		System.out.println("Sports Car Manual: " + sportsCarManual.getCarType() + " " + sportsCarManual.getCarModel() + " " + sportsCarManual.getCarColor() + " " + sportsCarManual.getCarEngine() + " " + sportsCarManual.getCarTransmission() + " " + sportsCarManual.getCarFuelType() + " " + sportsCarManual.getCarPrice());

	}

	public static void main(String[] args)
	{
		Application app = new Application();
		app.makeCar();
	}

}
