package edu.monmouth.lab2;

public class State {
	private String name;
	private int coastLength;
	private String stateBird;
	
public State (String name, int coastLength, String stateBird) {
	setName(name);
	setCoastLength(coastLength);
	setStateBird(stateBird);
}
public void setName(String name) {
	this.name=name;
}
public void setCoastLength(int coastLength) {
	this.coastLength=coastLength;
}
public void setStateBird(String stateBird) {
	this.stateBird=stateBird;
}
public String getName() {
	return this.name;
}
public int getCoastLength() {
	return this.coastLength;
}
public String getStateBird() {
	return this.getStateBird();
}
@Override
public boolean equals (Object obj) {
	if (this==obj) {
		return true;
	}
	if(obj == null || getClass()!=obj.getClass()) {
		return false;
	}
	State state =(State) obj;
	return coastLength== state.coastLength && name.equals(state.name)&& stateBird.equals (state.stateBird);
}
@Override 
public int hashCode() {
	return name.hashCode()+coastLength+ stateBird.hashCode();
}
@Override 
public String toString() {
	return "State: "+this.name+", Coast Length: "+this.coastLength+", State Bird: "+ this.stateBird;
}
}
