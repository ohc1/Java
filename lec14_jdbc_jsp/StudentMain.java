package lec14_jdbc_jsp;

import java.util.ArrayList;

import lec14_jdbc_jsp.model.Student;
import lec14_jdbc_jsp.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		StudentService service = StudentService.getInstance();
		
		// 학생 목록 조회
		ArrayList<Student> stuList = service.stuList();
		
		for(Student st : stuList) {
			System.out.println(st.toString());
		}
		
		// 학생추가
		Student wontae = new Student();
		wontae.setStuName("원태");
		wontae.setStuScore(700);
		
		int result = service.insertStu(wontae);
		
		if(result > 0) {
			System.out.println("등록 성공");
			stuList = service.stuList();
			for(Student st : stuList) {
				System.out.println(st.toString());
			}
		}
		
		
		
		
	}	// main 종료

}