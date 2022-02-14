package Mod6;

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        do {
        	System.out.println("Enter wall height (feet): ");
        	wallHeight = scnr.nextDouble();
        } while (wallHeight <= 0);
        
        do {
        	System.out.println("Enter wall width (feet): ");
        	wallWidth = scnr.nextDouble();
        } while (wallWidth <= 0);
        

        // Calculate and output wall area
        	wallArea = wallHeight * wallWidth;
        	System.out.println("Wall area: "+ wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        	gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        	System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
         
    }
}
