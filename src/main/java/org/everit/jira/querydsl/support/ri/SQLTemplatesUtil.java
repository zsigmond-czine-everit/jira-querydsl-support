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

import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import com.querydsl.sql.H2Templates;
import com.querydsl.sql.HSQLDBTemplates;
import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.PostgreSQLTemplates;
import com.querydsl.sql.SQLServer2005Templates;
import com.querydsl.sql.SQLServer2008Templates;
import com.querydsl.sql.SQLServer2012Templates;
import com.querydsl.sql.SQLServerTemplates;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.SQLTemplates.Builder;

/**
 * Utility class to determine the proper {@link SQLTemplates} for a database connection.
 */
public final class SQLTemplatesUtil {

  /**
   * Types of DBMS.
   */
  private enum DBMSTypes {

    H2 {

      @Override
      public String getProductName() {
        return TYPE_H2;
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return H2Templates.builder();
      }
    },

    HSQLDB {

      @Override
      public String getProductName() {
        return "HSQL Database Engine";
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return HSQLDBTemplates.builder();
      }

      @Override
      public String toString() {
        return TYPE_HSQLDB;
      }

    },

    MYSQL {
      @Override
      public String getProductName() {
        return TYPE_MYSQL;
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return MySQLTemplates.builder();
      }
    },

    ORACLE {
      @Override
      public String getProductName() {
        return TYPE_ORACLE;
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return OracleTemplatesExt.builder();
      }
    },

    POSTGRES {

      @Override
      public String getProductName() {
        return "PostgreSQL";
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return PostgreSQLTemplates.builder().printSchema();
      }

      @Override
      public String toString() {
        return TYPE_POSTGRES;
      }

    },

    SQLSERVER {
      @Override
      boolean fitsMajorVersion(final int majorVersion) {
        return majorVersion < VERSION_NINE;
      }

      @Override
      public String getProductName() {
        return "Microsoft SQL Server";
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return SQLServerTemplates.builder().printSchema();
      }

      @Override
      public String toString() {
        return TYPE_SQLSERVER;
      }

    },

    SQLSERVER_2005 {
      @Override
      boolean fitsMajorVersion(final int majorVersion) {
        return majorVersion == VERSION_NINE;
      }

      @Override
      public String getProductName() {
        return SQLSERVER.getProductName();
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return SQLServer2005Templates.builder().printSchema();
      }

      @Override
      public String toString() {
        return TYPE_SQLSERVER_2005;
      }
    },

    SQLSERVER_2008 {
      @Override
      boolean fitsMajorVersion(final int majorVersion) {
        return majorVersion == VERSION_TEN;
      }

      @Override
      public String getProductName() {
        return SQLSERVER.getProductName();
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return SQLServer2008Templates.builder().printSchema();
      }

      @Override
      public String toString() {
        return TYPE_SQLSERVER_2008;
      }
    },

    SQLSERVER_2012 {
      @Override
      boolean fitsMajorVersion(final int majorVersion) {
        return majorVersion > VERSION_TEN;
      }

      @Override
      public String getProductName() {
        return SQLSERVER.getProductName();
      }

      @Override
      public Builder getSQLTemplatesBuilder() {
        return SQLServer2012Templates.builder().printSchema();
      }

      @Override
      public String toString() {
        return TYPE_SQLSERVER_2012;
      }
    };

    public static final String TYPE_H2 = "H2";

    private static final String TYPE_HSQLDB = "HSQLDB";

    private static final String TYPE_MYSQL = "MySQL";

    private static final String TYPE_ORACLE = "Oracle";

    private static final String TYPE_POSTGRES = "Postgres";

    private static final String TYPE_SQLSERVER = "SQLServer";

    private static final String TYPE_SQLSERVER_2005 = "SQLServer2005";

    private static final String TYPE_SQLSERVER_2008 = "SQLServer2008";

    private static final String TYPE_SQLSERVER_2012 = "SQLServer2012";

    private static final int VERSION_NINE = 9;

    private static final int VERSION_TEN = 10;

    boolean fitsMajorVersion(final int majorVersion) {
      return true;
    }

    abstract String getProductName();

    abstract Builder getSQLTemplatesBuilder();

    @Override
    public String toString() {
      return getProductName();
    }

  }

  /**
   * Returns the proper {@link SQLTemplates} based on database meta data.
   */
  public static SQLTemplates getSQLTemplates(final DatabaseMetaData metadata,
      final boolean printSchema) {
    String name;
    int version;
    try {
      name = metadata.getDatabaseProductName();
      version = metadata.getDatabaseMajorVersion();
    } catch (SQLException e) {
      throw new RuntimeException("cannot determine database name or version", e);
    }
    for (DBMSTypes type : DBMSTypes.values()) {
      if (type.getProductName().equals(name) && type.fitsMajorVersion(version)) {
        Builder sqlTemplatesBuilder = type.getSQLTemplatesBuilder();
        if (printSchema) {
          sqlTemplatesBuilder.printSchema();
        }
        return sqlTemplatesBuilder.build();
      }
    }
    throw new RuntimeException("database " + name
        + " (major version: " + version + ") is not supported");
  }

  private SQLTemplatesUtil() {

  }
}
