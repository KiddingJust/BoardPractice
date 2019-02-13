package org.kidding.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kidding.dao.BoardDAO;
import org.kidding.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MybatisTest {

	@Autowired
	private BoardDAO dao;
	
	@Test
	public void daoTest() {
		List<BoardVO> vo = dao.getList();
		
		log.info("vo를 출력합니다. >>>>>> " + vo);
	}
	
	@Test
	public void insertTest() {
		
		BoardVO vo = new BoardVO();
		
		vo.setTitle("제목2");
		vo.setContent("내용2");
		vo.setWriter("작성자2");
		
		dao.insertList(vo);
		
	}
}
