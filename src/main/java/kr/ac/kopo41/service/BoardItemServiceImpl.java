 package kr.ac.kopo41.service;

import java.sql.SQLException;
import java.util.List;

import kr.ac.kopo.kopo41.dao.BoardItemDao;
import kr.ac.kopo.kopo41.dao.BoardItemDaoImpl;
import kr.ac.kopo.kopo41.domain.BoardItem;
import kr.ac.kopo41.service.dto.Pagination;

public class BoardItemServiceImpl implements BoardItemService {

	private BoardItemDao boardItemDao = new BoardItemDaoImpl();
	
	@Override
	public Pagination getPagination(int c, int pageSize, int countPerPage, int totalCount) {
		Pagination pagination = new Pagination();
		
		int nn = totalCount / countPerPage;	//마지막페이지 수 구하는 식. 전체 게시글수/페이지당 나오는 게시글 수;
		if(totalCount%countPerPage != 0) {//나머지가 있을 경우 1을 더해준다.(마지막 페이지)
			nn += 1;
		}
		if(c<1) {//입력된 현재 페이지 값이 1보다 작을 경우 1페이지가 출력되도록 조정. 
			c=1;
		} else if(c > nn ) {//입력된 현재 페이지 값이 마지막 페이지 수보다 크거나 같을 경우, 마지막 페이지 출력되도록 조정. 
			c = nn;
		}
		int start = c - (c%pageSize) + 1;//표기되는 페이지중 첫번째 페이지 구하는 식.
		int end = start + pageSize -1;//표기되는 페이지중 마지막 페이지 구하는 식

		int prePage = c - pageSize;//현재 페이지에서 < 눌렀을때 보여줄 페이지 구하는 식.
		if(prePage<1) {	// < 눌렀을 때 값이 1보다 작다면 보여줄 페이지를 1로 조정.
			prePage = 1;
		}
		int nextPage = c + pageSize;//현재 페이지에서 > 눌렀을 때 보여줄 페이지 구하는 식.

		if(nextPage > nn) {	// >눌렀을 때 마지막 페이지수 보다 크다면 마지막 페이지를 보여주도록 조정.
			nextPage = nn;
		}
		if(end>nn) { // >>눌렀을 떄 마지막 페이지 수보다 클 경우 마지막 페이지를 보여주도록 조정.
			end = nn;
		}
		
		pagination.setC(c);
		pagination.setStart(start);
		pagination.setEnd(end);
		pagination.setPp(1);
		pagination.setNn(nn);
		pagination.setP(prePage);
		pagination.setN(nextPage);
				
	
		return pagination;
	}

	@Override
	public BoardItem create(BoardItem boardItem) {
		// TODO Auto-generated method stub
		
		return boardItemDao.create(boardItem);
	}

	@Override
	public BoardItem selectOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardItem> selectAll(int page, int countPerPage){
		// TODO Auto-generated method stub
		return boardItemDao.selectAll(page, countPerPage);
	}

	@Override
	public void update(BoardItem boardItem){
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return boardItemDao.count();
	}

}
