package function;

//import java.util.InputMismatchException;
import java.util.Scanner;

import entity.Student;
import entity.Teacher;

public class MainClass {
	public static void main(String[] args) {
		
		PrincipleFunctionalities pf=new PrincipleFunctionalitiesImpl();
		Scanner scan=new Scanner(System.in);
		
	int operation=0;
	  while (true) {
		System.out.println("1. Add Student");
		System.out.println("2. Add Teacher");
		System.out.println("3. Remove Student");
		System.out.println("4. Remove Teacher");
		System.out.println("5. View All Students");
		System.out.println("6. View All Teachers");
		System.out.println("7. Exit");
		System.out.println("Select Option to perform: ");
		operation=scan.nextInt();
//		   try {
//               operation = scan.nextInt(); // Attempts to get an integer input
//               scan.nextLine(); // Consumes any leftover newline character

		switch (operation) {
		case 1: {
			Student stud=new Student();
			
			System.out.println("Enter Student Details: ");
			System.out.println("Enter Student Name: ");
			scan.nextLine();;
			stud.setName(scan.nextLine());
			System.out.println("Enter Student Admission Number:");
			stud.setAdmissionNo(scan.nextInt());
			System.out.println("Enter Student Age: ");
			stud.setAge(scan.nextInt());
			System.out.println("Enter Student Address:");
			scan.nextLine();
			stud.setAddress(scan.nextLine());
			System.out.println("Enter Student Department:");
			stud.setDepartment(scan.nextLine());
			pf.admission(stud);
			System.out.println("Admission Success");
			
			
			//System.out.println(stud.getName());;
			break;
		}
case 2: {
	Teacher teach=new Teacher();
	
	System.out.println("Enter Teacher Details:");
	System.out.println("Enter Teacher Name:");
	scan.nextLine();
	teach.setName(scan.nextLine());
	System.out.println("Enter Teacher Id:");
	teach.setId(scan.nextInt());
	System.out.println("Enter Teacher Department:");
	scan.nextLine();	
	teach.setDepartment(scan.nextLine());
	pf.addTeacher(teach);
	System.out.println("Teacher added successfully");
			break;
		}
case 3: {
	
	System.out.println("Enter Student Admission Number:");
	int adNo=scan.nextInt();
	pf.remove(adNo);
	System.out.println("Student removed successfully.");
	
	break;
}
case 4: {

	System.out.println("Enter Teacher Id:");
	int id=scan.nextInt();
	pf.removeTeacher(id);
	System.out.println("Teacher removed successfuly.");
	break;
}
case 5: {
    pf.viewAllStudents();
    break;
}
case 6:{
	pf.viewAllTeachers();
	break;
}
case 7: {
    System.out.println("Exiting...");
    scan.close();
    System.exit(0);
    break;
}
		default:
			System.out.println("Please select valid option.");
		}
//		    } catch (InputMismatchException e) {
//               System.out.println("Invalid input. Please enter a number between 1 and 7.");
//               scan.nextLine(); // Clear the invalid input
//           }
	}
	  }
	
}
