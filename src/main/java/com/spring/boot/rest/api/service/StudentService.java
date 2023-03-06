package com.spring.boot.rest.api.service;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.spring.boot.rest.api.model.Students;
import com.spring.boot.rest.api.repository.StudentRepository;  

@Service  
public class StudentService 
{
	@Autowired  
	StudentRepository studentRepository;  
	
	public List<Students> getAllStudents()   
	{  
		List<Students> students = new ArrayList<Students>();  
		studentRepository.findAll().forEach(students1 -> students.add(students1));  
		return students;  
	}  
	public Students getStudentById(int id)   
	{  
		return studentRepository.findById(id).get();  
	}  
	public void saveOrUpdate(Students student)   
	{  
		studentRepository.save(student);  
	}  
	public void delete(int id)   
	{  
		studentRepository.deleteById(id);  
	}  
	public void update(Students student, int studentid)   
	{  
		studentRepository.save(student);  
	} 	
}  
