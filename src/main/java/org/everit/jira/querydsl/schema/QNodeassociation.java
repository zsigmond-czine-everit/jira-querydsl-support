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
 * QNodeassociation is a Querydsl query type for QNodeassociation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNodeassociation extends com.querydsl.sql.RelationalPathBase<QNodeassociation> {

    private static final long serialVersionUID = 1189931015;

    public static final QNodeassociation nodeassociation = new QNodeassociation("nodeassociation");

    public final StringPath associationType = createString("associationType");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final StringPath sinkNodeEntity = createString("sinkNodeEntity");

    public final NumberPath<Long> sinkNodeId = createNumber("sinkNodeId", Long.class);

    public final StringPath sourceNodeEntity = createString("sourceNodeEntity");

    public final NumberPath<Long> sourceNodeId = createNumber("sourceNodeId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QNodeassociation> nodeassociationPk = createPrimaryKey(sourceNodeId, sourceNodeEntity, sinkNodeId, sinkNodeEntity, associationType);

    public QNodeassociation(String variable) {
        super(QNodeassociation.class, forVariable(variable), "public", "nodeassociation");
        addMetadata();
    }

    public QNodeassociation(String variable, String schema, String table) {
        super(QNodeassociation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNodeassociation(Path<? extends QNodeassociation> path) {
        super(path.getType(), path.getMetadata(), "public", "nodeassociation");
        addMetadata();
    }

    public QNodeassociation(PathMetadata metadata) {
        super(QNodeassociation.class, metadata, "public", "nodeassociation");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(associationType, ColumnMetadata.named("association_type").withIndex(5).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(6).ofType(Types.NUMERIC).withSize(9));
        addMetadata(sinkNodeEntity, ColumnMetadata.named("sink_node_entity").withIndex(4).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(sinkNodeId, ColumnMetadata.named("sink_node_id").withIndex(3).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(sourceNodeEntity, ColumnMetadata.named("source_node_entity").withIndex(2).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(sourceNodeId, ColumnMetadata.named("source_node_id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
    }

}

