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
 * QRundetails is a Querydsl query type for QRundetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QRundetails extends com.querydsl.sql.RelationalPathBase<QRundetails> {

    private static final long serialVersionUID = 1715997071;

    public static final QRundetails rundetails = new QRundetails("rundetails");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath infoMessage = createString("infoMessage");

    public final StringPath jobId = createString("jobId");

    public final NumberPath<Long> runDuration = createNumber("runDuration", Long.class);

    public final StringPath runOutcome = createString("runOutcome");

    public final DateTimePath<java.sql.Timestamp> startTime = createDateTime("startTime", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QRundetails> rundetailsPk = createPrimaryKey(id);

    public QRundetails(String variable) {
        super(QRundetails.class, forVariable(variable), "public", "rundetails");
        addMetadata();
    }

    public QRundetails(String variable, String schema, String table) {
        super(QRundetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QRundetails(Path<? extends QRundetails> path) {
        super(path.getType(), path.getMetadata(), "public", "rundetails");
        addMetadata();
    }

    public QRundetails(PathMetadata metadata) {
        super(QRundetails.class, metadata, "public", "rundetails");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(infoMessage, ColumnMetadata.named("info_message").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(jobId, ColumnMetadata.named("job_id").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(runDuration, ColumnMetadata.named("run_duration").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(runOutcome, ColumnMetadata.named("run_outcome").withIndex(5).ofType(Types.CHAR).withSize(1));
        addMetadata(startTime, ColumnMetadata.named("start_time").withIndex(3).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
    }

}

