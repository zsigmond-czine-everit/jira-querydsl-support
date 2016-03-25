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
 * QOptionconfiguration is a Querydsl query type for QOptionconfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOptionconfiguration extends com.querydsl.sql.RelationalPathBase<QOptionconfiguration> {

    private static final long serialVersionUID = -699687575;

    public static final QOptionconfiguration optionconfiguration = new QOptionconfiguration("optionconfiguration");

    public final NumberPath<Long> fieldconfig = createNumber("fieldconfig", Long.class);

    public final StringPath fieldid = createString("fieldid");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath optionid = createString("optionid");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOptionconfiguration> optionconfigurationPk = createPrimaryKey(id);

    public QOptionconfiguration(String variable) {
        super(QOptionconfiguration.class, forVariable(variable), "public", "optionconfiguration");
        addMetadata();
    }

    public QOptionconfiguration(String variable, String schema, String table) {
        super(QOptionconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOptionconfiguration(Path<? extends QOptionconfiguration> path) {
        super(path.getType(), path.getMetadata(), "public", "optionconfiguration");
        addMetadata();
    }

    public QOptionconfiguration(PathMetadata metadata) {
        super(QOptionconfiguration.class, metadata, "public", "optionconfiguration");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldconfig, ColumnMetadata.named("fieldconfig").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(fieldid, ColumnMetadata.named("fieldid").withIndex(2).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(optionid, ColumnMetadata.named("optionid").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(5).ofType(Types.NUMERIC).withSize(18));
    }

}

