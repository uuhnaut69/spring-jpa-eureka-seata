package com.uuhnaut69.account.Config;

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
	 * DataSourceProxy needs to be set as the primary data source, otherwise the
	 * transaction cannot be rolled back
	 *
	 * @param druidDataSource The DruidDataSource
	 * @return The default datasource
	 */
	@Primary
	@Bean("dataSource")
	public DataSource dataSource(DruidDataSource druidDataSource) {
		return new DataSourceProxy(druidDataSource);
	}
}
