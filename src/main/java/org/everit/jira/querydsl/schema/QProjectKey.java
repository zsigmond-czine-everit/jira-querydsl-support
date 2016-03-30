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
 * QProjectKey is a Querydsl query type for QProjectKey
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectKey extends com.querydsl.sql.RelationalPathBase<QProjectKey> {

    private static final long serialVersionUID = 1699155134;

    public static final QProjectKey projectKey1 = new QProjectKey("project_key");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> projectId = createNumber("projectId", Long.class);

    public final StringPath projectKey = createString("projectKey");

    public final com.querydsl.sql.PrimaryKey<QProjectKey> projectKeyPk = createPrimaryKey(id);

    public QProjectKey(String variable) {
        super(QProjectKey.class, forVariable(variable), "public", "project_key");
        addMetadata();
    }

    public QProjectKey(String variable, String schema, String table) {
        super(QProjectKey.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectKey(Path<? extends QProjectKey> path) {
        super(path.getType(), path.getMetadata(), "public", "project_key");
        addMetadata();
    }

    public QProjectKey(PathMetadata metadata) {
        super(QProjectKey.class, metadata, "public", "project_key");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(projectId, ColumnMetadata.named("project_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(projectKey, ColumnMetadata.named("project_key").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

