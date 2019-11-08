import java.util.Scanner;

public class GPAv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double noGrade = 0; 
		
		System.out.println("Enter a letter grade (end a + or - if applicable) or enter Q to end the program"); 
		
		while (in.hasNext()) {
			String grade = in.next();
		if (grade.equals("Q")) {
			break;
		}
		if (grade.equals("A") || grade.equals("A+")) {
			noGrade = 4.0;
			System.out.println("The numeric value is " + noGrade);
		} 
		else if (grade.equals("A-")) {
			noGrade = 3.7; 
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("B+")) {
			noGrade = 3.3;
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("B")) {
			noGrade = 3.0;
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("B-")) { 
			noGrade = 2.7; 
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("C+")) { 
			noGrade = 2.3; 
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("C")) { 
			noGrade = 2.0; 
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("C-")) { 
			noGrade = 1.7;
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("D+")) {
			noGrade = 1.3;
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("D")) { 
			noGrade = 1.0;
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("D-")) { 
			noGrade = 0.7;
			System.out.println("The numeric value is " + noGrade);
		}
		else if (grade.equals("F")) {
			noGrade = 0;
			System.out.println("The numeric value is " + noGrade);
		}
		else {
			System.out.println("Invaild Letter");
		}//else
		
		System.out.println();
		System.out.println("Enter a letter grade (end a + or - if applicable) or enter Q to end the program"); 
		
	}//while
	
		
	}

}//class
