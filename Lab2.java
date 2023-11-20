package edu.monmouth.lab2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Lab2 {
    public static void main(String[] args) {
	State newJersey = new State("New Jersey", 130,  "Eastern Goldfinch");
	State newYork = new State("New York", 127,  "Eastern Bluebird");
	State pennsylvania = new State("Pennsylvania", 0,  "Ruffled Grouse");
	State delaware = new State("Delaware", 28,  "Blue Hen");
	State maryland = new State("Maryland", 31,  "Oriole");
	State connecticut = new State("Connecticut", 96,  "Robin");
	State newJersey2 = new State("New Jersey", 130,  "Eastern Goldfinch");
	
	Governor njGov = new Governor("Murphy", 65);
	Governor nyGov = new Governor("Hochul", 64);
	Governor paGov = new Governor("Shapiro", 49);
	Governor deGov = new Governor("Carney", 66);
	Governor mdGov = new Governor("Moore", 44);
	Governor ctGov = new Governor("Lamont", 69);
	
	// verify State hashCode and equals methods are consistent
	 

	// verify Governor hashCode and equals methods are consistent
	
	// create a HashSet that can only house State objects
	 HashSet<State> States = new HashSet<>();

	// attempt to insert all 7 State objects to the HashSet
	// print whether or not the object was added or not
	 System.out.println("Inserting States!: ");
	 State[] allStates = {newJersey, newYork, pennsylvania, delaware, maryland, connecticut, newJersey2};
	   for (State state : allStates) {
           System.out.println(state.getName() + " added: " + States.add(state));
       }

	// iterate through the HashSet for each State
	 System.out.println("\nPrinting states:");
     for (State state : States) {
         System.out.println(state);
       }

	// create a HashMap associating State and Governor objects
     HashMap<State, Governor> Governors = new HashMap<>();

	// for the 6 unique State objects insert State and Governor objects 
     Governors.put(newJersey, njGov);
     Governors.put(newYork, nyGov);
     Governors.put(pennsylvania, paGov);
     Governors.put(delaware, deGov);
     Governors.put(maryland, mdGov);
     Governors.put(connecticut, ctGov);

	
	// print the number of elements in the HashMap
     System.out.println("\nNumber of elements in HashMap: " + Governors.size());

	// print all elements in the HashMap
     System.out.println("\nPrinting all elements in HashMap:");
     for (Map.Entry<State, Governor> entry : Governors.entrySet()) {
         System.out.println("State: " + entry.getKey() + ", Governor: " + entry.getValue());
     }

	// print the governor for newYork State object
     System.out.println("\nGovernor of New York: " + Governors.get(newYork));

     // determine if the State object newJersey exists as a key in the HashMap
     if (Governors.containsKey(newJersey)) {
         // if it exists, print the governor
         System.out.println("\nGovernor of New Jersey: " + Governors.get(newJersey));
     }
  
	State rhodeIsland = new State("Rhode Island", 40, "Rhode Island Red");
	// determine if the State object rhodeIsland exists as a key in the HashSet containing states
	   if (Governors.containsKey(rhodeIsland)) {
           // if it exists, print the governor
           System.out.println("\nGovernor of Rhode Island: " + Governors.get(rhodeIsland));
       } else {
           System.out.println("\nRhode Island does not exist in the HashMap.");
       }
   }

}

