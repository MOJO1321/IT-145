package Pets;

public class Pet {
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue;
	
	public Pet() { // Default constructor
		petType = "noType"; // Default petType: noType indicates pet type was not set
		petName = "noName"; // Default petName: noName indicates pet name was not set
		petAge = 0; // Default petAge: 0 indicates name was not set
		dogSpace = 0; // Default dogSpace: 0 indicates dog space was not set
		catSpace = 0; // Default catSpace: 0 indicates cat space was not set
		daysStay = 0; // Default daysStay: 0 indicates days stay was not set
		amountDue = 0; // Default amountDue: 0 indicates amount due was not set
	}

	//Setter
	
	public void setpetType (String petType) { //Mutator
		this.petType = petType;
	}
	
	public void setpetName (String petName) { //Mutator
		this.petName = petName;
	}
	
	public void setpetAge (int petAge) { //Mutator
		this.petAge = petAge;
	}
	
	public void setdogSpace (int dogSpace) { //Mutator
		this.dogSpace = dogSpace;
	}
	
	public void setcatSpace (int catSpace) { //Mutator
		this.catSpace = catSpace;
	}

	public void setdaysStay (int daysStay) { //Mutator
		this.daysStay = daysStay;
	}
	
	public void setamountDue (double daysStay) { //Mutator
		this.amountDue = daysStay;
	}
	
	//Getter
	
	public String getpetType() { // Accessor
		return petType;
	}
	
	public String getpetName() { // Accessor
		return petName;
	}
	
	public int getpetAge() { // Accessor
		return petAge;
	}
	
	public int getdogSpace() { // Accessor
		return dogSpace;
	}
	
	public int getcatSpace() { // Accessor
		return catSpace;
	}
	
	public int getdaysStay() { // Accessor
		return daysStay;
	}
	
	public double getamountDue() { // Accessor
		return amountDue;
	}
	
	//Methods
	
	public void checkIn() {
	}
	
	public void checkOut() {
	}
	
	public void getPet() {
	}
	
	public void createPet() {
	}
	
	public void updatePet() {
	}
	
	public void printPet() {
		System.out.println("Pet's Type: " + petType);
		System.out.println("Pet's Name: " + petName);
		System.out.println("Pet's Age: " + petAge);
	}
	
}

	


