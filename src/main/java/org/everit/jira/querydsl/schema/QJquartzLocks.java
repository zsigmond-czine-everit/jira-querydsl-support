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
 * QJquartzLocks is a Querydsl query type for QJquartzLocks
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzLocks extends com.querydsl.sql.RelationalPathBase<QJquartzLocks> {

    private static final long serialVersionUID = -1006523813;

    public static final QJquartzLocks jquartzLocks = new QJquartzLocks("jquartz_locks");

    public final StringPath lockName = createString("lockName");

    public final StringPath schedName = createString("schedName");

    public final com.querydsl.sql.PrimaryKey<QJquartzLocks> jquartzLocksPk = createPrimaryKey(lockName);

    public QJquartzLocks(String variable) {
        super(QJquartzLocks.class, forVariable(variable), "public", "jquartz_locks");
        addMetadata();
    }

    public QJquartzLocks(String variable, String schema, String table) {
        super(QJquartzLocks.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzLocks(Path<? extends QJquartzLocks> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_locks");
        addMetadata();
    }

    public QJquartzLocks(PathMetadata metadata) {
        super(QJquartzLocks.class, metadata, "public", "jquartz_locks");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(lockName, ColumnMetadata.named("lock_name").withIndex(2).ofType(Types.VARCHAR).withSize(40).notNull());
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

