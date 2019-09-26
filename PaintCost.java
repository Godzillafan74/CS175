
class PaintCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*
			 * This program will calculate the cost to paint a house
			 */
				
			 int houseLengthFeet=40;
			 System.out.println("houseLengthFeet " + (houseLengthFeet));
			 
			 int houseWidthFeet=15; 
			 System.out.println("houseWidthFeet " + (houseWidthFeet));
			 
			 int houseHeightFeet=25;
			 System.out.println("houseHeightFeet " + (houseHeightFeet)); 
			 
			 int windowLengthFeet=4;
			 System.out.println("windowLengthFeet " + (windowLengthFeet)); 
			 
			 int windowWidthFeet=2;
			 System.out.println("windowWidthFeet " + (windowWidthFeet)); 
			 
			 int doorLengthFeet=6; 
			 System.out.println("doorLengthFeet " + (doorLengthFeet)); 
			 
			 int doorWidthFeet=3; 
			 System.out.println("doorWidthFeet " + (doorWidthFeet));
			 
			 int numberofwindows=10;  
			 double windowArea= numberofwindows*((windowLengthFeet)*(windowWidthFeet)); 
			 System.out.println("windowArea " + windowArea);
			 
			 int numberofdoors=2; 
			 double doorArea= numberofdoors*((doorLengthFeet)*(doorWidthFeet));
			 System.out.println("doorArea " + doorArea);
			 
			 double x = (((houseLengthFeet)*(houseWidthFeet)))*2; 
			 System.out.println("Area of house " + (x));
			 
			 double y = ((x/2)+.5*(houseLengthFeet)*((houseHeightFeet)-(houseWidthFeet)))*2; 
			 System.out.println("Area of the peak side " + (y));
			 
			 double z = (x+y)-((windowArea)+(doorArea));
			 System.out.println("Square foot to paint " + (z));
			 
			 
			 
			 System.out.println("The cost to paint this house is $" + (z*5)); 
			 
				 
			 
			 }

		}
