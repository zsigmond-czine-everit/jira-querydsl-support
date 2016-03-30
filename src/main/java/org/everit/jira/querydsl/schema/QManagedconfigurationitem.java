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
 * QManagedconfigurationitem is a Querydsl query type for QManagedconfigurationitem
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QManagedconfigurationitem extends com.querydsl.sql.RelationalPathBase<QManagedconfigurationitem> {

    private static final long serialVersionUID = 1479457154;

    public static final QManagedconfigurationitem managedconfigurationitem = new QManagedconfigurationitem("managedconfigurationitem");

    public final StringPath accessLevel = createString("accessLevel");

    public final StringPath descriptionKey = createString("descriptionKey");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath itemId = createString("itemId");

    public final StringPath itemType = createString("itemType");

    public final StringPath managed = createString("managed");

    public final StringPath source = createString("source");

    public final com.querydsl.sql.PrimaryKey<QManagedconfigurationitem> managedconfigurationitemPk = createPrimaryKey(id);

    public QManagedconfigurationitem(String variable) {
        super(QManagedconfigurationitem.class, forVariable(variable), "public", "managedconfigurationitem");
        addMetadata();
    }

    public QManagedconfigurationitem(String variable, String schema, String table) {
        super(QManagedconfigurationitem.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QManagedconfigurationitem(Path<? extends QManagedconfigurationitem> path) {
        super(path.getType(), path.getMetadata(), "public", "managedconfigurationitem");
        addMetadata();
    }

    public QManagedconfigurationitem(PathMetadata metadata) {
        super(QManagedconfigurationitem.class, metadata, "public", "managedconfigurationitem");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(accessLevel, ColumnMetadata.named("access_level").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(descriptionKey, ColumnMetadata.named("description_key").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(itemId, ColumnMetadata.named("item_id").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(itemType, ColumnMetadata.named("item_type").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(managed, ColumnMetadata.named("managed").withIndex(4).ofType(Types.VARCHAR).withSize(10));
        addMetadata(source, ColumnMetadata.named("source").withIndex(6).ofType(Types.VARCHAR).withSize(255));
    }

}

