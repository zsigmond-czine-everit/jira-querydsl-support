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
 * QJquartzSimpleTriggers is a Querydsl query type for QJquartzSimpleTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzSimpleTriggers extends com.querydsl.sql.RelationalPathBase<QJquartzSimpleTriggers> {

    private static final long serialVersionUID = -1037134534;

    public static final QJquartzSimpleTriggers jquartzSimpleTriggers = new QJquartzSimpleTriggers("jquartz_simple_triggers");

    public final NumberPath<Long> repeatCount = createNumber("repeatCount", Long.class);

    public final NumberPath<Long> repeatInterval = createNumber("repeatInterval", Long.class);

    public final StringPath schedName = createString("schedName");

    public final NumberPath<Long> timesTriggered = createNumber("timesTriggered", Long.class);

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.querydsl.sql.PrimaryKey<QJquartzSimpleTriggers> jquartzSimpleTriggersPk = createPrimaryKey(triggerName, triggerGroup);

    public QJquartzSimpleTriggers(String variable) {
        super(QJquartzSimpleTriggers.class, forVariable(variable), "public", "jquartz_simple_triggers");
        addMetadata();
    }

    public QJquartzSimpleTriggers(String variable, String schema, String table) {
        super(QJquartzSimpleTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzSimpleTriggers(Path<? extends QJquartzSimpleTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_simple_triggers");
        addMetadata();
    }

    public QJquartzSimpleTriggers(PathMetadata metadata) {
        super(QJquartzSimpleTriggers.class, metadata, "public", "jquartz_simple_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(repeatCount, ColumnMetadata.named("repeat_count").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(repeatInterval, ColumnMetadata.named("repeat_interval").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(timesTriggered, ColumnMetadata.named("times_triggered").withIndex(6).ofType(Types.NUMERIC).withSize(18));
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("trigger_name").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

