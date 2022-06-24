package kr.ac.kopo.kopo41.dao;

import java.sql.SQLException;
import java.util.List;

import kr.ac.kopo.kopo41.domain.BoardItem;

public interface BoardItemDao {
	BoardItem create(BoardItem boardItem);//만들기
	BoardItem selectOne(int id);//하나의 값만 조회하기
	List<BoardItem> selectAll(int start, int countPerPage);//페이징 처리
	void update(BoardItem boardItem);//갱신
	void delete(int id);//삭제
	int count();//전체 숫자 세기
	void deleteAll();
}


