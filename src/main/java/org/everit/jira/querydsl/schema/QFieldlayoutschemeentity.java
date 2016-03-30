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
 * QFieldlayoutschemeentity is a Querydsl query type for QFieldlayoutschemeentity
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldlayoutschemeentity extends com.querydsl.sql.RelationalPathBase<QFieldlayoutschemeentity> {

    private static final long serialVersionUID = -1497296076;

    public static final QFieldlayoutschemeentity fieldlayoutschemeentity = new QFieldlayoutschemeentity("fieldlayoutschemeentity");

    public final NumberPath<Long> fieldlayout = createNumber("fieldlayout", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath issuetype = createString("issuetype");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFieldlayoutschemeentity> fieldlayoutschemeentityPk = createPrimaryKey(id);

    public QFieldlayoutschemeentity(String variable) {
        super(QFieldlayoutschemeentity.class, forVariable(variable), "public", "fieldlayoutschemeentity");
        addMetadata();
    }

    public QFieldlayoutschemeentity(String variable, String schema, String table) {
        super(QFieldlayoutschemeentity.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayoutschemeentity(Path<? extends QFieldlayoutschemeentity> path) {
        super(path.getType(), path.getMetadata(), "public", "fieldlayoutschemeentity");
        addMetadata();
    }

    public QFieldlayoutschemeentity(PathMetadata metadata) {
        super(QFieldlayoutschemeentity.class, metadata, "public", "fieldlayoutschemeentity");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(fieldlayout, ColumnMetadata.named("fieldlayout").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(issuetype, ColumnMetadata.named("issuetype").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(scheme, ColumnMetadata.named("scheme").withIndex(2).ofType(Types.NUMERIC).withSize(18));
    }

}

