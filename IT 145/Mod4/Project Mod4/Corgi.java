package Mod4;
public class Corgi extends Dog {

    // additional class variables
	
	int weight;
	int age;


    // constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        this.weight = pounds;
        this.age = years;
    }

    // mutator methods

    public void setweight(int pounds) {
    	this.weight = pounds;
    }
    
    public int getweight() {
    	return weight;
    }
    
    public void setage(int years) {
    	this.age = years;
    }
    
    public int getage() {
    	return age;
    }
    
    // override toString() method to include additional dog information
    @Override
    public String toString() {
        return (super.toString() + "\nThe Corgi is " + age +
                " years old and weighs " + weight + " pounds.");
    }

}
