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
 * QQrtzFiredTriggers is a Querydsl query type for QQrtzFiredTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzFiredTriggers extends com.querydsl.sql.RelationalPathBase<QQrtzFiredTriggers> {

    private static final long serialVersionUID = -442917782;

    public static final QQrtzFiredTriggers qrtzFiredTriggers = new QQrtzFiredTriggers("qrtz_fired_triggers");

    public final StringPath entryId = createString("entryId");

    public final DateTimePath<java.sql.Timestamp> firedTime = createDateTime("firedTime", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final StringPath triggerListener = createString("triggerListener");

    public final StringPath triggerState = createString("triggerState");

    public final com.querydsl.sql.PrimaryKey<QQrtzFiredTriggers> qrtzFiredTriggersPk = createPrimaryKey(entryId);

    public QQrtzFiredTriggers(String variable) {
        super(QQrtzFiredTriggers.class, forVariable(variable), "public", "qrtz_fired_triggers");
        addMetadata();
    }

    public QQrtzFiredTriggers(String variable, String schema, String table) {
        super(QQrtzFiredTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzFiredTriggers(Path<? extends QQrtzFiredTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "qrtz_fired_triggers");
        addMetadata();
    }

    public QQrtzFiredTriggers(PathMetadata metadata) {
        super(QQrtzFiredTriggers.class, metadata, "public", "qrtz_fired_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entryId, ColumnMetadata.named("entry_id").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(firedTime, ColumnMetadata.named("fired_time").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18));
        addMetadata(triggerId, ColumnMetadata.named("trigger_id").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(triggerListener, ColumnMetadata.named("trigger_listener").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(triggerState, ColumnMetadata.named("trigger_state").withIndex(6).ofType(Types.VARCHAR).withSize(255));
    }

}

