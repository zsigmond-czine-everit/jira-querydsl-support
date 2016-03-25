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
 * QServiceconfig is a Querydsl query type for QServiceconfig
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QServiceconfig extends com.querydsl.sql.RelationalPathBase<QServiceconfig> {

    private static final long serialVersionUID = -1042747649;

    public static final QServiceconfig serviceconfig = new QServiceconfig("serviceconfig");

    public final StringPath clazz = createString("clazz");

    public final NumberPath<Long> delaytime = createNumber("delaytime", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath servicename = createString("servicename");

    public final com.querydsl.sql.PrimaryKey<QServiceconfig> serviceconfigPk = createPrimaryKey(id);

    public QServiceconfig(String variable) {
        super(QServiceconfig.class, forVariable(variable), "public", "serviceconfig");
        addMetadata();
    }

    public QServiceconfig(String variable, String schema, String table) {
        super(QServiceconfig.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QServiceconfig(Path<? extends QServiceconfig> path) {
        super(path.getType(), path.getMetadata(), "public", "serviceconfig");
        addMetadata();
    }

    public QServiceconfig(PathMetadata metadata) {
        super(QServiceconfig.class, metadata, "public", "serviceconfig");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(clazz, ColumnMetadata.named("clazz").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(delaytime, ColumnMetadata.named("delaytime").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(servicename, ColumnMetadata.named("servicename").withIndex(4).ofType(Types.VARCHAR).withSize(255));
    }

}

