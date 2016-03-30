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
 * QWorklog is a Querydsl query type for QWorklog
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QWorklog extends com.querydsl.sql.RelationalPathBase<QWorklog> {

    private static final long serialVersionUID = 313830747;

    public static final QWorklog worklog = new QWorklog("worklog");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath grouplevel = createString("grouplevel");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final NumberPath<Long> rolelevel = createNumber("rolelevel", Long.class);

    public final DateTimePath<java.sql.Timestamp> startdate = createDateTime("startdate", java.sql.Timestamp.class);

    public final NumberPath<Long> timeworked = createNumber("timeworked", Long.class);

    public final StringPath updateauthor = createString("updateauthor");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final StringPath worklogbody = createString("worklogbody");

    public final com.querydsl.sql.PrimaryKey<QWorklog> worklogPk = createPrimaryKey(id);

    public QWorklog(String variable) {
        super(QWorklog.class, forVariable(variable), "public", "worklog");
        addMetadata();
    }

    public QWorklog(String variable, String schema, String table) {
        super(QWorklog.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QWorklog(Path<? extends QWorklog> path) {
        super(path.getType(), path.getMetadata(), "public", "worklog");
        addMetadata();
    }

    public QWorklog(PathMetadata metadata) {
        super(QWorklog.class, metadata, "public", "worklog");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("author").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(7).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(grouplevel, ColumnMetadata.named("grouplevel").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issueid, ColumnMetadata.named("issueid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(rolelevel, ColumnMetadata.named("rolelevel").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(startdate, ColumnMetadata.named("startdate").withIndex(10).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(timeworked, ColumnMetadata.named("timeworked").withIndex(11).ofType(Types.NUMERIC).withSize(18));
        addMetadata(updateauthor, ColumnMetadata.named("updateauthor").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updated, ColumnMetadata.named("updated").withIndex(9).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(worklogbody, ColumnMetadata.named("worklogbody").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

