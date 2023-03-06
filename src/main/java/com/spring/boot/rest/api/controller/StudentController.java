package com.spring.boot.rest.api.controller;
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;  
import com.spring.boot.rest.api.model.Students;  
import com.spring.boot.rest.api.service.StudentService;  

@RestController  
public class StudentController 
{
	
	@Autowired  
	StudentService studentService;  
	 
	@GetMapping("/student")  
	private List<Students> getAllStudents()   
	{  
		return studentService.getAllStudents();  
	}  
	@GetMapping("/student/{id}")  
	private Students getStudent(@PathVariable("id") int id)   
	{  
		return studentService.getStudentById(id);  
	}  
	@DeleteMapping("/student/{id}")  
	private void deleteStudent(@PathVariable("id") int id)   
	{  
		studentService.delete(id);  
	}  
	@PostMapping("/student")  
	private int saveStudent(@RequestBody Students student)   
	{  
		studentService.saveOrUpdate(student);  
		return student.getId();  
	}    
	@PutMapping("/student")  
	private Students update(@RequestBody Students student)   
	{  
		studentService.saveOrUpdate(student);  
		return student;  
	}  
	}  
