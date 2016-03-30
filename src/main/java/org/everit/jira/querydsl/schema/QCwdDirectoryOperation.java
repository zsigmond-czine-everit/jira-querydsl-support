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
 * QCwdDirectoryOperation is a Querydsl query type for QCwdDirectoryOperation
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdDirectoryOperation extends com.querydsl.sql.RelationalPathBase<QCwdDirectoryOperation> {

    private static final long serialVersionUID = -279429934;

    public static final QCwdDirectoryOperation cwdDirectoryOperation = new QCwdDirectoryOperation("cwd_directory_operation");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final StringPath operationType = createString("operationType");

    public final com.querydsl.sql.PrimaryKey<QCwdDirectoryOperation> cwdDirectoryOperationPk = createPrimaryKey(directoryId, operationType);

    public QCwdDirectoryOperation(String variable) {
        super(QCwdDirectoryOperation.class, forVariable(variable), "public", "cwd_directory_operation");
        addMetadata();
    }

    public QCwdDirectoryOperation(String variable, String schema, String table) {
        super(QCwdDirectoryOperation.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdDirectoryOperation(Path<? extends QCwdDirectoryOperation> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_directory_operation");
        addMetadata();
    }

    public QCwdDirectoryOperation(PathMetadata metadata) {
        super(QCwdDirectoryOperation.class, metadata, "public", "cwd_directory_operation");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(directoryId, ColumnMetadata.named("directory_id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(operationType, ColumnMetadata.named("operation_type").withIndex(2).ofType(Types.VARCHAR).withSize(60).notNull());
    }

}

