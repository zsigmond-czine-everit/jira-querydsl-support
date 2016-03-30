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
 * QEntityPropertyIndexDocument is a Querydsl query type for QEntityPropertyIndexDocument
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QEntityPropertyIndexDocument extends com.querydsl.sql.RelationalPathBase<QEntityPropertyIndexDocument> {

    private static final long serialVersionUID = -1507874083;

    public static final QEntityPropertyIndexDocument entityPropertyIndexDocument = new QEntityPropertyIndexDocument("entity_property_index_document");

    public final StringPath document = createString("document");

    public final StringPath entityKey = createString("entityKey");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath moduleKey = createString("moduleKey");

    public final StringPath pluginKey = createString("pluginKey");

    public final DateTimePath<java.sql.Timestamp> updated = createDateTime("updated", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QEntityPropertyIndexDocument> entityPropertyIndexDocumPk = createPrimaryKey(id);

    public QEntityPropertyIndexDocument(String variable) {
        super(QEntityPropertyIndexDocument.class, forVariable(variable), "public", "entity_property_index_document");
        addMetadata();
    }

    public QEntityPropertyIndexDocument(String variable, String schema, String table) {
        super(QEntityPropertyIndexDocument.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEntityPropertyIndexDocument(Path<? extends QEntityPropertyIndexDocument> path) {
        super(path.getType(), path.getMetadata(), "public", "entity_property_index_document");
        addMetadata();
    }

    public QEntityPropertyIndexDocument(PathMetadata metadata) {
        super(QEntityPropertyIndexDocument.class, metadata, "public", "entity_property_index_document");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(document, ColumnMetadata.named("document").withIndex(6).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(entityKey, ColumnMetadata.named("entity_key").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(moduleKey, ColumnMetadata.named("module_key").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(pluginKey, ColumnMetadata.named("plugin_key").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updated, ColumnMetadata.named("updated").withIndex(5).ofType(Types.TIMESTAMP).withSize(35).withDigits(6));
    }

}

