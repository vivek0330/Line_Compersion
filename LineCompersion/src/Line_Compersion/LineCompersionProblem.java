package Line_Compersion;

import java.util.Scanner;

public class LineCompersionProblem {
	
	public static void main(String[] args){
		// Coordinates of line 1
	   	Scanner myObj = new Scanner(System.in);
	      	System.out.println(" Welcome to Line Compersion Computation ");
	      	System.out.println("Enter x1, y1, x2, y2:  ");
	        int coordinate_x1 = myObj.nextInt();
	        int coordinate_y1 = myObj.nextInt();
	        int coordinate_x2 = myObj.nextInt();
	        int coordinate_y2 = myObj.nextInt();
	        System.out.println("enter coordinate_x1: "+ coordinate_x1);
	        System.out.println("enter coordinate_y1: "+ coordinate_y1);
	        System.out.println("enter coordinate_x2: "+ coordinate_x2);
	        System.out.println("enter coordinate_y2: "+ coordinate_y2);
	        int Length1 =(int) (Math.sqrt((coordinate_x2-coordinate_x1)^2+(coordinate_y2-coordinate_y1)^2));
	        System.out.println("Length of a line: "+Length1);
	        
	     // Coordinated of line 2
	     Scanner myObj2 = new Scanner(System.in);
	      	System.out.println(" Welcome to Line Compersion Computation ");
	      	System.out.println("Enter x1, y1, x2, y2:  ");
	        int coordinate_a1 = myObj2.nextInt();
	        int coordinate_b1 = myObj2.nextInt();
	        int coordinate_a2 = myObj2.nextInt();
	        int coordinate_b2 = myObj2.nextInt();
	        System.out.println("enter coordinate_a1: "+ coordinate_a1);
	        System.out.println("enter coordinate_b1: "+ coordinate_b1);
	        System.out.println("enter coordinate_a2: "+ coordinate_a2);
	        System.out.println("enter coordinate_b2: "+ coordinate_b2);
	        int Length2 =(int) (Math.sqrt((coordinate_a2-coordinate_a1)^2+(coordinate_b2-coordinate_b1)^2));
	        System.out.println("Length of a line: "+Length2);
	        
	        	if (Length1 == Length2) {
	        		System.out.println("length is same");	
				}
	        	else if (Length1 > Length2) {
	        		System.out.println("Length1 is greater then Length2");
	        	}
	        	else {
	        		System.out.println("Length2 is greater then Length1");
	        	}
	        	
		}
}
