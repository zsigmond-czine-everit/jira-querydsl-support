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
 * QOauthconsumer is a Querydsl query type for QOauthconsumer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOauthconsumer extends com.querydsl.sql.RelationalPathBase<QOauthconsumer> {

    private static final long serialVersionUID = 1323060309;

    public static final QOauthconsumer oauthconsumer = new QOauthconsumer("oauthconsumer");

    public final StringPath callback = createString("callback");

    public final StringPath consumerKey = createString("consumerKey");

    public final StringPath consumername = createString("consumername");

    public final StringPath consumerservice = createString("consumerservice");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath privateKey = createString("privateKey");

    public final StringPath publicKey = createString("publicKey");

    public final StringPath sharedSecret = createString("sharedSecret");

    public final StringPath signatureMethod = createString("signatureMethod");

    public final com.querydsl.sql.PrimaryKey<QOauthconsumer> oauthconsumerPk = createPrimaryKey(id);

    public QOauthconsumer(String variable) {
        super(QOauthconsumer.class, forVariable(variable), "public", "oauthconsumer");
        addMetadata();
    }

    public QOauthconsumer(String variable, String schema, String table) {
        super(QOauthconsumer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthconsumer(Path<? extends QOauthconsumer> path) {
        super(path.getType(), path.getMetadata(), "public", "oauthconsumer");
        addMetadata();
    }

    public QOauthconsumer(PathMetadata metadata) {
        super(QOauthconsumer.class, metadata, "public", "oauthconsumer");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(callback, ColumnMetadata.named("callback").withIndex(9).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerKey, ColumnMetadata.named("consumer_key").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(consumername, ColumnMetadata.named("consumername").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(consumerservice, ColumnMetadata.named("consumerservice").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(2).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(description, ColumnMetadata.named("description").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(privateKey, ColumnMetadata.named("private_key").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(publicKey, ColumnMetadata.named("public_key").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(sharedSecret, ColumnMetadata.named("shared_secret").withIndex(11).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(signatureMethod, ColumnMetadata.named("signature_method").withIndex(10).ofType(Types.VARCHAR).withSize(60));
    }

}

