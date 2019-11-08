import java.util.Scanner;

public class GPAv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double noGrade = 0.0;
		double noGpa = 0.0;
		double noGradepoints = 0.0;
		double Totalgrade = 0.0; 
		
		int Credit = 0;
		
		String Courseinfo = null; 
		
		System.out.println("Enter the course info seperated by commas for the following:(Title, credit hours, and letter grade(followed by + or -) or Q for quit");
		
		while(in.hasNext()) { 
			
			Courseinfo = in.next();
			if(Courseinfo.equals("Q")) {
				break;
			}
			String [] data = Courseinfo.split(",");
			String info = data[0];
			int hours = Integer.parseInt(data[1]);
			String grade = data[2];
			
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
			else if (grade.equals("F") || grade.equals("WF")) {
				noGrade = 0;
				System.out.println("The numeric value is " + noGrade);
			}
			else if (grade.equals("P") || grade.equals("NP") || grade.equals("I")) {
				hours = 0;
			}
			else {
				System.out.println("Invaild Letter");
			}//else
			
			noGradepoints += (noGrade * hours);
			Credit += hours;
			Totalgrade += noGrade;
			noGpa = noGradepoints/Credit;
			System.out.println("\nEnter the course info seperated by commas for the following:(Title, credit hours, and letter grade(followed by + or -) or Q for quit");
		}//while
		
		System.out.println("Your GPA is: " + noGpa);

	}
	
}//class