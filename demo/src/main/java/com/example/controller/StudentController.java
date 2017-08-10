package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    
    public List <Student> getStudent() {
    	return studentService.getAllStudent();
	
    }
    	@RequestMapping(value = "/student", method = RequestMethod.POST)
    
    public Student save(Student e){
    	return studentService.save(e);
    }
    

    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
    public Student getStudent(@PathVariable("id") long id) {
		return studentService.getStudentById(id);
	}
}


