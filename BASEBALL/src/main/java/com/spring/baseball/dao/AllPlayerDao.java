package com.spring.baseball.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.spring.baseball.dto.AllPlayer;


@Repository
public class AllPlayerDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;

	// BeanPropertyRowMapper는 Role클래스의 프로퍼티를 보고 자동으로 칼럼과 맵핑해주는 RowMapper객체를 생성한다.
	// roleId 프로퍼티는 role_id 칼럼과 맵핑이 된다.
	// 만약 프로퍼티와 칼럼의 규칙이 맞아 떨어지지 않는다면 직접 RowMapper객체를 생성해야 한다.
	// 생성하는 방법은 아래의 rowMapper2를 참고한다.
	private RowMapper<AllPlayer> rowMapper = BeanPropertyRowMapper.newInstance(AllPlayer.class);

		
	
	public AllPlayerDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
//		this.insertAction = new SimpleJdbcInsert(dataSource)
//                .withTableName("");
	}

	// roleId에 해당하는 자료가 없을 경우  org.springframework.dao.EmptyResultDataAccessException 이 발생한다.
		
	//SelectAllTest를 위한 코드
//	public List<HPlayer> selectALL(){
//		
//		return jdbc.query(HPlayerDaoSqls.SELECT_ALL, Collections.EMPTY_MAP, rowMapper);
//	}
//	
	
	public List<AllPlayer> getAllPlayers(AllPlayer player){
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("allname", player.getName());
		return jdbc.query(AllPlayerDaoSqls.SELECT_AllName, map, rowMapper);
	}
}