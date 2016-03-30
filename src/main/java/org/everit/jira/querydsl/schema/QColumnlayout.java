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
 * QColumnlayout is a Querydsl query type for QColumnlayout
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QColumnlayout extends com.querydsl.sql.RelationalPathBase<QColumnlayout> {

    private static final long serialVersionUID = 127794232;

    public static final QColumnlayout columnlayout = new QColumnlayout("columnlayout");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> searchrequest = createNumber("searchrequest", Long.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QColumnlayout> columnlayoutPk = createPrimaryKey(id);

    public QColumnlayout(String variable) {
        super(QColumnlayout.class, forVariable(variable), "public", "columnlayout");
        addMetadata();
    }

    public QColumnlayout(String variable, String schema, String table) {
        super(QColumnlayout.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QColumnlayout(Path<? extends QColumnlayout> path) {
        super(path.getType(), path.getMetadata(), "public", "columnlayout");
        addMetadata();
    }

    public QColumnlayout(PathMetadata metadata) {
        super(QColumnlayout.class, metadata, "public", "columnlayout");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(searchrequest, ColumnMetadata.named("searchrequest").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(username, ColumnMetadata.named("username").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

