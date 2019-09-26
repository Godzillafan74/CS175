import java.util.*;
class PaintCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * This program will calculate the cost to paint a house
			 */
				
			Scanner L=new Scanner(System.in);
			
			 System.out.println("Put in the house length");
		
			 int houseLengthFeet=L.nextInt();
			 System.out.println("houseLengthFeet " + (houseLengthFeet + "\n"));
			 
			 System.out.println("Put in the house width");
			 int houseWidthFeet=L.nextInt(); 
			 System.out.println("houseWidthFeet " + (houseWidthFeet + "\n"));
			 
			 System.out.println("Put in the house height");
			 int houseHeightFeet=L.nextInt();
			 System.out.println("houseHeightFeet " + (houseHeightFeet + "\n")); 
			 
			 System.out.println("Put in the window length");
			 int windowLengthFeet=L.nextInt();
			 System.out.println("windowLengthFeet " + (windowLengthFeet + "\n")); 
			 
			 System.out.println("Put in the window width");
			 int windowWidthFeet=L.nextInt();
			 System.out.println("windowWidthFeet " + (windowWidthFeet + "\n")); 
			 
			 System.out.println("Put in the door length");
			 int doorLengthFeet=L.nextInt(); 
			 System.out.println("doorLengthFeet " + (doorLengthFeet + "\n")); 
			 
			 System.out.println("Put in the door width");
			 int doorWidthFeet=L.nextInt(); 
			 System.out.println("doorWidthFeet " + (doorWidthFeet + "\n"));
			 
			 System.out.println("Put in the number of windows");
			 int numberofwindows=L.nextInt();  
			 double windowArea= numberofwindows*((windowLengthFeet)*(windowWidthFeet)); 
			 System.out.println("windowArea " + windowArea + "\n");
			 
			 System.out.println("Put in the number of doors");
			 int numberofdoors=L.nextInt(); 
			 double doorArea= numberofdoors*((doorLengthFeet)*(doorWidthFeet));
			 System.out.println("doorArea " + doorArea + "\n");
			 
			 double x = (((houseLengthFeet)*(houseWidthFeet)))*2; 
			 System.out.println("Area of house " + (x));
			 
			 double y = ((x/2)+.5*(houseLengthFeet)*((houseHeightFeet)-(houseWidthFeet)))*2; 
			 System.out.println("Area of the peak side " + (y));
			 
			 double z = (x+y)-((windowArea)+(doorArea));
			 System.out.println("Square foot to paint " + (z));
			 
			 
			 
			 System.out.println("The cost to paint this house is $" + (z*5)); 
			 
				 
			 
			 }

		}
