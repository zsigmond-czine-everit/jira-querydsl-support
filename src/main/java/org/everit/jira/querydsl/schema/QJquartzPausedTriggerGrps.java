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
 * QJquartzPausedTriggerGrps is a Querydsl query type for QJquartzPausedTriggerGrps
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzPausedTriggerGrps extends com.querydsl.sql.RelationalPathBase<QJquartzPausedTriggerGrps> {

    private static final long serialVersionUID = 326546731;

    public static final QJquartzPausedTriggerGrps jquartzPausedTriggerGrps = new QJquartzPausedTriggerGrps("jquartz_paused_trigger_grps");

    public final StringPath schedName = createString("schedName");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final com.querydsl.sql.PrimaryKey<QJquartzPausedTriggerGrps> jquartzPausedTriggerGrpsPk = createPrimaryKey(triggerGroup);

    public QJquartzPausedTriggerGrps(String variable) {
        super(QJquartzPausedTriggerGrps.class, forVariable(variable), "public", "jquartz_paused_trigger_grps");
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(String variable, String schema, String table) {
        super(QJquartzPausedTriggerGrps.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(Path<? extends QJquartzPausedTriggerGrps> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_paused_trigger_grps");
        addMetadata();
    }

    public QJquartzPausedTriggerGrps(PathMetadata metadata) {
        super(QJquartzPausedTriggerGrps.class, metadata, "public", "jquartz_paused_trigger_grps");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

