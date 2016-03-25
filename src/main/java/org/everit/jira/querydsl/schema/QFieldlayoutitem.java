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
 * QFieldlayoutitem is a Querydsl query type for QFieldlayoutitem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFieldlayoutitem extends com.querydsl.sql.RelationalPathBase<QFieldlayoutitem> {

    private static final long serialVersionUID = -1808715649;

    public static final QFieldlayoutitem fieldlayoutitem = new QFieldlayoutitem("fieldlayoutitem");

    public final StringPath description = createString("description");

    public final StringPath fieldidentifier = createString("fieldidentifier");

    public final NumberPath<Long> fieldlayout = createNumber("fieldlayout", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ishidden = createString("ishidden");

    public final StringPath isrequired = createString("isrequired");

    public final StringPath renderertype = createString("renderertype");

    public final NumberPath<Long> verticalposition = createNumber("verticalposition", Long.class);

    public final com.querydsl.sql.PrimaryKey<QFieldlayoutitem> fieldlayoutitemPk = createPrimaryKey(id);

    public QFieldlayoutitem(String variable) {
        super(QFieldlayoutitem.class, forVariable(variable), "public", "fieldlayoutitem");
        addMetadata();
    }

    public QFieldlayoutitem(String variable, String schema, String table) {
        super(QFieldlayoutitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFieldlayoutitem(Path<? extends QFieldlayoutitem> path) {
        super(path.getType(), path.getMetadata(), "public", "fieldlayoutitem");
        addMetadata();
    }

    public QFieldlayoutitem(PathMetadata metadata) {
        super(QFieldlayoutitem.class, metadata, "public", "fieldlayoutitem");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(fieldidentifier, ColumnMetadata.named("fieldidentifier").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(fieldlayout, ColumnMetadata.named("fieldlayout").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(ishidden, ColumnMetadata.named("ishidden").withIndex(6).ofType(Types.VARCHAR).withSize(60));
        addMetadata(isrequired, ColumnMetadata.named("isrequired").withIndex(7).ofType(Types.VARCHAR).withSize(60));
        addMetadata(renderertype, ColumnMetadata.named("renderertype").withIndex(8).ofType(Types.VARCHAR).withSize(255));
        addMetadata(verticalposition, ColumnMetadata.named("verticalposition").withIndex(5).ofType(Types.NUMERIC).withSize(18));
    }

}

