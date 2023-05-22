package com.base.entidade;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DataConfig {
	
	@Bean
	public DataSource dataSource() {
		
		//instancia objeto de configuração do banco
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		// seta dados de configuração do banco 
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_entidade");
		dataSource.setUsername("root");// usuário do banco de dados 
		dataSource.setPassword(""); // senha do db
		
		// retorna o objeto
		return dataSource;
	
		
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter () {
		
		// instacia objeto do tipo hibernate
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		
		// configuração do hibernate
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
		adapter.setPrepareConnection(true);
		
		
		// retorna objeto
		return adapter;
		
	}
	
}