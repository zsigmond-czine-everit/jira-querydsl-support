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
 * QJiraworkflows is a Querydsl query type for QJiraworkflows
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJiraworkflows extends com.querydsl.sql.RelationalPathBase<QJiraworkflows> {

    private static final long serialVersionUID = 723672430;

    public static final QJiraworkflows jiraworkflows = new QJiraworkflows("jiraworkflows");

    public final StringPath creatorname = createString("creatorname");

    public final StringPath descriptor = createString("descriptor");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath islocked = createString("islocked");

    public final StringPath workflowname = createString("workflowname");

    public final com.querydsl.sql.PrimaryKey<QJiraworkflows> jiraworkflowsPk = createPrimaryKey(id);

    public QJiraworkflows(String variable) {
        super(QJiraworkflows.class, forVariable(variable), "public", "jiraworkflows");
        addMetadata();
    }

    public QJiraworkflows(String variable, String schema, String table) {
        super(QJiraworkflows.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraworkflows(Path<? extends QJiraworkflows> path) {
        super(path.getType(), path.getMetadata(), "public", "jiraworkflows");
        addMetadata();
    }

    public QJiraworkflows(PathMetadata metadata) {
        super(QJiraworkflows.class, metadata, "public", "jiraworkflows");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(creatorname, ColumnMetadata.named("creatorname").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(descriptor, ColumnMetadata.named("descriptor").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(islocked, ColumnMetadata.named("islocked").withIndex(5).ofType(Types.VARCHAR).withSize(60));
        addMetadata(workflowname, ColumnMetadata.named("workflowname").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

