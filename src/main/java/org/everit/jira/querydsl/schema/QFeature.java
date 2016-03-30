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
 * QFeature is a Querydsl query type for QFeature
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QFeature extends com.querydsl.sql.RelationalPathBase<QFeature> {

    private static final long serialVersionUID = 2104422846;

    public static final QFeature feature = new QFeature("feature");

    public final StringPath featureName = createString("featureName");

    public final StringPath featureType = createString("featureType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath userKey = createString("userKey");

    public final com.querydsl.sql.PrimaryKey<QFeature> featurePk = createPrimaryKey(id);

    public QFeature(String variable) {
        super(QFeature.class, forVariable(variable), "public", "feature");
        addMetadata();
    }

    public QFeature(String variable, String schema, String table) {
        super(QFeature.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QFeature(Path<? extends QFeature> path) {
        super(path.getType(), path.getMetadata(), "public", "feature");
        addMetadata();
    }

    public QFeature(PathMetadata metadata) {
        super(QFeature.class, metadata, "public", "feature");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(featureName, ColumnMetadata.named("feature_name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(featureType, ColumnMetadata.named("feature_type").withIndex(3).ofType(Types.VARCHAR).withSize(10));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(userKey, ColumnMetadata.named("user_key").withIndex(4).ofType(Types.VARCHAR).withSize(255));
    }

}

