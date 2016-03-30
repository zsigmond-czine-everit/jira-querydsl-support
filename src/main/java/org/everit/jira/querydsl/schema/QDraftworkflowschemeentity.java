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
 * QDraftworkflowschemeentity is a Querydsl query type for QDraftworkflowschemeentity
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QDraftworkflowschemeentity extends com.querydsl.sql.RelationalPathBase<QDraftworkflowschemeentity> {

    private static final long serialVersionUID = -1675333904;

    public static final QDraftworkflowschemeentity draftworkflowschemeentity = new QDraftworkflowschemeentity("draftworkflowschemeentity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final StringPath workflow = createString("workflow");

    public final com.querydsl.sql.PrimaryKey<QDraftworkflowschemeentity> draftworkflowschemeentityPk = createPrimaryKey(id);

    public QDraftworkflowschemeentity(String variable) {
        super(QDraftworkflowschemeentity.class, forVariable(variable), "public", "draftworkflowschemeentity");
        addMetadata();
    }

    public QDraftworkflowschemeentity(String variable, String schema, String table) {
        super(QDraftworkflowschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QDraftworkflowschemeentity(Path<? extends QDraftworkflowschemeentity> path) {
        super(path.getType(), path.getMetadata(), "public", "draftworkflowschemeentity");
        addMetadata();
    }

    public QDraftworkflowschemeentity(PathMetadata metadata) {
        super(QDraftworkflowschemeentity.class, metadata, "public", "draftworkflowschemeentity");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issuetype, ColumnMetadata.named("issuetype").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(scheme, ColumnMetadata.named("scheme").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(workflow, ColumnMetadata.named("workflow").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

