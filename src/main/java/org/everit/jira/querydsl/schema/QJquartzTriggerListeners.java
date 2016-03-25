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
 * QJquartzTriggerListeners is a Querydsl query type for QJquartzTriggerListeners
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzTriggerListeners extends com.querydsl.sql.RelationalPathBase<QJquartzTriggerListeners> {

    private static final long serialVersionUID = 436650964;

    public static final QJquartzTriggerListeners jquartzTriggerListeners = new QJquartzTriggerListeners("jquartz_trigger_listeners");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerListener = createString("triggerListener");

    public final StringPath triggerName = createString("triggerName");

    public final com.querydsl.sql.PrimaryKey<QJquartzTriggerListeners> jquartzTriggerListenersPk = createPrimaryKey(triggerGroup, triggerListener);

    public QJquartzTriggerListeners(String variable) {
        super(QJquartzTriggerListeners.class, forVariable(variable), "public", "jquartz_trigger_listeners");
        addMetadata();
    }

    public QJquartzTriggerListeners(String variable, String schema, String table) {
        super(QJquartzTriggerListeners.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzTriggerListeners(Path<? extends QJquartzTriggerListeners> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_trigger_listeners");
        addMetadata();
    }

    public QJquartzTriggerListeners(PathMetadata metadata) {
        super(QJquartzTriggerListeners.class, metadata, "public", "jquartz_trigger_listeners");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerListener, ColumnMetadata.named("trigger_listener").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("trigger_name").withIndex(1).ofType(Types.VARCHAR).withSize(200));
    }

}

