package org.kidding.dao;

import java.util.List;

import org.kidding.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	private BoardDAO dao;
	
	@Override
	public List<BoardVO> getList() {
		
		List<BoardVO> vo = dao.getList();
		
		return vo;
	}

	@Override
	public void insertList(BoardVO vo) {

		dao.insertList(vo);
		
	}

}
