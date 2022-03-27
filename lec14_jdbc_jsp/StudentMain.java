package lec14_jdbc_jsp;

import java.util.ArrayList;

import lec14_jdbc_jsp.model.Student;
import lec14_jdbc_jsp.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		StudentService service = StudentService.getInstance();
		
		// �л� ��� ��ȸ
		ArrayList<Student> stuList = service.stuList();
		
		for(Student st : stuList) {
			System.out.println(st.toString());
		}
		
		// �л��߰�
		Student wontae = new Student();
		wontae.setStuName("����");
		wontae.setStuScore(700);
		
		int result = service.insertStu(wontae);
		
		if(result > 0) {
			System.out.println("��� ����");
			stuList = service.stuList();
			for(Student st : stuList) {
				System.out.println(st.toString());
			}
		}
		
		
		
		
	}	// main ����

}