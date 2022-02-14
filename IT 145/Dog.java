package Pets;

public class Dog extends Pet{ //Dog derives from Pet
	public int dogSpaceNbr;
	public double dogWeight;
	public String dogGrooming;
	
	public Dog() { // Default constructor
		dogWeight = 0; // Default dogWeight:0 indicates dog weight was not set
		dogGrooming = "noChoice"; // Default dogGrooming: noChoice indicates dogGrooming was not set
	}
	
	//Setters
	
	public void setdogWeight (double dogWeight) {
		this.dogWeight = dogWeight;
	}
	
	public void setdogGrooming (String dogGrooming) {
		this.dogGrooming = dogGrooming;
	}
	
	//Getters
	
	public double getdogWeight() {
		return dogWeight;
	}
	
	public String getdogGrooming() {
		return dogGrooming;
	}
	
	public void printDog() {
		System.out.println("Dog's Weight: " + dogWeight);
		System.out.println("Grooming: " + dogGrooming);
	}
}
