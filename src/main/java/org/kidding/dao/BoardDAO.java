package org.kidding.dao;

import java.util.List;

import org.kidding.domain.BoardVO;


public interface BoardDAO {

	public List<BoardVO> getList();
	
	public void insertList(BoardVO vo);
	
}
