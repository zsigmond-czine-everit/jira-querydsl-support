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
 * QJquartzBlobTriggers is a Querydsl query type for QJquartzBlobTriggers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzBlobTriggers extends com.querydsl.sql.RelationalPathBase<QJquartzBlobTriggers> {

    private static final long serialVersionUID = 1114341221;

    public static final QJquartzBlobTriggers jquartzBlobTriggers = new QJquartzBlobTriggers("jquartz_blob_triggers");

    public final SimplePath<byte[]> blobData = createSimple("blobData", byte[].class);

    public final StringPath schedName = createString("schedName");

    public final StringPath triggerGroup = createString("triggerGroup");

    public final StringPath triggerName = createString("triggerName");

    public final com.querydsl.sql.PrimaryKey<QJquartzBlobTriggers> jquartzBlobTriggersPk = createPrimaryKey(triggerName, triggerGroup);

    public QJquartzBlobTriggers(String variable) {
        super(QJquartzBlobTriggers.class, forVariable(variable), "public", "jquartz_blob_triggers");
        addMetadata();
    }

    public QJquartzBlobTriggers(String variable, String schema, String table) {
        super(QJquartzBlobTriggers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzBlobTriggers(Path<? extends QJquartzBlobTriggers> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_blob_triggers");
        addMetadata();
    }

    public QJquartzBlobTriggers(PathMetadata metadata) {
        super(QJquartzBlobTriggers.class, metadata, "public", "jquartz_blob_triggers");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(blobData, ColumnMetadata.named("blob_data").withIndex(4).ofType(Types.BINARY).withSize(2147483647));
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
        addMetadata(triggerGroup, ColumnMetadata.named("trigger_group").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(triggerName, ColumnMetadata.named("trigger_name").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
    }

}

