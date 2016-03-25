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
 * QUserhistoryitem is a Querydsl query type for QUserhistoryitem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserhistoryitem extends com.querydsl.sql.RelationalPathBase<QUserhistoryitem> {

    private static final long serialVersionUID = -1339524156;

    public static final QUserhistoryitem userhistoryitem = new QUserhistoryitem("userhistoryitem");

    public final StringPath data = createString("data");

    public final StringPath entityid = createString("entityid");

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> lastviewed = createNumber("lastviewed", Long.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QUserhistoryitem> userhistoryitemPk = createPrimaryKey(id);

    public QUserhistoryitem(String variable) {
        super(QUserhistoryitem.class, forVariable(variable), "public", "userhistoryitem");
        addMetadata();
    }

    public QUserhistoryitem(String variable, String schema, String table) {
        super(QUserhistoryitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserhistoryitem(Path<? extends QUserhistoryitem> path) {
        super(path.getType(), path.getMetadata(), "public", "userhistoryitem");
        addMetadata();
    }

    public QUserhistoryitem(PathMetadata metadata) {
        super(QUserhistoryitem.class, metadata, "public", "userhistoryitem");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(data, ColumnMetadata.named("data").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(entityid, ColumnMetadata.named("entityid").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(entitytype, ColumnMetadata.named("entitytype").withIndex(2).ofType(Types.VARCHAR).withSize(10));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lastviewed, ColumnMetadata.named("lastviewed").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(username, ColumnMetadata.named("username").withIndex(4).ofType(Types.VARCHAR).withSize(255));
    }

}

