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
 * QCwdGroupAttributes is a Querydsl query type for QCwdGroupAttributes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdGroupAttributes extends com.querydsl.sql.RelationalPathBase<QCwdGroupAttributes> {

    private static final long serialVersionUID = 1488891102;

    public static final QCwdGroupAttributes cwdGroupAttributes = new QCwdGroupAttributes("cwd_group_attributes");

    public final StringPath attributeName = createString("attributeName");

    public final StringPath attributeValue = createString("attributeValue");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final NumberPath<Long> groupId = createNumber("groupId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerAttributeValue = createString("lowerAttributeValue");

    public final com.querydsl.sql.PrimaryKey<QCwdGroupAttributes> cwdGroupAttributesPk = createPrimaryKey(id);

    public QCwdGroupAttributes(String variable) {
        super(QCwdGroupAttributes.class, forVariable(variable), "public", "cwd_group_attributes");
        addMetadata();
    }

    public QCwdGroupAttributes(String variable, String schema, String table) {
        super(QCwdGroupAttributes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdGroupAttributes(Path<? extends QCwdGroupAttributes> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_group_attributes");
        addMetadata();
    }

    public QCwdGroupAttributes(PathMetadata metadata) {
        super(QCwdGroupAttributes.class, metadata, "public", "cwd_group_attributes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("attribute_name").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(attributeValue, ColumnMetadata.named("attribute_value").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(directoryId, ColumnMetadata.named("directory_id").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(groupId, ColumnMetadata.named("group_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lowerAttributeValue, ColumnMetadata.named("lower_attribute_value").withIndex(6).ofType(Types.VARCHAR).withSize(255));
    }

}

