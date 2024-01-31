<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	// 자바코드를 넣어줘도됨 - 위치는 상관없음
	
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	// <%= 변수이름(값)을 넣을때는 이렇게 변수를 만들어줘야함
			
	pageContext.setAttribute("name", name); // 속성값설정 - 키벨류 형태
	pageContext.setAttribute("age", age);
	pageContext.setAttribute("gender", "female"); //페이지영역의 우선권 : pageContext - request - sesstion - application 순서대로 
	// ${속성이름}= 내가정해준이름으로 데이터를 정의해주고 불러올수있음
	
	// pageContext
	// 페이지마다(파일마다) 저장소가 있음 - 페이지를 벗어나면 데이터가 사라짐
	// 페이지 전용저장소
	
	// 4대저장소
	// pageContext(페이지저장소)
	// sesstion(연결상태 - 브라우저 끄기 전까지는 유지가됨)
	// application(서비스를이용하는 모든사람들이 이용하는 공간 - 서버 돌아가는동안은 계속 유지됨)
	// ** request() - 요청이 이루어질동안유효함 - request.getRequestDispatcher("result.jsp").forward(request, response);
	// 로그인데이터 - 세션영역에 저장하는게 좋음
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>결과페이지</h1>
	<hr>
	이름 : ${param.name}<br>
	나이 : ${param.age}<br>
	<!-- request에서 parameter에 있는 애들만 불러오는 방법 -->
	<hr>
	이름 : <%= name %><br>
	나이 : <%= age %><br>
	<hr>
	이름 : ${name}<br>
	나이 : ${age}<br>
	성별 : ${requestScope.gender} <!-- request 영역에 있는 gender 를 읽어옴 --> <br>
	성별 : ${pageScope.gender}
	<hr>
</body>
</html>