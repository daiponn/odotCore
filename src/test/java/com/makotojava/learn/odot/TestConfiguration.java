package com.makotojava.learn.odot;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import com.makotojava.learn.odot.config.AbstractApplicationConfiguration;

public class TestConfiguration extends AbstractApplicationConfiguration {

  @Override
  @Bean(name = "dataSource")
  public DataSource getDataSource() {
    EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    EmbeddedDatabase embeddedDb = builder
        .setType(EmbeddedDatabaseType.DERBY)
        .ignoreFailedDrops(true)
        // .addScript("sql/drop_tables.sql")
        .addScript("sql/create_tables.sql")
        .addScript("sql/insert_data.sql")
        .build();
    return embeddedDb;
  }

}
