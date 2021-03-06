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
 * QFieldconfiguration is a Querydsl query type for QFieldconfiguration
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldconfiguration extends com.querydsl.sql.RelationalPathBase<QFieldconfiguration> {

    private static final long serialVersionUID = -1837713804;

    public static final QFieldconfiguration fieldconfiguration = new QFieldconfiguration("fieldconfiguration");

    public final StringPath configname = createString("configname");

    public final NumberPath<Long> customfield = createNumber("customfield", Long.class);

    public final StringPath description = createString("description");

    public final StringPath fieldid = createString("fieldid");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFieldconfiguration> fieldconfigurationPk = createPrimaryKey(id);

    public QFieldconfiguration(String variable) {
        super(QFieldconfiguration.class, forVariable(variable), "public", "fieldconfiguration");
        addMetadata();
    }

    public QFieldconfiguration(String variable, String schema, String table) {
        super(QFieldconfiguration.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldconfiguration(Path<? extends QFieldconfiguration> path) {
        super(path.getType(), path.getMetadata(), "public", "fieldconfiguration");
        addMetadata();
    }

    public QFieldconfiguration(PathMetadata metadata) {
        super(QFieldconfiguration.class, metadata, "public", "fieldconfiguration");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(configname, ColumnMetadata.named("configname").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(customfield, ColumnMetadata.named("customfield").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(description, ColumnMetadata.named("description").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldid, ColumnMetadata.named("fieldid").withIndex(4).ofType(Types.VARCHAR).withSize(60));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
    }

}

