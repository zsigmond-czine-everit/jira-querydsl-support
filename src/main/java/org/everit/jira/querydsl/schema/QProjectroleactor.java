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
 * QProjectroleactor is a Querydsl query type for QProjectroleactor
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QProjectroleactor extends com.querydsl.sql.RelationalPathBase<QProjectroleactor> {

    private static final long serialVersionUID = -921383298;

    public static final QProjectroleactor projectroleactor = new QProjectroleactor("projectroleactor");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> pid = createNumber("pid", Long.class);

    public final NumberPath<Long> projectroleid = createNumber("projectroleid", Long.class);

    public final StringPath roletype = createString("roletype");

    public final StringPath roletypeparameter = createString("roletypeparameter");

    public final com.querydsl.sql.PrimaryKey<QProjectroleactor> projectroleactorPk = createPrimaryKey(id);

    public QProjectroleactor(String variable) {
        super(QProjectroleactor.class, forVariable(variable), "public", "projectroleactor");
        addMetadata();
    }

    public QProjectroleactor(String variable, String schema, String table) {
        super(QProjectroleactor.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QProjectroleactor(Path<? extends QProjectroleactor> path) {
        super(path.getType(), path.getMetadata(), "public", "projectroleactor");
        addMetadata();
    }

    public QProjectroleactor(PathMetadata metadata) {
        super(QProjectroleactor.class, metadata, "public", "projectroleactor");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(pid, ColumnMetadata.named("pid").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(projectroleid, ColumnMetadata.named("projectroleid").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(roletype, ColumnMetadata.named("roletype").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(roletypeparameter, ColumnMetadata.named("roletypeparameter").withIndex(5).ofType(Types.VARCHAR).withSize(255));
    }

}

