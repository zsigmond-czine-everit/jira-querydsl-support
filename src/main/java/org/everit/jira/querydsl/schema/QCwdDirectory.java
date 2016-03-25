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
 * QCwdDirectory is a Querydsl query type for QCwdDirectory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdDirectory extends com.querydsl.sql.RelationalPathBase<QCwdDirectory> {

    private static final long serialVersionUID = -744816619;

    public static final QCwdDirectory cwdDirectory = new QCwdDirectory("cwd_directory");

    public final NumberPath<Integer> active = createNumber("active", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdDate = createDateTime("createdDate", java.sql.Timestamp.class);

    public final StringPath description = createString("description");

    public final StringPath directoryName = createString("directoryName");

    public final NumberPath<Long> directoryPosition = createNumber("directoryPosition", Long.class);

    public final StringPath directoryType = createString("directoryType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath implClass = createString("implClass");

    public final StringPath lowerDirectoryName = createString("lowerDirectoryName");

    public final StringPath lowerImplClass = createString("lowerImplClass");

    public final DateTimePath<java.sql.Timestamp> updatedDate = createDateTime("updatedDate", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QCwdDirectory> cwdDirectoryPk = createPrimaryKey(id);

    public QCwdDirectory(String variable) {
        super(QCwdDirectory.class, forVariable(variable), "public", "cwd_directory");
        addMetadata();
    }

    public QCwdDirectory(String variable, String schema, String table) {
        super(QCwdDirectory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdDirectory(Path<? extends QCwdDirectory> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_directory");
        addMetadata();
    }

    public QCwdDirectory(PathMetadata metadata) {
        super(QCwdDirectory.class, metadata, "public", "cwd_directory");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(active, ColumnMetadata.named("active").withIndex(6).ofType(Types.NUMERIC).withSize(9));
        addMetadata(createdDate, ColumnMetadata.named("created_date").withIndex(4).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(description, ColumnMetadata.named("description").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(directoryName, ColumnMetadata.named("directory_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(directoryPosition, ColumnMetadata.named("directory_position").withIndex(11).ofType(Types.NUMERIC).withSize(18));
        addMetadata(directoryType, ColumnMetadata.named("directory_type").withIndex(10).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(implClass, ColumnMetadata.named("impl_class").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerDirectoryName, ColumnMetadata.named("lower_directory_name").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(lowerImplClass, ColumnMetadata.named("lower_impl_class").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedDate, ColumnMetadata.named("updated_date").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
    }

}

