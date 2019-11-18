package com.student.examination;

import java.net.HttpURLConnection;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;

@RestController
@Api(value="students" , tags="students")
@SwaggerDefinition(consumes={"application/json"}, produces={"application/json"}, schemes={SwaggerDefinition.Scheme.HTTPS})
public class StudentController {

	@Autowired
	private StudentService studentService;
	
 	@GetMapping("/studentAll")
	@ApiOperation(value="Get List of students", notes="This method return list of students from db")
	@ApiResponses(value={@ApiResponse( code =HttpURLConnection.HTTP_OK, response=ResponseVO.class,message = "Successful"),
			@ApiResponse( code = HttpURLConnection.HTTP_BAD_REQUEST, message = "Generc business exception"),
			@ApiResponse( code = HttpURLConnection.HTTP_INTERNAL_ERROR, message = "entity of values not found"),
			@ApiResponse( code = HttpURLConnection.HTTP_GATEWAY_TIMEOUT, message = "slow connection"),
	})
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

	@GetMapping("/student/{name}")
	public StudentVO retrieveByName(@PathVariable String name) {
		return studentService.getStudentByname(name);
		
	}
	
}
