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
 * QJiraaction is a Querydsl query type for QJiraaction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJiraaction extends com.querydsl.sql.RelationalPathBase<QJiraaction> {

    private static final long serialVersionUID = -908132452;

    public static final QJiraaction jiraaction = new QJiraaction("jiraaction");

    public final StringPath actionbody = createString("actionbody");

    public final StringPath actionlevel = createString("actionlevel");

    public final NumberPath<Long> actionnum = createNumber("actionnum", Long.class);

    public final StringPath actiontype = createString("actiontype");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final NumberPath<Long> rolelevel = createNumber("rolelevel", Long.class);

    public final StringPath updateauthor = createString("updateauthor");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QJiraaction> jiraactionPk = createPrimaryKey(id);

    public QJiraaction(String variable) {
        super(QJiraaction.class, forVariable(variable), "public", "jiraaction");
        addMetadata();
    }

    public QJiraaction(String variable, String schema, String table) {
        super(QJiraaction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJiraaction(Path<? extends QJiraaction> path) {
        super(path.getType(), path.getMetadata(), "public", "jiraaction");
        addMetadata();
    }

    public QJiraaction(PathMetadata metadata) {
        super(QJiraaction.class, metadata, "public", "jiraaction");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionbody, ColumnMetadata.named("actionbody").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(actionlevel, ColumnMetadata.named("actionlevel").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(actionnum, ColumnMetadata.named("actionnum").withIndex(11).ofType(Types.NUMERIC).withSize(18));
        addMetadata(actiontype, ColumnMetadata.named("actiontype").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(author, ColumnMetadata.named("author").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(8).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issueid, ColumnMetadata.named("issueid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(rolelevel, ColumnMetadata.named("rolelevel").withIndex(6).ofType(Types.NUMERIC).withSize(18));
        addMetadata(updateauthor, ColumnMetadata.named("updateauthor").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updated, ColumnMetadata.named("updated").withIndex(10).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
    }

}

