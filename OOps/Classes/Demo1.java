package Classes;

public class Demo1 {
	public static void main(String[]args) {
		
			Car car=new Car("closed","seated","on",10);
			
			//using public datatype 
//			car.speed=100;	
//			System.out.println(car.speed);
		
			//using private datatype
//		    car.setdoors(4);
//		    System.out.println(car.getdoors());
			
			//used to call getter and setter for private 
//			car.setdoors("closed");
//			car.setdriver("seated");
//			car.setengine("on");
//			car.setspeed(10);
			System.out.println(car.run());
	}
}