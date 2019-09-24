package com.spring.baseball.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
public class DBConfig implements TransactionManagementConfigurer{
	private String driverClassName = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://192.168.1.174:3306/test?useUnicode=true&characterEncoding=utf8";
	private String username = "testuser";
	private String password = "1234";

	/**
	 * 커넥션 풀과 관련된 Bean을 생성한다.
	 * @return
	 */
	//데이터소스는 디비 커넥션 관리를 위한 것
	@Bean
	public DataSource dataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		
		return dataSource;
	}

	/**
	 * 트랜잭션 관리자를 생성한다.
	 * @return
	 */
	@Bean
	public PlatformTransactionManager transactionManager(){
		return new DataSourceTransactionManager(dataSource());
	}
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return transactionManager();
	}
}