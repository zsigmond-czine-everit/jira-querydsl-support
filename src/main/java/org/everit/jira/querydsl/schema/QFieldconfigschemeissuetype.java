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
 * QFieldconfigschemeissuetype is a Querydsl query type for QFieldconfigschemeissuetype
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldconfigschemeissuetype extends com.querydsl.sql.RelationalPathBase<QFieldconfigschemeissuetype> {

    private static final long serialVersionUID = -751260790;

    public static final QFieldconfigschemeissuetype fieldconfigschemeissuetype = new QFieldconfigschemeissuetype("fieldconfigschemeissuetype");

    public final NumberPath<Long> fieldconfigscheme = createNumber("fieldconfigscheme", Long.class);

    public final NumberPath<Long> fieldconfiguration = createNumber("fieldconfiguration", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final com.querydsl.sql.PrimaryKey<QFieldconfigschemeissuetype> fieldconfigschemeissuetypePk = createPrimaryKey(id);

    public QFieldconfigschemeissuetype(String variable) {
        super(QFieldconfigschemeissuetype.class, forVariable(variable), "public", "fieldconfigschemeissuetype");
        addMetadata();
    }

    public QFieldconfigschemeissuetype(String variable, String schema, String table) {
        super(QFieldconfigschemeissuetype.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldconfigschemeissuetype(Path<? extends QFieldconfigschemeissuetype> path) {
        super(path.getType(), path.getMetadata(), "public", "fieldconfigschemeissuetype");
        addMetadata();
    }

    public QFieldconfigschemeissuetype(PathMetadata metadata) {
        super(QFieldconfigschemeissuetype.class, metadata, "public", "fieldconfigschemeissuetype");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldconfigscheme, ColumnMetadata.named("fieldconfigscheme").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(fieldconfiguration, ColumnMetadata.named("fieldconfiguration").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issuetype, ColumnMetadata.named("issuetype").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

