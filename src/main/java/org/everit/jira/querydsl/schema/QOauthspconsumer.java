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
 * QOauthspconsumer is a Querydsl query type for QOauthspconsumer
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOauthspconsumer extends com.querydsl.sql.RelationalPathBase<QOauthspconsumer> {

    private static final long serialVersionUID = -1946545678;

    public static final QOauthspconsumer oauthspconsumer = new QOauthspconsumer("oauthspconsumer");

    public final StringPath callback = createString("callback");

    public final StringPath consumerKey = createString("consumerKey");

    public final StringPath consumername = createString("consumername");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final StringPath executingTwoLOUser = createString("executingTwoLOUser");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath publicKey = createString("publicKey");

    public final StringPath threeLOAllowed = createString("threeLOAllowed");

    public final StringPath twoLOAllowed = createString("twoLOAllowed");

    public final StringPath twoLOImpersonationAllowed = createString("twoLOImpersonationAllowed");

    public final com.querydsl.sql.PrimaryKey<QOauthspconsumer> oauthspconsumerPk = createPrimaryKey(id);

    public QOauthspconsumer(String variable) {
        super(QOauthspconsumer.class, forVariable(variable), "public", "oauthspconsumer");
        addMetadata();
    }

    public QOauthspconsumer(String variable, String schema, String table) {
        super(QOauthspconsumer.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOauthspconsumer(Path<? extends QOauthspconsumer> path) {
        super(path.getType(), path.getMetadata(), "public", "oauthspconsumer");
        addMetadata();
    }

    public QOauthspconsumer(PathMetadata metadata) {
        super(QOauthspconsumer.class, metadata, "public", "oauthspconsumer");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(callback, ColumnMetadata.named("callback").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(consumerKey, ColumnMetadata.named("consumer_key").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(consumername, ColumnMetadata.named("consumername").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(2).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(description, ColumnMetadata.named("description").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(executingTwoLOUser, ColumnMetadata.named("executing_two_l_o_user").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(publicKey, ColumnMetadata.named("public_key").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(threeLOAllowed, ColumnMetadata.named("three_l_o_allowed").withIndex(11).ofType(Types.VARCHAR).withSize(60));
        addMetadata(twoLOAllowed, ColumnMetadata.named("two_l_o_allowed").withIndex(8).ofType(Types.VARCHAR).withSize(60));
        addMetadata(twoLOImpersonationAllowed, ColumnMetadata.named("two_l_o_impersonation_allowed").withIndex(10).ofType(Types.VARCHAR).withSize(60));
    }

}

