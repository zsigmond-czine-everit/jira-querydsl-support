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
 * QPluginversion is a Querydsl query type for QPluginversion
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QPluginversion extends com.querydsl.sql.RelationalPathBase<QPluginversion> {

    private static final long serialVersionUID = -1743192307;

    public static final QPluginversion pluginversion1 = new QPluginversion("pluginversion");

    public final DateTimePath<java.sql.Timestamp> created = createDateTime("created", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath pluginkey = createString("pluginkey");

    public final StringPath pluginname = createString("pluginname");

    public final StringPath pluginversion = createString("pluginversion");

    public final com.querydsl.sql.PrimaryKey<QPluginversion> pluginversionPk = createPrimaryKey(id);

    public QPluginversion(String variable) {
        super(QPluginversion.class, forVariable(variable), "public", "pluginversion");
        addMetadata();
    }

    public QPluginversion(String variable, String schema, String table) {
        super(QPluginversion.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QPluginversion(Path<? extends QPluginversion> path) {
        super(path.getType(), path.getMetadata(), "public", "pluginversion");
        addMetadata();
    }

    public QPluginversion(PathMetadata metadata) {
        super(QPluginversion.class, metadata, "public", "pluginversion");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(created, ColumnMetadata.named("created").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(pluginkey, ColumnMetadata.named("pluginkey").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(pluginname, ColumnMetadata.named("pluginname").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(pluginversion, ColumnMetadata.named("pluginversion").withIndex(4).ofType(Types.VARCHAR).withSize(255));
    }

}

