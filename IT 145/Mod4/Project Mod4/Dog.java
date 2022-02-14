package Mod4;
public class Dog {

    // class variables
	private String type;
	private String breed;
	private String name;
	protected String topTrick;


    // constructor
	
	public Dog(String type, String breed, String name) {
	
	this.type = type;
	this.breed = breed;
	this.name = name;
	}

    // methods
	
	public void settopTrick(String Trick) {
		this.topTrick = Trick;
	}
	public String gettopTrick() {
		return topTrick;
	}

    // method used to print Dog information
    public String toString() {
        String temp = "\nDOG DATA\n" + name + " is a " + breed +
                ", a " + type + " dog. \nThe top trick is : " +
                topTrick + ".";
        return temp;
    }

}
