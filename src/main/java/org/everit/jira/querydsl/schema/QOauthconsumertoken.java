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
 * QOauthconsumertoken is a Querydsl query type for QOauthconsumertoken
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOauthconsumertoken extends com.querydsl.sql.RelationalPathBase<QOauthconsumertoken> {

    private static final long serialVersionUID = -493495612;

    public static final QOauthconsumertoken oauthconsumertoken = new QOauthconsumertoken("oauthconsumertoken");

    public final StringPath consumerKey = createString("consumerKey");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath token = createString("token");

    public final StringPath tokenKey = createString("tokenKey");

    public final StringPath tokenSecret = createString("tokenSecret");

    public final StringPath tokenType = createString("tokenType");

    public final com.querydsl.sql.PrimaryKey<QOauthconsumertoken> oauthconsumertokenPk = createPrimaryKey(id);

    public QOauthconsumertoken(String variable) {
        super(QOauthconsumertoken.class, forVariable(variable), "public", "oauthconsumertoken");
        addMetadata();
    }

    public QOauthconsumertoken(String variable, String schema, String table) {
        super(QOauthconsumertoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthconsumertoken(Path<? extends QOauthconsumertoken> path) {
        super(path.getType(), path.getMetadata(), "public", "oauthconsumertoken");
        addMetadata();
    }

    public QOauthconsumertoken(PathMetadata metadata) {
        super(QOauthconsumertoken.class, metadata, "public", "oauthconsumertoken");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(consumerKey, ColumnMetadata.named("consumer_key").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(2).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(token, ColumnMetadata.named("token").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(tokenKey, ColumnMetadata.named("token_key").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(tokenSecret, ColumnMetadata.named("token_secret").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(tokenType, ColumnMetadata.named("token_type").withIndex(6).ofType(Types.VARCHAR).withSize(60));
    }

}

