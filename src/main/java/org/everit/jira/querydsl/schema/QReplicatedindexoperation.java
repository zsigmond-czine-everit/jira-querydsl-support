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
 * QReplicatedindexoperation is a Querydsl query type for QReplicatedindexoperation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QReplicatedindexoperation extends com.querydsl.sql.RelationalPathBase<QReplicatedindexoperation> {

    private static final long serialVersionUID = 1130677288;

    public static final QReplicatedindexoperation replicatedindexoperation = new QReplicatedindexoperation("replicatedindexoperation");

    public final StringPath affectedIds = createString("affectedIds");

    public final StringPath affectedIndex = createString("affectedIndex");

    public final StringPath entityType = createString("entityType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> indexTime = createDateTime("indexTime", java.sql.Timestamp.class);

    public final StringPath nodeId = createString("nodeId");

    public final StringPath operation = createString("operation");

    public final com.querydsl.sql.PrimaryKey<QReplicatedindexoperation> replicatedindexoperationPk = createPrimaryKey(id);

    public QReplicatedindexoperation(String variable) {
        super(QReplicatedindexoperation.class, forVariable(variable), "public", "replicatedindexoperation");
        addMetadata();
    }

    public QReplicatedindexoperation(String variable, String schema, String table) {
        super(QReplicatedindexoperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QReplicatedindexoperation(Path<? extends QReplicatedindexoperation> path) {
        super(path.getType(), path.getMetadata(), "public", "replicatedindexoperation");
        addMetadata();
    }

    public QReplicatedindexoperation(PathMetadata metadata) {
        super(QReplicatedindexoperation.class, metadata, "public", "replicatedindexoperation");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(affectedIds, ColumnMetadata.named("affected_ids").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(affectedIndex, ColumnMetadata.named("affected_index").withIndex(4).ofType(Types.VARCHAR).withSize(60));
        addMetadata(entityType, ColumnMetadata.named("entity_type").withIndex(5).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(indexTime, ColumnMetadata.named("index_time").withIndex(2).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(nodeId, ColumnMetadata.named("node_id").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(operation, ColumnMetadata.named("operation").withIndex(7).ofType(Types.VARCHAR).withSize(60));
    }

}

