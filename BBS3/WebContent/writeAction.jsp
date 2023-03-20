<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bbs.BbsDAO" %>
<%@ page import ="java.io.PrintWriter" %>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id ="bbs" class="bbs.Bbs" scope="page" />
<jsp:setProperty name="bbs" property="bbsTitle" />
<jsp:setProperty name="bbs" property="bbsContent" />

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    
	
    <title>JSP 게시판 웹사이트</title>
</head>
<body>
	<%
	String userID=null;
	if(session.getAttribute("userID") != null){
		userID = (String) session.getAttribute("userID");
	}
	if(userID == null) {
		PrintWriter script=response.getWriter();
		script.println("<script>");
		script.println("alert('로그인을 하세요')");
		script.println("location.href='login.jsp'"); //로그인 성공했을때 main.jsp 페이지로 이동
		script.println("</script>");
	}else {
		if(bbs.getBbsTitle()==null || bbs.getBbsContent()==null) {
			PrintWriter script=response.getWriter();
			script.println("<script>");
			script.println("alert('입력이 안 된 사항이 있습니다.')");
			script.println("history.back()");
			script.println("</script>");
		} else {
			BbsDAO bbsDAO = new BbsDAO();
			int result = bbsDAO.write(bbs.getBbsTitle(), userID, bbs.getBbsContent()); //6번이 매개변수로 들어감
			if (result == -1) {
				PrintWriter script=response.getWriter();
				script.println("<script>");
				script.println("alert('글쓰기에 실패했습니다.')"); //데이터베이스가 오류인 경우
				script.println("history.back()");
				script.println("</script>");
			} else { //정상적인 경우
				PrintWriter script=response.getWriter();
				script.println("<script>");
				script.println("alert('글쓰기 등록되었습니다.')");
				script.println("location.href='bbs.jsp'");
				script.println("</script>");
			}
		}
	}
		
	%>
	
</body>
</html>