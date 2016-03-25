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
 * QUserassociation is a Querydsl query type for QUserassociation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserassociation extends com.querydsl.sql.RelationalPathBase<QUserassociation> {

    private static final long serialVersionUID = -1779670370;

    public static final QUserassociation userassociation = new QUserassociation("userassociation");

    public final StringPath associationType = createString("associationType");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final StringPath sinkNodeEntity = createString("sinkNodeEntity");

    public final NumberPath<Long> sinkNodeId = createNumber("sinkNodeId", Long.class);

    public final StringPath sourceName = createString("sourceName");

    public final com.querydsl.sql.PrimaryKey<QUserassociation> userassociationPk = createPrimaryKey(sourceName, sinkNodeId, sinkNodeEntity, associationType);

    public QUserassociation(String variable) {
        super(QUserassociation.class, forVariable(variable), "public", "userassociation");
        addMetadata();
    }

    public QUserassociation(String variable, String schema, String table) {
        super(QUserassociation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserassociation(Path<? extends QUserassociation> path) {
        super(path.getType(), path.getMetadata(), "public", "userassociation");
        addMetadata();
    }

    public QUserassociation(PathMetadata metadata) {
        super(QUserassociation.class, metadata, "public", "userassociation");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(associationType, ColumnMetadata.named("association_type").withIndex(4).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(created, ColumnMetadata.named("created").withIndex(6).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(5).ofType(Types.NUMERIC).withSize(9));
        addMetadata(sinkNodeEntity, ColumnMetadata.named("sink_node_entity").withIndex(3).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(sinkNodeId, ColumnMetadata.named("sink_node_id").withIndex(2).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(sourceName, ColumnMetadata.named("source_name").withIndex(1).ofType(Types.VARCHAR).withSize(60).notNull());
    }

}

