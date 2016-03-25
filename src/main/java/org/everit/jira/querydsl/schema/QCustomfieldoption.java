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
 * QCustomfieldoption is a Querydsl query type for QCustomfieldoption
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCustomfieldoption extends com.querydsl.sql.RelationalPathBase<QCustomfieldoption> {

    private static final long serialVersionUID = 464664230;

    public static final QCustomfieldoption customfieldoption = new QCustomfieldoption("customfieldoption");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final NumberPath<Long> customfieldconfig = createNumber("customfieldconfig", Long.class);

    public final StringPath customvalue = createString("customvalue");

    public final StringPath disabled = createString("disabled");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath optiontype = createString("optiontype");

    public final NumberPath<Long> parentoptionid = createNumber("parentoptionid", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCustomfieldoption> customfieldoptionPk = createPrimaryKey(id);

    public QCustomfieldoption(String variable) {
        super(QCustomfieldoption.class, forVariable(variable), "public", "customfieldoption");
        addMetadata();
    }

    public QCustomfieldoption(String variable, String schema, String table) {
        super(QCustomfieldoption.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCustomfieldoption(Path<? extends QCustomfieldoption> path) {
        super(path.getType(), path.getMetadata(), "public", "customfieldoption");
        addMetadata();
    }

    public QCustomfieldoption(PathMetadata metadata) {
        super(QCustomfieldoption.class, metadata, "public", "customfieldoption");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("customfield").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(customfieldconfig, ColumnMetadata.named("customfieldconfig").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(customvalue, ColumnMetadata.named("customvalue").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(disabled, ColumnMetadata.named("disabled").withIndex(8).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(optiontype, ColumnMetadata.named("optiontype").withIndex(7).ofType(Types.VARCHAR).withSize(60));
        addMetadata(parentoptionid, ColumnMetadata.named("parentoptionid").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(5).ofType(Types.NUMERIC).withSize(18));
    }

}

