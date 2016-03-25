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
 * QRemembermetoken is a Querydsl query type for QRemembermetoken
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRemembermetoken extends com.querydsl.sql.RelationalPathBase<QRemembermetoken> {

    private static final long serialVersionUID = 658352892;

    public static final QRemembermetoken remembermetoken = new QRemembermetoken("remembermetoken");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath token = createString("token");

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QRemembermetoken> remembermetokenPk = createPrimaryKey(id);

    public QRemembermetoken(String variable) {
        super(QRemembermetoken.class, forVariable(variable), "public", "remembermetoken");
        addMetadata();
    }

    public QRemembermetoken(String variable, String schema, String table) {
        super(QRemembermetoken.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRemembermetoken(Path<? extends QRemembermetoken> path) {
        super(path.getType(), path.getMetadata(), "public", "remembermetoken");
        addMetadata();
    }

    public QRemembermetoken(PathMetadata metadata) {
        super(QRemembermetoken.class, metadata, "public", "remembermetoken");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("created").withIndex(2).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(token, ColumnMetadata.named("token").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(username, ColumnMetadata.named("username").withIndex(4).ofType(Types.VARCHAR).withSize(255));
    }

}

