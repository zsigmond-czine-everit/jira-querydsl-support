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
 * QQrtzSimpleTriggers is a Querydsl query type for QQrtzSimpleTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzSimpleTriggers extends com.querydsl.sql.RelationalPathBase<QQrtzSimpleTriggers> {

    private static final long serialVersionUID = -1288780276;

    public static final QQrtzSimpleTriggers qrtzSimpleTriggers = new QQrtzSimpleTriggers("qrtz_simple_triggers");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> repeatCount = createNumber("repeatCount", Integer.class);

    public final NumberPath<Long> repeatInterval = createNumber("repeatInterval", Long.class);

    public final NumberPath<Integer> timesTriggered = createNumber("timesTriggered", Integer.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QQrtzSimpleTriggers> qrtzSimpleTriggersPk = createPrimaryKey(id);

    public QQrtzSimpleTriggers(String variable) {
        super(QQrtzSimpleTriggers.class, forVariable(variable), "public", "qrtz_simple_triggers");
        addMetadata();
    }

    public QQrtzSimpleTriggers(String variable, String schema, String table) {
        super(QQrtzSimpleTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzSimpleTriggers(Path<? extends QQrtzSimpleTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "qrtz_simple_triggers");
        addMetadata();
    }

    public QQrtzSimpleTriggers(PathMetadata metadata) {
        super(QQrtzSimpleTriggers.class, metadata, "public", "qrtz_simple_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(repeatCount, ColumnMetadata.named("repeat_count").withIndex(3).ofType(Types.NUMERIC).withSize(9));
        addMetadata(repeatInterval, ColumnMetadata.named("repeat_interval").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(timesTriggered, ColumnMetadata.named("times_triggered").withIndex(5).ofType(Types.NUMERIC).withSize(9));
        addMetadata(triggerId, ColumnMetadata.named("trigger_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
    }

}

