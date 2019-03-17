package com.student.examination;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/studentAll")
	public List<StudentVO> getAllStudent(){
			
		return studentService.retrieveAll();
	}
	
	@GetMapping("/student/{id}")
	public StudentVO retrieveById(@PathVariable int id) {
		return studentService.getStudentById(id);
		
	}
	
	@PostMapping("/addStudent")
	public ResponseEntity addStudent(@RequestBody StudentVO studentVO) {
		
		studentService.addStudent(studentVO);
		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(studentVO.getStudentId()).toUri();
		return	ResponseEntity.created(location).build();				
	}

	
	
}
