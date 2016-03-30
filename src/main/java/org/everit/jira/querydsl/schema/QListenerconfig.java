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
 * QListenerconfig is a Querydsl query type for QListenerconfig
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QListenerconfig extends com.querydsl.sql.RelationalPathBase<QListenerconfig> {

    private static final long serialVersionUID = 1997064494;

    public static final QListenerconfig listenerconfig = new QListenerconfig("listenerconfig");

    public final StringPath clazz = createString("clazz");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath listenername = createString("listenername");

    public final com.querydsl.sql.PrimaryKey<QListenerconfig> listenerconfigPk = createPrimaryKey(id);

    public QListenerconfig(String variable) {
        super(QListenerconfig.class, forVariable(variable), "public", "listenerconfig");
        addMetadata();
    }

    public QListenerconfig(String variable, String schema, String table) {
        super(QListenerconfig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QListenerconfig(Path<? extends QListenerconfig> path) {
        super(path.getType(), path.getMetadata(), "public", "listenerconfig");
        addMetadata();
    }

    public QListenerconfig(PathMetadata metadata) {
        super(QListenerconfig.class, metadata, "public", "listenerconfig");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clazz, ColumnMetadata.named("clazz").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(listenername, ColumnMetadata.named("listenername").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

