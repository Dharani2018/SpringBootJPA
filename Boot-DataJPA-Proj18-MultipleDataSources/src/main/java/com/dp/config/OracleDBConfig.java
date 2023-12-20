package com.dp.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.dp.repo.prod", 
					   entityManagerFactoryRef = "oraEntity", transactionManagerRef = "oraTxMgmr")
public class OracleDBConfig {
	
	@Bean(name = "OraDs")
	@ConfigurationProperties(prefix = "ora.dss")
	@Primary
	public DataSource createOracleDs() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "oraEntity")
	@Primary
	public LocalContainerEntityManagerFactoryBean createOracleEntityManagerFactory(EntityManagerFactoryBuilder builder) {
		//create map object having hibernate properties
		Map<String, Object> hm = new HashMap();
		hm.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		hm.put("hibernate.hbm2ddl.auto", "update");
		//create and return LocalContainerEntityManagerFactoryBean class object which makes EntityManagerFactory as the spring bean
		return builder.dataSource(createOracleDs()).packages("com.dp.entity.prod").properties(hm).build();		
	}
	
	@Bean(name="oraTxMgmr")
	public PlatformTransactionManager createTxManager(@Qualifier("oraEntity") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}

}
