package Polymorphism;

public class Main {
public static void main(String[]args) {
//	Phone p=new Phone();
//	p.feature();
//	
//	Nokia3310 n=new Nokia3310();
//	n.feature();
//	
//	Iphone i=new Iphone();
//	i.feature();
	
	//polymorphism
	Phone phone;//created a reference
    phone=new Nokia3310();
    phone.feature();
    phone=new Iphone();
    phone.feature();
}
}