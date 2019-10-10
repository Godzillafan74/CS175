import java.util.*;
public class CarCostCalculation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner L=new Scanner(System.in);
		
		String stickerHybrid = "Make:Toyota,Model:Prius,Cost:31000,MPG:30";
		String stickerRegular= "Make:Toyota,Model:Corolla,Cost:28000,MPG:20";
		String [] stuff = stickerHybrid.split(",");
		System.out.println(stuff[0]);
		String [] Make = stuff[0].split(":");
		String makeregular = stuff[0];
		System.out.println(stuff[1]);
		String [] Model = stuff[1].split(":");
		System.out.println(stuff[2]);
		String [] Cost = stuff[2].split(":");
		System.out.println(stuff[3]);
		String [] MPG = stuff[3].split(":");
		
		
		
		String [] stuff1 = stickerRegular.split(",");
		System.out.println(stuff1[0]);
		String [] Make1 = stuff1[0].split(":");
		System.out.println(stuff1[1]);
		String [] Model1 = stuff1[1].split(":");
		System.out.println(stuff1[2]);
		String [] Cost1 = stuff1[2].split(":");
		System.out.println(stuff1[3]);
		String [] MPG1 = stuff1[3].split(":");
		
		System.out.println("Put in the miles travelled in one year"); 
		double milesperyear=L.nextDouble();
		System.out.println("miles per year: " + (milesperyear + "\n"));
		 
		System.out.println("Put in the cost per gallon of gas"); 
		double costgas=L.nextDouble();
		System.out.println("cost per gallon of gas: $" + (costgas + "\n"));
		
		double costafteryearregular=(Integer.parseInt(Cost)+(milesperyear/Integer.parseInt(MPG)*costgas));
		
	}

}
