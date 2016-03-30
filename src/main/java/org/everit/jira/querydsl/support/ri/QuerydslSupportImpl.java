/*
 * Copyright (C) 2011 Everit Kft. (http://www.everit.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.everit.jira.querydsl.support.ri;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import org.everit.jira.querydsl.support.QuerydslCallable;
import org.everit.jira.querydsl.support.QuerydslSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.atlassian.jira.ofbiz.DefaultOfBizConnectionFactory;
import com.atlassian.jira.ofbiz.OfBizConnectionFactory;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLTemplates;

/**
 * Implements the {@link QuerydslSupport} as a Jira plugin.
 */
public class QuerydslSupportImpl implements QuerydslSupport {

  /**
   * The schema name in the querydsl classes.
   */
  private static final String DEFAULT_SCHEMA_NAME = "public";

  /**
   * The logger.
   */
  private static final Logger LOGGER = LoggerFactory.getLogger(QuerydslSupportImpl.class);

  /**
   * Configuration for the database.
   */
  private Configuration configuration;

  /**
   * Database connection factory.
   */
  private OfBizConnectionFactory connectionFactory;

  /**
   * Obtains the {@link OfBizConnectionFactory} instance, and creates the {@link Configuration} for
   * the querydsl.
   *
   * @throws Exception
   *           if has problem to get informations of connection.
   */
  public QuerydslSupportImpl() throws Exception {
    try {
      connectionFactory = DefaultOfBizConnectionFactory.getInstance();
    } catch (Exception e) {
      LOGGER.error("Unsuccessful get OfBizConnectionFactory instance.", e);
      throw e;
    }

    try (Connection connection = connectionFactory.getConnection()) {

      DatabaseMetaData metaData = connection.getMetaData();

      String schemaName = connectionFactory.getDatasourceInfo().getSchemaName();

      boolean definedSchema = (schemaName != null) && !schemaName.trim().isEmpty();
      SQLTemplates templates = SQLTemplatesUtil.getSQLTemplates(metaData, definedSchema);
      configuration = new Configuration(templates);

      if (definedSchema && !schemaName.equals(DEFAULT_SCHEMA_NAME)) {
        configuration.registerSchemaOverride(DEFAULT_SCHEMA_NAME, schemaName);
      }

    } catch (SQLException e) {
      LOGGER.error("Unsuccessful get information of the connection.", e);
      throw e;
    }
  }

  @Override
  public <R> R execute(final QuerydslCallable<R> callable) {
    try (Connection connection = connectionFactory.getConnection()) {
      return callable.call(connection, configuration);
    } catch (SQLException e) {
      throw configuration.translate(e);
    }
  }

}
