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
 * QIssuelink is a Querydsl query type for QIssuelink
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIssuelink extends com.querydsl.sql.RelationalPathBase<QIssuelink> {

    private static final long serialVersionUID = 26749211;

    public static final QIssuelink issuelink = new QIssuelink("issuelink");

    public final NumberPath<Long> destination = createNumber("destination", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> linktype = createNumber("linktype", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final NumberPath<Long> source = createNumber("source", Long.class);

    public final com.querydsl.sql.PrimaryKey<QIssuelink> issuelinkPk = createPrimaryKey(id);

    public QIssuelink(String variable) {
        super(QIssuelink.class, forVariable(variable), "public", "issuelink");
        addMetadata();
    }

    public QIssuelink(String variable, String schema, String table) {
        super(QIssuelink.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuelink(Path<? extends QIssuelink> path) {
        super(path.getType(), path.getMetadata(), "public", "issuelink");
        addMetadata();
    }

    public QIssuelink(PathMetadata metadata) {
        super(QIssuelink.class, metadata, "public", "issuelink");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(destination, ColumnMetadata.named("destination").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(linktype, ColumnMetadata.named("linktype").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(source, ColumnMetadata.named("source").withIndex(3).ofType(Types.NUMERIC).withSize(18));
    }

}

