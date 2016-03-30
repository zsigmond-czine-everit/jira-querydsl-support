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
 * QFileattachment is a Querydsl query type for QFileattachment
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFileattachment extends com.querydsl.sql.RelationalPathBase<QFileattachment> {

    private static final long serialVersionUID = 2005760983;

    public static final QFileattachment fileattachment = new QFileattachment("fileattachment");

    public final StringPath author = createString("author");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final StringPath filename = createString("filename");

    public final NumberPath<Long> filesize = createNumber("filesize", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issueid = createNumber("issueid", Long.class);

    public final StringPath mimetype = createString("mimetype");

    public final NumberPath<Integer> thumbnailable = createNumber("thumbnailable", Integer.class);

    public final NumberPath<Integer> zip = createNumber("zip", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QFileattachment> fileattachmentPk = createPrimaryKey(id);

    public QFileattachment(String variable) {
        super(QFileattachment.class, forVariable(variable), "public", "fileattachment");
        addMetadata();
    }

    public QFileattachment(String variable, String schema, String table) {
        super(QFileattachment.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFileattachment(Path<? extends QFileattachment> path) {
        super(path.getType(), path.getMetadata(), "public", "fileattachment");
        addMetadata();
    }

    public QFileattachment(PathMetadata metadata) {
        super(QFileattachment.class, metadata, "public", "fileattachment");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(author, ColumnMetadata.named("author").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(created, ColumnMetadata.named("created").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(filename, ColumnMetadata.named("filename").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(filesize, ColumnMetadata.named("filesize").withIndex(6).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issueid, ColumnMetadata.named("issueid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(mimetype, ColumnMetadata.named("mimetype").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(thumbnailable, ColumnMetadata.named("thumbnailable").withIndex(9).ofType(Types.NUMERIC).withSize(9));
        addMetadata(zip, ColumnMetadata.named("zip").withIndex(8).ofType(Types.NUMERIC).withSize(9));
    }

}

