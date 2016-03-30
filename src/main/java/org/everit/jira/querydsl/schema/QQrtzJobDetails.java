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
 * QQrtzJobDetails is a Querydsl query type for QQrtzJobDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzJobDetails extends com.querydsl.sql.RelationalPathBase<QQrtzJobDetails> {

    private static final long serialVersionUID = -483104828;

    public static final QQrtzJobDetails qrtzJobDetails = new QQrtzJobDetails("qrtz_job_details");

    public final StringPath className = createString("className");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isDurable = createString("isDurable");

    public final StringPath isStateful = createString("isStateful");

    public final StringPath jobData = createString("jobData");

    public final StringPath jobGroup = createString("jobGroup");

    public final StringPath jobName = createString("jobName");

    public final StringPath requestsRecovery = createString("requestsRecovery");

    public final com.querydsl.sql.PrimaryKey<QQrtzJobDetails> qrtzJobDetailsPk = createPrimaryKey(id);

    public QQrtzJobDetails(String variable) {
        super(QQrtzJobDetails.class, forVariable(variable), "public", "qrtz_job_details");
        addMetadata();
    }

    public QQrtzJobDetails(String variable, String schema, String table) {
        super(QQrtzJobDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzJobDetails(Path<? extends QQrtzJobDetails> path) {
        super(path.getType(), path.getMetadata(), "public", "qrtz_job_details");
        addMetadata();
    }

    public QQrtzJobDetails(PathMetadata metadata) {
        super(QQrtzJobDetails.class, metadata, "public", "qrtz_job_details");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(className, ColumnMetadata.named("class_name").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(isDurable, ColumnMetadata.named("is_durable").withIndex(5).ofType(Types.VARCHAR).withSize(60));
        addMetadata(isStateful, ColumnMetadata.named("is_stateful").withIndex(6).ofType(Types.VARCHAR).withSize(60));
        addMetadata(jobData, ColumnMetadata.named("job_data").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(jobGroup, ColumnMetadata.named("job_group").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(jobName, ColumnMetadata.named("job_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(requestsRecovery, ColumnMetadata.named("requests_recovery").withIndex(7).ofType(Types.VARCHAR).withSize(60));
    }

}

