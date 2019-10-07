package com.board.impl;

import java.util.List;

import com.board.model.Board;
import com.board.model.BoardService;

public class BoardCollectionImpl implements BoardService {
	@Override
	public void writeBoard(Board board, List<Board> boards) {
		boards.add(board);
//		
//		for (int i = 0; i < boards.length; i++) {
//			if (boards[i] == null) {
//				boards[i] = board;
//				break;
			}
		}

	}

	@Override
	public Board getBoard(int boardNo, List<Board> boards) {
		Board boardTemp = null;
		for (Board board:boards) {
			if (boards.getBoardNo() == boardNo) {
				boardTemp = board;

			}
		}
		return boardTemp;
	}

	@Override
	public List<Board> getBoardList(List<Board> boards) {
		List<Board> listTemp = new ArrayList<>();
		for (Board board : boards) {
			listTemp.add(board); 
		}
		return listTemp;
	}
	@Override
	public void updateBoard(Board board, List<Board> boards) {
		for(Board boardTemp : boards) {
			if (board.getBoardNo() == boardTemp.getBoardNo()) {
				board[i].setContents(board.getContents());
				
		}
	}
	
		
	
		}

	@Override
	public void writeBoard(Board board, Board[] boards) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Board[] getBoardList(Board[] boards) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBoard(com.board.model.Board board, com.board.model.Board[] boardAry) {
		// TODO Auto-generated method stub
		
	}
	}
}
