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
 * QOsHistorystepPrev is a Querydsl query type for QOsHistorystepPrev
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QOsHistorystepPrev extends com.querydsl.sql.RelationalPathBase<QOsHistorystepPrev> {

    private static final long serialVersionUID = -1066587657;

    public static final QOsHistorystepPrev osHistorystepPrev = new QOsHistorystepPrev("os_historystep_prev");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> previousId = createNumber("previousId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QOsHistorystepPrev> osHistorystepPrevPk = createPrimaryKey(id, previousId);

    public QOsHistorystepPrev(String variable) {
        super(QOsHistorystepPrev.class, forVariable(variable), "public", "os_historystep_prev");
        addMetadata();
    }

    public QOsHistorystepPrev(String variable, String schema, String table) {
        super(QOsHistorystepPrev.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QOsHistorystepPrev(Path<? extends QOsHistorystepPrev> path) {
        super(path.getType(), path.getMetadata(), "public", "os_historystep_prev");
        addMetadata();
    }

    public QOsHistorystepPrev(PathMetadata metadata) {
        super(QOsHistorystepPrev.class, metadata, "public", "os_historystep_prev");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(previousId, ColumnMetadata.named("previous_id").withIndex(2).ofType(Types.NUMERIC).withSize(18).notNull());
    }

}

