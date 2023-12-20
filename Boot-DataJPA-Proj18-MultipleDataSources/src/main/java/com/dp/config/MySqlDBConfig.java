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
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.dp.repo.offrs",
					   entityManagerFactoryRef = "msEntity", transactionManagerRef = "msTxMgmr")
public class MySqlDBConfig {
	
	@Bean(name = "msDs")
	@ConfigurationProperties(prefix = "ms.dss")
	public DataSource createOracleDs() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "msEntity")
	public LocalContainerEntityManagerFactoryBean createOracleEntityManagerFactory(EntityManagerFactoryBuilder entityManagerFactoryBuilder ) {
		//create map object having hibernate properties
		Map<String, Object> hm = new HashMap();
		//hm.put("spring.jpa.database-platform", "org.hibernate.dialect.MYSQL8Dialect");
		hm.put("hibernate.hbm2ddl.auto", "update");
		//create and return LocalContainerEntityManagerFactoryBean class object which makes EntityManagerFactory as the spring bean
		return entityManagerFactoryBuilder.dataSource(createOracleDs()).packages("com.dp.entity.offrs").properties(hm).build();		
	}
	
	@Bean
	public EntityManagerFactoryBuilder entityManagerFactoryBuilder() {
	   return new EntityManagerFactoryBuilder(new HibernateJpaVendorAdapter(), new HashMap<>(), null);
	}
	
	@Bean(name="msTxMgmr")
	public PlatformTransactionManager createTxManager(@Qualifier("msEntity") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
	}
}