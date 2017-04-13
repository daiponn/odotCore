package com.makotojava.learn.odot;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

public class TestConfigurationNullDataSource extends TestConfiguration {

  @Override
  @Bean(name = "dataSource")
  public DataSource getDataSource() {
    return null;
  }

}
