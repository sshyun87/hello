package com.board.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.board.impl.BoardServiceImpl;
import com.board.model.Board;
import com.board.model.BoardCollection;
import com.board.model.BoardService;

public class BoardProc {
	Scanner sc = new Scanner(System.in);
//	Board[] boardAry = new Board[10];
	List<Board> boardAry = new ArrayList<>();
	
//	BoardService service = new BoardServiceImpl();
	BoardCollection service = new BoardCollectionImpl();
	private boolean menu;
	
	public void execute() {
		while (true) {
			System.out.println("메뉴선택하세요.");
			System.out.println("1.작성 2.단건조회 3.전체조회 4.변경 9.종료");
			try {
			int menu = sc.nextInt();
			}catch(Exception e) {
				System.out.println("정상적인 메뉴 선택 해주세요.");
				menu = sc.hasNextInt();
				sc.nextLine();
//				e.printStackTrace();
			}
//			sc.nextLine(); 
//			if (menu == 1) {
//				writeBoard();
//			} else if (menu == 2) {
//				getBoard();
//			} else if (menu == 3) {
//				getBoardList();
//			} else if (menu == 4) {
//				updateBoard();
//			} else if (menu == 9) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
		}
	}
	public void updateBoard() {
		System.out.println("변경할 글번호:");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.println("변경할 내용:");
		String content = sc.nextLine();
		Board board = new Board(boardNo, "", content, "");
		service.updateBoard(board, boardAry);
		
	}
	public void writeBoard() {
		System.out.println("글작성.");
		System.out.println("게시글번호입력:");
		int boardNo = sc.nextInt(); 
		sc.nextLine();
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		System.out.println("내용을 입력하세요.");
		String contents = sc.nextLine();
		System.out.println("작성자 입력하세요.");
		String writer = sc.nextLine();
		Board board = new Board(boardNo, title, contents, writer);
		service.writeBoard(board, boardAry);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] == null) {
//				boardAry[i] = board;
//				break;
//			}
//
//		}
	}

	public void getBoard() {
		System.out.println("한건조회.");
		System.out.println("조회할 번호를 입력: ");
		int boardNo = sc.nextInt();
		Board board = service.getBoard(boardNo, boardAry);
		System.out.println(board);
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry != null && boardAry[i].getBoardNo() == boardNo) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i].getContents());
//			}
//		}

	}

	public void getBoardList() {
		System.out.println("전체글조회.");
//		Board[] resultAry = service.getBoardList(boardAry);
		for (Board brd : resultAry) {
			System.out.println(brd);
		}
		
//		for (int i = 0; i < boardAry.length; i++) {
//			if (boardAry[i] != null) {
//				System.out.println(boardAry[i].getTitle() + "," + boardAry[i]);
//			}
//		}
	}
}
