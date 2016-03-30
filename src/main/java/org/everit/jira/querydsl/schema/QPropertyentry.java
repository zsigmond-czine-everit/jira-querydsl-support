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
 * QPropertyentry is a Querydsl query type for QPropertyentry
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPropertyentry extends com.querydsl.sql.RelationalPathBase<QPropertyentry> {

    private static final long serialVersionUID = -443955067;

    public static final QPropertyentry propertyentry = new QPropertyentry("propertyentry");

    public final NumberPath<Long> entityId = createNumber("entityId", Long.class);

    public final StringPath entityName = createString("entityName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath propertyKey = createString("propertyKey");

    public final NumberPath<Integer> propertytype = createNumber("propertytype", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QPropertyentry> propertyentryPk = createPrimaryKey(id);

    public QPropertyentry(String variable) {
        super(QPropertyentry.class, forVariable(variable), "public", "propertyentry");
        addMetadata();
    }

    public QPropertyentry(String variable, String schema, String table) {
        super(QPropertyentry.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPropertyentry(Path<? extends QPropertyentry> path) {
        super(path.getType(), path.getMetadata(), "public", "propertyentry");
        addMetadata();
    }

    public QPropertyentry(PathMetadata metadata) {
        super(QPropertyentry.class, metadata, "public", "propertyentry");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entityId, ColumnMetadata.named("entity_id").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(entityName, ColumnMetadata.named("entity_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(propertyKey, ColumnMetadata.named("property_key").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(propertytype, ColumnMetadata.named("propertytype").withIndex(5).ofType(Types.NUMERIC).withSize(9));
    }

}

