package demo.mockitotesting1;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		
		        UserRepository userRepository = new UserInterfaceImplement(); 
		        App app = new App(userRepository);

		        Student newStudent = new Student("1", "John Doe", 20, "john@example.com");
		        app.addUser(newStudent);

		        Student retrievedStudent = app.getUserById("1");
		        if (retrievedStudent != null) {
		            System.out.println(retrievedStudent.displayInfo());
		        }

		        List<Student> allStudents = app.getAllUsers();
		        for (Student student : allStudents) {
		            System.out.println(student.displayInfo());
		        }
		    }
		

	}


