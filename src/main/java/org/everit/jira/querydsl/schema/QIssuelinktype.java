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
 * QIssuelinktype is a Querydsl query type for QIssuelinktype
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QIssuelinktype extends com.querydsl.sql.RelationalPathBase<QIssuelinktype> {

    private static final long serialVersionUID = -1190219051;

    public static final QIssuelinktype issuelinktype = new QIssuelinktype("issuelinktype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath inward = createString("inward");

    public final StringPath linkname = createString("linkname");

    public final StringPath outward = createString("outward");

    public final StringPath pstyle = createString("pstyle");

    public final com.querydsl.sql.PrimaryKey<QIssuelinktype> issuelinktypePk = createPrimaryKey(id);

    public QIssuelinktype(String variable) {
        super(QIssuelinktype.class, forVariable(variable), "public", "issuelinktype");
        addMetadata();
    }

    public QIssuelinktype(String variable, String schema, String table) {
        super(QIssuelinktype.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QIssuelinktype(Path<? extends QIssuelinktype> path) {
        super(path.getType(), path.getMetadata(), "public", "issuelinktype");
        addMetadata();
    }

    public QIssuelinktype(PathMetadata metadata) {
        super(QIssuelinktype.class, metadata, "public", "issuelinktype");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(inward, ColumnMetadata.named("inward").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(linkname, ColumnMetadata.named("linkname").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(outward, ColumnMetadata.named("outward").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(pstyle, ColumnMetadata.named("pstyle").withIndex(5).ofType(Types.VARCHAR).withSize(60));
    }

}

