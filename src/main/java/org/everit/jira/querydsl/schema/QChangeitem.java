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
 * QChangeitem is a Querydsl query type for QChangeitem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QChangeitem extends com.querydsl.sql.RelationalPathBase<QChangeitem> {

    private static final long serialVersionUID = 1537862395;

    public static final QChangeitem changeitem = new QChangeitem("changeitem");

    public final StringPath field = createString("field");

    public final StringPath fieldtype = createString("fieldtype");

    public final NumberPath<Long> groupid = createNumber("groupid", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath newstring = createString("newstring");

    public final StringPath newvalue = createString("newvalue");

    public final StringPath oldstring = createString("oldstring");

    public final StringPath oldvalue = createString("oldvalue");

    public final com.querydsl.sql.PrimaryKey<QChangeitem> changeitemPk = createPrimaryKey(id);

    public QChangeitem(String variable) {
        super(QChangeitem.class, forVariable(variable), "public", "changeitem");
        addMetadata();
    }

    public QChangeitem(String variable, String schema, String table) {
        super(QChangeitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QChangeitem(Path<? extends QChangeitem> path) {
        super(path.getType(), path.getMetadata(), "public", "changeitem");
        addMetadata();
    }

    public QChangeitem(PathMetadata metadata) {
        super(QChangeitem.class, metadata, "public", "changeitem");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(field, ColumnMetadata.named("field").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(fieldtype, ColumnMetadata.named("fieldtype").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(groupid, ColumnMetadata.named("groupid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(newstring, ColumnMetadata.named("newstring").withIndex(8).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(newvalue, ColumnMetadata.named("newvalue").withIndex(7).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(oldstring, ColumnMetadata.named("oldstring").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(oldvalue, ColumnMetadata.named("oldvalue").withIndex(5).ofType(Types.VARCHAR).withSize(2147483647));
    }

}

