package Encapsulation;

public class Person {
private String name;
private int age;
private String gender;

public Person(String name, int age, String gender) {
	this.name = name;
	this.age=age;
	this.gender = gender;
}
public void setname(String name) {
	this.name = name;
}

public boolean setage(int age) {
	if(age>=0 && age<=150) {
		this.age = age;
		return true;
	}else {
		return false;
	}
}

@Override
public String toString() {
	return "name=" + name + ", age=" + age + ", gender=" + gender;
}

}