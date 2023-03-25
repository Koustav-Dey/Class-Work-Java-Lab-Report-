package com.hibernatepro.hibernate;

import com.hibernatepro.hibernate.dao.InstructorDao;
import com.hibernatepro.hibernate.entity.Course;
import com.hibernatepro.hibernate.entity.Instructor;

public class MainApp {
	public static void main(String[] args) {

		InstructorDao instructorDao = new InstructorDao();
		
		Instructor instructor = new Instructor("Ramen", "Barua", "ramen@gmail.com");
		instructorDao.saveInstructor(instructor);
		
		// create some courses
		Course tempCourse1 = new Course("Learn Spring Boot");
		instructor.getCourses().add(tempCourse1);
		
		Course tempCourse2 = new Course("Learn hibernate");
		instructor.getCourses().add(tempCourse2);
		
		instructorDao.saveInstructor(instructor);
	}
}
