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
 * QConfigurationcontext is a Querydsl query type for QConfigurationcontext
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QConfigurationcontext extends com.querydsl.sql.RelationalPathBase<QConfigurationcontext> {

    private static final long serialVersionUID = 885206577;

    public static final QConfigurationcontext configurationcontext = new QConfigurationcontext("configurationcontext");

    public final StringPath customfield = createString("customfield");

    public final NumberPath<Long> fieldconfigscheme = createNumber("fieldconfigscheme", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> project = createNumber("project", Long.class);

    public final NumberPath<Long> projectcategory = createNumber("projectcategory", Long.class);

    public final com.querydsl.sql.PrimaryKey<QConfigurationcontext> configurationcontextPk = createPrimaryKey(id);

    public QConfigurationcontext(String variable) {
        super(QConfigurationcontext.class, forVariable(variable), "public", "configurationcontext");
        addMetadata();
    }

    public QConfigurationcontext(String variable, String schema, String table) {
        super(QConfigurationcontext.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QConfigurationcontext(Path<? extends QConfigurationcontext> path) {
        super(path.getType(), path.getMetadata(), "public", "configurationcontext");
        addMetadata();
    }

    public QConfigurationcontext(PathMetadata metadata) {
        super(QConfigurationcontext.class, metadata, "public", "configurationcontext");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(customfield, ColumnMetadata.named("customfield").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(fieldconfigscheme, ColumnMetadata.named("fieldconfigscheme").withIndex(5).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(project, ColumnMetadata.named("project").withIndex(3).ofType(Types.NUMERIC).withSize(18));
        addMetadata(projectcategory, ColumnMetadata.named("projectcategory").withIndex(2).ofType(Types.NUMERIC).withSize(18));
    }

}

