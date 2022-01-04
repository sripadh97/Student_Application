package com.students.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.students.model.Student;
import com.students.service.StudentService;
//marking class as Controller

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v3")
public class StudentController {
	//Autowire the Student Service Class
	@Autowired
	StudentService studentService;
	//creating a get mapping that retrieves all the student details from the database
	@GetMapping("/students")
	private List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	//create a get mapping that retrieves specific student detail
	@GetMapping("/students/{id}")
	private Student getStudent(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	//create a delete mapping that deletes specific student details
	@DeleteMapping("/students/{id}")
	private void deleteStudent(@PathVariable int id) {
		studentService.delete(id);
	}
	//create a post mapping that post the student detail in the database
	@PostMapping("/students")
	private int saveStudent(@RequestBody Student student) {
		studentService.saveOrUpdate(student);
		return student.getId();
	}
	//create put mapping that updates the student detail
	@PutMapping("/students/{id}")
	private Student update(@RequestBody Student student, @PathVariable int id) {
		studentService.update(student, id);
		return student;
	}
}
