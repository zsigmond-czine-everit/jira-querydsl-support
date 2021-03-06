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
 * QQrtzCronTriggers is a Querydsl query type for QQrtzCronTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzCronTriggers extends com.querydsl.sql.RelationalPathBase<QQrtzCronTriggers> {

    private static final long serialVersionUID = -381106520;

    public static final QQrtzCronTriggers qrtzCronTriggers = new QQrtzCronTriggers("qrtz_cron_triggers");

    public final StringPath cronexperssion = createString("cronexperssion");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> triggerId = createNumber("triggerId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QQrtzCronTriggers> qrtzCronTriggersPk = createPrimaryKey(id);

    public QQrtzCronTriggers(String variable) {
        super(QQrtzCronTriggers.class, forVariable(variable), "public", "qrtz_cron_triggers");
        addMetadata();
    }

    public QQrtzCronTriggers(String variable, String schema, String table) {
        super(QQrtzCronTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzCronTriggers(Path<? extends QQrtzCronTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "qrtz_cron_triggers");
        addMetadata();
    }

    public QQrtzCronTriggers(PathMetadata metadata) {
        super(QQrtzCronTriggers.class, metadata, "public", "qrtz_cron_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cronexperssion, ColumnMetadata.named("cronexperssion").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(triggerId, ColumnMetadata.named("trigger_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
    }

}

