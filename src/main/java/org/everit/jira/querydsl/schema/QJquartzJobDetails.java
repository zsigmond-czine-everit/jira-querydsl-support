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
 * QJquartzJobDetails is a Querydsl query type for QJquartzJobDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QJquartzJobDetails extends com.querydsl.sql.RelationalPathBase<QJquartzJobDetails> {

    private static final long serialVersionUID = -689504782;

    public static final QJquartzJobDetails jquartzJobDetails = new QJquartzJobDetails("jquartz_job_details");

    public final StringPath description = createString("description");

    public final BooleanPath isDurable = createBoolean("isDurable");

    public final BooleanPath isNonconcurrent = createBoolean("isNonconcurrent");

    public final BooleanPath isStateful = createBoolean("isStateful");

    public final BooleanPath isUpdateData = createBoolean("isUpdateData");

    public final BooleanPath isVolatile = createBoolean("isVolatile");

    public final StringPath jobClassName = createString("jobClassName");

    public final SimplePath<byte[]> jobData = createSimple("jobData", byte[].class);

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final BooleanPath requestsRecovery = createBoolean("requestsRecovery");

    public final StringPath schedName = createString("schedName");

    public final com.querydsl.sql.PrimaryKey<QJquartzJobDetails> jquartzJobDetailsPk = createPrimaryKey(jobName, jobGroup);

    public QJquartzJobDetails(String variable) {
        super(QJquartzJobDetails.class, forVariable(variable), "public", "jquartz_job_details");
        addMetadata();
    }

    public QJquartzJobDetails(String variable, String schema, String table) {
        super(QJquartzJobDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QJquartzJobDetails(Path<? extends QJquartzJobDetails> path) {
        super(path.getType(), path.getMetadata(), "public", "jquartz_job_details");
        addMetadata();
    }

    public QJquartzJobDetails(PathMetadata metadata) {
        super(QJquartzJobDetails.class, metadata, "public", "jquartz_job_details");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.VARCHAR).withSize(250));
        addMetadata(isDurable, ColumnMetadata.named("is_durable").withIndex(6).ofType(Types.BIT).withSize(1));
        addMetadata(isNonconcurrent, ColumnMetadata.named("is_nonconcurrent").withIndex(9).ofType(Types.BIT).withSize(1));
        addMetadata(isStateful, ColumnMetadata.named("is_stateful").withIndex(8).ofType(Types.BIT).withSize(1));
        addMetadata(isUpdateData, ColumnMetadata.named("is_update_data").withIndex(10).ofType(Types.BIT).withSize(1));
        addMetadata(isVolatile, ColumnMetadata.named("is_volatile").withIndex(7).ofType(Types.BIT).withSize(1));
        addMetadata(jobClassName, ColumnMetadata.named("job_class_name").withIndex(5).ofType(Types.VARCHAR).withSize(250));
        addMetadata(jobData, ColumnMetadata.named("job_data").withIndex(12).ofType(Types.BINARY).withSize(2147483647));
        addMetadata(jobGroup, ColumnMetadata.named("job_group").withIndex(3).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(jobName, ColumnMetadata.named("job_name").withIndex(2).ofType(Types.VARCHAR).withSize(200).notNull());
        addMetadata(requestsRecovery, ColumnMetadata.named("requests_recovery").withIndex(11).ofType(Types.BIT).withSize(1));
        addMetadata(schedName, ColumnMetadata.named("sched_name").withIndex(1).ofType(Types.VARCHAR).withSize(120));
    }

}

