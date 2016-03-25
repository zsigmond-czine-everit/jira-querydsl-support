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
 * QJquartzFiredTriggers is a Querydsl query type for QJquartzFiredTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzFiredTriggers extends com.querydsl.sql.RelationalPathBase<QJquartzFiredTriggers> {

    private static final long serialVersionUID = 1089220476;

    public static final QJquartzFiredTriggers jquartzFiredTriggers = new QJquartzFiredTriggers("jquartz_fired_triggers");

    public final StringPath entryId = createString("entryId");

    public final NumberPath<Long> firedTime = createNumber("firedTime", Long.class);

    public final StringPath instanceName = createString("instanceName");

    public final BooleanPath isNonconcurrent = createBoolean("isNonconcurrent");

    public final BooleanPath isStateful = createBoolean("isStateful");

    public final BooleanPath isUpdateData = createBoolean("isUpdateData");

    public final BooleanPath isVolatile = createBoolean("isVolatile");

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public final BooleanPath requestsRecovery = createBoolean("requestsRecovery");

    public final StringPath schedName = createString("schedName");

    public final NumberPath<Long> schedTime = createNumber("schedTime", Long.class);

    public final StringPath state = createString("state");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.querydsl.sql.PrimaryKey<QJquartzFiredTriggers> jquartzFiredTriggersPk = createPrimaryKey(entryId);

    public QJquartzFiredTriggers(String variable) {
        super(QJquartzFiredTriggers.class, forVariable(variable), "public", "jquartz_fired_triggers");
        addMetadata();
    }

    public QJquartzFiredTriggers(String variable, String schema, String table) {
        super(QJquartzFiredTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzFiredTriggers(Path<? extends QJquartzFiredTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_fired_triggers");
        addMetadata();
    }

    public QJquartzFiredTriggers(PathMetadata metadata) {
        super(QJquartzFiredTriggers.class, metadata, "public", "jquartz_fired_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entryId, ColumnMetadata.named("entry_id").withIndex(2).ofType(Types.VARCHAR).withSize(95).notNull());
        addMetadata(firedTime, ColumnMetadata.named("fired_time").withIndex(7).ofType(Types.NUMERIC).withSize(18));
        addMetadata(instanceName, ColumnMetadata.named("instance_name").withIndex(6).ofType(Types.VARCHAR).withSize(200));
        addMetadata(isNonconcurrent, ColumnMetadata.named("is_nonconcurrent").withIndex(14).ofType(Types.BIT).withSize(1));
        addMetadata(isStateful, ColumnMetadata.named("is_stateful").withIndex(13).ofType(Types.BIT).withSize(1));
        addMetadata(isUpdateData, ColumnMetadata.named("is_update_data").withIndex(15).ofType(Types.BIT).withSize(1));
        addMetadata(isVolatile, ColumnMetadata.named("is_volatile").withIndex(5).ofType(Types.BIT).withSize(1));
        addMetadata(jobGroup, ColumnMetadata.named("job_group").withIndex(12).ofType(Types.VARCHAR).withSize(200));
        addMetadata(jobName, ColumnMetadata.named("job_name").withIndex(11).ofType(Types.VARCHAR).withSize(200));
        addMetadata(priority, ColumnMetadata.named("priority").withIndex(9).ofType(Types.NUMERIC).withSize(9));
        addMetadata(requestsRecovery, ColumnMetadata.named("requests_recovery").withIndex(16).ofType(Types.BIT).withSize(1));
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(schedTime, ColumnMetadata.named("sched_time").withIndex(8).ofType(Types.NUMERIC).withSize(18));
        addMetadata(state, ColumnMetadata.named("state").withIndex(10).ofType(Types.VARCHAR).withSize(16));
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(triggerName, ColumnMetadata.named("trigger_name").withIndex(3).ofType(Types.VARCHAR).withSize(200));
    }

}

