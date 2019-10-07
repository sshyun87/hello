package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardServiceImpl;
import com.board.impl.EmployeeServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;
import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	List<Board> boardAry = new ArrayList<>();

	EmployeeService service = new EmployeeServiceImpl();

	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 9.종료");
			int menu = 0;
			try {
				menu = sc.nextInt();
			} catch (Exception e) {
				System.out.println("정상적인 메뉴 선택 해주세요.");
				menu = sc.nextInt();
				sc.nextLine();
//				e.printStackTrace();
			}
			sc.nextLine();
			if (menu == 1) {
				writeBoard();
			} else if (menu == 2) {
				getBoard();
			} else if (menu == 3) {
				getBoardList();
			} else if (menu == 4) {
				updateBoard();
			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 내용:");
		String content = sc.nextLine();
		Board board = new Board(boardNo, "", content, "");
//		service.updateBoard(board, boardAry);

	}

	public void writeBoard() {
		System.out.println("직원 등록.");
		System.out.println("직원 번호 입력:");
		int empId = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요.");
		String firstName = sc.nextLine();
		System.out.println("성을 입력하세요.");
		String lastName = sc.nextLine();
		System.out.println("email을 입력하세요.");
		String email = sc.nextLine();
		System.out.println("입사일을 입력하세요.");
		String hireDate = sc.nextLine();
		System.out.println("급여를 입력하세요");
		int salary = sc.nextInt();sc.nextLine();
		System.out.println("JobId를 입력하세요.");
		String jobId = sc.nextLine();
		//입력 받은 값을 emp 인스턴스에 담는다.
		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setFirstName(firstName);
		emp.setLastName(lastName);
		emp.setEmail(email);
		emp.setHireDate(hireDate); //2010/10/05
		emp.setSalary(salary);
		emp.setJobId(jobId);
		service.insertEmployee(emp);
	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력: ");
		int boardNo = sc.nextInt();
//		Board board = service.getBoard(boardNo, boardAry);
//		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}

	}

	public void getBoardList() {
		System.out.println("전체글조회.");
		List<Employee> employees = service.getEmpList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}

//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i]);
//			}
//		}
	}
}
