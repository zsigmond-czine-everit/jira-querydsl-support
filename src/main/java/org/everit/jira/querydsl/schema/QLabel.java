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
 * QLabel is a Querydsl query type for QLabel
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QLabel extends com.querydsl.sql.RelationalPathBase<QLabel> {

    private static final long serialVersionUID = -1297414212;

    public static final QLabel label1 = new QLabel("label");

    public final NumberPath<Long> fieldid = createNumber("fieldid", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final StringPath label = createString("label");

    public final com.querydsl.sql.PrimaryKey<QLabel> labelPk = createPrimaryKey(id);

    public QLabel(String variable) {
        super(QLabel.class, forVariable(variable), "public", "label");
        addMetadata();
    }

    public QLabel(String variable, String schema, String table) {
        super(QLabel.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QLabel(Path<? extends QLabel> path) {
        super(path.getType(), path.getMetadata(), "public", "label");
        addMetadata();
    }

    public QLabel(PathMetadata metadata) {
        super(QLabel.class, metadata, "public", "label");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldid, ColumnMetadata.named("fieldid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issue, ColumnMetadata.named("issue").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(label, ColumnMetadata.named("label").withIndex(4).ofType(Types.VARCHAR).withSize(255));
    }

}

