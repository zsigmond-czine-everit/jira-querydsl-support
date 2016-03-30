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
 * QGlobalpermissionentry is a Querydsl query type for QGlobalpermissionentry
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QGlobalpermissionentry extends com.querydsl.sql.RelationalPathBase<QGlobalpermissionentry> {

    private static final long serialVersionUID = 156067528;

    public static final QGlobalpermissionentry globalpermissionentry = new QGlobalpermissionentry("globalpermissionentry");

    public final StringPath groupId = createString("groupId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath permission = createString("permission");

    public final com.querydsl.sql.PrimaryKey<QGlobalpermissionentry> globalpermissionentryPk = createPrimaryKey(id);

    public QGlobalpermissionentry(String variable) {
        super(QGlobalpermissionentry.class, forVariable(variable), "public", "globalpermissionentry");
        addMetadata();
    }

    public QGlobalpermissionentry(String variable, String schema, String table) {
        super(QGlobalpermissionentry.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QGlobalpermissionentry(Path<? extends QGlobalpermissionentry> path) {
        super(path.getType(), path.getMetadata(), "public", "globalpermissionentry");
        addMetadata();
    }

    public QGlobalpermissionentry(PathMetadata metadata) {
        super(QGlobalpermissionentry.class, metadata, "public", "globalpermissionentry");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(permission, ColumnMetadata.named("permission").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

