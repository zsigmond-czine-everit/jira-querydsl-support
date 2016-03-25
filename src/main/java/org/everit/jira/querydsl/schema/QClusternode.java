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
 * QClusternode is a Querydsl query type for QClusternode
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QClusternode extends com.querydsl.sql.RelationalPathBase<QClusternode> {

    private static final long serialVersionUID = 933561796;

    public static final QClusternode clusternode = new QClusternode("clusternode");

    public final StringPath nodeId = createString("nodeId");

    public final StringPath nodeState = createString("nodeState");

    public final com.querydsl.sql.PrimaryKey<QClusternode> clusternodePk = createPrimaryKey(nodeId);

    public QClusternode(String variable) {
        super(QClusternode.class, forVariable(variable), "public", "clusternode");
        addMetadata();
    }

    public QClusternode(String variable, String schema, String table) {
        super(QClusternode.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClusternode(Path<? extends QClusternode> path) {
        super(path.getType(), path.getMetadata(), "public", "clusternode");
        addMetadata();
    }

    public QClusternode(PathMetadata metadata) {
        super(QClusternode.class, metadata, "public", "clusternode");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(nodeId, ColumnMetadata.named("node_id").withIndex(1).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(nodeState, ColumnMetadata.named("node_state").withIndex(2).ofType(Types.VARCHAR).withSize(60));
    }

}

