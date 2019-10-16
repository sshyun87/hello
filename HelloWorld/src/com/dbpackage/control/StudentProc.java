package com.dbpackage.control;

import java.util.List;
import java.util.Scanner;

import com.dbpackage.impl.StudentServiceImpl;
import com.dbpackage.model.Student;
import com.dbpackage.model.StudentService;

public class StudentProc {
	Scanner sc = new Scanner(System.in);
	StudentService service = new StudentServiceImpl();
	
	public void execute() {
		while (true) {
			int menu = 0;
			System.out.println("1.입력 2.전체조회 3.한건조회 9.종료");
			menu = sc.nextInt();
			sc.nextLine();
			if(menu == 1) {
				createStudent();
			}else if(menu==2) {
				searchList();
			}else if(menu==3) {
				searchStudent();
			}
		}
	}
	public void createStudent() {
		System.out.println(("학생번호 입력:"));
		int sNo = sc.nextInt();sc.nextLine();
		System.out.println("학생이름 입력:");
		String sName = sc.nextLine();
		System.out.println("전공 입력:");
		String sMajor = sc.nextLine();
		Student student = new Student(sNo, sName, sMajor);
		service.insertStudent(student);
	}
	public void searchList() {
		System.out.println("학생목록");
		List<Student> list = service.getStudentList();
		for(Student stu : list) {
			
		}
	}
	public void searchStudent() {
		System.out.println("조회할 학생 입력:");
		String sName = sc.nextLine();
		System.out.println("");
		 
	}
}
