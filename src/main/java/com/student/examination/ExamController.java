package com.student.examination;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/exam")
public class ExamController {

	@Autowired
	private ExamService examService;
	
	@GetMapping("/getAllExam/{id}")
	public @ResponseBody ResponseVO
	retrieveAllExamDetailsById(@PathVariable long id){
		
		ExaminationVO e= examService.getAllExamDetailsBySubjectId(id);
		//List<ResponseVO> responseList=new ArrayList<>();
		ResponseVO responseVO=new ResponseVO();
		
			System.out.println(e.getSubject()+ "Subject Id:"+e.getSubjectId());
			responseVO.setStudentId(e.getStudentvo().getStudentId());
			responseVO.setSubject(e.getSubject());
			responseVO.setName(e.getStudentvo().getFirstName()+" "+e.getStudentvo().getLastName());
			responseVO.setMark(e.getScore());
			if(e.getScore()>e.getPassMark())  {
				responseVO.setComment("Score "+" "+e.getScore()+"out of"+" "+ e.getFullmark()+" || "+"PASS");
			}
		return responseVO;
	}
	@GetMapping("getAllExamBySub/{subjectName}")
	public List<ExaminationVO> getAllBySubjectName(@PathVariable String subjectName){
		List<ExaminationVO> examList=examService.getAllBySubName(subjectName);
		return examList;
		
	}
	
	
}
