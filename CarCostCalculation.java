import java.util.*;
class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner L=new Scanner(System.in);
		
		 System.out.println("Put in the cost of the regular car"); 
		 double costregularcar=L.nextDouble();
		 System.out.println("cost of regular car: $" + (costregularcar + "\n"));
		 
		 System.out.println("Put in the miles per gallon of regular car"); 
		 double milesregularcar=L.nextDouble();
		 System.out.println("miles of regular car: " + (milesregularcar + "\n"));
		 
		 System.out.println("Put in the cost of the hybrid car"); 
		 double costhybridcar=L.nextDouble();
		 System.out.println("cost of hybrid car: $" + (costhybridcar + "\n"));
		 
		 System.out.println("Put in the miles per gallon of the hybrid car"); 
		 double mileshybridcar=L.nextDouble();
		 System.out.println("miles  for hybrid car: " + (mileshybridcar + "\n"));
		 
		 System.out.println("Put in the miles travelled in one year"); 
		 double milesperyear=L.nextDouble();
		 System.out.println("miles per year: " + (milesperyear + "\n"));
		 
		 System.out.println("Put in the cost per gallon of gas"); 
		 double costgas=L.nextDouble();
		 System.out.println("cost per gallon of gas: $" + (costgas + "\n"));
		 
		 double costafteryearregular=(costregularcar+(milesperyear/milesregularcar*costgas));
		 double costafteryearhybrid=(costhybridcar+(milesperyear/mileshybridcar*costgas));
		 System.out.println("Cost to own a regular car after year 1: " + costafteryearregular + " for hybrid car: " + costafteryearhybrid);
		 
		 double costafteryear2regular=(costregularcar+(milesperyear*2/milesregularcar*costgas));
		 double costafteryear2hybrid=(costhybridcar+(milesperyear*2/mileshybridcar*costgas));
		 System.out.println("Cost to own a regular car after year 2: " + costafteryear2regular + " for hybrid car: " + costafteryear2hybrid);
		 
		 double costafteryear3regular=(costregularcar+(milesperyear*3/milesregularcar*costgas));
		 double costafteryear3hybrid=(costhybridcar+(milesperyear*3/mileshybridcar*costgas));
		 System.out.println("Cost to own a regular car after year 3: " + costafteryear3regular + " for hybrid car: " + costafteryear3hybrid);
		 
		 double costafteryear4regular=(costregularcar+(milesperyear*4/milesregularcar*costgas));
		 double costafteryear4hybrid=(costhybridcar+(milesperyear*4/mileshybridcar*costgas));
		 System.out.println("Cost to own a regular car after year 4: " + costafteryear4regular + " for hybrid car: " + costafteryear4hybrid);
		 
		 double costafteryear5regular=(costregularcar+(milesperyear*5/milesregularcar*costgas));
		 double costafteryear5hybrid=(costhybridcar+(milesperyear*5/mileshybridcar*costgas));
		 System.out.println("Cost to own a regular car after year 5: " + costafteryear5regular + " for hybrid car: " + costafteryear5hybrid);
		 
		 if (costafteryear5regular > costafteryear5hybrid) {
			 System.out.println("The hybrid car pays back after 5 years");
		 }
		 }
		}
