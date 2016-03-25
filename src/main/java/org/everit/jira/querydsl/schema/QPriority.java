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
 * QPriority is a Querydsl query type for QPriority
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPriority extends com.querydsl.sql.RelationalPathBase<QPriority> {

    private static final long serialVersionUID = -62202916;

    public static final QPriority priority = new QPriority("priority");

    public final StringPath description = createString("description");

    public final StringPath iconurl = createString("iconurl");

    public final StringPath id = createString("id");

    public final StringPath pname = createString("pname");

    public final NumberPath<Long> sequence = createNumber("sequence", Long.class);

    public final StringPath statusColor = createString("statusColor");

    public final com.querydsl.sql.PrimaryKey<QPriority> priorityPk = createPrimaryKey(id);

    public QPriority(String variable) {
        super(QPriority.class, forVariable(variable), "public", "priority");
        addMetadata();
    }

    public QPriority(String variable, String schema, String table) {
        super(QPriority.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPriority(Path<? extends QPriority> path) {
        super(path.getType(), path.getMetadata(), "public", "priority");
        addMetadata();
    }

    public QPriority(PathMetadata metadata) {
        super(QPriority.class, metadata, "public", "priority");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(description, ColumnMetadata.named("description").withIndex(4).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(iconurl, ColumnMetadata.named("iconurl").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.VARCHAR).withSize(60).notNull());
        addMetadata(pname, ColumnMetadata.named("pname").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(sequence, ColumnMetadata.named("sequence").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(statusColor, ColumnMetadata.named("status_color").withIndex(6).ofType(Types.VARCHAR).withSize(60));
    }

}

