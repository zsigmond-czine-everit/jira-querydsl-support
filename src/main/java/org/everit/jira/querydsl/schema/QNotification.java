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
 * QNotification is a Querydsl query type for QNotification
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QNotification extends com.querydsl.sql.RelationalPathBase<QNotification> {

    private static final long serialVersionUID = 475074339;

    public static final QNotification notification = new QNotification("notification");

    public final StringPath event = createString("event");

    public final NumberPath<Long> eventTypeId = createNumber("eventTypeId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath notifParameter = createString("notifParameter");

    public final StringPath notifType = createString("notifType");

    public final NumberPath<Long> scheme = createNumber("scheme", Long.class);

    public final NumberPath<Long> templateId = createNumber("templateId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QNotification> notificationPk = createPrimaryKey(id);

    public QNotification(String variable) {
        super(QNotification.class, forVariable(variable), "public", "notification");
        addMetadata();
    }

    public QNotification(String variable, String schema, String table) {
        super(QNotification.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QNotification(Path<? extends QNotification> path) {
        super(path.getType(), path.getMetadata(), "public", "notification");
        addMetadata();
    }

    public QNotification(PathMetadata metadata) {
        super(QNotification.class, metadata, "public", "notification");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(event, ColumnMetadata.named("event").withIndex(3).ofType(Types.VARCHAR).withSize(60));
        addMetadata(eventTypeId, ColumnMetadata.named("event_type_id").withIndex(4).ofType(Types.NUMERIC).withSize(18));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18).notNull());
        addMetadata(notifParameter, ColumnMetadata.named("notif_parameter").withIndex(7).ofType(Types.VARCHAR).withSize(60));
        addMetadata(notifType, ColumnMetadata.named("notif_type").withIndex(6).ofType(Types.VARCHAR).withSize(60));
        addMetadata(scheme, ColumnMetadata.named("scheme").withIndex(2).ofType(Types.NUMERIC).withSize(18));
        addMetadata(templateId, ColumnMetadata.named("template_id").withIndex(5).ofType(Types.NUMERIC).withSize(18));
    }

}

