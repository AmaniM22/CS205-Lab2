package edu.monmouth.lab2;

public class Governor {
	private String name;
	private int age;

	
public Governor(String name, int age) {
	setName(name);
	setAge(age);
}

public void setName (String name){
	this.name=name;
}

public void setAge(int age) {
	this.age=age;
}
public String getName() {
	return this.name;
}
public int getAge() {
	return this.age;
}
@Override 
public boolean equals(Object obj) {
	if (this==obj) {
		return true;
	}
	if(obj == null || getClass()!=obj.getClass()) {
		return false;
	}
	Governor governor =(Governor) obj;
	return age== governor.age&& name.equals(governor.name);
}
@Override
public int hashCode() {
	return (name.hashCode()+age);
}
@Override 
public String toString() {
	return "Governor Name: " +this.name +",Age: "+this.age;
	
}
}
