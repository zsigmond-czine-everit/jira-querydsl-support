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
 * QSchemepermissions is a Querydsl query type for QSchemepermissions
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSchemepermissions extends com.querydsl.sql.RelationalPathBase<QSchemepermissions> {

    private static final long serialVersionUID = 363516551;

    public static final QSchemepermissions schemepermissions = new QSchemepermissions("schemepermissions");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> permission = createNumber("permission", Long.class);

    public final StringPath permissionKey = createString("permissionKey");

    public final StringPath permParameter = createString("permParameter");

    public final StringPath permType = createString("permType");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.querydsl.sql.PrimaryKey<QSchemepermissions> schemepermissionsPk = createPrimaryKey(id);

    public QSchemepermissions(String variable) {
        super(QSchemepermissions.class, forVariable(variable), "public", "schemepermissions");
        addMetadata();
    }

    public QSchemepermissions(String variable, String schema, String table) {
        super(QSchemepermissions.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSchemepermissions(Path<? extends QSchemepermissions> path) {
        super(path.getType(), path.getMetadata(), "public", "schemepermissions");
        addMetadata();
    }

    public QSchemepermissions(PathMetadata metadata) {
        super(QSchemepermissions.class, metadata, "public", "schemepermissions");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(permission, ColumnMetadata.named("permission").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(permissionKey, ColumnMetadata.named("permission_key").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(permParameter, ColumnMetadata.named("perm_parameter").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(permType, ColumnMetadata.named("perm_type").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(scheme, ColumnMetadata.named("scheme").withIndex(2).ofType(Types.NUMERIC).withSize(18));
    }

}

