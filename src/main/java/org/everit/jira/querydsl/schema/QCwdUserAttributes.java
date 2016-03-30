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
 * QCwdUserAttributes is a Querydsl query type for QCwdUserAttributes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCwdUserAttributes extends com.querydsl.sql.RelationalPathBase<QCwdUserAttributes> {

    private static final long serialVersionUID = 1434343130;

    public static final QCwdUserAttributes cwdUserAttributes = new QCwdUserAttributes("cwd_user_attributes");

    public final StringPath attributeName = createString("attributeName");

    public final StringPath attributeValue = createString("attributeValue");

    public final NumberPath<Long> directoryId = createNumber("directoryId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath lowerAttributeValue = createString("lowerAttributeValue");

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QCwdUserAttributes> cwdUserAttributesPk = createPrimaryKey(id);

    public QCwdUserAttributes(String variable) {
        super(QCwdUserAttributes.class, forVariable(variable), "public", "cwd_user_attributes");
        addMetadata();
    }

    public QCwdUserAttributes(String variable, String schema, String table) {
        super(QCwdUserAttributes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCwdUserAttributes(Path<? extends QCwdUserAttributes> path) {
        super(path.getType(), path.getMetadata(), "public", "cwd_user_attributes");
        addMetadata();
    }

    public QCwdUserAttributes(PathMetadata metadata) {
        super(QCwdUserAttributes.class, metadata, "public", "cwd_user_attributes");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(attributeName, ColumnMetadata.named("attribute_name").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(attributeValue, ColumnMetadata.named("attribute_value").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(directoryId, ColumnMetadata.named("directory_id").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(lowerAttributeValue, ColumnMetadata.named("lower_attribute_value").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(2).ofType(Types.NUMERIC).withSize(18));
    }

}

