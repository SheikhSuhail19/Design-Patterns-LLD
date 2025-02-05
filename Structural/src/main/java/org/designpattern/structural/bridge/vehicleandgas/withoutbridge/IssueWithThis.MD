Problem:
Adding a new vehicle type (e.g., Truck) or a new fuel type (e.g., HydrogenGas) requires modifying multiple classes.

New classes:

    - TruckElectric
    - TruckGaslone
    - TruckHydrogenGas
    - CarHydrogenGas
    - BikeHydrogenGas

Refactoring Goal:

Use the Bridge Pattern to separate Vehicle Type (Car, Bike, Truck) from Fuel Type (Electric, Gasoline, Hybrid).
Ensure that new vehicle types and new fuel types can be added independently without modifying existing code.