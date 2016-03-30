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
 * QFiltersubscription is a Querydsl query type for QFiltersubscription
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFiltersubscription extends com.querydsl.sql.RelationalPathBase<QFiltersubscription> {

    private static final long serialVersionUID = 1168682189;

    public static final QFiltersubscription filtersubscription = new QFiltersubscription("filtersubscription");

    public final StringPath emailOnEmpty = createString("emailOnEmpty");

    public final NumberPath<Long> filterID = createNumber("filterID", Long.class);

    public final StringPath groupname = createString("groupname");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> lastRun = createDateTime("lastRun", java.sql.Timestamp.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QFiltersubscription> filtersubscriptionPk = createPrimaryKey(id);

    public QFiltersubscription(String variable) {
        super(QFiltersubscription.class, forVariable(variable), "public", "filtersubscription");
        addMetadata();
    }

    public QFiltersubscription(String variable, String schema, String table) {
        super(QFiltersubscription.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFiltersubscription(Path<? extends QFiltersubscription> path) {
        super(path.getType(), path.getMetadata(), "public", "filtersubscription");
        addMetadata();
    }

    public QFiltersubscription(PathMetadata metadata) {
        super(QFiltersubscription.class, metadata, "public", "filtersubscription");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(emailOnEmpty, ColumnMetadata.named("email_on_empty").withIndex(6).ofType(Types.VARCHAR).withSize(10));
        addMetadata(filterID, ColumnMetadata.named("filter_i_d").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(groupname, ColumnMetadata.named("groupname").withIndex(4).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lastRun, ColumnMetadata.named("last_run").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(username, ColumnMetadata.named("username").withIndex(3).ofType(Types.VARCHAR).withSize(60));
    }

}

