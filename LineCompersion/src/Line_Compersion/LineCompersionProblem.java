package Line_Compersion;

import java.util.Scanner;

public class LineCompersionProblem {
	
	public static void main(String[] args){
		// get value from user
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
	        int Length =(int) (Math.sqrt((coordinate_x2-coordinate_x1)^2+(coordinate_y2-coordinate_y1)^2));
	        System.out.println("Length of a line: "+Length);
		}
}
