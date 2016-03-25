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
 * QProjectversion is a Querydsl query type for QProjectversion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectversion extends com.querydsl.sql.RelationalPathBase<QProjectversion> {

    private static final long serialVersionUID = -2774057;

    public static final QProjectversion projectversion = new QProjectversion("projectversion");

    public final StringPath archived = createString("archived");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final StringPath released = createString("released");

    public final DateTimePath<java.sql.Timestamp> releasedate = createDateTime("releasedate", java.sql.Timestamp.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final DateTimePath<java.sql.Timestamp> startdate = createDateTime("startdate", java.sql.Timestamp.class);

    public final StringPath url = createString("url");

    public final StringPath vname = createString("vname");

    public final com.querydsl.sql.PrimaryKey<QProjectversion> projectversionPk = createPrimaryKey(id);

    public QProjectversion(String variable) {
        super(QProjectversion.class, forVariable(variable), "public", "projectversion");
        addMetadata();
    }

    public QProjectversion(String variable, String schema, String table) {
        super(QProjectversion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectversion(Path<? extends QProjectversion> path) {
        super(path.getType(), path.getMetadata(), "public", "projectversion");
        addMetadata();
    }

    public QProjectversion(PathMetadata metadata) {
        super(QProjectversion.class, metadata, "public", "projectversion");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(archived, ColumnMetadata.named("archived").withIndex(7).ofType(Types.VARCHAR).withSize(10));
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(project, ColumnMetadata.named("project").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(released, ColumnMetadata.named("released").withIndex(6).ofType(Types.VARCHAR).withSize(10));
        addMetadata(releasedate, ColumnMetadata.named("releasedate").withIndex(10).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(startdate, ColumnMetadata.named("startdate").withIndex(9).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(url, ColumnMetadata.named("url").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(vname, ColumnMetadata.named("vname").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

