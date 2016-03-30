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
 * QQrtzTriggerListeners is a Querydsl query type for QQrtzTriggerListeners
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzTriggerListeners extends com.querydsl.sql.RelationalPathBase<QQrtzTriggerListeners> {

    private static final long serialVersionUID = -876738522;

    public static final QQrtzTriggerListeners qrtzTriggerListeners = new QQrtzTriggerListeners("qrtz_trigger_listeners");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final StringPath triggerListener = createString("triggerListener");

    public final com.querydsl.sql.PrimaryKey<QQrtzTriggerListeners> qrtzTriggerListenersPk = createPrimaryKey(id);

    public QQrtzTriggerListeners(String variable) {
        super(QQrtzTriggerListeners.class, forVariable(variable), "public", "qrtz_trigger_listeners");
        addMetadata();
    }

    public QQrtzTriggerListeners(String variable, String schema, String table) {
        super(QQrtzTriggerListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzTriggerListeners(Path<? extends QQrtzTriggerListeners> path) {
        super(path.getType(), path.getMetadata(), "public", "qrtz_trigger_listeners");
        addMetadata();
    }

    public QQrtzTriggerListeners(PathMetadata metadata) {
        super(QQrtzTriggerListeners.class, metadata, "public", "qrtz_trigger_listeners");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(triggerId, ColumnMetadata.named("trigger_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(triggerListener, ColumnMetadata.named("trigger_listener").withIndex(3).ofType(Types.VARCHAR).withSize(255));
    }

}

