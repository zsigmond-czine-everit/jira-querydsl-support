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
 * QClusternodeheartbeat is a Querydsl query type for QClusternodeheartbeat
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QClusternodeheartbeat extends com.querydsl.sql.RelationalPathBase<QClusternodeheartbeat> {

    private static final long serialVersionUID = 358918072;

    public static final QClusternodeheartbeat clusternodeheartbeat = new QClusternodeheartbeat("clusternodeheartbeat");

    public final NumberPath<Long> heartbeatTime = createNumber("heartbeatTime", Long.class);

    public final StringPath nodeId = createString("nodeId");

    public final com.querydsl.sql.PrimaryKey<QClusternodeheartbeat> clusternodeheartbeatPk = createPrimaryKey(nodeId);

    public QClusternodeheartbeat(String variable) {
        super(QClusternodeheartbeat.class, forVariable(variable), "public", "clusternodeheartbeat");
        addMetadata();
    }

    public QClusternodeheartbeat(String variable, String schema, String table) {
        super(QClusternodeheartbeat.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusternodeheartbeat(Path<? extends QClusternodeheartbeat> path) {
        super(path.getType(), path.getMetadata(), "public", "clusternodeheartbeat");
        addMetadata();
    }

    public QClusternodeheartbeat(PathMetadata metadata) {
        super(QClusternodeheartbeat.class, metadata, "public", "clusternodeheartbeat");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(heartbeatTime, ColumnMetadata.named("heartbeat_time").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(nodeId, ColumnMetadata.named("node_id").withIndex(1).ofType(Types.VARCHAR).withSize(60).notNull());
    }

}

