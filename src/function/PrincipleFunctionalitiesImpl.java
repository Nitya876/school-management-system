package function;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Student;
import entity.Teacher;

public class PrincipleFunctionalitiesImpl implements PrincipleFunctionalities{

	static ArrayList<Student> studentList=new ArrayList<Student>();
	static ArrayList<Teacher> teacherList=new ArrayList<Teacher>();	
	
	@Override
	public void admission(Student student) {
		studentList.add(student);
	}

	@Override
	public void remove(int adNo) {
		for(int i=0;i<studentList.size();i++) {
			Student stud=studentList.get(i);
			if(stud.getAdmissionNo()==adNo) {
				studentList.remove(i);
				break;
			}
		}
	}

	@Override
	public void addTeacher(Teacher teacher) {
		teacherList.add(teacher);
		
	}

	@Override
	public void removeTeacher(int  id) {
			for (int i=0;i<teacherList.size();i++) {
				Teacher teach=teacherList.get(i);
				if (teach.getId()==id) {
					teacherList.remove(i);
					break;
				}
			}
	}

	@Override
	public void viewAllStudents() {
		for(Student student: studentList) {
			System.out.println("Student Name : "+student.getName());
			System.out.println("Student Age: "+student.getAge());
			System.out.println("Student Dept: "+student.getDepartment());
			System.out.println("Student ID:"+ student.getAdmissionNo());
			System.out.println("Student Address : "+student.getAddress());
			System.out.println("************************************************************");
		}
		
	}

	@Override
	public void viewAllTeachers() {
		for (Teacher teacher:teacherList) {
			System.out.println("Teacher Name: "+teacher.getName());
			System.out.println("Teacher Id: "+teacher.getId());
			System.out.println("Teacher Dept: "+teacher.getDepartment());
			System.out.println("*************************************************************");
		}
		
	}
	
	
	

}
