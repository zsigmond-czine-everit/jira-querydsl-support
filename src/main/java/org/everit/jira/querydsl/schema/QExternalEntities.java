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
 * QExternalEntities is a Querydsl query type for QExternalEntities
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QExternalEntities extends com.querydsl.sql.RelationalPathBase<QExternalEntities> {

    private static final long serialVersionUID = -1687044380;

    public static final QExternalEntities externalEntities = new QExternalEntities("external_entities");

    public final StringPath entitytype = createString("entitytype");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QExternalEntities> externalEntitiesPk = createPrimaryKey(id);

    public QExternalEntities(String variable) {
        super(QExternalEntities.class, forVariable(variable), "public", "external_entities");
        addMetadata();
    }

    public QExternalEntities(String variable, String schema, String table) {
        super(QExternalEntities.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QExternalEntities(Path<? extends QExternalEntities> path) {
        super(path.getType(), path.getMetadata(), "public", "external_entities");
        addMetadata();
    }

    public QExternalEntities(PathMetadata metadata) {
        super(QExternalEntities.class, metadata, "public", "external_entities");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(entitytype, ColumnMetadata.named("entitytype").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

