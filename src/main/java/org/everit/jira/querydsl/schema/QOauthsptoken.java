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
 * QOauthsptoken is a Querydsl query type for QOauthsptoken
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOauthsptoken extends com.querydsl.sql.RelationalPathBase<QOauthsptoken> {

    private static final long serialVersionUID = 1253330301;

    public static final QOauthsptoken oauthsptoken = new QOauthsptoken("oauthsptoken");

    public final StringPath callback = createString("callback");

    public final StringPath consumerKey = createString("consumerKey");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> sessionCreationTime = createDateTime("sessionCreationTime", java.sql.Timestamp.class);

    public final StringPath sessionHandle = createString("sessionHandle");

    public final DateTimePath<java.sql.Timestamp> sessionLastRenewalTime = createDateTime("sessionLastRenewalTime", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> sessionTimeToLive = createDateTime("sessionTimeToLive", java.sql.Timestamp.class);

    public final StringPath spauth = createString("spauth");

    public final StringPath spverifier = createString("spverifier");

    public final StringPath spversion = createString("spversion");

    public final StringPath token = createString("token");

    public final StringPath tokenSecret = createString("tokenSecret");

    public final StringPath tokenType = createString("tokenType");

    public final NumberPath<Long> ttl = createNumber("ttl", Long.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QOauthsptoken> oauthsptokenPk = createPrimaryKey(id);

    public QOauthsptoken(String variable) {
        super(QOauthsptoken.class, forVariable(variable), "public", "oauthsptoken");
        addMetadata();
    }

    public QOauthsptoken(String variable, String schema, String table) {
        super(QOauthsptoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthsptoken(Path<? extends QOauthsptoken> path) {
        super(path.getType(), path.getMetadata(), "public", "oauthsptoken");
        addMetadata();
    }

    public QOauthsptoken(PathMetadata metadata) {
        super(QOauthsptoken.class, metadata, "public", "oauthsptoken");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(callback, ColumnMetadata.named("callback").withIndex(10).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerKey, ColumnMetadata.named("consumer_key").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(2).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(sessionCreationTime, ColumnMetadata.named("session_creation_time").withIndex(14).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(sessionHandle, ColumnMetadata.named("session_handle").withIndex(13).ofType(Types.VARCHAR).withSize(255));
        addMetadata(sessionLastRenewalTime, ColumnMetadata.named("session_last_renewal_time").withIndex(15).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(sessionTimeToLive, ColumnMetadata.named("session_time_to_live").withIndex(16).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(spauth, ColumnMetadata.named("spauth").withIndex(9).ofType(Types.VARCHAR).withSize(60));
        addMetadata(spverifier, ColumnMetadata.named("spverifier").withIndex(11).ofType(Types.VARCHAR).withSize(255));
        addMetadata(spversion, ColumnMetadata.named("spversion").withIndex(12).ofType(Types.VARCHAR).withSize(60));
        addMetadata(token, ColumnMetadata.named("token").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(tokenSecret, ColumnMetadata.named("token_secret").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(tokenType, ColumnMetadata.named("token_type").withIndex(5).ofType(Types.VARCHAR).withSize(60));
        addMetadata(ttl, ColumnMetadata.named("ttl").withIndex(8).ofType(Types.NUMERIC).withSize(18));
        addMetadata(username, ColumnMetadata.named("username").withIndex(7).ofType(Types.VARCHAR).withSize(255));
    }

}

