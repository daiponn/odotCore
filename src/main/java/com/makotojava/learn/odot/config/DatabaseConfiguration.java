package com.makotojava.learn.odot.config;

import javax.sql.DataSource;

public interface DatabaseConfiguration {

  public DataSource getDataSource();

}
