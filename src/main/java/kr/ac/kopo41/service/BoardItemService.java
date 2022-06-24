package kr.ac.kopo41.service;

import java.sql.SQLException;
import java.util.List;

import kr.ac.kopo.kopo41.domain.BoardItem;
import kr.ac.kopo41.service.dto.Pagination;

public interface BoardItemService {
	//pageSize는 보여지는 페이지 수
	//countPerPage 는 페이지당 보여지는 목록 수
	Pagination getPagination(int c, int pageSize, int countPerPage, int totalCount);
	BoardItem create(BoardItem boardItem);//만들기
	BoardItem selectOne(int id);//하나의 값만 조회하기
	List<BoardItem> selectAll(int start, int countPerPage);//페이징 처리
	void update(BoardItem boardItem);//갱신
	void delete(int id);//삭제
	int count();//전체 숫자 세기
}
