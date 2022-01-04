package com.students;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
// import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.students.model.Student;
import com.students.repository.StudentRepository;
import com.students.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentApplicationTests {
	
	@Autowired
	private StudentService service;
	
	@MockBean
	private StudentRepository repository;
	/*
	 * @Test public void getStudentsTest() {
	 * when(repository.findAll()).thenReturn(Stream.of(new Student("Kausthub",
	 * "Adidam", "avs@gmail.com")).collect(Collectors.toList())); assertEquals(1,
	 * service.getAllStudent().size()); }
	 * 
	 * @Test public void deleteStudentTest() { Student student = new
	 * Student("Kausthub","Adidam", "avs@gmail.com"); service.delete(0);
	 * verify(repository, times(0)).delete(student); }
	 * 
	 * @Test public void getStudentByLastNameTest() {
	 * when(repository.findAll()).thenReturn(Stream.of(new Student("Kausthub",
	 * "Adidam", "k@gmail.com")).collect(Collectors.toList())); assertEquals(1,
	 * service.getAllStudent().size()); }
	 */
	
	/*
	 * @Test public void updateStudentTest() { Student student =
	 * repository.findById(1).get(); student.setEmailId("k.a@gmail.com"); Student
	 * studentUpdated = repository.save(student);
	 * Assertions.assertThat(studentUpdated.getEmailId()).isEqualTo("k.a@gmail.com")
	 * ; }
	 */
	/*
	 * @Test public void getStudentByFirstNameTest() {
	 * when(repository.findAll()).thenReturn(Stream.of(new Student("Kausthub",
	 * "Adidam", "k@gmail.com")).collect(Collectors.toList())); assertEquals(1,
	 * service.getAllStudent().size()); }
	 */
	
	
	/*@Test
	public void saveStudentTest() {
		Student student = new Student("Kausthub", "Adidam", "something");
		when(repository.save(student)).thenReturn(student);
		assertEquals(student, service.saveOrUpdate(student));
	}*/
	
	/*@Test
	void contextLoads() {
	}*/
	@Autowired
	StudentRepository studrepo;
	
	/*@Test
	public void testCreate() {
		Student s = new Student();
		s.setId(1);
		s.setFirstName("Kausthub");
		s.setLastName("Adidam");
		s.setEmailId("adidam.kausthub@gmail.com");
		studrepo.save(s);
		assertNotNull(studrepo.findById(1).get());
	}
	@Test
	public void testReadAll() {
		List<Student> list = studrepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	@Test
	public void testSingleStudent() {
		Student student  = studrepo.findById(1).get();
		assertEquals(1, student.getId());
	}*/
	/*@Test
	public void testUpdate() {
		Student s = studrepo.findById(1).get();
		s.setLastName("Adidam");
		((StudentService) studrepo).saveOrUpdate(s);
		assertNotEquals("Adidam", studrepo.findById(1).get().getLastName());
	}*/
	/*@Test
	public void testDelete() {
		studrepo.deleteById(1);
		assertThat(studrepo.existsById(1)).isFalse();
	}*/
}
