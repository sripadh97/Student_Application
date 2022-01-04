package com.students.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.students.model.Student;
import com.students.repository.StudentRepository;

//import com.student.repository.StudentRepository;
//business logic
@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;
	//getting all students details
	public List<Student> getAllStudent() {
		List<Student> student = new ArrayList<Student>();
		studentRepository.findAll().forEach(student1->student.add(student1));
		return student;
	}
	//getting a specific student detail by findById() of Crud Repository
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	//saving a specific student details by save() method of Crud repository
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}
	//deleting a specific record by deleteById() Crud Repository
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	//updating a record
	public void update(Student student, int id) {
		System.out.println(id);
		System.out.println(studentRepository.findAll());
		Optional<Student> students = studentRepository.findById(id);
		if(students.isPresent()) {
			Student studentFromdb = students.get();
			studentFromdb.setEmailId(student.getEmailId());
			studentFromdb.setFirstName(student.getFirstName());
			studentFromdb.setLastName(student.getLastName());
			studentRepository.save(studentFromdb);
			
		}
		
		
	}
}
