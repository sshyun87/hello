package com.board.model;

public interface BoardCollection {
	public void writeBoard(Board board, Board[] boards);//글작성.
	public Board getBoard(int boardNo, Board[] boards);//한건조회.
	public Board [] getBoardList(Board[] boards);//전체리스트.
	public interface Board [] delBoard
	//변경하기.
	public void updateBoard(Board board, Board[] boards);
	//삭제하기.
	public void deleteBoard(int boardNo, Board[] boards);

}
	public void updateBoard(com.board.model.Board board, com.board.model.Board[] boardAry);
