package com.hibernate_jpa_crud.cruddemo;

import com.hibernate_jpa_crud.cruddemo.dao.StudentDao;
import com.hibernate_jpa_crud.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao) {
		return args -> {
			createStudent(studentDao);
		};
	}

	private void createStudent(StudentDao studentDao) {

		//create the student object
		System.out.println("creating the student");
		Student tempStudent = new Student("Sarmad", "Rehman", "sarmadr02@gmail.com");
		//saved the object
		System.out.println("Saving the student");
		studentDao.save(tempStudent);
		//displayed the id of the student saved
		System.out.println("The id of " + tempStudent.getFirstname() + "is" + tempStudent.getId());
	}
}
