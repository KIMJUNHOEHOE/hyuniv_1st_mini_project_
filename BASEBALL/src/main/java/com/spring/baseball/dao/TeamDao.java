package com.spring.baseball.dao;

import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.spring.baseball.dto.PPlayer;
import com.spring.baseball.dto.Team;



@Repository
public class TeamDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;

	// BeanPropertyRowMapper는 Role클래스의 프로퍼티를 보고 자동으로 칼럼과 맵핑해주는 RowMapper객체를 생성한다.
	// roleId 프로퍼티는 role_id 칼럼과 맵핑이 된다.
	// 만약 프로퍼티와 칼럼의 규칙이 맞아 떨어지지 않는다면 직접 RowMapper객체를 생성해야 한다.
	// 생성하는 방법은 아래의 rowMapper2를 참고한다.
	private RowMapper<Team> rowMapper = BeanPropertyRowMapper.newInstance(Team.class);

		
	
	
	public TeamDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
//		this.insertAction = new SimpleJdbcInsert(dataSource) //데이터 insert를 위한 것
//                .withTableName("");
	}

	// roleId에 해당하는 자료가 없을 경우  org.springframework.dao.EmptyResultDataAccessException 이 발생한다.
		
	
	public List<Team> getTeam(Team team){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("tname", team.getTname());
		return jdbc.query(TeamDaoSqls.SELECT_Tname, map, rowMapper);
	}
	
	
	
}
