package grading_system;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		student st = new student();
		
		int numberofSubjects = 7;
		int totalMarks = 0;
		
		System.out.println("Enter name: ");
		st.name = s.nextLine();
		
		System.out.println("Enter ID: ");
		st.id = s.nextInt();
		
		System.out.println("Enter age: ");
		st.age = s.nextInt();
		
		for (int i = 1; i < numberofSubjects; i++) {
			System.out.println("Enter mark for Subjects " + i + ": ");
			int marks = s.nextInt();
			
			//STEP 2 COMPUTE TOTAL:
			
			totalMarks += marks;
		}
		
		//STEP 3 COMPUTE AVERAGE: 
		
		double averageMarks = (double) totalMarks / numberofSubjects;
		
		//STEP 4 DISPLAY RESULT:
		
		System.out.println("Name: " + st.name);
		System.out.println("ID: " + st.id);
		System.out.print("Total Marks: " + totalMarks);
		System.out.println("Average Marks: " + averageMarks);
		
		s.close();
		
		
		
	}

}
