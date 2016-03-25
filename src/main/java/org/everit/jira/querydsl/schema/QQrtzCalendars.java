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
 * QQrtzCalendars is a Querydsl query type for QQrtzCalendars
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QQrtzCalendars extends com.querydsl.sql.RelationalPathBase<QQrtzCalendars> {

    private static final long serialVersionUID = -411092714;

    public static final QQrtzCalendars qrtzCalendars = new QQrtzCalendars("qrtz_calendars");

    public final StringPath calendar = createString("calendar");

    public final StringPath calendarName = createString("calendarName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.querydsl.sql.PrimaryKey<QQrtzCalendars> qrtzCalendarsPk = createPrimaryKey(calendarName);

    public QQrtzCalendars(String variable) {
        super(QQrtzCalendars.class, forVariable(variable), "public", "qrtz_calendars");
        addMetadata();
    }

    public QQrtzCalendars(String variable, String schema, String table) {
        super(QQrtzCalendars.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QQrtzCalendars(Path<? extends QQrtzCalendars> path) {
        super(path.getType(), path.getMetadata(), "public", "qrtz_calendars");
        addMetadata();
    }

    public QQrtzCalendars(PathMetadata metadata) {
        super(QQrtzCalendars.class, metadata, "public", "qrtz_calendars");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(calendar, ColumnMetadata.named("calendar").withIndex(3).ofType(Types.VARCHAR).withSize(2147483647));
        addMetadata(calendarName, ColumnMetadata.named("calendar_name").withIndex(2).ofType(Types.VARCHAR).withSize(255).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.NUMERIC).withSize(18));
    }

}

