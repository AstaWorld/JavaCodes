package Inheritance;

public class Vehicle {
public String engine;
public int wheels;
public int seats;
public int fuelTank;
public String Lights;

public Vehicle(String engine, int fuelTank, String Lights, int seats, int wheels) {
	this.engine=engine;
	this.fuelTank=fuelTank;
	this.Lights=Lights;
	this.seats=seats;
	this.wheels=wheels;
	
}
public String getengine() {
	return engine;
}
public int getfuelTank() {
	return fuelTank;
}
public String getLights() {
	return Lights;
}
public int getseats() {
	return seats;
}
public int getwheels() {
	return wheels;
}

public String run() {
	return "running vehicle";
}
public String toString() {
    return "Engine: " + engine + 
           ", Fuel Tank: " + fuelTank + 
           ", Lights: " + Lights + 
           ", Seats: " + seats + 
           ", Wheels: " + wheels;
}
}