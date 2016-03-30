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
 * QQrtzTriggers is a Querydsl query type for QQrtzTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzTriggers extends com.querydsl.sql.RelationalPathBase<QQrtzTriggers> {

    private static final long serialVersionUID = 1668156794;

    public static final QQrtzTriggers qrtzTriggers = new QQrtzTriggers("qrtz_triggers");

    public final StringPath calendarName = createString("calendarName");

    public final DateTimePath<java.sql.Timestamp> endTime = createDateTime("endTime", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> job = createNumber("job", Long.class);

    public final NumberPath<Integer> misfireInstr = createNumber("misfireInstr", Integer.class);

    public final DateTimePath<java.sql.Timestamp> nextFire = createDateTime("nextFire", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final StringPath triggerState = createString("triggerState");

    public final StringPath triggerType = createString("triggerType");

    public final com.querydsl.sql.PrimaryKey<QQrtzTriggers> qrtzTriggersPk = createPrimaryKey(id);

    public QQrtzTriggers(String variable) {
        super(QQrtzTriggers.class, forVariable(variable), "public", "qrtz_triggers");
        addMetadata();
    }

    public QQrtzTriggers(String variable, String schema, String table) {
        super(QQrtzTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzTriggers(Path<? extends QQrtzTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "qrtz_triggers");
        addMetadata();
    }

    public QQrtzTriggers(PathMetadata metadata) {
        super(QQrtzTriggers.class, metadata, "public", "qrtz_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendarName, ColumnMetadata.named("calendar_name").withIndex(10).ofType(Types.VARCHAR).withSize(255));
        addMetadata(endTime, ColumnMetadata.named("end_time").withIndex(9).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(job, ColumnMetadata.named("job").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(misfireInstr, ColumnMetadata.named("misfire_instr").withIndex(11).ofType(Types.NUMERIC).withSize(9));
        addMetadata(nextFire, ColumnMetadata.named("next_fire").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(8).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(triggerName, ColumnMetadata.named("trigger_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(triggerState, ColumnMetadata.named("trigger_state").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(triggerType, ColumnMetadata.named("trigger_type").withIndex(7).ofType(Types.VARCHAR).withSize(60));
    }

}

