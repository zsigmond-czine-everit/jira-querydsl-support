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
package org.everit.jira.querydsl.schema;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCwdApplication is a Querydsl query type for QCwdApplication
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdApplication extends com.querydsl.sql.RelationalPathBase<QCwdApplication> {

    private static final long serialVersionUID = 376249592;

    public static final QCwdApplication cwdApplication = new QCwdApplication("cwd_application");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final StringPath applicationName = createString("applicationName");

    public final StringPath applicationType = createString("applicationType");

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath credential = createString("credential");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerApplicationName = createString("lowerApplicationName");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QCwdApplication> cwdApplicationPk = createPrimaryKey(id);

    public QCwdApplication(String variable) {
        super(QCwdApplication.class, forVariable(variable), "public", "cwd_application");
        addMetadata();
    }

    public QCwdApplication(String variable, String schema, String table) {
        super(QCwdApplication.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdApplication(Path<? extends QCwdApplication> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_application");
        addMetadata();
    }

    public QCwdApplication(PathMetadata metadata) {
        super(QCwdApplication.class, metadata, "public", "cwd_application");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("active").withIndex(6).ofType(Types.NUMERIC).withSize(9));
        addMetadata(applicationName, ColumnMetadata.named("application_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(applicationType, ColumnMetadata.named("application_type").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(createdDate, ColumnMetadata.named("created_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(credential, ColumnMetadata.named("credential").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(description, ColumnMetadata.named("description").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lowerApplicationName, ColumnMetadata.named("lower_application_name").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedDate, ColumnMetadata.named("updated_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
    }

}

