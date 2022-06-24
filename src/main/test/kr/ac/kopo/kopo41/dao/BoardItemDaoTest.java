package kr.ac.kopo.kopo41.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.extensions.TestSetup;
import kr.ac.kopo.kopo41.domain.BoardItem;

class BoardItemDaoTest {
	private BoardItemDao boardItemDao = new BoardItemDaoImpl();
	private BoardItem boardItem1;
	private BoardItem boardItem2;
	
	
	
	@BeforeEach
	void setUp() throws Exception{
		
//		boardItem1 = new BoardItem();
//		boardItem1.setTitle("title339");
//		boardItemDao.create(boardItem1);
		
	}
	
	@AfterEach
	void tearDown() throws Exception{
		
	}
//	@Test
//	void deleteAll() throws ClassNotFoundException, SQLException {
//		boardItemDao.deleteAll();
//		
//	}

//	@Test
//	void create1() throws ClassNotFoundException, SQLException {
//		BoardItem boardItem = boardItemDao.selectOne(2);
//		
//		assertEquals(boardItem.getId(), 2);
//		assertEquals(boardItem.getTitle(), "title2");
//		
//		boardItem1 = new BoardItem();
//		boardItem1.setTitle("title339");
//		boardItemDao.create(boardItem1);
//		
//	}
//	
	@Test
	void select1(){
		BoardItem boardItem = boardItemDao.selectOne(1);
		
		assertEquals(boardItem.getId(), 1);
		assertEquals(boardItem.getTitle(), "titleUpdated");
		
	}
	
	@Test
	void update(){

		boardItem1 = new BoardItem();
		boardItem1.setId(1);
		boardItem1.setTitle("titleUpdated");
		boardItem1.setContent("수병몬발사");
		boardItem2 = new BoardItem();
		boardItem2.setId(2);
		boardItem2.setTitle("titleUpdated2");
		boardItem2.setContent("재원몬발사");
		boardItemDao.update(boardItem2);
		BoardItem boardItem = boardItemDao.selectOne(2);
		assertEquals(boardItem.getId(), 2);
		assertEquals(boardItem.getTitle(), "titleUpdated2");
		assertEquals(boardItem.getContent(), "재원몬발사");
	}
	
	@Test
	void selectAll() {
		
		List<BoardItem> boardItem = boardItemDao.selectAll(1, 50);
		boardItem.get(0).getId();
		assertEquals(boardItem.get(0).getId(), 1);
		assertEquals(boardItem.get(0).getTitle(), "titleUpdated");
		
	}
	@Test
	void count() {
		int value = boardItemDao.count();
		assertEquals(value, 100);
		
	}
	@Test
	void delete1() {
		//boardItemDao.delete(1);
		
	}
	
	

}
