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
 * QAuditItem is a Querydsl query type for QAuditItem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditItem extends com.querydsl.sql.RelationalPathBase<QAuditItem> {

    private static final long serialVersionUID = 33753686;

    public static final QAuditItem auditItem = new QAuditItem("audit_item");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> logId = createNumber("logId", Long.class);

    public final StringPath objectId = createString("objectId");

    public final StringPath objectName = createString("objectName");

    public final StringPath objectParentId = createString("objectParentId");

    public final StringPath objectParentName = createString("objectParentName");

    public final StringPath objectType = createString("objectType");

    public final com.querydsl.sql.PrimaryKey<QAuditItem> auditItemPk = createPrimaryKey(id);

    public QAuditItem(String variable) {
        super(QAuditItem.class, forVariable(variable), "public", "audit_item");
        addMetadata();
    }

    public QAuditItem(String variable, String schema, String table) {
        super(QAuditItem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditItem(Path<? extends QAuditItem> path) {
        super(path.getType(), path.getMetadata(), "public", "audit_item");
        addMetadata();
    }

    public QAuditItem(PathMetadata metadata) {
        super(QAuditItem.class, metadata, "public", "audit_item");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(logId, ColumnMetadata.named("log_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(objectId, ColumnMetadata.named("object_id").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(objectName, ColumnMetadata.named("object_name").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(objectParentId, ColumnMetadata.named("object_parent_id").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(objectParentName, ColumnMetadata.named("object_parent_name").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(objectType, ColumnMetadata.named("object_type").withIndex(3).ofType(Types.VARCHAR).withSize(60));
    }

}

