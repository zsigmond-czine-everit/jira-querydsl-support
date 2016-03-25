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
 * QJquartzTriggers is a Querydsl query type for QJquartzTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzTriggers extends com.querydsl.sql.RelationalPathBase<QJquartzTriggers> {

    private static final long serialVersionUID = 1703696168;

    public static final QJquartzTriggers jquartzTriggers = new QJquartzTriggers("jquartz_triggers");

    public final StringPath calendarName = createString("calendarName");

    public final StringPath description = createString("description");

    public final NumberPath<Long> endTime = createNumber("endTime", Long.class);

    public final BooleanPath isVolatile = createBoolean("isVolatile");

    public final SimplePath<byte[]> jobData = createSimple("jobData", byte[].class);

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final NumberPath<Short> misfireInstr = createNumber("misfireInstr", Short.class);

    public final NumberPath<Long> nextFireTime = createNumber("nextFireTime", Long.class);

    public final NumberPath<Long> prevFireTime = createNumber("prevFireTime", Long.class);

    public final NumberPath<Integer> priority = createNumber("priority", Integer.class);

    public final StringPath schedName = createString("schedName");

    public final NumberPath<Long> startTime = createNumber("startTime", Long.class);

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final StringPath triggerState = createString("triggerState");

    public final StringPath triggerType = createString("triggerType");

    public final com.querydsl.sql.PrimaryKey<QJquartzTriggers> jquartzTriggersPk = createPrimaryKey(triggerName, triggerGroup);

    public QJquartzTriggers(String variable) {
        super(QJquartzTriggers.class, forVariable(variable), "public", "jquartz_triggers");
        addMetadata();
    }

    public QJquartzTriggers(String variable, String schema, String table) {
        super(QJquartzTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzTriggers(Path<? extends QJquartzTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_triggers");
        addMetadata();
    }

    public QJquartzTriggers(PathMetadata metadata) {
        super(QJquartzTriggers.class, metadata, "public", "jquartz_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendarName, ColumnMetadata.named("calendar_name").withIndex(15).ofType(Types.VARCHAR).withSize(200));
        addMetadata(description, ColumnMetadata.named("description").withIndex(7).ofType(Types.VARCHAR).withSize(250));
        addMetadata(endTime, ColumnMetadata.named("end_time").withIndex(14).ofType(Types.NUMERIC).withSize(18));
        addMetadata(isVolatile, ColumnMetadata.named("is_volatile").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(jobData, ColumnMetadata.named("job_data").withIndex(17).ofType(Types.BINARY).withSize(2147483647));
        addMetadata(jobGroup, ColumnMetadata.named("job_group").withIndex(5).ofType(Types.VARCHAR).withSize(200));
        addMetadata(jobName, ColumnMetadata.named("job_name").withIndex(4).ofType(Types.VARCHAR).withSize(200));
        addMetadata(misfireInstr, ColumnMetadata.named("misfire_instr").withIndex(16).ofType(Types.NUMERIC).withSize(4));
        addMetadata(nextFireTime, ColumnMetadata.named("next_fire_time").withIndex(8).ofType(Types.NUMERIC).withSize(18));
        addMetadata(prevFireTime, ColumnMetadata.named("prev_fire_time").withIndex(9).ofType(Types.NUMERIC).withSize(18));
        addMetadata(priority, ColumnMetadata.named("priority").withIndex(10).ofType(Types.NUMERIC).withSize(9));
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(13).ofType(Types.NUMERIC).withSize(18));
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("trigger_name").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerState, ColumnMetadata.named("trigger_state").withIndex(11).ofType(Types.VARCHAR).withSize(16));
        addMetadata(triggerType, ColumnMetadata.named("trigger_type").withIndex(12).ofType(Types.VARCHAR).withSize(8));
    }

}

