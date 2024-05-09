package function;

import entity.Student;
import entity.Teacher;

public interface PrincipleFunctionalities {
	void admission(Student student);
	void remove(int adNo);
	void addTeacher(Teacher teacher);
	void removeTeacher(int id);	
	void viewAllStudents();
	void viewAllTeachers();
}
