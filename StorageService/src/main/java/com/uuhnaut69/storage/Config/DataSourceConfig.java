package com.uuhnaut69.storage.Config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

import io.seata.rm.datasource.DataSourceProxy;

@Configuration
public class DataSourceConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DruidDataSource druidDataSource() {
		return new DruidDataSource();
	}

	/**
	 * need to DataSourceProxy as the primary data source, otherwise the transaction
	 * can not be rolled back
	 * 
	 * @param druidDataSource
	 * @return
	 */
	@Primary
	@Bean("dataSource")
	public DataSource dataSource(DruidDataSource druidDataSource) {
		return new DataSourceProxy(druidDataSource);
	}
}
