package Composition;

public class Main {
 public static void main(String[] args) {
	 Laptop laptop=new Laptop();
	// System.out.println(laptop);//build constructor and print all the values from the other classes as well
	//System.out.println(laptop.getProcessor().getBrand());//using this we can get processor class specific value using getters and setters 
    
	 Processor p1=new Processor();
	 GraphicCard g1=new GraphicCard();
	 Laptop l1=new Laptop(24.5f, p1, "DDR5","1TB", g1,"Single Layer", "Backlit");
	 System.out.println(l1);
 }
}