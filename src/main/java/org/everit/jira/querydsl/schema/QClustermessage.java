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
 * QClustermessage is a Querydsl query type for QClustermessage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QClustermessage extends com.querydsl.sql.RelationalPathBase<QClustermessage> {

    private static final long serialVersionUID = 666794245;

    public static final QClustermessage clustermessage = new QClustermessage("clustermessage");

    public final StringPath claimedByNode = createString("claimedByNode");

    public final StringPath destinationNode = createString("destinationNode");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath message = createString("message");

    public final DateTimePath<java.sql.Timestamp> messageTime = createDateTime("messageTime", java.sql.Timestamp.class);

    public final StringPath sourceNode = createString("sourceNode");

    public final com.querydsl.sql.PrimaryKey<QClustermessage> clustermessagePk = createPrimaryKey(id);

    public QClustermessage(String variable) {
        super(QClustermessage.class, forVariable(variable), "public", "clustermessage");
        addMetadata();
    }

    public QClustermessage(String variable, String schema, String table) {
        super(QClustermessage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QClustermessage(Path<? extends QClustermessage> path) {
        super(path.getType(), path.getMetadata(), "public", "clustermessage");
        addMetadata();
    }

    public QClustermessage(PathMetadata metadata) {
        super(QClustermessage.class, metadata, "public", "clustermessage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(claimedByNode, ColumnMetadata.named("claimed_by_node").withIndex(4).ofType(Types.VARCHAR).withSize(60));
        addMetadata(destinationNode, ColumnMetadata.named("destination_node").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(message, ColumnMetadata.named("message").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(messageTime, ColumnMetadata.named("message_time").withIndex(6).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(sourceNode, ColumnMetadata.named("source_node").withIndex(2).ofType(Types.VARCHAR).withSize(60));
    }

}

