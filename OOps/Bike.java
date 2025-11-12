package Inheritance;

public class Bike extends Vehicle{
private String handle;
public Bike(String handle,String engine,int fuelTank,String Lights,int seats,int wheels) {
	super(engine,fuelTank,Lights,seats,wheels);
	this.handle=handle;;
}
public String gethandle() {
	return handle;
}
public String toString() {
	return "Handle: "+handle+" "+
			super.toString();//super.tostring is used to print all 
	                         //the values of parent and child class
}
public String run() {
	return "running bike";
}
}