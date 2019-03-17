package com.student.examination;

import java.util.List;

public interface ExamService {
	
   ExaminationVO getAllExamDetailsBySubjectId(long id);
   List<ExaminationVO> getAllBySubName(String subjectName);
}
