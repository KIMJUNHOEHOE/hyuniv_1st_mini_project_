package com.spring.baseball.dao;

public class TeamPlayerDaoSqls {
	public static final String SELECT_TeamPicher = "select p.pname" + 
			" from pstat_classic p inner join player_def d" + 
			" on p.num = d.num" + 
			" where d.team = :tname";
	public static final String SELECT_Teamhitter = "select h.hname" + 
			" from hstat_classic h inner join player_def d" + 
			" on h.num = d.num" + 
			" where d.dposition != 'P' and d.team = :tname ";
	
}
