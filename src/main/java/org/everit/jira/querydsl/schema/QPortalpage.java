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
 * QPortalpage is a Querydsl query type for QPortalpage
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPortalpage extends com.querydsl.sql.RelationalPathBase<QPortalpage> {

    private static final long serialVersionUID = -356153037;

    public static final QPortalpage portalpage = new QPortalpage("portalpage");

    public final StringPath description = createString("description");

    public final NumberPath<Long> favCount = createNumber("favCount", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath layout = createString("layout");

    public final StringPath pagename = createString("pagename");

    public final NumberPath<Long> ppversion = createNumber("ppversion", Long.class);

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QPortalpage> portalpagePk = createPrimaryKey(id);

    public QPortalpage(String variable) {
        super(QPortalpage.class, forVariable(variable), "public", "portalpage");
        addMetadata();
    }

    public QPortalpage(String variable, String schema, String table) {
        super(QPortalpage.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPortalpage(Path<? extends QPortalpage> path) {
        super(path.getType(), path.getMetadata(), "public", "portalpage");
        addMetadata();
    }

    public QPortalpage(PathMetadata metadata) {
        super(QPortalpage.class, metadata, "public", "portalpage");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(favCount, ColumnMetadata.named("fav_count").withIndex(6).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(layout, ColumnMetadata.named("layout").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(pagename, ColumnMetadata.named("pagename").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(ppversion, ColumnMetadata.named("ppversion").withIndex(8).ofType(Types.NUMERIC).withSize(18));
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(username, ColumnMetadata.named("username").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

