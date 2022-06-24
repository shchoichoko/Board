<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,javax.sql.*,java.io.*,java.util.List" %> <!--라이브러리 임포트-->
<% request.setCharacterEncoding("UTF-8"); %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %> <!-- JSTL 사용하기 위해 씀 --> 
<%@ page import="kr.ac.kopo.kopo41.domain.BoardItem" %>
<%@ page import="kr.ac.kopo.kopo41.dao.BoardItemDao" %>
<%@ page import="kr.ac.kopo.kopo41.dao.BoardItemDaoImpl" %>
<%@ page import="kr.ac.kopo41.service.BoardItemService" %>
<%@ page import="kr.ac.kopo41.service.BoardItemServiceImpl" %>
<%@ page import="kr.ac.kopo41.service.dto.Pagination" %>
  
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<% 
	BoardItem boardItem = new BoardItem();
	
	pageContext.setAttribute("boardItem", boardItem);
	pageContext.setAttribute("name", "양");
	
	BoardItemService boardItemService = new BoardItemServiceImpl();
	Pagination pagination = boardItemService.getPagination(1,15,50,1025);
	pageContext.setAttribute("pagination", pagination);

	
	BoardItemDao boardItemDao = new BoardItemDaoImpl();
	List<BoardItem> boardItems  = boardItemDao.selectAll(1,50);
	//pageContext.setAttribute("boardItems", boardItems);
	
	//List<BoardItem> boardItems = new ArrayList<BoardItem>();
	
	//BoardItem boardItem1 = new BoardItem();
	//BoardItem boardItem2 = new BoardItem();
	//boardItem2.setTitle("bbb1");
	//boardItem1.setTitle("aa111");
	//boardItems.add(boardItem1);
	//boardItems.add(boardItem2);
	
	pageContext.setAttribute("boardItems", boardItems);
	%>

	<!-- <div>${name}</div>
	<div>${pagination.p}</div> -->
		 <table cellspacing = 1 width = 650 border="1">
    <tr>
      <td width = 50><p align="center"><b>번호</b></p></td>
      <td width = 200><p align="center"><b>제목</b></p></td>
      <td width = 100><p align="center"><b>등록일</b></p></td>
    </tr>
	<c:forEach var="item" items="${boardItems}">
		<tr>
		<td width = 50><p align="center">${item.id }</p></td>
		<td width = 50><p align="center">${item.title }</p></td>
		<td width = 50><p align="center">${item.date }</p></td>
	<!--<td>${item.content }</td> -->
		</tr>
	</c:forEach>
		</table>
	<c:forEach var="i" begin="${pagination.start}" end="${pagination.end }">
		<div>${i}</div>
	</c:forEach> 
	

</body>
</html>
