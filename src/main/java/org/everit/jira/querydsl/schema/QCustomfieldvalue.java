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
 * QCustomfieldvalue is a Querydsl query type for QCustomfieldvalue
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCustomfieldvalue extends com.querydsl.sql.RelationalPathBase<QCustomfieldvalue> {

    private static final long serialVersionUID = -1225926368;

    public static final QCustomfieldvalue customfieldvalue = new QCustomfieldvalue("customfieldvalue");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final DateTimePath<java.sql.Timestamp> datevalue = createDateTime("datevalue", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> issue = createNumber("issue", Long.class);

    public final NumberPath<Double> numbervalue = createNumber("numbervalue", Double.class);

    public final StringPath parentkey = createString("parentkey");

    public final StringPath stringvalue = createString("stringvalue");

    public final StringPath textvalue = createString("textvalue");

    public final StringPath valuetype = createString("valuetype");

    public final com.querydsl.sql.PrimaryKey<QCustomfieldvalue> customfieldvaluePk = createPrimaryKey(id);

    public QCustomfieldvalue(String variable) {
        super(QCustomfieldvalue.class, forVariable(variable), "public", "customfieldvalue");
        addMetadata();
    }

    public QCustomfieldvalue(String variable, String schema, String table) {
        super(QCustomfieldvalue.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomfieldvalue(Path<? extends QCustomfieldvalue> path) {
        super(path.getType(), path.getMetadata(), "public", "customfieldvalue");
        addMetadata();
    }

    public QCustomfieldvalue(PathMetadata metadata) {
        super(QCustomfieldvalue.class, metadata, "public", "customfieldvalue");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("customfield").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(datevalue, ColumnMetadata.named("datevalue").withIndex(8).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issue, ColumnMetadata.named("issue").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(numbervalue, ColumnMetadata.named("numbervalue").withIndex(6).ofType(Types.DOUBLE).withSize(17).withDigits(17));
        addMetadata(parentkey, ColumnMetadata.named("parentkey").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(stringvalue, ColumnMetadata.named("stringvalue").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(textvalue, ColumnMetadata.named("textvalue").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(valuetype, ColumnMetadata.named("valuetype").withIndex(9).ofType(Types.VARCHAR).withSize(255));
    }

}

