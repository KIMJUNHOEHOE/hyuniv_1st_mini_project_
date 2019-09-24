<%@ page
 language="java"
 contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>결과입니다</title>
</head>
<body>
	<div class="lists">
        
            <c:forEach items="${Lists}" var="list">
                
                        <td>${list.num}</td>
                        <td>${list.hname}</td>
                        <td>${list.hposition}</td>
                        <td>${list.team}</td>
                        <td>${list.at_bat}</td>
                        <td>${list.hhit}</td>
                        <td>${list.hhr}</td>
                        <td>${list.rbi}</td>
                        <td>${list.stl}</td>0
                        <td>${list.havr}</td>
                        <td>${list.at_bat_r}</td>
                        <td>${list.por_at_bat}</td>
                        <td>${list.risp}</td>
                                             
            </c:forEach>         
                     
    </div>


</body>
</html>