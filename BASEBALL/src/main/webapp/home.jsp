<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page
 language="java"
 contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<html>
<head>
	<title>선수입니다</title>
</head>
<body>

<form action="hsearch.do" method ="post">
	
타자선수이름 :	<input type ="text" name = "hname">
	<input type = "submit" value="찾기">
	<input type = "reset" value="취소">
</form>
	
	
	<div class="lists">
	        
	            <c:forEach items="${HLists}" var="hlist">
	                		
	            			<td>${hlist.hname}</td>
	            			<td>${hlist.team}</td>
	                        <td>${hlist.dposition}</td>
	                        <td>${hlist.havr}</td>
	                        <td>${hlist.risp}</td>
	                        <td>${hlist.hhr}</td>
	                        <td>${hlist.rbi}</td>
	                        <td>${hlist.stl}</td>
	                        <td>${hlist.hpower}</td>
	                        <td>${hlist.prank}</td>
	                        <td>${hlist.contact}</td>
	                        <td>${hlist.crank}</td>
	                        <td>${hlist.eyes}</td>
	                        <td>${hlist.erank}</td>
	                        <td>${hlist.running}</td>
	                        <td>${hlist.rrank}</td>
	                        <td>${hlist.speed}</td>
	                        <td>${hlist.srank}</td>
	                        <td>${hlist.def}</td>
	                        <td>${hlist.drank}</td>
	             
	             
	            </c:forEach>         
	                     
	</div>
	
	
	

<form action="psearch.do" method ="post">
투수선수이름 : <input type = "text"	name ="pname">
	<input type = "submit" value ="찾기">
	<input type = "reset" value = "취소">
</form>

	<div class="lists">
	        
	            <c:forEach items="${PLists}" var="plist">
	                
	                        <td>${plist.pname}</td>
	                        <td>${plist.team}</td>
	                        <td>${plist.p_position}</td>
	                        <td>${plist.era}</td>
	                        <td>${plist.inning}</td>
	                        <td>${plist.win}</td>
	                        <td>${plist.lose}</td>
	                        <td>${plist.save}</td>
	                        <td>${plist.hold}</td>
	                        <td>${plist.stamina}</td>
	                        <td>${plist.st_rank}</td>
	                        <td>${plist.b_speed}</td>
	                        <td>${plist.sp_rank}</td>
	                        <td>${plist.b_power}</td>
	                        <td>${plist.p_rank}</td>
	                        <td>${plist.command}</td>
	                        <td>${plist.c_rank}</td>
	                        <td>${plist.e_control}</td>
	                        <td>${plist.mind}</td>
	                        <td>${plist.p_style}</td>
	                        <td>${plist.t_gofo}</td>
	                        <td>${plist.mainball}</td>
	                        
	                        
	                       
	            </c:forEach>         
	                     
	</div>

<form action="hlist.do" method ="post">
	<input type = "submit" value="타자선수리스트">
</form>
	<div class="hlists">
	            <c:forEach items="${HnameLists}" var="hnamelist">
	            			<td>${hnamelist.hname}</td><br>
	            </c:forEach>         
	</div>

<form action="plist.do" method ="post">
	<input type = "submit" value="투수선수리스트">
</form>
	<div class="plists">
	            <c:forEach items="${PnameLists}" var="pnamelist">
	            			<td>${pnamelist.pname}</td><br>
	            </c:forEach>         
	</div>

<form action="teamSearch.do" method ="post" style="width: 300px; ">
                        <select name="tname">
                        	<option name="" >-- --</option>
                            <option name="team1">두산</option>
                            <option name="team2">SK</option>
                            <option name="team3">한화</option>
                            <option name="team4">넥센</option>
                            <option name="team5">LG</option>
                            <option name="team6">KIA</option>
                            <option name="team7">삼성</option>
                            <option name="team8">롯데</option>
                            <option name="team9">NC</option>
                            <option name="team10">KT</option>
                        </select>
                    <input type='submit' value='pitchersearch' name='horp' size=100 style="width: 85px; ">
                    <input type='submit' value='hittersearch' name='horp' size=100 style="width: 85px; ">
</form>
	<div class="tlists">
	        
	            <c:forEach items="${Teampicherlist}" var="teampicherlist">
	                
	                        <td>${teampicherlist.pname}</td>
	                        
	                                                
	                       
	            </c:forEach>         
	                     
	</div>
	<div class="tlists">
	        
	            <c:forEach items="${Teamhitterlist}" var="teamhitterlist">
	                
	                      
	                        <td>${teamhitterlist.hname}</td>
	                                                
	                       
	            </c:forEach>         
	                     
	</div>





</body>


</html>
