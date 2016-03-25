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
 * QTrackbackPing is a Querydsl query type for QTrackbackPing
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTrackbackPing extends com.querydsl.sql.RelationalPathBase<QTrackbackPing> {

    private static final long serialVersionUID = -58268148;

    public static final QTrackbackPing trackbackPing = new QTrackbackPing("trackback_ping");

    public final StringPath blogname = createString("blogname");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath excerpt = createString("excerpt");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final StringPath title = createString("title");

    public final StringPath url = createString("url");

    public final com.querydsl.sql.PrimaryKey<QTrackbackPing> trackbackPingPk = createPrimaryKey(id);

    public QTrackbackPing(String variable) {
        super(QTrackbackPing.class, forVariable(variable), "public", "trackback_ping");
        addMetadata();
    }

    public QTrackbackPing(String variable, String schema, String table) {
        super(QTrackbackPing.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTrackbackPing(Path<? extends QTrackbackPing> path) {
        super(path.getType(), path.getMetadata(), "public", "trackback_ping");
        addMetadata();
    }

    public QTrackbackPing(PathMetadata metadata) {
        super(QTrackbackPing.class, metadata, "public", "trackback_ping");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blogname, ColumnMetadata.named("blogname").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(7).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(excerpt, ColumnMetadata.named("excerpt").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issue, ColumnMetadata.named("issue").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(title, ColumnMetadata.named("title").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(url, ColumnMetadata.named("url").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

