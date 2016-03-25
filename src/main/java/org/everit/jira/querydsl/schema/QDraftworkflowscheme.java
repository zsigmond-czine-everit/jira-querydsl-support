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
 * QDraftworkflowscheme is a Querydsl query type for QDraftworkflowscheme
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDraftworkflowscheme extends com.querydsl.sql.RelationalPathBase<QDraftworkflowscheme> {

    private static final long serialVersionUID = -2015684403;

    public static final QDraftworkflowscheme draftworkflowscheme = new QDraftworkflowscheme("draftworkflowscheme");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastModifiedDate = createDateTime("lastModifiedDate", java.sql.Timestamp.class);

    public final StringPath lastModifiedUser = createString("lastModifiedUser");

    public final StringPath name = createString("name");

    public final NumberPath<Long> workflowSchemeId = createNumber("workflowSchemeId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QDraftworkflowscheme> draftworkflowschemePk = createPrimaryKey(id);

    public QDraftworkflowscheme(String variable) {
        super(QDraftworkflowscheme.class, forVariable(variable), "public", "draftworkflowscheme");
        addMetadata();
    }

    public QDraftworkflowscheme(String variable, String schema, String table) {
        super(QDraftworkflowscheme.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDraftworkflowscheme(Path<? extends QDraftworkflowscheme> path) {
        super(path.getType(), path.getMetadata(), "public", "draftworkflowscheme");
        addMetadata();
    }

    public QDraftworkflowscheme(PathMetadata metadata) {
        super(QDraftworkflowscheme.class, metadata, "public", "draftworkflowscheme");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lastModifiedDate, ColumnMetadata.named("last_modified_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(lastModifiedUser, ColumnMetadata.named("last_modified_user").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(workflowSchemeId, ColumnMetadata.named("workflow_scheme_id").withIndex(4).ofType(Types.NUMERIC).withSize(18));
    }

}

