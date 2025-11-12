package Classes;

public class Car {
	
	private String doors;
	private String engine;
	private int speed;
	private String driver;
	
	//default constructor
//	public Car() {
//		doors="closed";
//		driver="away";
//		engine="off";
//		speed=0;
//	}
	
	//parameterized constructor
	public Car(String doors,String engine,String driver,int speed) {
		this.doors=doors;
		this.driver=driver;
		this.engine=engine;
		this.speed=speed;
	}
//	
//	public  int speed;
	
//example for accesing private variable
//	public void setdoors(String doors) {
//		this.doors=doors;//this is used to refer the correct variable
//	}
//	public int getdoors() {
//		return doors;
//	}
	
	public void setdoors(String doors) {
		this.doors=doors;//this is used to refer the correct variable
	}
	
	
	public void setengine(String engine) {
		this.engine=engine;//this is used to refer the correct variable
	}
	
	public void setspeed(int speed) {
		this.speed=speed;//this is used to refer the correct variable
	}
	
	public int getspeed() {
		return speed;
	}
	
	public void setdriver(String driver) {
		this.driver=driver;//this is used to refer the correct variable
	}
	
	public String run() {
		if(doors.equals("closed")&&engine.equals("on")&&driver.equals("seated")&& speed>0) {
			return "running";
		}else {
			return "not running";
		}
	}
	
}