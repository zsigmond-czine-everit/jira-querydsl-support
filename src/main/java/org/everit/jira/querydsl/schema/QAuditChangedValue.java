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
 * QAuditChangedValue is a Querydsl query type for QAuditChangedValue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAuditChangedValue extends com.querydsl.sql.RelationalPathBase<QAuditChangedValue> {

    private static final long serialVersionUID = -1097897120;

    public static final QAuditChangedValue auditChangedValue = new QAuditChangedValue("audit_changed_value");

    public final StringPath deltaFrom = createString("deltaFrom");

    public final StringPath deltaTo = createString("deltaTo");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> logId = createNumber("logId", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QAuditChangedValue> auditChangedValuePk = createPrimaryKey(id);

    public QAuditChangedValue(String variable) {
        super(QAuditChangedValue.class, forVariable(variable), "public", "audit_changed_value");
        addMetadata();
    }

    public QAuditChangedValue(String variable, String schema, String table) {
        super(QAuditChangedValue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAuditChangedValue(Path<? extends QAuditChangedValue> path) {
        super(path.getType(), path.getMetadata(), "public", "audit_changed_value");
        addMetadata();
    }

    public QAuditChangedValue(PathMetadata metadata) {
        super(QAuditChangedValue.class, metadata, "public", "audit_changed_value");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(deltaFrom, ColumnMetadata.named("delta_from").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(deltaTo, ColumnMetadata.named("delta_to").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(logId, ColumnMetadata.named("log_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(name, ColumnMetadata.named("name").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

